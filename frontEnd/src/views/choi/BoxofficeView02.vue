<template>
  <div>
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>박스오피스 무비차트</h1>
              <ul class="breadcumb">
                <li class="active"><a href="#">Home</a></li>
                <li>
                  <span class="ion-ios-arrow-right"></span> celebrity listing
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single col-xs-12">
      <div>
        <!-- blog detail section-->
        <div class="col-xs-8" style="padding-left: 5%">
          <div>
            <div>
              <div class="col-xs-12">
                <div class="blog-detail-ct">
                  <h1 class="col-xs-12">
                    추억의 만화 ‘더 퍼스트 슬램덩크’, 개봉 첫날 박스오피스 2위
                  </h1>
                  <span class="time col-xs-12">2023.01.05 11:44</span>
                  <span class="time col-xs-12">이소연 기자</span>
                  <img
                    src="http://www.cctimes.kr/news/photo/202301/734849_283062_3024.jpg"
                    alt=""
                    class="col-xs-12"
                  />
                  <p class="article col-xs-12">
                    영화 ‘더 퍼스트 슬램덩크’가 개봉 첫날 박스오피스 2위에
                    올랐다.
                  </p>

                  <p class="article col-xs-12">
                    5일 영화진흥위원회 영화관 입장권 통합 전산망에 따르면 지난
                    4일 개봉한 ‘더 퍼스트 슬램덩크’는 첫날 6만2095명을 동원해
                    박스오피스 2위를 차지했다. 이는 그간 ‘아바타: 물의 길’에
                    이어 박스오피스 2위 자리를 지켜왔던 ‘영웅’을 제친 결과다.
                  </p>

                  <p class="article col-xs-12">
                    ‘더 퍼스트 슬램덩크’는 누적 발행 부수 1억2000만부 돌파라는
                    역사적인 기록을 달성한 만화 ‘슬램덩크’의 극장판 애니메이션
                    작품이다. ‘슬램덩크’는 전국 제패를 꿈꾸는 북산고 농구부
                    5인방의 꿈과 열정을 담아낸 청춘 만화다.
                  </p>
                  <div class="flex-it flex-ct col-xs-12">
                    <p class="article">
                      ‘슬램덩크’는 1990년대에서 2000년대 청춘의 가슴을 뜨겁게
                      만든 명작으로 꼽힌다. ‘슬램덩크’ 연재가 종료된 지는 26년이
                      지났지만, 여전히 ‘꼭 읽어야 하는 만화’로 불리며 많은
                      사랑을 받고 있다. <br /><br />

                      이번에 개봉한 극장판은 만화 원작자인 이노우에 다케히코가
                      직접 각본과 연출을 맡아 팬들의 기대를 모았다. 영화에서는
                      원작에는 나오지 않았던 송태섭과 정대만의 ‘비하인드
                      스토리’가 공개된다. 또한, 각 인물의 움직임을 역동적으로
                      구현한 컴퓨터그래픽(CG)으로 캐릭터에게 숨을 불어넣었다.
                    </p>
                    <img
                      src="https://dimg.donga.com/wps/NEWS/IMAGE/2023/01/05/117310651.2.jpg"
                      alt=""
                      style="width: 350px; height: 250px"
                    />
                  </div>
                  <div class="col-xs-12">
                    <p class="article">
                      또한 일본 만화 ‘슬램덩크’의 원작자 이노우에
                      다케히코(井上雄彦)는 한국에서 개봉한 ‘슬램덩크’의 극장판
                      애니메이션 ‘더 퍼스트 슬램덩크’가 흥행한 데 대한 감사
                      인사를 전했다. 그는 지난 4일 트위터에 한국어로 “오늘부터
                      한국에서 상영이 시작됐습니다. 벌써부터 많은 분들이
                      봐주시다니 기쁩니다. 감사합니다”라고 올렸다.
                    </p>
                    <h4 style="margin-top: 10%; margin-bottom: 4%">
                      독자들이 뽑은 '슬램덩크' 최고의 대사 댓글 순위
                    </h4>
                    <p class="article">
                      1. 왼손은 거들뿐 (46%) <br />2. 농구가 하고 싶어요. (8%)
                      <br />3. 그래 난 정대만, 포기를 모르는 남자지. (6%)
                      <br />4. 영감님의 영광의 시대는 언제죠? 난 지금입니다.
                      (5%) <br />5. 아직 이길 수 있다고 생각하는 건 저뿐인가요?
                      포기하면 그 순간이 바로 시합 종료입니다. (5%) <br />6.
                      농구 좋아하세요? (4%) <br />7. 난 천재니까! (4%) <br />8.
                      정말 좋아합니다. 이번엔 거짓이 아니라고요. (4%)
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- end of  blog detail section-->
        <!-- celebrity list section-->
        <div class="col-xs-4" style="padding-right: 3%;">
          <div>
            <div>
              <div>
                <div v-for="(data, index) in movie.BoxOffice" :key="index">
                  <div>
                    <div class="ranking col-xs-2">No.{{ data.rank }}</div>
                  </div>
                  <div>
                    <router-link :to="'/allMovie/' + data.movieCd">
                      <div class="ceb-item-style-2" style="background-color:#020d18">
                        <img
                          src="https://ssl.pstatic.net/imgmovie/mdi/mit500/2154/215466_P01_135602.jpg"
                          alt=""
                          style="width: 16.5%;"
                        />
                        <div class="ceb-infor" style="background-color:#020d18">
                          <h2>
                            <a href="celebritysingle.html">{{
                              data.movieNm
                            }}</a>
                          </h2>
                          <!-- <span>Avatar: The Way of Water</span> -->
                          <p style="margin-top: 1%">
                            개봉일: {{ data.openDt }}<br />
                            오늘까지 총 누적관객수: {{ data.audiAcc }} 명
                          </p>
                        </div>
                      </div>
                    </router-link>
                  </div>
                </div>

                <!-- TODO: 탑버튼 추가_정주희 -->
                <a class="topbutton" href="#">
                  <img src="@/assets/images_jung/iconUp_48.png" />
                </a>
              </div>
            </div>
          </div>
        </div>
        <!-- end of celebrity list section-->
      </div>
    </div>
  </div>
