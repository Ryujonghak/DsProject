<template>
  <div class="home">
    <!-- TODO: 메인에서 영화 클릭시 나오는 페이지 입니다. (유튜브 동영상 연결) -->
    <!-- 배경 검정 div -->
    <div style="background: black">
      <!-- 비디오 test -->
      <div class="mainMovie" style="background: black">
        <div class="container parent">
          <div class="cover01"></div>
          <div class="cover02"></div>
          <div class="cover03"></div>
          <!-- <div class="close-button"></div> -->
          <!-- 동영상 위 글자 시작 -->
          <div class="slider sliderv2">
            <div class="container">
              <div class="row">
                <div class="slider-single-item">
                  <div class="movie-item">
                    <div class="row">
                      <div class="col-xs-12 title-detail">
                        <div
                          class="title-in col-xs-12"
                          style="padding-top: 50px; width: 1000px"
                        >
                          <h1 class="col-xs-12" style="width: 1000px">
                            <a href="#"
                              >{{ currentMovie.movienm
                              }}<span>{{ currentMovie.prdtyear }}</span></a
                            >
                          </h1>
                          <div
                            class="social-btn col-xs-12"
                            style="padding-top: 2%; width: 1000px; height: 50px"
                          >
                            <a href="/movieDetail" class="parent-btn"
                              ><i class="ion-play"></i>상세보기 ></a
                            >
                            <a href="#" class="parent-btn" @click="likeSave"
                              ><i class="ion-heart"></i>찜하기</a
                            >
                            <a href="#" class="parent-btn" id="sh-link"
                              ><i class="ion-android-share-alt"></i>공유하기</a
                            >
                          </div>
                          <div
                            class="mv-details col-xs-12"
                            style="width: 1000px; margin-bottom: 0px"
                          >
                            <p>
                              <i class="ion-android-star"></i
                              ><span>{{ currentMovie.raiting }}</span> /10
                            </p>
                            <ul class="mv-infor">
                              <li>{{ currentMovie.opendt }} 개봉</li>
                              <li>{{ currentMovie.showtm }} 분</li>
                            </ul>
                          </div>
                          <div
                            class="btn-transform transform-vertical col-xs-12"
                            style="width: 1000px"
                          >
                            <div class="col-xs-12">
                              <a
                                @click="showSeatPage"
                                class="item item-1 redbtn"
                                >예매하기</a
                              >
                            </div>
                            <div class="col-xs-12">
                              <a
                                class="item item-2 redbtn hvrbtn"
                                @click="showSeatPage"
                                >예매하기</a
                              >
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- 동영상 위 글자 끝 -->
          <!-- :src="changedUrl" -->
          <iframe
            class="video col-xs-12"
            :src="changedUrl"
            title="YouTube video player"
            frameborder="0"
            allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
            allowfullscreen
          ></iframe>
          <!-- 영화 줄거리 시작 -->
          <div class="short-details col-xs-12" style="width: 1000px">
            <div
              class="short-detail01"
              style="padding-top: 0px; margin-top: 0px"
            >
              {{ currentMovie.plot }}
            </div>
          </div>
          <!-- 영화 줄거리 끝 -->
        </div>
      </div>
    </div>
    <!-- TODO: 예매페이지뷰 컴포넌트 추가 시작 -->
    <div v-show="seatPage">
      <SeatView />
    </div>
    <!-- 예매페이지뷰 컴포넌트 추가 끝 -->
  </div>
</template>

<script>
/* eslint-disable */
import custom from "@/assets/js/custom.js";
import SeatView from "@/views/kim/SeatView.vue";
export default {
  mounted() {
    custom();
    this.changeUrl();
  },
  components: {
    SeatView,
  },
  props: ["movieProps"],
  data() {
    return {
      seatPage: false,
      currentMovie: this.movieProps,
      changedUrl: "",
    };
  },
  methods: {
    showSeatPage() {
      this.seatPage = !this.seatPage;
    },
    changeUrl() {
      // TODO: 배경에 유튜브 비디오를 넣기 위해서 주소에서 필요한 부분만 잘라와야 합니다.
      const cutYoutubeUrl = this.currentMovie.utubeurl.substring(17); // ex.kihrFxwdMb4
      // 다른 주소랑 붙여주기
      this.changedUrl =
        "https://www.youtube.com/embed/" +
        cutYoutubeUrl +
        "?rel=0&loop=1&playlist=" +
        cutYoutubeUrl +
        "&autoplay=1&mute=1";
    },
    likeSave() {
      alert("저장되었습니다. 마이페이지에서 확인 가능합니다 :)");
    },
  },
};
</script>

<style scoped>
/* 비디오 css */
.parent {
  position: relative;
  /* padding-bottom: 40%; */
  padding-bottom: 56.25%;
}
.cover01 {
  /* 그라데이션 주는 css */
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
  /* 영상 윗 부분 잘라주는 css */
  position: absolute;
  width: 100%;
  height: 10%;
  z-index: 3;
  background-color: black;
}

.cover03 {
  position: absolute;
  top: 80%;
  width: 100%;
  height: 20%;
  z-index: 3;
  background-color: black;
}

.short-details {
  position: absolute;
  top: 82%;
  z-index: 3;
}

.short-detail01 {
  position: absolute;
  text-align: left;
  color: white;
}

.video {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  width: 100%;
  height: 100%;
}
</style>
