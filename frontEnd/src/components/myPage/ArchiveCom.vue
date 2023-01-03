<template>
  <div>
    <!--preloading-->
    <!-- <div id="preloader">
        <img class="logo" src="images/logo1.png" alt="" width="119" height="58" />
        <div id="status">
          <span></span>
          <span></span>
        </div>
      </div> -->

    <!-- 상단 페이지 제목 -->
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>{{ CurrentUser.name }}’s archive</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY ARCHIVE</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- ㅇㅇㅇ 여기 div 원본은 testCom에 있음-->
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 -->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-img">
                <!-- src="images/uploads/user-img.png" -->
                <img
                  class="profileImg"
                  src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                  alt=""
                />
                <br />
              </div>
              <div class="user-fav">
                <ul>
                  <li class="active">
                    <router-link to="">프로필</router-link>
                  </li>
                  <!-- 프로필 로그인 정보 표시 시작-->
                  <li style="color: white">
                    <strong style="color: white">이름 </strong>
                    <label>{{ CurrentUser.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ CurrentUser.username }}</label>
                  </li>
                  <!-- 프로필 로그인 정보 표시 끝 -->
                </ul>
              </div>

              <div class="user-fav">
                <p>Account Details</p>
                <ul>
                  <li class="active">
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li>
                    <router-link to="/myticket">예매내역</router-link>
                  </li>
                  <li>
                    <router-link to="/mywish">찜한 영화</router-link>
                  </li>
                  <li>
                    <router-link to="/myqna">나의 문의내역</router-link>
                  </li>
                  <li>
                    <router-link to="/myprofile">개인정보 수정</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <p>Others</p>
                <ul>
                  <!--                  <li><a href="#">Log out</a></li>-->
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- 2) 리뷰 파트 시작 -->
            <div class="topbar-filter user">
              <p>나의 리뷰: 영화 관람평가</p>
              <a href="userfavoritegrid.html" class="grid"
                ><i class="ion-grid"></i
              ></a>
            </div>

            <!-- TODO: 리뷰작성 -->
            <div id="reviews" class="tab review">
              <div class="row" style="padding: 3%">
                <div class="rv-hd">
                  <div class="div">
                    <!-- 예매내역/내정보-나의아카이브 에서 리뷰쓰기 클릭시 정보 넘어가야함 -->
                    <h2>{{ watchedMovie.movieNm }}</h2>
                  </div>
                </div>
                <div>
                  <div class="rv-hd">
                    <form
                      class="review-form col-xs-12"
                      name="myform"
                      id="myform"
                      method="post"
                    >
                      <!-- 리뷰 작성폼 시작 -->
                      <div>
                        <fieldset>
                          <span class="review-form-style"
                            >별점을 선택해주세요</span
                          >
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
                        <textarea
                          class="col-auto form-control"
                          style="fontsize: 91%"
                          type="text"
                          id="reviewContents"
                          required
                          placeholder="평점 및 영화 관람평을 작성해주세요. 주제와 무관한 리뷰 또는 스포일러는 삭제될 수 있습니다."
                        ></textarea>
                        <!-- <textarea
                          class="col-auto form-control"
                          style="fontsize: 91%"
                          type="text"
                          id="reviewContents"
                          required
                          v-model="review.content"
                          placeholder="평점 및 영화 관람평을 작성해주세요. 주제와 무관한 리뷰 또는 스포일러는 삭제될 수 있습니다."
                        ></textarea> -->
                      </div>
                      <!-- 리뷰작성폼 끝 -->
                    </form>

                    <!-- 리뷰등록 버튼 -->
                    <div v-if="!submitted">
                      <div class="col-xs-3">
                        <!-- TODO: 리뷰 등록 버튼에 함수 걸어주기 -->
                        <a href="#" class="redbtn" @click="saveReview"
                          >관람평 등록</a
                        >
                      </div>
                      <!-- 등록버튼 끝 -->
                    </div>

                    <div v-else>
                      <div class="alert alert-success" role="alert">
                        관람평이 등록되었습니다.!
                      </div>
                      <router-link to="/archive" class="alert alert-success"
                        >뒤로</router-link
                      >
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- 리뷰작성 끝 -->

            <!-- 나의 리뷰 메뉴바  -->
            <div class="topbar-filter user">
              <p>
                나의 리뷰 <span>8{{}} 리뷰갯수 셀수있을까 movies</span> in total
              </p>
              <a href="userfavoritegrid.html" class="grid"
                ><i class="ion-grid"></i
              ></a>
            </div>

            <!-- 나의 리뷰 조회 시작 -->
            <div class="row">
              <!-- 리뷰 : 1 -->
              <div class="col-xs-12 movie-item-style-2 userrate">
                <div class="mv-user-review-item"></div>
                <!-- 영화정보 -->
                <div class="col-xs-3">
                  <div class="mv-item-infor">
                    <br />
                    <h6>
                      <a href="#"
                        >{{ watchedMovie.movieNm }}
                        <span> ({{ watchedMovie.openDt }}) </span></a
                      >
                    </h6>
                    <p>
                      Run Time: {{ watchedMovie.showTm }}분 <br /><a
                        >{{ watchedMovie.watchGradeNm }}
                      </a>
                    </p>
                    <span class="time sm">{{ watchedMovie.scheNo }}</span>
                    <br />
                  </div>
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="row" style="padding: 3%">
                    <!-- ㅇㅇ -->
                    <div class="user-infor">
                      <div class="mv-user-review-item">
                        <!-- 별점 v-for 반복문 -->
                        <div class="rate-star">
                          <h6>
                            나의 별점
                            <span
                              class="rate-star-result"
                              v-for="(i, index) in reviewMovie.userStarRating"
                              :key="index"
                              ><i class="ion-ios-star"></i
                            ></span>
                          </h6>
                        </div>
                      </div>
                      <p style="margin-top: 2%">
                        {{ reviewMovie.userReview }}
                      </p>
                    </div>
                  </div>
                </div>
                <!-- 리뷰삭제 버튼 -->
                <div class="col-xs-2 deletebtn">
                  <div class="movie-item-style-2">
                    <!-- FIXME: 클릭이벤트-리뷰삭제 -->
                    <a href="#" class="redbtn" @click="deleteReview">삭제</a>
                  </div>
                </div>
                <!-- 리뷰삭제 버튼 끝 -->
              </div>
              <!-- 리뷰 : 2 -->
              <div class="col-xs-12 movie-item-style-2 userrate">
                <div class="mv-user-review-item"></div>
                <!-- 영화정보 -->
                <div class="col-xs-3">
                  <div class="mv-item-infor">
                    <br />
                    <h6>
                      <a href="#"
                        >{{ watchedMovie.movieNm }}
                        <span> ({{ watchedMovie.openDt }}) </span></a
                      >
                    </h6>
                    <p>
                      Run Time: {{ watchedMovie.showTm }}분 <br /><a
                        >{{ watchedMovie.watchGradeNm }}
                      </a>
                    </p>
                    <span class="time sm">{{ watchedMovie.scheNo }}</span>
                    <br />
                  </div>
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="row" style="padding: 3%">
                    <!-- ㅇㅇ -->
                    <div class="user-infor">
                      <div class="mv-user-review-item">
                        <!-- 별점 v-for 반복문 -->
                        <div class="rate-star">
                          <h6>
                            나의 별점
                            <span
                              class="rate-star-result"
                              v-for="(i, index) in reviewMovie.userStarRating"
                              :key="index"
                              ><i class="ion-ios-star"></i
                            ></span>
                          </h6>
                        </div>
                      </div>
                      <p style="margin-top: 2%">
                        아바타 2는 아직 안 봤는데 넘 기대되구요,, 1도 재밌게
                        봤었구요,, 저는 집에 가고 싶구요,, 리뷰쓰기는 또 어떻게
                        작동시켜야 하는지 까마득 하구요,, 시간은 흐르는데 다
                        끝난건 없는거 같구요,, 자신감 하락하구요,, ㅜㅜ,, 너무
                        혼내지 말기,, 다시 리뷰로 돌아가서 아바타 언제 보려나
                        싶지만 얼른 보고싶고 선리뷰 별 드립니다. 사실 이건
                        영화를 봐야지 쓸 수 있는 리뷰랍니다.
                      </p>
                    </div>
                  </div>
                </div>
                <!-- 리뷰삭제 버튼 -->
                <div class="col-xs-2 deletebtn">
                  <div class="movie-item-style-2">
                    <!-- FIXME: 클릭이벤트-리뷰삭제 -->
                    <a href="#" class="redbtn" @click="deleteReview">삭제</a>
                  </div>
                </div>
                <!-- 리뷰삭제 버튼 끝 -->
              </div>
            </div>
            <!-- 나의 리뷰 조회 끝 -->

            <!-- 페이지 -->
            <ul class="pagination">
              <li class="icon-prev">
                <a href="#"><i class="ion-ios-arrow-left"></i></a>
              </li>
              <li class="active"><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">...</a></li>
              <li><a href="#">21</a></li>
              <li><a href="#">22</a></li>
              <li class="icon-next">
                <a href="#"><i class="ion-ios-arrow-right"></i></a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
