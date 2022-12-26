<template>
  <div>
    <!-- TODO: 영화 상세보기 페이지입니다. 메인 케러셀 -> 메인 디테일 -> 상세보기 통해서도 올 수 있고 전체 영화보기를 통해서도 들어올 수 있습나다. -->
    <div class="hero mv-single-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12"></div>
        </div>
      </div>
    </div>

    <div class="page-single movie-single movie_single">
      <div class="container">
        <div class="row ipad-width2">
          <!-- 왼쪽 사이드 바 시작 -->
          <div class="col-md-4 col-sm-12 col-xs-12">
            <div class="movie-img">
              <!-- {{ movie.posterUrl }} -->
              <img :src="movie.posterUrl" alt="poster" />
              <div class="movie-btn">
                <div class="btn-transform transform-vertical red">
                  <div>
                    <a href="#" class="item item-1 redbtn">
                      <i class="ion-play"></i>예고편보기</a
                    >
                  </div>
                  <div>
                    <!-- TODO: 유튜브 URL, 영화 이름, 예매 페이지 연결 등 백엔드 데이터 받아와야 하는 곳 -->
                    <!-- {{ movie.youtubeUrl }} -->
                    <!-- href={{ movie.youtubeUrl }} -->
                    <a
                      :href="movie.youtubeUrl"
                      class="item item-2 redbtn fancybox-media hvr-grow"
                      ><i class="ion-play"></i
                    ></a>
                  </div>
                </div>
                <div class="btn-transform transform-vertical">
                  <div>
                    <a href="/userInfoAdmin" class="item item-1 yellowbtn">
                      <i class="ion-card"></i>예매하기</a
                    >
                  </div>
                  <div>
                    <a href="/userInfoAdmin" class="item item-2 yellowbtn"
                      ><i class="ion-card"></i
                    ></a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- 왼쪽 사이드 바 끝 -->

          <div class="col-md-8 col-sm-12 col-xs-12">
            <div class="movie-single-ct main-content">
              <h1 class="bd-hd">
                {{ movie.title }}<span>{{ movie.pubdate }}</span>
              </h1>
              <div class="social-btn">
                <!-- TODO: 찜하기 구현, 클릭하면 데이터를 저장..? 어떻게 구현하는거? 하하하 -->
                <a href="#" class="parent-btn" @click="likeSave"
                  ><i class="ion-heart"></i>찜하기</a
                >
                <!-- <div class="hover-bnt"> -->
                <a href="#" class="parent-btn" id="sh-link"
                  ><i class="ion-android-share-alt"></i>공유하기</a
                >
                <!-- </div> -->
              </div>
              <div class="movie-rate">
                <div class="rate">
                  <i class="ion-android-star"></i>
                  <p>
                    <span>{{ movie.rating }}</span> /5<br />
                    <!-- <span>{{ movie.userRating }}</span> /10<br /> -->
                  </p>
                </div>
                <div class="rate-star">
                  <p>별점:</p>
                  <span
                    class="rate-star-result"
                    v-for="(i, index) in movie.starRating"
                    :key="index"
                    ><i class="ion-ios-star"></i
                  ></span>
                </div>
              </div>

              <div class="movie-tabs">
                <div class="tabs">
                  <ul class="tab-links tabs-mv">
                    <li class="active"><a href="#overview">영화정보</a></li>
                    <li><a href="#reviews">평점 및 관람평</a></li>
                    <li><a href="#media">포스터/스틸컷</a></li>
                  </ul>
                  <div class="tab-content">
                    <!-- 영화 정보 시작 -->
                    <div id="overview" class="tab active">
                      <div class="row">
                        <div class="col-md-8 col-sm-12 col-xs-12">
                          <!-- {{ currentMovie.synopsis }} -->
                          <p>
                            {{ movie.synopsis }}
                          </p>
                          <div class="title-hd-sm">
                            <h4>포스터/스틸컷</h4>
                            <div class="tab-links active">
                              <a href="#media" class="time"
                                >더보기 <i class="ion-ios-arrow-right"></i
                              ></a>
                            </div>
                          </div>
                          <!-- 표지 이미지들 (최대 4개까지 가져오고싶음) -->
                          <!-- 이미지 가져오기 test 시작 -->
                          <!-- <div>
                            <ul>
                              <li
                                :class="{ active: index == currentIndex }"
                                v-for="(data, index) in movie.imageUrl"
                                :key="index"
                                @click="setActiveDept(data, index)"
                              >
                                {{ data }}
                              </li>
                            </ul>
                          </div> -->
                          <!-- FIXME: 이렇게는 안 되는거? 그럼 어떻게 구현하면 좋을까요? 게다가 URL이 한두개가 아님요 -->
                          <span class="mvsingle-item ov-item">
                            <a
                              :class="{ active: index == currentIndex }"
                              v-for="(data, index) in movie.tempImgUrl"
                              :key="index"
                              class="img-lightbox"
                              data-fancybox-group="gallery"
                              :href="data"
                              ><img
                                class="small-thumnail"
                                :src="data"
                                alt="썸네일"
                            /></a>
                          </span>
                          <!-- 이미지 가져오기 test 끝 -->
                          <div class="title-hd-sm">
                            <h4>출연/대표작</h4>
                          </div>
                          <!-- 목록 불러오기 테스트 시작 -->
                          <!-- <div class="mvcast-item">
                            <ul class= "col-xs-6">
                              <li
                                class="cast-it"
                                style="color: #abb7c4"
                                :class="{ active: index == currentIndex }"
                                v-for="(data, index) in movie.actor"
                                :key="index"
                                @click="setActiveDept(data, index)"
                              >
                                {{ data }}
                              </li>
                            </ul>
                            <ul class="col-xs-6">
                              <li
                                class="cast-it"
                                style="color: #abb7c4"
                                :class="{ active: index == currentIndex }"
                                v-for="(data, index) in movie.role"
                                :key="index"
                                @click="setActiveDept(data, index)"
                              >
                                {{ data }}
                              </li>
                            </ul>
                          </div> -->
                          <!-- 2번째 실험 시작 -->
                          <div class="mvcast-item">
                            <ul class="col-xs-6">
                              <li
                                class="cast-it"
                                style="color: #abb7c4"
                                :class="{ active: index == currentIndex }"
                                v-for="(data, index) in movie.actor"
                                :key="index"
                                @click="setActiveDept(data, index)"
                              >
                                {{ data }}
                              </li>
                            </ul>
                            <ul class="col-xs-6">
                              <li
                                class="cast-it"
                                style="color: #abb7c4"
                                :class="{ active: index == currentIndex }"
                                v-for="(data, index) in movie.role"
                                :key="index"
                                @click="setActiveDept(data, index)"
                              >
                                {{ data }}
                              </li>
                            </ul>
                          </div>
                          <!-- <div class="mvcast-item">

                                {{ movie.actor }}
                          </div> -->

                          <!-- TODO: 밑의 식으로 반복 가능한지 데이터 들어오면 확인해보기 (ul 반복시키기) -->
                          <!-- <div class="mvcast-item">
                            <ul class="cast-it" style="color: #abb7c4">
                              <li class="cast-left">data.actor</li>
                              <li>data.major</li>
                            </ul>
                            <ul class="cast-it" style="color: #abb7c4">
                              <li class="cast-left">data.actor</li>
                              <li>data.major</li>
                            </ul>
                          </div> -->
                          <!-- 목록 불러오기 테스트 끝 -->
                          <div
                            class="title-hd-sm col-xs-12"
                            style="padding-left: 0"
                          >
                            <h4>누적관객수</h4>
                          </div>
                          <!-- <p>{{ movie.누적관객수 }}</p> -->
                          <div><h1 class="watched-people">2,945,915</h1></div>
                        </div>
                        <!-- 오른쪽 사이드 바 시작 -->
                        <!-- TODO: 감독, 장르, 개봉일, 러닝타임 등 데이터 가져오기 -->
                        <div class="col-md-4 col-xs-12 col-sm-12">
                          <div class="sb-it">
                            <h6>감독:</h6>
                            <p>{{ movie.director }}</p>
                          </div>
                          <div class="sb-it">
                            <h6>장르:</h6>
                            <!-- <p>{{ currentMovie.genre }}</p> -->
                            <p>{{ movie.genre }}</p>
                          </div>
                          <div class="sb-it">
                            <h6>개봉:</h6>
                            <p>{{ movie.pubdate }}</p>
                            <!-- <p>2022.12.14</p> -->
                          </div>
                          <div class="sb-it">
                            <h6>러닝타임:</h6>
                            <!-- <p>{{ currentMovie.러닝타임 }}</p> -->
                            <p>{{ movie.runTime }}</p>
                          </div>
                        </div>
                        <!-- 오른쪽 사이드 바 끝 -->
                      </div>
                    </div>
                    <!-- 영화 정보 끝 -->

                    <!-- 2) 리뷰 파트 시작 -->
                    <div id="reviews" class="tab review">
                      <div class="row" style="padding: 3%">
                        <div class="rv-hd">
                          <div class="div">
                            <h3>DS CINEMA</h3>
                            <h2>아바타: 물의 길</h2>
                          </div>
                        </div>
                        <div class="rv-hd">
                          <form
                            class="review-form col-xs-9"
                            name="myform"
                            id="myform"
                            method="post"
                          >
                            <fieldset>
                              <!-- <span class="review-form-style">별점을 선택해주세요</span> -->
                              <input
                                type="radio"
                                name="reviewStar"
                                value="5"
                                id="rate1"
                              /><label for="rate1">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="4"
                                id="rate2"
                              /><label for="rate2">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="3"
                                id="rate3"
                              /><label for="rate3">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="2"
                                id="rate4"
                              /><label for="rate4">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="1"
                                id="rate5"
                              /><label for="rate5">★</label>
                            </fieldset>
                            <div>
                              <textarea
                                v-model="userReview"
                                class="col-auto form-control"
                                style="fontsize: 91%"
                                type="text"
                                id="reviewContents"
                                placeholder="평점 및 영화 관람평을 작성해주세요. 주제와 무관한 리뷰 또는 스포일러는 삭제될 수 있습니다."
                              ></textarea>
                            </div>
                          </form>
                          <div class="col-xs-3">
                            <!-- 리뷰 작성 버튼에 함수 걸어주기 -->
                            <a href="#" class="redbtn" @click="saveReview"
                              >관람평 작성</a
                            >
                          </div>
                        </div>
                        <div
                          class="mv-user-review-item"
                          v-for="(data, index) in review"
                          :key="index"
                        >
                          <div class="user-infor">
                            <img
                              src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                              alt="user"
                            />
                            <div>
                              <div class="rate-star">
                                <span
                                  class="rate-star-result"
                                  v-for="(i, index) in data.rating"
                                  :key="index"
                                  ><i
                                    class="ion-ios-star"
                                    style="color: #f5b50a"
                                  ></i
                                ></span>
                              </div>
                              <!-- TODO: 우리가,, 꼭 아이디를 받아와서 넣어야 할까? -->
                              <p class="time" style="fontsize: 100%">
                                {{ data.username }}
                              </p>
                            </div>
                          </div>
                          <p style="margin-top: 2%">
                            {{ data.content }}
                          </p>
                        </div>
                        <div class="topbar-filter">
                          <label>Reviews per page:</label>
                          <select>
                            <option value="range">5 Reviews</option>
                            <option value="saab">10 Reviews</option>
                          </select>
                          <div class="pagination2">
                            <span>Page 1 of 6:</span>
                            <a class="active" href="#">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <a href="#">4</a>
                            <a href="#">5</a>
                            <a href="#">6</a>
                            <a href="#"><i class="ion-arrow-right-b"></i></a>
                          </div>
                        </div>
                      </div>
                    </div>
                    <!-- 2) 리뷰 파트 끝 -->

                    <!-- 3) 스틸컷 시작 -->
                    <div id="media" class="tab">
                      <div class="row" style="padding: 3%">
                        <div class="rv-hd">
                          <div>
                            <h3>DS CINEMA</h3>
                            <h2>아바타: 물의 길</h2>
                          </div>
                        </div>
                        <div class="title-hd-sm">
                          <h4>포스터/스틸컷<span> ({{ imageUrlLength }})</span></h4>
                        </div>
                        <div class="mvsingle-item media-item">
                          <div>
                            <!-- <span
                              class="rate-star-result"
                              v-for="(i, index) in userRating"
                              :key="index"
                              ><i class="ion-ios-star"></i
                            ></span> -->
                            <div class="mvsingle-item ov-item">
                              <a
                                :class="{ active: index == currentIndex }"
                                v-for="(data, index) in movie.imageUrl"
                                :key="index"
                                class="img-lightbox"
                                data-fancybox-group="gallery"
                                :href="data"
                                ><img
                                  class="small-thumnail"
                                  :src="data"
                                  alt="썸네일"
                              /></a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <!-- 3) 스틸컷 끝 -->
                  </div>
                </div>
              </div>
            </div>
          </div>
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
    this.cutNames();
  },
  data() {
    return {
      movie: {
        title: "아바타: 물의 길",
        synopsis:
          " 아바타: 물의 길 은 판도라 행성에서 '제이크 설리'와 '네이티리'가 이룬 가족이 겪게 되는 무자비한 위협과 살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다. 월드와이드 역대 흥행 순위 1위를 기록한 전편에 이어 제임스 카메론 감독이 13년만에 선보이는 영화로, 샘 워싱턴, 조 샐다나, 시고니 위버, 스티븐 랭, 케이트 윈슬렛이출연하고 존 랜도가 프로듀싱을 맡았다.",
        genre: "액션, 어드벤쳐, SF",
        pubdate: "2022.12.14",
        rating: 4.5,
        starRating: 0, // 나중에 백엔드에서 평점 가져오기 (TODO: 정수로 받아야 합니다,,)
        runTime: "192h",
        genre: "액션, 어드벤쳐, SF",
        director: "최아리",
        actor: "최아리,강수빈,정주희",
        role: "아바타1,아바타2,아바타3",
        watchedPeople: "2,945,915",
        review: "",
        youtubeUrl: "https://www.youtube.com/watch?v=7Q70_m-59O8&t=7s",
        posterUrl:
          "https://movie-phinf.pstatic.net/20221215_185/1671091761840XXpCR_JPEG/movie_image.jpg?type=m665_443_2", // 포스터 주소는 1개만 받으면 됩니다.
        imageUrl:
          "https://movie-phinf.pstatic.net/20221110_282/16680463363384H0hJ_JPEG/movie_image.jpg?type=m665_443_2,https://movie-phinf.pstatic.net/20221110_147/1668046384890YVGlu_JPEG/movie_image.jpg?type=m665_443_2,https://movie-phinf.pstatic.net/20221110_141/1668046432203AKL6P_JPEG/movie_image.jpg?type=m665_443_2,https://movie-phinf.pstatic.net/20221123_280/1669180665184phjkW_JPEG/movie_image.jpg?type=m665_443_2", // 약 4~6개 정도 주소 백엔드에 넣어두는건 어떤지 고민입니다.
        tempImgUrl: [],
      },
      review: [
        {
          movieCode: 1,
          rating: 4,
          username: "choiari1002",
          content: "그래픽이 너무 멋졌어요.",
        },
        {
          movieCode: 1,
          rating: 5,
          username: "subin1234",
          content: "가족들이랑 재밌게 봤습니다.",
        },
        {
          movieCode: 1,
          rating: 3,
          username: "juhee5678",
          content: "재밌지만 아쉬워요.",
        },
      ],
      userReview: "",
      userStarRaing: 3,
      imageUrlLength: 0
    };
  },
  methods: {
    cutNames() {
      this.movie.actor = this.movie.actor.split(",");
      this.movie.role = this.movie.role.split(",");
      this.movie.imageUrl = this.movie.imageUrl.split(",");
      // 가져온 이미지 url 개수
      this.imageUrlLength = this.movie.imageUrl.length;
      // 썸네일 이미지 2장만 보이게 설정
      this.movie.tempImgUrl[0] = this.movie.imageUrl[0];
      this.movie.tempImgUrl[1] = this.movie.imageUrl[1];
      // 데이터 들어온 평점 내림하기 (별 반복문 돌리기 위해서)
      this.movie.starRating = Math.floor(this.movie.rating);
    },
    likeSave() {
      alert("저장되었습니다. 마이페이지에서 확인 가능합니다 :)");
    },
    // axios, 모든 영화 정보 조회 요청 함수
    // TODO: but 문제는 우리는 앞에서 클릭하면 들어오는 영화의 정보만 가지고 들어와야 하기 때문에 다르게 구현해야한다. 일단 대충 가져옴
    retrieveMovie() {
      MovieDataService.getAll()
        .then((response) => {
          this.movie = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    // FIXME: 새로운 리뷰 저장 함수
    saveReview() {
      // 임시 객체 변수 -> springboot 전송
      // 백데이터에 우리가 새로 받은 userStarRaing, 넣어주기
      // BUT 그렇다면 username, movieCode 등은 자동으로 넘어갈 수 있는지
      let data = {
        rating: this.userStarRaing,
        content: this.userReview,
      };

      // insert 요청 함수 호출
      DeptDataService.create(data)
        .then((response) => {
          this.dept.dno = response.data.dno;
          console.log(response.data);
          this.submitted = true;
        })
        // 실패하면 .catch() 결과가 전송됨
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>

<style scoped>
.movie-img {
  position: fixed;
}
/*movie single hero*/
/* TODO: 이미지 이걸로 통일하는거 어떤지 물어보기 */
.mv-single-hero {
  background: url(@/assets/images_choi/Views/choi/MovieDetail/movie-theater02.jpg)
    no-repeat;
  /* height: 598px; */
  width: 100%;
}
.watched-people {
  font-size: 500%;
  /* text-align: center; */
  color: grey;
  margin-top: 15%;
}
.rate-star-result {
  padding: 0%;
  margin: 0%;
}
.movie-image-box {
  margin-right: 1%;
}

/* 리뷰쓰기 css */
#myform fieldset {
  display: inline-block;
  direction: rtl;
  border: 0;
  /* width: 500%; */
  /* height: 300%; */
}
#myform fieldset legend {
  text-align: right;
}
#myform input[type="radio"] {
  display: none;
}
#myform label {
  font-size: 3em;
  color: transparent;
  text-shadow: 0 0 0 #f0f0f0;
}
#myform label:hover {
  text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
}
#myform label:hover ~ label {
  text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
}
#myform input[type="radio"]:checked ~ label {
  text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
}
#reviewContents {
  width: 100%;
  height: 150px;
  padding: 10px;
  box-sizing: border-box;
  border: solid 1.5px #d3d3d3;
  border-radius: 5px;
  font-size: 16px;
  resize: none;
}
.review-form {
  padding-left: 0%;
  margin-bottom: 5%;
}
.review-form-style {
  color: #999;
}
.list {
  text-align: left;
  max-width: 750px;
  margin: auto;
}
/* .small-thumnail {
  width: 20%;
  height: 50%;
} */
</style>
