package com.example.demo.controller;

import com.example.demo.model.DetailMovie;
import com.example.demo.repository.DailyMovieRepository;
import com.example.demo.repository.DetailMovieRepository;
import kr.or.kobis.kobisopenapi.consumer.rest.KobisOpenAPIRestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
public class NMovieApi {


    @Autowired
    DetailMovieRepository detailMovieRepository;

    @Autowired
            DailyMovieRepository dailyMovieRepository;

    //발급키
    String clientId = "네이버 발급키를 사용하세요.";
    String clientSecret = "발급키를 사용하세요.";

    @GetMapping("/nmovie")
    public void nmovie() {

        String NResponse = "";


        List<String> movieNm = dailyMovieRepository.allmovieNm();

        try {

            for (int i = 0; i < movieNm.size(); i++) {
                String urlnm = URLEncoder.encode(movieNm.get(i), "UTF-8");

                System.out.println(urlnm);

//                String apiURL = "https://openapi.naver.com/v1/search/movie.json?query=" + urlcd;
//
//                Map<String, String> requestHeaders = new HashMap<>();
//                requestHeaders.put("X-Naver-Client-Id", clientId);
//                requestHeaders.put("X-Naver-Client-Secret", clientSecret);
//                NResponse = get(apiURL,requestHeaders);


                System.out.println("HTTPURLCONNETCTION START ");

                String ApiUrl = "https://openapi.naver.com/v1/search/movie.json?query=" +
                        urlnm +
                        "&display=1&start=1";

                Map<String, String> requestHeaders = new HashMap<>();
                requestHeaders.put("X-Naver-Client-Id", clientId);
                requestHeaders.put("X-Naver-Client-Secret", clientSecret);
                String responseBody = get(ApiUrl,requestHeaders);

                JSONParser jsonParser = new JSONParser();
                JSONObject jsonObject = (JSONObject) jsonParser.parse(responseBody);
                JSONArray infoArray = (JSONArray) jsonObject.get("items");

                for(int j = 0; j < infoArray.size(); j++) {
                    System.out.println("=item_" + j + "============================");
                    JSONObject itemObject = (JSONObject) infoArray.get(j);
                    System.out.println("title:\t" + itemObject.get("title"));
                    System.out.println("subtitle:\t" + itemObject.get("subtitle"));
                    System.out.println("director:\t" + itemObject.get("director"));
                    System.out.println("actor:\t" + itemObject.get("actor"));
                    System.out.println("userRating:\t" + itemObject.get("userRating") + "\n");

                }






//                System.out.println("Nresponse 사이즈 : " + NResponse.length());
//
//                System.out.println(NResponse);
////                BufferedReader bf;
////
////                bf = new BufferedReader(new InputStreamReader(apiURL.openStream(), "UTF-8"));
////
////                detailResponse = bf.readLine();
////                System.out.println(bf.readLine());
//
//                if (!NResponse.isEmpty()) {
//                    JSONParser jsonParser = new JSONParser();
//
//                    Object obj = jsonParser.parse(NResponse);
//
//                    JSONObject jsonObject = (JSONObject) obj;
//
//                    JSONObject parse_Nmovie = (JSONObject) jsonObject.get("items");
//
//
//                    System.out.println(parse_Nmovie.get("userRaiting"));
//                } else {
//                    System.out.println("에러");
//                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }


    public static void main(String[] args) {
        // API 객체 생성

        NMovieApi api = new NMovieApi();

        // API 요청
        api.nmovie();
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


}