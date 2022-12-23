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

    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 -->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-img">
                <img src="images/uploads/user-img.png" alt="" />
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

              <!-- todo: active가 안됨 -->
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
                  <li><a href="#">탈퇴하기</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- 프로필 -->
            <!-- <div class="container mb-4">
              <img
                src="@/assets/image/av.png"
                class="mt-neg100 mb-4 rounded-circle"
                width="128"
              />
              <h1 class="font-weight-bold title">Sal(닉네임)</h1>
              <p>이름, 아이디, 이메일 중 하나 ..</p>
            </div> -->

            <!-- 즐겨찾는 영화관 -->
            <div class="page-single movie_list">
              <div class="container">
                <div class="row ipad-width2">
                  <div class="col-md-8 col-sm-12 col-xs-12">
                    <!-- 즐겨찾는 영화관 -->
                    <div class="topbar-filter">
                      <p>즐겨찾는 영화관 <span>1</span> in total</p>

                      <a href="moviegrid.html" class="grid"
                      ><i class="ion-grid"></i
                      ></a>
                    </div>
                    <!-- 내용 -->
                    <p>dd</p>
                  </div>
                </div>
              </div>
            </div>

            <!-- 오른쪽 본문 내용 -->
            <div class="col-md-11 col-sm-12 col-xs-12">
              <div class="topbar-filter user">
                <p>나의 아카이브 <span>8 movies</span> in total</p>
                <select>
                  <option value="range">-- 개봉일순 --</option>
                  <option value="saab">-- 평점높은순 --</option>
                </select>
                <!-- <a href="userfavoritelist.html" class="list"
                ><i class="ion-ios-list-outline active"></i
              ></a> -->
                <!-- <a href="userfavoritegrid.html" class="grid"
                  ><i class="ion-grid"></i
                ></a> -->
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
              <!-- <ul class="pagination">
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
            </ul> -->
            </div>

            <!-- 예매내역 -->
            <div class="page-single movie_list">
              <div class="container">
                <div class="row ipad-width2">
                  <div class="col-md-8 col-sm-12 col-xs-12">
                    <!-- 예매내역 -->
                    <div class="topbar-filter">
                      <p>예매내역 <span>1</span> in total</p>

                      <a href="moviegrid.html" class="grid"
                      ><i class="ion-grid"></i
                      ></a>
                    </div>

                    <!-- 예매한 영화-->
                    <div class="movie-item-style-2">
                      <!-- todo) 이미지크기...  -->
                      <img src="images/poster/영웅.jpg" alt="" />
                      <div class="mv-item-infor">
                        <h6>
                          <!-- todo) 영화 상세보기 링크 변경 -->
                          <a href="moviesingle.html"
                          >영웅 <span>(2022)</span></a
                          >
                        </h6>
                        <p class="rate">
                          <i class="ion-android-star"></i><span>8.1</span> /10
                        </p>

                        <p class="describe">
                          Run Time: 120분 <a>12세 관람가</a>
                        </p>

                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">예매번호</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">관람일시</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">상영관</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">좌석정보</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <p class="describe col-xs-12"></p>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">결제금액</p>
                          <p class="col-xs-4">{{}}</p>
                          <!-- 예매취소 버튼 -->
                          <div class="col-xs-4">
                            <a href="#" class="redbtn">예매취소</a>
                          </div>
                        </div>
                      </div>
                    </div>
                    <!-- 예매한 영화-->
                    <div class="movie-item-style-2">
                      <!-- todo) 이미지크기...  -->
                      <img src="images/poster/영웅.jpg" alt="" />
                      <div class="mv-item-infor">
                        <h6>
                          <!-- todo) 영화 상세보기 링크 변경 -->
                          <a href="moviesingle.html"
                          >영웅 <span>(2022)</span></a
                          >
                        </h6>
                        <p class="rate">
                          <i class="ion-android-star"></i><span>8.1</span> /10
                        </p>

                        <p class="describe">
                          Run Time: 120분 <a>12세 관람가</a>
                        </p>

                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">예매번호</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">관람일시</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">상영관</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">좌석정보</p>
                          <p class="col-xs-6">{{}}</p>
                        </div>
                        <p class="describe col-xs-12"></p>
                        <div class="col-xs-12">
                          <p class="movie-detail-content col-xs-4">결제금액</p>
                          <p class="col-xs-4">{{}}</p>
                          <!-- 예매취소 버튼 -->
                          <div class="col-xs-4">
                            <a href="#" class="redbtn">예매취소</a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>

              <!-- 나의 문의내역 -->
              <div class="page-single movie_list">
                <div class="container">
                  <div class="row ipad-width2">
                    <div class="col-md-8 col-sm-12 col-xs-12">
                      <!-- 즐겨찾는 영화관 -->
                      <div class="topbar-filter">
                        <p>나의 문의내역 <span>1</span> in total</p>
                        <a href="moviegrid.html" class="grid"
                        ><i class="ion-grid"></i
                        ></a>
                      </div>
                      <!-- 내용 -->
                      <p>dd</p>
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

      // 예매내역 : 백에서 가져와야함 //////////////////////////////
      // TODO: 예매내역 + 영화고유번호에 맞는 포스터이미지
      ReservedMovie: {
        id: "",   // 회원테이블 아이디
        movieCd: "",  // 영화고유번호
        scheNo: "",   // 상영스케줄
        cnt: "",      // 예매 수량
        price: "",    // 결제금액
        paidDate: "", // 결제일(예매날짜)
      },
      reservedMovieImages: "", // TODO: 예매한 영화포스터 -> 영화고유번호에 해당하는 이미지 불러와야함
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
    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },

    // TODO: 예매한 영화정보 가져오기
    ReservedMovieList() {}

  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
  },
};
</script>

<style>
.box-image {
  width: 55px;
  height: 70px;
}

.movie-detail-content {
  padding-left: 0;
}

.movie-detail-content-bottom {
  padding-bottom: 10px;
}
</style>