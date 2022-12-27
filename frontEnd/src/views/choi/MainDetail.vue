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
          <div class="close-button"></div>
          <!-- 영화 줄거리 시작 -->
          <div class="short-details">
            <div class="col-xs-12 short-detail01">
              {{ movie.synopsis }}
            </div>
          </div>
          <!-- 영화 줄거리 끝 -->
          <!-- 동영상 위 글자 시작 -->
          <div class="slider sliderv2">
            <div class="container">
              <div class="row">
                <div class="slider-single-item">
                  <div class="movie-item">
                    <div class="row">
                      <div class="col-xs-12 title-detail">
                        <div class="title-in" style="padding-top: 7%">
                          <h1>
                            <a href="#"
                              >{{ movie.title
                              }}<span>{{ movie.pubdate }}</span></a
                            >
                          </h1>
                          <div class="social-btn" style="margin-top: 1%">
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
                          <div class="mv-details">
                            <p>
                              <i class="ion-android-star"></i
                              ><span>{{ movie.rating }}</span> /5
                            </p>
                            <ul class="mv-infor">
                              <li>{{ movie.pubdate }} 개봉</li>
                              <li>{{ movie.runTime }} 분</li>
                            </ul>
                          </div>
                          <div class="btn-transform transform-vertical">
                            <div>
                              <a href="#" class="item item-1 redbtn"
                                >예매하기</a
                              >
                            </div>
                            <div>
                              <a href="#" class="item item-2 redbtn hvrbtn"
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
          <iframe
            class="video"
            src="https://www.youtube.com/embed/BYG_xR6goA0?rel=0&loop=1&playlist=BYG_xR6goA0&autoplay=1&mute=1"
            title="YouTube video player"
            frameborder="0"
            allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
            allowfullscreen
          ></iframe>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
/* eslint-disable */
import custom from "@/assets/js/custom.js";
export default {
  mounted() {
    custom();
    this.changeUrl();
  },
  data() {
    return {
      movie: {
        title: "아바타: 물의 길",
        synopsis:
          " 아바타: 물의 길 은 판도라 행성에서 '제이크 설리'와 '네이티리'가 이룬 가족이 겪게 되는 무자비한 위협과 살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다. 월드와이드 역대 흥행 순위 1위를 기록한 전편에 이어 제임스 카메론 감독이 13년만에 선보이는 영화로, 샘 워싱턴, 조 샐다나, 시고니 위버, 스티븐 랭, 케이트 윈슬렛이출연하고 존 랜도가 프로듀싱을 맡았다.",
        genre: "액션, 어드벤쳐, SF",
        pubdate: "2022.12.14",
        rating: 4.5, // 백엔드에서 가져온 평점
        runTime: "192",
        genre: "액션, 어드벤쳐, SF",
        director: "최아리",
        actor: "최아리,강수빈,정주희",
        role: "아바타1,아바타2,아바타3",
        watchedPeople: "2,945,915",
        review: "",
        youtubeUrl: "https://youtu.be/d9MyW72ELq0",
        posterUrl:
          "https://movie-phinf.pstatic.net/20221215_185/1671091761840XXpCR_JPEG/movie_image.jpg?type=m665_443_2", // 포스터 주소는 1개만 받으면 됩니다.
        imageUrl:
          "https://movie-phinf.pstatic.net/20221110_282/16680463363384H0hJ_JPEG/movie_image.jpg?type=m665_443_2,https://movie-phinf.pstatic.net/20221110_147/1668046384890YVGlu_JPEG/movie_image.jpg?type=m665_443_2,https://movie-phinf.pstatic.net/20221110_141/1668046432203AKL6P_JPEG/movie_image.jpg?type=m665_443_2,https://movie-phinf.pstatic.net/20221123_280/1669180665184phjkW_JPEG/movie_image.jpg?type=m665_443_2", // 약 4~6개 정도 주소 백엔드에 넣어두는건 어떤지 고민입니다.
        tempImgUrl: [],
      },
      changedUrl: "",
    };
  },
  methods: {
    changeUrl() {
      // TODO: 배경에 유튜브 비디오를 넣기 위해서 주소에서 필요한 부분만 잘라와야 합니다.
      const cutYoutubeUrl = this.movie.youtubeUrl.substring(17); // ex.kihrFxwdMb4
      // 다른 주소랑 붙여주기
      // "https://www.youtube.com/embed/BYG_xR6goA0?rel=0&loop=1&playlist=BYG_xR6goA0&autoplay=1&mute=1"
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
  height: 10%;
  z-index: 3;
  background-color: black;
}

.cover03 {
  position: absolute;
  top: 90%;
  width: 100%;
  height: 10%;
  z-index: 3;
  background-color: black;
}

.close-button {
  position: absolute;
  /* top: 90%; */
  /* width: 100%;
  height: 10%; */
  z-index: 3;
}

.short-details {
  position: absolute;
  top: 80%;
  z-index: 3;
}

.short-detail01 {
  text-align: left;
  color: white;
  padding-top: 2%;
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
