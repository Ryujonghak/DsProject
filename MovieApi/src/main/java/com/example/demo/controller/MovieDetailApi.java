package com.example.demo.controller;

import com.example.demo.model.DetailMovie;
import com.example.demo.repository.DailyMovieRepository;
import com.example.demo.repository.DetailMovieRepository;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import kr.or.kobis.kobisopenapi.consumer.rest.KobisOpenAPIRestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.el.util.MessageFactory.get;

/**
 * packageName : com.example.demo.controller
 * fileName : TestController
 * author : Moon
 * date : 2022-12-23-023
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-23-023         Moon          최초 생성
 */
@RestController
@Slf4j
@Component
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieDetailApi {


    @Autowired
    DetailMovieRepository detailMovieRepository;

    @Autowired
    DailyMovieRepository dailyMovieRepository;



    //발급키
    String key = "f9440f7e99cce6b022597815a3cb5571";

    String kmkey = "8AB6K050D2Q94G2O6512";

    String movieCd = "";

    String direc="";

    @PostMapping("/moviedetail")
    public void movieDetail() {


        String detailResponse = "";

        List<String> movieCd = dailyMovieRepository.allmovieCd();

        String clientId = "j5NG5CkLzfCuIvlLSY_2";
        String clientSecret = "rLPIELDosA";

        try {
//            // KOBIS 오픈 API Rest Client를 통해 호출
            KobisOpenAPIRestService service = new KobisOpenAPIRestService(key);


            for (int i = 0; i < movieCd.size(); i++)
//            for (int i = 0; i < 1; i++)
            {
                String urlcd = movieCd.get(i);

                detailResponse = service.getMovieInfo(true, urlcd);
//

                if (!detailResponse.isEmpty()) {
                    JSONParser jsonParser = new JSONParser();

                    Object obj = jsonParser.parse(detailResponse);

                    JSONObject jsonObject = (JSONObject) obj;

                    JSONObject parse_movieInfoResult = (JSONObject) jsonObject.get("movieInfoResult");

                    JSONObject movieInfo = (JSONObject) parse_movieInfoResult.get("movieInfo");

                    DetailMovie dtmv = new DetailMovie();

                    dtmv.setMoviecd((String) movieInfo.get("movieCd"));
                    dtmv.setMovienm((String) movieInfo.get("movieNm"));
                    dtmv.setMovienmen((String) movieInfo.get("movieNmEn"));
                    dtmv.setMovienmog((String) movieInfo.get("movieNmOg"));
                    dtmv.setPrdtyear((String) movieInfo.get("prdtYear"));
                    dtmv.setShowtm((String) movieInfo.get("showTm"));
                    dtmv.setOpendt((String) movieInfo.get("openDt"));
                    dtmv.setPrdtstatnm((String) movieInfo.get("prdtStatNm"));

                    JSONArray nations = (JSONArray) movieInfo.get("nations");
                    String nation = "";

                    for (int j = 0; j < nations.size(); j++)
                    {
                        JSONObject nations_nationNm = (JSONObject) nations.get(j);
                        if (j == nations.size() - 1) {
                            nation += nations_nationNm.get("nationNm").toString();
                        } else {
                            nation += nations_nationNm.get("nationNm").toString() + ",";
                        }
                    }

                    System.out.println(nation);
                    dtmv.setNationnm(nation);

                    JSONArray genres = (JSONArray) movieInfo.get("genres");
                    String genre = "";
                    for (int j = 0; j < genres.size(); j++) {
                        JSONObject generes_genre = (JSONObject) genres.get(j);
                        if (j == genres.size() - 1) {
                            genre += generes_genre.get("genreNm").toString();
                        } else {
                            genre += generes_genre.get("genreNm").toString() + ",";
                        }
                    }
                    System.out.println(genre);
                    dtmv.setGenrenm(genre);

                    JSONArray directors = (JSONArray) movieInfo.get("directors");
                    String director = "";
                    for (int j = 0; j < directors.size(); j++) {
                        JSONObject directors_peopleNm = (JSONObject) directors.get(j);
                        if (j == directors.size() - 1) {
                            director += directors_peopleNm.get("peopleNm").toString();
                        } else {
                            director += directors_peopleNm.get("peopleNm").toString() + ",";
                        }
                    }
                    dtmv.setDirectors(director);
                    System.out.println(director);


                    JSONArray actors = (JSONArray) movieInfo.get("actors");
                    String actorname = "";
                    String cast = "";
                    for (int j = 0; j < actors.size(); j++) {
                        JSONObject actor = (JSONObject) actors.get(j);
                        if (j == actors.size() - 1) {
                            actorname += actor.get("peopleNm").toString();
                            cast += actor.get("cast").toString();
                        } else {
                            actorname += actor.get("peopleNm").toString() + ",";
                            cast += actor.get("cast").toString() + ",";
                        }
                    }
                    dtmv.setActor(actorname);
                    dtmv.setCast(cast);
                    System.out.println("배우+역할 끝");

                    JSONArray audits = (JSONArray) movieInfo.get("audits");
                    String wGradeNm = "";
                    for (int j = 0; j < audits.size(); j++) {
                        JSONObject watchGrade = (JSONObject) audits.get(j);
                        if (j == audits.size() - 1) {
                            wGradeNm += watchGrade.get("watchGradeNm").toString();
                        } else {
                            wGradeNm += watchGrade.get("watchGradeNm").toString() + ",";
                        }
                    }
                    dtmv.setWatchgradenm(wGradeNm);

                    System.out.println("심의등급 끝");



//                    TODO : NAVER API
                    String urlnm = URLEncoder.encode((String) movieInfo.get("movieNm"), "UTF-8");
                    System.out.println("1. URL 인코딩");

                    String ApiUrl = "https://openapi.naver.com/v1/search/movie.json?query=" +
                            urlnm +
                            "&display=1&start=1";

                    System.out.println("2. URL조립");

                    Map<String, String> requestHeaders = new HashMap<>();
                    requestHeaders.put("X-Naver-Client-Id", clientId);
                    requestHeaders.put("X-Naver-Client-Secret", clientSecret);
                    String responseBody = get(ApiUrl, requestHeaders);

                    System.out.println("3. 연결완료");

                    JSONParser jsonParserN = new JSONParser();
                    JSONObject jsonObjectN = (JSONObject) jsonParserN.parse(responseBody);

                    JSONArray info = (JSONArray) jsonObjectN.get("items");
//                    JSONObject info = (JSONObject) jsonObjectN.get("items");
                    System.out.println(info.toString());

                    System.out.println("4. 파싱 완료");
                    Double utring;

                    JSONObject targetN = (JSONObject) info.get(0);

                    try{
                        String tk = targetN.get("userRating").toString();
                        utring = Double.valueOf(tk).doubleValue();
                        dtmv.setRaiting(utring);
                        System.out.println("평점 set");

                        String temp = targetN.get("image").toString();
                        temp = temp.replace("/mit110/", "/mit500/").replace("\"","");
                        System.out.println("URL재조립? " + temp);
                        dtmv.setPosterurln(temp);



////                        TODO : KMDB 줄거리, 포스터, 스틸컷
//
                        String kmtitle = URLEncoder.encode((String) dtmv.getMovienm(), "UTF-8");
                        String kmdirec = URLEncoder.encode((String) dtmv.getDirectors(), "UTF-8");
                        System.out.println("1. KMDB URL조립");

                        String KMDBurl = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json2.jsp?collection=kmdb_new2&detail=Y&title=" +
                                kmtitle +
                                "&director=" +
                                kmdirec +
                                "&ServiceKey=" +
                                kmkey;

                        System.out.println("2. KMDB 연결성공");

                        Map<String, String> requestKM = new HashMap<>();
                        String responseKM = get(KMDBurl, requestKM);



                        System.out.println("3. KMDB 연결완료");

                        System.out.println(responseKM);
                        JSONParser jsonParserKM = new JSONParser();
                        JSONObject jsonObjectKM = (JSONObject) jsonParserKM.parse(responseKM);

                        if( jsonObjectKM.get("TotalCount").toString().equals("0") )
                        {
                            KMDBurl = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json2.jsp?collection=kmdb_new2&detail=Y&title=" +
                                    kmtitle +  "&ServiceKey=" + kmkey;

                            requestKM = new HashMap<>();
                            responseKM = get(KMDBurl, requestKM);

                            System.out.println(responseKM);
                            jsonParserKM = new JSONParser();
                            jsonObjectKM = (JSONObject) jsonParserKM.parse(responseKM);
                        }


                            JSONArray kminfo = (JSONArray) jsonObjectKM.get("Data");

                            JSONObject kminfo2 = (JSONObject) kminfo.get(0);

                            JSONArray kminfo3 = (JSONArray) kminfo2.get("Result");

                            JSONObject kminfo4 = (JSONObject) kminfo3.get(0);

//                        System.out.println("타겟까지 왔나?" + kminfo4.toString());

                            String kmimgtemp = kminfo4.get("stlls").toString();

                            kmimgtemp = kmimgtemp.replace("\"", "").replace("|", ",");

                            dtmv.setImgurl(kmimgtemp);

//                        IMG SET

                            String kmposttemp = kminfo4.get("posters").toString();

                            kmposttemp = kmposttemp.replace("\"", "").replace("|", ",");

                            dtmv.setPosterurlkm(kmposttemp);

                            System.out.println("KMPOSTER : " + kmposttemp);

//                        POSTER SET

                            JSONObject kminfo5 = (JSONObject) kminfo4.get("plots");

//                        System.out.println("kminfo5 : " + kminfo5.toString());

                            JSONArray kminfo6 = (JSONArray) kminfo5.get("plot");

//                        System.out.println("kminfo6 : " + kminfo6.toString());

                            JSONObject targetplot = (JSONObject) kminfo6.get(0);

//                        System.out.println(targetplot.toString());

                            String plottemp = targetplot.get("plotText").toString();

                            System.out.println(plottemp);

                            dtmv.setPlot(plottemp);


                            detailMovieRepository.save(dtmv);


                    }
                    catch (Exception e)
                    {
                        e.getMessage();
                    }


                } else {
                    System.out.println("에러");
                }
            }

        }
        catch (Exception e) {
            e.getMessage();
        }
    }

    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 에러 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }

    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }

    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);

        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();

            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }

            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
        }
    }


    public static void main(String[] args) {
        // API 객체 생성

        MovieDetailApi api = new MovieDetailApi();

        // API 요청
        api.movieDetail();
    }


}