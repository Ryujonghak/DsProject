<template>
  <div v-if="wishlist != null">

    <!-- 상단 페이지 제목 -->
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>{{ user.name }}’s wish</h1>
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
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-img">
                <img class="profileImg" src="@/assets/images_choi/Views/choi/MovieDetail/user.png" alt=""/>
                <br/>
              </div>
              <div class="user-fav">
                <ul>
                  <li class="active">
                    <router-link to="">프로필</router-link>
                  </li>
                  <!-- 프로필 로그인 정보 표시 시작-->
                  <li style="color: white">
                    <strong style="color: white">이름 </strong>
                    <label>{{ user.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ user.username }}</label>
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
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->
          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user" id="portfolio-filters">
              <!-- <p>나의 찜한 영화 <span>{{ totalMovie }}</span> in total</p> -->
              <p class="mytitle">나의 찜한 영화 <span>{{ totalMovie }}</span> in total</p>
              <select class="form-select" 
              v-model="opendt"
              @change="getOpendtWishlist"
              >
                <option selected value="20"> 전체 </option>
                <option value="2023"> 2023 </option>
                <option value="2022"> 2022 </option>
              </select>
            </div>

            <div v-if="emptyWish == true" class="noWish">
              <h3>찜한 영화가 없습니다.</h3>
            </div>

            <div class="flex-wrap-movielist" v-if="emptyWish == false">
              <!-- 상영작 1 -->
              <div
                  class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
                  v-for="(data, index) in wishlist" :key="index"
              >
                <img :src="data.posterurln" alt="poster"/>
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <div class="hvr-inner">
                  <router-link
                      :to="'/SeatTest/' + data.moviecd"
                      >예매하기 
                      <i class="ion-android-arrow-dropright"></i
                    ></router-link>
                </div>
                <!-- 영화정보 -->
                <div class="mv-item-infor">
                  <router-link :to="'/allMovie/' + data.moviecd">
                    <h6><a>{{ data.movienm }}({{ data.opendt }})</a></h6>
                  </router-link>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>{{ data.raiting }}</span> /10
                  </p>
                </div>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- 탑버튼 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
  </div>
</template>

<script>
/* eslint-disable */
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";
import User from "@/model/user";
import WishlistDataService from "@/services/WishlistDataService";

export default {

  data() {
    return {
      wishlist: null,
      username: this.$store.state.auth.user.username,
      user: new User(),
      message: "",
      movie: [],
      totalMovie: 0,
      opendt: "20",
      
      emptyWish: true,  

      selected: "",
      prdtyear: "",
    };
  },
  methods: {
    // 찜한 결과 가져오기
    getWishlist() {
      WishlistDataService
          .getUsernameMovie(this.username)
          .then((res) => {
            this.wishlist = res.data;
            this.totalMovie = this.wishlist.length;
            this.findWish();  // 찜한 내역 확인함수 추가

            console.log(this.$store.state.auth.user.username);
            console.log(this.$route.params.moviecd);
            console.log("wishlist: ", this.wishlist);
          })
          .catch(err => {
            console.log(err);
          });
    },
    // 위시리스트 영화 opendt로 검색
    getOpendtWishlist() {
      WishlistDataService
          .getOpendtMovie(this.opendt)
          .then((res) => {
            this.wishlist = res.data;
            this.totalMovie = this.wishlist.length;

            console.log(this.$store.state.auth.user.username);
            console.log(this.$route.params.moviecd);
            console.log("wishlist: ", this.wishlist);
          })
          .catch(err => {
            console.log(err);
          });
    },
    findWish() {
      if(this.wishlist.length == 0) {
        this.emptyWish = true;
      } else {
        this.emptyWish = false;
      }
      console.log("findWish", this.wishlist);
    },

    // 로그인 한 사용자정보 가져오기
    getUser() {
      console.log("username: " + this.username);
      userService
          .getUserUsername(this.username)
          .then((response) => {
            this.user = response.data;
            console.log("getUser this.user: ", this.user);
          })
          .catch((err) => console.log(err));
    },
    // 로그아웃
    logout() {
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/");
    },
  },
  mounted() {
    custom();
    this.getUser(); 
    this.getWishlist();
  },
};
</script>

<style scoped>
/* 배경이미지 */
.user-hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
  width: 100%;
}

/* 마이페이지-프로필 이미지크기 수정 */
.profileImg {
  -ms-interpolation-mode: bicubic;
  border: 0;
  max-height: 120px;
  max-width: 120px;
  vertical-align: middle;
}

/* 탑버튼 */
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}

/* 찜한내역없음 */
.noWish {
  color:lightslategray;
}

.mytitle{
  color: azure;
}

/* 셀렉트박스 화살표 */
.topbar-filter select{
  width: 35% !important;
  background: url(../../../public/images/uploads/drop-icon.png) no-repeat right 20px center;

}
</style>
