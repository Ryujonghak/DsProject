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
    <!-- celebrity list section-->
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2">
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="row">
              <div v-for="(data, index) in movie.BoxOffice" :key="index">
                <div class="col-md-12">
                  <div class="ranking">No.{{ data.rank }}</div>
                </div>
                <div class="col-md-12">
                  <div class="ceb-item-style-2">
                    <img src="https://ssl.pstatic.net/imgmovie/mdi/mit500/2237/223799_P19_172600.jpeg" alt="" style="width:7%"/>
                    <div class="ceb-infor">
                      <h2>
                        <a href="celebritysingle.html">{{ data.movieNm }}</a>
                      </h2>
                      <!-- <span>Avatar: The Way of Water</span> -->
                      <p style="margin-top: 1%">
                        개봉일: {{ data.openDt }}<br />
                        오늘까지 총 누적관객수: {{ data.audiAcc }} 명
                      </p>
                    </div>
                  </div>
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
    </div>
    <!-- end of celebrity list section-->
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
          alert("성공");
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
.ranking {
  margin-bottom: 1%;
  padding-left: 1%;
  background-color: rgb(127, 74, 161);
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
