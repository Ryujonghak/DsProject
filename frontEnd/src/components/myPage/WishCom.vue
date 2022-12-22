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
              <!-- 프로필 이미지 업로드 추가 v-if -->
              <!-- <div v-if="images" class="user-img"> -->
              <div class="user-img">
                <img src="images/uploads/user-img.png" alt="" />
                <br />
                <a href="#" class="redbtn">Change avatar</a>
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
                  <li>
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li>
                    <router-link to="/myticket">예매내역</router-link>
                  </li>
                  <li class="active">
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
              <p>찜한 영화목록 <span>8 movies</span> in total</p>
              <select>
                <option value="range">-- 2022년 --</option>
                <option value="saab">-- 2021년 --</option>
              </select>
            </div>

            <div class="flex-wrap-movielist">
              <!-- 상영작 1 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <!-- 제목 -->
                <div class="mv-item-infor">
                  <h6><a href="#">oblivion</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>

              <!-- 상영작 2 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv2.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">into the wild</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.8</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 3 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv-item3.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">Die hard</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.4</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 4 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv-item4.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">The walk</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.4</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 5 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv3.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">blade runner </a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.3</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 6 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv4.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">Mulholland pride</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.2</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 7 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv5.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">skyfall: evil of boss</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.0</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 8 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv-item1.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">Interstellar</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.4</span> /10
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

<style></style>
