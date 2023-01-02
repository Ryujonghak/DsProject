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
              <h1>{{ CurrentUser.name }}’s wish</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY WISH</li>
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
                <!-- src="images/uploads/user-img.png" -->
                <img class="profileImg" src="@/assets/images_choi/Views/choi/MovieDetail/user.png" alt="" />
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
<!--                  <li><a href="#">Log out</a></li>-->
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->
    <!-- 오른쪽 본문 내용 -->
    <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user" id="portfolio-filters">
              <p>나의 찜한 영화 <span>8 movies</span> in total</p>
              <div>
                <span class="mx-3 active" data-filter="*">ㅇAll Movie </span>
                <span class="mx-3" data-filter=".2022">ㅇ2022 </span>
                <span class="mx-3" data-filter=".2023">ㅇ2023</span>
              </div>
              <span class="grid" data-filter="*"><i class="ion-grid"></i></span>
            </div>

            <div class="flex-wrap-movielist">
              <!-- 상영작 1 -->
              <!-- todo: 필터명 2022 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
              >
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
              <!-- todo: 필터명 2023 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2023"
              >
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
              <!-- todo: 필터명 2022 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
              >
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
              <!-- todo: 필터명 2023 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2023"
              >
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
              <!-- todo: 필터명 2022 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
              >
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
              <!-- todo: 필터명 2022 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
              >
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
              <!-- todo: 필터명 2023 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2023"
              >
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
              <!-- todo: 필터명 2022 -->
              <div
                class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
              >
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

    // TODO:  isotope
    $(".flex-wrap-movielist").imagesLoaded(function () {
      // Isotope 초기화 실행
      let portfolioIsotope = $(".flex-wrap-movielist").isotope({
        itemSelector: ".portfolio-item", // Isotope 대상 아이템 선택
        layoutMode: "fitRows", // 여러가지 배치형태 옵션
      });
      // Isotope 메뉴 클릭 시 배치를 다시 정렬
      // id는 #으로 접근
      // div의 id="portfolio-filters" 의 span태그 클릭이벤트
      $("#portfolio-filters span").on("click", function () {
        $("#portfolio-filters span").removeClass("active"); // 기존 클래스에 active  삭제
        $(this).addClass("active"); // 현재 클릭한 클래스에 active 추가

        // Isotope 필터 적용시키기
        portfolioIsotope.isotope({
          filter: $(this).data("filter"), // 현재 클릭한 얘(this)의 li태그(리트스목록태그)의 data filter 속성 값을 filter에 저장
        });
      });
    });
  },
};
</script>

<style scoped>
/* 배경이미지 : 아리걸로 통일 */
.user-hero {
  background: url(@/assets/images_jung/movie-theater02.jpg)
  no-repeat;
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