/* eslint-disable */

// import axios from "axios";   // 프로필이미지 업로드
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";

export default {
  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      CurrentUser: {
        email: "",
        password: "",
        username: "",
        phone: null,
        year: null, 
        month: null,
        day: null,
        name: "",
        answer: "", // 비번확인용 정답
      },
      message: "",

      // FIXME: 예매한 영화.. 작성중
      watchedMovie: {
        username: "", // 아이디
        paidDate: "", // 예매일자
        reservNo: "", // 예매번호
        openDt: "2022", // 개봉년도
        movieNm: "눈의 여왕5: 스노우 프린세스와 미러랜드의 비밀", // 영화제목   -> title로 바꿔야하나?
        posterURL:
          "https://movie-phinf.pstatic.net/20221215_185/1671091761840XXpCR_JPEG/movie_image.jpg?type=m665_443_2", // 포스터 주소는 1개만 받으면 됩니다.",  // 영화포스터이미지
        directors: "제임스카메론", // 감독
        rating: 4.3, // 평점(관람객)
        starRating: 4, // 나중에 백엔드에서 평점 가져오기 (정수로 받아야 합니다,,)
        showTm: "192", // 상영시간
        watchGradeNm: "12세관람가", // 관람등급
        scheNo: "2022/12/28", // 상영스케쥴
        seatNo: "I3", // 좌석번호
        cnt: "1", // 예매수량
        price: "15000", // 금액
      },
      // TODO: 리뷰
      currentReview: null,
      message: "",
      reviewMovie: {
        userStarRating: 2, // 사용자별점
        userReview: [
          "클릭버튼으로 생성된 영화번호? 예매번호를 넘겨주면 그안에 저장된 영화제목 등 정보를 불러서 출력하도록 만들어야 함...... 리뷰내용이 너무 길어지니까 오류가 나네... 그래서 []안에 넣으니까 되긴한데 쌍따옴표까지 같이 출력돼서 약간 곤란쓰............................................................................................일단 리뷰를 이만큼 길게 쓰는 사람도 있겠지 하지만 나는 아니고 여기에다가 아무말이나 쓰고 있을 뿐이고 집에가고싶을 뿐이고 잠온다... ", // 리뷰내용
        ],
      },
      // 리뷰작성후 버튼 클릭시 true로 변경
      submitted: false,
    };
  },
  methods: {
    // uploadImage: function () {
    //   let form = new FormData();
    //   let image = this.$refs["image"].files[0];
    //
    //   form.append("image", image);
    //
    //   axios
    //     .post("/upload", form, {
    //       header: { "Content-Type": "multipart/form-data" },
    //     })
    //     .then(({ data }) => {
    //       this.images = data;
    //     })
    //     .catch((err) => console.log(err));
    // },
    // clickInputTag: function () {
    //   this.$refs["image"].click();
    // },
    
    getUser(username) {
      // 종학이 백엔드 데이터 받는 함수
      username = this.$store.state.auth.user.username;
      // username = "forbob";
      console.log(username);
      userService
        .getUserUsername(username)
        .then((response) => {
          this.CurrentUser = {
            email: response.data.email,
            password: response.data.password,
            username: response.data.username,
            phone: response.data.phone,
            year: response.data.year,
            month: response.data.month,
            day: response.data.day,
            name: response.data.name,
            answer: response.data.answer,
          };
          console.log(this.CurrentUser);
          // console.log(response.data);
        })
        .catch((err) => console.log(err));
    },
    // 아리 별점
    cutNames() {
      // this.watchedMovie.starRating = Math.floor(this.watchedMovie.rating);
      this.watchedMovie.starRating = Math.floor(this.watchedMovie.rating);
      // alert(this.movie.starRating);
    },
    // FIXME: 새로운 리뷰 저장 함수
    saveReview() {
      // 임시 객체 변수 -> springboot 전송
      // 백데이터에 우리가 새로 받은 userStarRaing, 넣어주기
      // BUT 그렇다면 username, movieCode 등은 자동으로 넘어갈 수 있는지
      let data = {
        rating: this.userStarRating,
        content: this.userReview,
      };
      // insert 요청 함수 호출
      ReviewDataService.create(data)
        .then((response) => {
          this.review.id = response.data.id;
          console.log(response.data);
          this.submitted = true;
        })
        // 실패하면 .catch() 결과가 전송됨
        .catch((e) => {
          console.log(e);
        });
    },
    newReview() {
      // 새양식 다시 보여주기, 변수 초기화
      this.submitted = false;
      this.review = {};
    },

    // FIXME: 리뷰 작성버튼 눌러서 저장하기
    // saveReview() {
    // },
    // FIXME: 리뷰 삭제
    deleteReview() {
      ReviewDataService.delete(this.currentReview.id)
        .then((response) => {
          console.log(response.data);
          this.$router.push("/archive");
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    custom();

    (this.message = ""), this.getUser(); // 종학이 백엔드 데이터
    this.getReview(this.$route.params.id); // 리뷰 id로 가져오기
  },
};
</script>

<style scoped>
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

.deletebtn {
  margin-top: 10%;
}

/* 배경이미지 : 아리걸로 통일 */
.user-hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
  /* height: 598px; */
  width: 100%;
}

/* 마이페이지-프로필 이미지크기 수정 */
.profileImg {
  -ms-interpolation-mode: bicubic;
  border: 0;
  /* height: auto; */
  max-height: 120px;
  /* max-width: 100%; */
  max-width: 120px;
  vertical-align: middle;
}
</style>
