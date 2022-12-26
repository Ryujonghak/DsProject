<template>
  <div>
    <!-- TODO: 만들어만 놓고 사용은 안하는 파일  -->
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
              <h1>{{ CurrentUser.name }}’s profile</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>Profile</li>
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
              <!-- 프로필 이미지 업로드 추가 v-if -->
              <!-- <div v-if="images" class="user-img"> -->
              <div class="user-img">
                <img src="images/uploads/user-img.png" alt="" />
                <br />
                <!-- <a href="#" class="redbtn">Change avatar</a> -->
              </div>
              <!-- 프로필 이미지 업로드 추가 v-else -->
              <!-- <div
                        v-else
                        class="w-full h-full flex items-center justify-center cursor-pointer hover:bg-pink-100"
                        @click="clickInputTag()"
                    >
                      <input
                          ref="image"
                          id="input"
                          type="file"
                          name="image"
                          accept="image/*"
                          multiple="multiple"
                          class="hidden"
                          @change="uploadImage()"
                      />
                      <svg
                          class="w-8 h-8"
                          xmlns="http://www.w3.org/2000/svg"
                          fill="none"
                          viewBox="0 0 24 24"
                          stroke="currentColor"
                      >
                        <path
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M12 9v3m0 0v3m0-3h3m-3 0H9m12 0a9 9 0 11-18 0 9 9 0 0118 0z"
                        />
                      </svg>
                    </div> -->
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
                    <router-link to="/myprofile">개인정보 수정</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <p>Others</p>
                <ul>
                  <li>
                    <router-link to="/myqna">나의 문의내역</router-link>
                  </li>
                  <li><a href="#">Log out</a></li>
                  <li><a href="#">탈퇴하기</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user">
              <p>나의 리뷰 <span>8 movies</span> in total</p>
              <a href="userfavoritegrid.html" class="grid"
                ><i class="ion-grid"></i
              ></a>
            </div>

            <!-- TODO: test -->
            <div id="reviews" class="tab review">
              <div class="row" style="padding: 3%">
                <div class="rv-hd">
                  <div class="mv-user-review-item">
                    <div class="user-infor">
                
                      <div>
                        <div class="no-star">
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star"></i>
                          <i class="ion-android-star last"></i>
                        </div>
                        <!-- TODO: 우리가,, 꼭 아이디를 받아와서 넣어야 할까? -->
                        <p class="time" style="fontsize: 100%">choiari1002</p>
                      </div>
                    </div>
                    <p style="margin-top: 2%">
                      아바타 2는 아직 안 봤는데 넘 기대되구요,, 1도 재밌게
                      봤었구요,, 저는 집에 가고 싶구요,, 리뷰쓰기는 또 어떻게
                      작동시켜야 하는지 까마득 하구요,, 시간은 흐르는데 다
                      끝난건 없는거 같구요,, 자신감 하락하구요,, ㅜㅜ,, 너무
                      혼내지 말기,, 다시 리뷰로 돌아가서 아바타 언제 보려나
                      싶지만 얼른 보고싶고 선리뷰 별 드립니다. 사실 이건 영화를
                      봐야지 쓸 수 있는 리뷰랍니다.
                    </p>
                  </div>
                </div>
              </div>
            </div>

            <div class="topbar-filter user">
              <p>나의 아카이브 <span>8 movies</span> in total</p>
              <label>Sort by:</label>
              <select>
                <option value="range">-- 개봉일순 --</option>
                <option value="saab">-- 평점높은순 --</option>
              </select>
              <a href="userfavoritelist.html" class="list"
                ><i class="ion-ios-list-outline active"></i
              ></a>
              <a href="userfavoritegrid.html" class="grid"
                ><i class="ion-grid"></i
              ></a>
            </div>

            <div class="flex-wrap-movielist">
              <!-- 상영작 1 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <!-- 리뷰테이블에서 사용자 평점 가져오기 -->
                  <p class="time sm-text">나의 별점:</p>
                  <i class="ion-android-star"></i><span>4.0</span> /5

                  <!-- <h6>Best Musical movie</h6> -->
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>

              <!-- 상영작 2 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 3 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 4 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 5 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 6 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 7 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 8 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <!-- TODO: style.css _ hvr-inner 수정함 -->
                <div class="hvr-inner">
                  <h6>
                    <a href="#">영웅 <span>(2022)</span></a>
                  </h6>
                  <p>
                    Run Time: {{}} 2h 21’ <br />
                    Director: {{}} dd <br />
                    Watched: 2022/12/22
                  </p>
                  <p class="time sm-text">your reviews:</p>
                  <h6>Best Musical movie in my opinion</h6>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">영웅</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
            </div>

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
        answer: "",
      },
      message: "",
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

    // 종학이 백엔드 데이터 받는 함수
    getUser(username) {
      username = "forbob";
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
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
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
</style>
