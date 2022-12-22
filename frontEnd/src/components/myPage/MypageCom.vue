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
                <img src="images/uploads/user-img.png" alt=""/>
                <br/>
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

            <!-- 자주가는 극장 -->
            <div class="page-single movie_list">
              <div class="container">
                <div class="row ipad-width2">
                  <div class="col-md-8 col-sm-12 col-xs-12">
                    <div class="topbar-filter">
                      <p>즐겨찾는 영화관 <span>1</span> in total</p>
                    </div>
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    Run Time: {{ }} 2h 21’ <br />
                    Director: {{  }} dd <br />
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
                    <!-- 예매한 영화 1 : 상영 예정 -->
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
                                <!-- 별점 -->
                                <p class="rate">
                                  <i class="ion-android-star"></i
                                  ><span>8.1</span> /10
                                </p>
                                <p>
                                  Director: 윤제균
                                </p>
                                <p class="describe">
                                  Run Time: 120분 <a>12세 관람가</a>
                                </p>
                                
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    예매번호
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    관람일시
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    상영관
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    좌석정보
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <p class="describe col-xs-12"></p>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    결제금액
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                              </div>
                            </div>
                    <!-- 예매취소 버튼  -->
                    <div class="movie-item-style-2">
                      <a href="#" class="redbtn">예매 취소</a>
                    </div>

                    <!-- 예매한 영화 2 : 상영 예정 -->
                             <!-- 예매한 영화 1 : 상영 예정 -->
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
                                <!-- 별점 -->
                                <p class="rate">
                                  <i class="ion-android-star"></i
                                  ><span>8.1</span> /10
                                </p>
                                <p>
                                  Director: 윤제균
                                </p>
                                <p class="describe">
                                  Run Time: 120분 <a>12세 관람가</a>
                                </p>
                                
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    예매번호
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    관람일시
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    상영관
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    좌석정보
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                                <p class="describe col-xs-12"></p>
                                <div class="col-xs-12">
                                  <p class="movie-detail-content col-xs-6">
                                    결제금액
                                  </p>
                                  <p class="col-xs-6">{{}}</p>
                                </div>
                              </div>
                            </div>
                    <!-- 예매취소 버튼  -->
                    <div class="movie-item-style-2">
                      <a href="#" class="redbtn">예매 취소</a>
                    </div>
                  </div>
                </div>

                <div class="row ipad-width2">
                  <div class="col-md-8 col-sm-12 col-xs-12">
                    <!-- QnA  -->
                    <div class="topbar-filter">
                      <p>나의 문의내역 <span>0</span> in total</p>
                      <a href="moviegrid.html" class="grid"
                      ><i class="ion-grid"></i
                      ></a>
                    </div>
                    <p>문의내역이 없습니다.</p>
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
import custom from '@/assets/js/custom';
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
      message: ""

    }
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
      username = "forbob"
      console.log(username);
      userService.getUserUsername(username)
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
            }
            console.log(this.CurrentUser);
            // console.log(response.data);
          }).catch(err => console.log(err));
    }
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터 
  }
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