</template>

<script>
import MovieDataService from "@/services/MovieDataService";
export default {
  mounted() {
    this.retrieveMovie();
  },
  data() {
    return {
      movie: [],
      searchMname: "",

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 10, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수

      // TODO: 검색 기능 추가
      searchStatue: "",
      nowPlayingMovies: [],
    };
  },
  methods: {
    retrieveMovie() {
      MovieDataService.getBoxofficeAll(
        this.searchMname,
        this.page - 1,
        this.pageSize
      )
        .then((response) => {
          const movie = response.data;
          this.movie = movie;
          console.log(response.data);
        })
        .catch((e) => {
          alert("실패");
          console.log(e);
        });
    },
  },
};
</script>

<style scoped>
.common-hero {
  /* background: url(https://images.pexels.com/photos/4982005/pexels-photo-4982005.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2) */
  background: url(@/assets/images_choi/Views/choi/boxoffice/boxoffice03.jpeg)
    no-repeat;
  /* height: 598px; */
  width: 100%;
}

.article {
  font-size: 16px;
  color: #abb7c4;
  font-weight: 500;
  text-transform: none;
  line-height: 24px !important;
}
.ranking {
  margin-bottom: 1%;
  padding-left: 1%;
  /* background-color: rgb(127, 74, 161); */
  background-color: #fb4357;
  font-family: "Dosis", sans-serif;
  font-size: 18px;
  color: #ffffff;
  font-weight: 700;
}

/* TODO: 탑버튼 추가_정주희*/
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}
</style>
