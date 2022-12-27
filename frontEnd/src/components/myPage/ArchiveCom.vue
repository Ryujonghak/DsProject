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
        

            <!-- 나의 리뷰  -->
            <div class="topbar-filter user">
              <p>나의 리뷰 <span>8 movies</span> in total</p>
              <a href="userfavoritegrid.html" class="grid"
                ><i class="ion-grid"></i
              ></a>
            </div>
            <!-- 나의 리뷰 내용 시작 -->
            <div class="row">
              <!-- 리뷰 : 1 -->
              <div class="col-xs-12 movie-item-style-2 userrate">
                <div class="mv-user-review-item"></div>
                <!-- 영화정보 -->
                <div class="col-xs-3">
                  <div class="mv-item-infor">
                    <br />
                    <h6>
                      <a href="#">영웅 <span>(2022)</span></a>
                    </h6>
                    <p>Run Time: 120분 <br /><a>12세 관람가</a></p>
                    <span class="time sm">2022년 10월 12일</span>
                    <br />
                  </div>
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="row" style="padding: 3%">
                    <!-- ㅇㅇ -->
                    <div class="mv-user-review-item">
                      <div class="user-infor">
                        <!-- 별점 v-for 반복문 -->
                        <div class="rate-star">
                          <h6>
                            나의 별점
                            <span
                              class="rate-star-result"
                              v-for="(i, index) in movie.starRating"
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
                <!-- 예매취소 버튼 -->
                <div class="col-xs-2 deletebtn">
                  <div class="movie-item-style-2">
                    <a href="#" class="redbtn">삭제</a>
                  </div>
                </div>
                <!-- 예매취소 버튼 끝 -->
              </div>
              <!-- 리뷰 : 2 -->
              <div class="col-xs-12 movie-item-style-2 userrate">
                <div class="mv-user-review-item"></div>
                <!-- 영화정보 -->
                <div class="col-xs-3">
                  <div class="mv-item-infor">
                    <br />
                    <h6>
                      <a href="#">영웅 <span>(2022)</span></a>
                    </h6>
                    <p>Run Time: 120분 <br /><a>12세 관람가</a></p>
                    <span class="time sm">2022년 10월 12일</span>
                  </div>
                </div>
                <!-- 영화정보 -->
                <div class="col-xs-8">
                  <div class="row" style="padding: 3%">
                    <!-- ㅇㅇ -->
                    <div class="mv-user-review-item">
                      <div class="user-infor">
                        <!-- 별점 v-for 반복문 -->
                        <div class="rate-star">
                          <h6>
                            나의 별점
                            <span
                              class="rate-star-result"
                              v-for="(i, index) in movie.starRating"
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
                <!-- 예매취소 버튼 -->
                <div class="col-xs-2 deletebtn">
                  <div class="movie-item-style-2">
                    <a href="#" class="redbtn">삭제</a>
                  </div>
                </div>
                <!-- 예매취소 버튼 끝 -->
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
        answer: "",
      },
      message: "",
      movie: {
        title: "아바타: 물의 길",
        synopsis:
          " 아바타: 물의 길 은 판도라 행성에서 '제이크 설리'와 '네이티리'가 이룬 가족이 겪게 되는 무자비한 위협과 살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다. 월드와이드 역대 흥행 순위 1위를 기록한 전편에 이어 제임스 카메론 감독이 13년만에 선보이는 영화로, 샘 워싱턴, 조 샐다나, 시고니 위버, 스티븐 랭, 케이트 윈슬렛이출연하고 존 랜도가 프로듀싱을 맡았다.",
        genre: "액션, 어드벤쳐, SF",
        pubdate: "2022.12.14",
        rating: 4.5,
        starRating: 1, // 나중에 백엔드에서 평점 가져오기 (TODO: 정수로 받아야 합니다,,)
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
      },
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
    // 아리 별점
    cutNames() {
      this.movie.actor = this.movie.actor.split(",");
      this.movie.role = this.movie.role.split(",");
      this.movie.imageUrl = this.movie.imageUrl.split(",");
      this.movie.starRating = Math.floor(this.movie.rating);
      // alert(this.movie.starRating);
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

.deletebtn {
  margin-top: 10%;
}
</style>
