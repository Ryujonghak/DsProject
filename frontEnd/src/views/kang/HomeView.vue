<template>
  <!-- TODO: movie.MovieDetail 있을경우 화면 보여주기 -->
  <div v-if="movie.MovieDetail" style="background: black">
    <div class="mainMovie" style="background: black">
      <div class="parent">
        <div class="cover01"></div>
        <div class="cover02"></div>
        <div class="cover03"></div>
        <!-- TODO: 메인에서 영상의 크기만 전체화면으로 넓게 보여주고 나머지 아래 부분은 중앙 정렬해서 보기에 더 다채롭도록 css 변경, 밑 포스터는 가리지 않고 살짝 보이도록 함 (최아리 수정) -->
        <iframe
          class="video"
          src="https://www.youtube.com/embed/7MjKspiRQ-g?rel=0&loop=1&playlist=7MjKspiRQ-g&autoplay=1&mute=1"
          title="YouTube video player"
          frameborder="0"
          allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
          allowfullscreen
          style="width: 100%; height: 100%"
        ></iframe>
      </div>
    </div>
    <div class="slider movie-items">
      <div class="container">
        <div class="row">
          <div class="slick-multiItemSlider">
            <!-- TODO: 영화 포스터 캐로셀 작업 -->
            <div
              class="movie-item"
              v-for="(data, index) in movie.MovieDetail"
              v-bind:key="index"
            >
              <div class="mv-img" @click="showDetail(data)">
                <a>
                  <img
                    :src="data.posterurln"
                    alt="poster"
                    width="285"
                    height="437"
                /></a>
              </div>
              <div class="title-in" style="margin-left: 2%; margin-bottom: 2%">
                <div class="cate">
                  <span class="blue"
                    ><a href="#detail">{{ data.genrenm }}</a></span
                  >
                </div>
                <h6>
                  <a @click="showDetail(data)">{{ data.movienm }}</a>
                </h6>
                <p><i class="ion-android-star"></i>{{ data.raiting }}</p>
              </div>
            </div>
            <!-- TODO: 끝 -->
          </div>
          <router-link to="/allMovie" class="more"
            >더보기 <i class="ion-ios-arrow-right"></i
          ></router-link>
        </div>
      </div>
    </div>
    <div style="width: 100%; height: 350px"></div>

    <!-- TODO: 메인디테일뷰 컴포넌트 v-if로 보여주는 부분, 프롭스로 다른 컴포넌트로 데이터 전달하는 부분 추가 (최아리 추가) -->
    <!-- TODO: vue props 설명 추가 (최아리 추가) -->
    <!-- 1. 우리의 목적은 한 페이지 안에서 '전체 목록 -> 상세 -> 예매' 까지 가능해야 하기 때문에 제일 아래 부분에 <DetailCom/> 를 우선적으로 넣어줍니다. -->
    <!-- 2. 그리고 v-if="detailPage" 를 걸어줘서 위의 목록에서 클릭을 해야 상세 페이지가 보이게 설정합니다. -->
    <!-- 3. 위의 목록에서 포스터와 영화 제목에  @click="showDetail(data)" 이렇게 클릭이벤트를 걸어주고 클릭시 각각의 데이터를 포함해서 currentMovie 안에 데이터를 넣어줍니다. (showDetail(data) 함수 참고) -->
    <!-- 4. 마지막으로 <DetailCom :movieProps="currentMovie" /> 이런식으로 :보낼프롭스명="보낼데이터" 자식 컴포넌트에 데이터를 넘겨줍니다. -->
    <!-- 5. MainDetail 페이지로.. -->

    <!-- 바로 밑의 div는 필요없어 보이지만 빼면 위의 목록 슬라이드가 모두 깨져버려서 일단 넣어뒀습니다. -->
    <div>
      <DetailCom />
    </div>

    <!-- 데이터를 넘겨받은 메인디테일 부분 시작 -->
    <div v-if="detailPage">
      <DetailCom :movieProps="currentMovie" />
    </div>
    <!-- 데이터를 넘겨받은 메인디테일 부분 끝 -->

    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png" />
    </a>
  </div>
</template>

<script>
import custom from "@/assets/js/custom.js";
import DetailCom from "@/views/choi/MainDetail.vue";
import MovieDataService from "@/services/MovieDataService";

export default {
  mounted() {
    custom();
    this.retrieveMovie();
  },
  components: {
    DetailCom, // 다음 컴포넌트
  },
  data() {
    return {
      detailPage: false,
      movie: [],
      searchMname: "",
      currentMovie: null,

      //페이징을 위한 변수 정의
      page: 1,
      count: 0,
      pageSize: 10,

      pageSizes: [5, 10, 15],
    };
  },
  methods: {
    // TODO: 클릭시 currenIndex 안에 데이터 추가해서 다음 페이지로 보내기 (최아리 추가)
    showDetail(data) {
      this.currentMovie = data;

      this.detailPage = !this.detailPage;
    },
    retrieveMovie() {
      MovieDataService.getMovieDetailAll(
        this.searchMname,
        this.page - 1,
        this.pageSize
      )
        .then((response) => {
          const movie = response.data;
          this.movie = movie;
          console.log(response.data);
          // console.log(this.movie);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>
<style lang="scss" scoped>
.cover01 {
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: 3;
  content: " ";
  background-image: linear-gradient(
    to right,
    #000 0%,
    rgba(0, 0, 0, 0.3) 25%,
    rgba(0, 0, 0, 0) 50%,
    rgba(0, 0, 0, 0.35) 75%,
    #000 100%
  );
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
.cover02 {
  position: absolute;
  width: 100%;
  height: 13.5%;
  z-index: 3;
  background-color: black;
}
.cover03 {
  position: absolute;
  top: 85%;
  width: 100%;
  height: 15%;
  z-index: 3;
  background-color: black;
}
.parent {
  // padding-bottom: 56.25%;
  position: relative;
  padding-bottom: 56.25%;
  height: 0;
  overflow: hidden;
  max-width: 100%;
}
.video {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  width: 100%;
  height: 300px;
}
.title {
  color: aliceblue;
  text-align: center;
  margin-bottom: 5%;
  margin-top: 2%;
}
.h1 {
  font-size: 30px;
}
.slider {
  padding-top: 0;
  padding-bottom: 0%;
  background-color: black;
  position: absolute;
  width: 100%;
  height: 25%;
  z-index: 4;
}
.more {
  color: aliceblue;
  font-size: 15px;
  float: right;
}
.movie-items {
  background: black;
}
// .mv-img {
//   width: 285px !important;
//   height: 437px !important;
// }
.movie-item {
  display: flex !important;
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
