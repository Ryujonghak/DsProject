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
              <div class="user-fav">
                <p>Account Details</p>
                <ul>
                  <li>
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li class="active">
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
          <!-- <div class="flex-wrap-movielist user-fav-list">
            <div class="page-single">
              <div class="container">
                <div class="row ipad-width2"> -->
          <!-- 1. 예매내역 : 간략보기 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user">
              <p>예매내역 <span>1 movies</span> in total</p>
              <select>
                <option value="range">-- 2022년 --</option>
                <option value="saab">-- 2021년 --</option>
              </select>
            </div>
            <!-- 페이지  -->
            <div class="topbar-filter">
              <label>Movies per page:</label>
              <select>
                <option value="range">20 Movies</option>
                <option value="saab">10 Movies</option>
              </select>
              <div class="pagination2">
                <span>Page 1 of 1:</span>
                <a class="active" href="#">1</a>
                <a href="#"><i class="ion-arrow-right-b"></i></a>
              </div>
            </div>
            <!-- 예매한 영화 -->
            <div class="row">
              <div class="col-xs-12 movie-item-style-2 userrate">
                <!-- 포스터 -->
                <div class="col-xs-2">
                  <img src="images/uploads/mv1.jpg" alt="" />
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="mv-item-infor">
                    <h6>
                      <a href="#">영웅 <span>(2022)</span></a>
                    </h6>
                    <!-- 별점 -->
                    <p class="rate">
                      <i class="ion-android-star"></i>
                      <span>8.1</span> /10
                    </p>
                    <p>Run Time: 120분 <a>12세 관람가</a></p>
                    <span class="time sm">2022년 10월 12일</span>
                    <br />
                    <span class="time sm">DS CINEMA 서면 1관 </span>
                    <br />
                    <span class="time sm-text">18:00</span>
                    <span class="time sm"> I5</span>
                    <span class="time sm"> I6</span>
                  </div>
                </div>
                <!-- 영화정보 끝 -->
                <!-- 예매취소 버튼 -->
                <div class="col-xs-2">
                  <div class="movie-item-style-2">
                    <a href="#" class="redbtn">예매 취소</a>
                  </div>
                </div>
                <!-- 예매취소 버튼 끝 -->
              </div>
            </div>
            <!-- 예매한 영화 -->
            <div class="row">
              <div class="col-xs-12 movie-item-style-2 userrate">
                <!-- 포스터 -->
                <div class="col-xs-2">
                  <img src="images/uploads/mv1.jpg" alt="" />
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="mv-item-infor">
                    <h6>
                      <a href="#">영웅 <span>(2022)</span></a>
                    </h6>
                    <!-- 별점 -->
                    <p class="rate">
                      <i class="ion-android-star"></i>
                      <span>8.1</span> /10
                    </p>
                    <p>Run Time: 120분 <a>12세 관람가</a></p>
                    <span class="time sm">2022년 10월 12일</span>
                    <br />
                    <span class="time sm">DS CINEMA 서면 2관</span>
                    <br />
                    <span class="time sm-text">18:00</span>
                    <span class="time sm"> I5</span>
                    <span class="time sm"> I6</span>
                  </div>
                </div>
                <!-- 영화정보 끝 -->
                <!-- 예매취소 버튼 -->
                <div class="col-xs-2">
                  <div class="movie-item-style-2">
                    <a href="#" class="redbtn">예매 취소</a>
                  </div>
                </div>
                <!-- 예매취소 버튼 끝 -->
              </div>
            </div>
            <!-- 예매한 영화 -->
            <div class="row">
              <div class="col-xs-12 movie-item-style-2 userrate">
                <!-- 포스터 -->
                <div class="col-xs-2">
                  <img src="images/uploads/mv1.jpg" alt="" />
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="mv-item-infor">
                    <h6>
                      <a href="#">영웅 <span>(2022)</span></a>
                    </h6>
                    <!-- 별점 -->
                    <p class="rate">
                      <i class="ion-android-star"></i>
                      <span>8.1</span> /10
                    </p>
                    <p>Run Time: 120분 <a>12세 관람가</a></p>
                    <span class="time sm">2022년 10월 12일</span>
                    <br />
                    <span class="time sm">DS CINEMA 서면 3관</span>
                    <br />
                    <span class="time sm-text">18:00</span>
                    <span class="time sm"> I5</span>
                    <span class="time sm"> I6</span>
                  </div>
                </div>
                <!-- 영화정보 끝 -->
                <!-- 예매취소 버튼 -->
                <div class="col-xs-2">
                  <div class="movie-item-style-2">
                    <a href="#" class="redbtn">예매 취소</a>
                  </div>
                </div>
                <!-- 예매취소 버튼 끝 -->
              </div>
            </div>

            <!-- 2. 예매 내역 상세보기 -->
            <div class="page-single userfav_list">
              <div class="container">
                <div class="row ipad-width2">
                  <div class="col-md-9 col-sm-12 col-xs-12">
                    <div class="topbar-filter user">
                      <p>예매내역 상세보기<span>1 movies</span> in total</p>
                      <select>
                        <option value="range">-- 2022년 --</option>
                        <option value="saab">-- 2021년 --</option>
                      </select>
                    </div>

                    <div class="flex-wrap-movielist user-fav-list">
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
                          <p>Director: 윤제균</p>
                          <p class="describe">
                            Run Time: 120분 <a>12세 관람가</a>
                          </p>

                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              예매번호
                            </p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              관람일시
                            </p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">상영관</p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              좌석정보
                            </p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <p class="describe col-xs-12"></p>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              결제금액
                            </p>
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
                          <p>Director: 윤제균</p>
                          <p class="describe">
                            Run Time: 120분 <a>12세 관람가</a>
                          </p>

                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              예매번호
                            </p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              관람일시
                            </p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">상영관</p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              좌석정보
                            </p>
                            <p class="col-xs-6">{{}}</p>
                          </div>
                          <p class="describe col-xs-12"></p>
                          <div class="col-xs-12">
                            <p class="movie-detail-content col-xs-4">
                              결제금액
                            </p>
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

          <!-- </div>
              </div>
            </div>
          </div> -->
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
    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },
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

.movie-item-style-2 {
  padding-top: 20px;
}
</style>
