<template>
  <div>
    <div class="mainMovie" style="background: black">
      <div class="container parent">
        <div class="cover01"></div>
        <div class="cover02"></div>
        <div class="cover03"></div>
        <iframe
          class="video"
          src="https://www.youtube.com/embed/OLLJYT-_BWw?rel=0&loop=1&playlist=OLLJYT-_BWw&autoplay=1&mute=1"
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
          <div class="title">
            <h6 class="h1">BOX OFFICE</h6>
          </div>
          <div class="slick-multiItemSlider">
             <!-- v-for="(data, index) in movie.MovieDetail" v-bind:key="index" -->
            <!-- 아바타 영화포스터 -->
            <div class="movie-item">
              <div class="mv-img">
                <a href="/mainDetail"
                  > <img :src="data.posterurln" alt="poster" 
                       width="285"
                    height="437"/></a>
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="blue"><a href="#">{{ data.genrenm }}</a></span>
                </div>
                <h6><a @click="showDetail">{{data.movienm}}</a></h6>
                <p><i class="ion-android-star"></i>{{ data.raiting }}</p>
              </div>
            </div>
            <!-- 영웅 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <a href="#"
                  ><img
                    src="@/assets/images_kang/Views/HomeView/poster/영웅.jpg"
                    alt=""
                    width="285"
                    height="437"
                /></a>
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="yell"><a href="#">action</a></span>
                </div>
                <h6><a href="#">The revenant</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 더메뉴 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <a href="#"
                  ><img
                    src="@/assets/images_kang/Views/HomeView/poster/THEMENU.jpg"
                    alt=""
                    width="285"
                    height="437"
                /></a>
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="green"><a href="#">comedy</a></span>
                </div>
                <h6><a href="#">Die hard</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 본즈앤올 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <a href="#"
                  ><img
                    src="@/assets/images_kang/Views/HomeView/poster/본즈앤올.jpg"
                    alt=""
                    width="285"
                    height="437"
                /></a>
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="blue"><a href="#">Sci-fi</a></span>
                  <span class="orange"><a href="#">advanture</a></span>
                </div>
                <h6><a href="#">The walk</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 신비아파트 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <a href="#"
                  ><img
                    src="@/assets/images_kang/Views/HomeView/poster/신비아파트.jpg"
                    alt=""
                    width="285"
                    height="437"
                /></a>
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="blue"><a href="#">Sci-fi</a></span>
                </div>
                <h6><a href="#">Interstellar</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 오늘밤세계에서어쩌구 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <a href="#"
                  ><img
                    src="@/assets/images_kang/Views/HomeView/poster/오늘밤세계에서어쩌구.jpg"
                    alt=""
                    width="285"
                    height="437"
                /></a>
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="yell"><a href="#">action</a></span>
                </div>
                <h6><a href="#">The revenant</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 올뺴미 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <img
                  src="@/assets/images_kang/Views/HomeView/poster/올빼미.jpg"
                  alt=""
                  width="285"
                  height="437"
                />
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="green"><a href="#">comedy</a></span>
                </div>
                <h6><a href="#">Die hard</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 코르사주 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <img
                  src="@/assets/images_kang/Views/HomeView/poster/코르사주.jpg"
                  alt=""
                  width="285"
                  height="437"
                />
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="blue"><a href="#">Sci-fi</a></span>
                  <span class="orange"><a href="#">advanture</a></span>
                </div>
                <h6><a href="#">The walk</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
            <!-- 탄생 영화포스터 -->
            <!-- <div class="movie-item">
              <div class="mv-img">
                <img
                  src="@/assets/images_kang/Views/HomeView/poster/탄생.jpg"
                  alt=""
                  width="285"
                  height="437"
                />
              </div>
              <div class="title-in">
                <div class="cate">
                  <span class="green"><a href="#">comedy</a></span>
                </div>
                <h6><a href="#">Die hard</a></h6>
                <p><i class="ion-android-star"></i><span>7.4</span> /10</p>
              </div>
            </div> -->
          </div>

          <a href="#" class="more"
            >더보기 <i class="ion-ios-arrow-right"></i
          ></a>
        </div>
      </div>
    </div>
    <!-- TODO: 메인디테일뷰 컴포넌트 추가 시작 -->
    <div v-show="detailPage">
      <DetailCom />
    </div>
    <!-- 메인디테일뷰 컴포넌트 추가 끝 -->
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
    DetailCom,
  },
  data() {
    return {
      detailPage: false,
      movie: [],
      searchMname: "",


      //페이징을 위한 변수 정의
      page: 1,
      count: 0,
      pageSize: 3,

      pageSizes: [3, 6, 9],
    }
  },
  methods: {
    showDetail() {
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
    rgba(0, 0, 0, 0.35) 25%,
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
  height: 20%;
  z-index: 3;
  background-color: black;
}

.cover03 {
  position: absolute;
  top: 90%;
  width: 100%;
  height: 9%;
  z-index: 3;
  background-color: black;
}
.parent {
  position: relative;
  padding-bottom: 40%;
  // padding-bottom: 56.25%;
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
}
.h1 {
  font-size: 20px;
}
.slider {
  padding-top: 0;
  padding-bottom: 0;
}
.more {
  color: aliceblue;
  font-size: 15px;
  float: right;
}
.movie-items {
  background: black;
}
</style>
