<template>
  <!-- 수빈언니데이터 -->
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4>영화 관리 페이지</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2">
          <!-- <!— 왼쪽 메뉴바 시작 —> -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-fav">
                <p>관리자 목록</p>
                <ul>
                  <li>
                    <router-link to="/userInfoAdmin">회원관리</router-link>
                  </li>
                  <li>
                    <a href="#"></a>
                    <a
                      class="btn btn-default dropdown-toggle"
                      data-toggle="dropdown"
                      @click="boardclick"
                    >
                      게시판관리
                      <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li>
                        <router-link to="/board-admin"
                          >공지사항 관리</router-link
                        >
                      </li>
                      <li class="active">
                        <router-link to="/movie-admin">영화 관리</router-link>
                      </li>
                      <li>
                        <router-link to="/review-admin">리뷰관리</router-link>
                      </li>
                      <li>
                        <router-link to="/qna-admin">QnA 답변관리</router-link>
                      </li>
                    </ul>
                  </li>
                  <li>
                    <router-link to="/payment-admin">예매 내역</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <ul>
                  <li><a href="#" @click="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->

          <!-- 전체정렬 -->

          <!-- 본문 시작 -->
          <!-- 새 영화관리 테이블 시작 -->
          <div class="page-single movie_list">
            <div class="container">
              <div class="row ipad-width2">
                <div class="col-md-8 col-sm-12 col-xs-12">
                  <div class="topbar-filter">
                    <label>Sort by:</label>
                    <select>
                      <option value="date">Release date Descending</option>
                      <option value="date">Release date Ascending</option>
                    </select>
                    <button class="regbtn" style="width: 15%">
                      <router-link to="/addMovie-admin"
                        >새 영화 등록</router-link
                      >
                    </button>
                  </div>
                  <div
                    class="movie-item-style-2"
                    v-for="(data, index) in movie.MovieDetail"
                    v-bind:key="index">
                    <img :src="data.posterurln" alt="poster" />
                    <div class="mv-item-infor">
                      <h6>
                        영화이름:
                        <a href="#">{{ data.movienm }}</a>
                        <span>({{ data.prdtyear }})</span>
                      </h6>
                      <p class="rate">
                        평점:
                        <a href="#">{{ data.raiting }}</a>
                      </p>
                      <p class="describe">
                        줄거리:
                        {{ data.plot }}
                      </p>
                      <p class="run-time">
                        상영시간: {{ data.showtm }} 분
                        <span>관람등급 : {{ data.watchgradenm }}</span>
                        <span>개봉일자: {{ data.opendt }}</span>
                        장르 : {{ data.genrenm }}
                      </p>
                      <p>
                        감독: <a href="#">{{ data.directors }}</a>
                      </p>
                      <p>
                        출연진:
                        <a href="#"> {{ data.actor }}</a>
                      </p>
                      <button class="redbtn" @click="deleteMovie(data)">삭제</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- 새 영화관리 테이블 끝  -->
          <!-- 본문 끝 -->

          <!-- <!— 페이징 + 전체 목록 시작 —> -->
          <!-- <!— 페이징 양식 시작 —> -->
          <div class="col-md-12">
            <b-pagination
              v-model="page"
              :total-rows="movie.totalItems"
              :per-page="pageSize"
              prev-text="Prev"
              next-text="Next"
              @change="handlePageChange"
            ></b-pagination>
          </div>
          <!-- <!— 페이징 양식 끝 —> -->
          <!-- 필터 페이지네이션 -->

          <!-- 끝 -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import MovieDataService from "@/services/MovieDataService";

export default {
  mounted() {
    this.retrieveMovie();
  },
  data() {
    return {
      board: false,
      movie: [],
      searchMname: "",

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 5, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
    };
  },
  methods: {

    retrieveMovie() {
      MovieDataService.getMovieDetailAll(
        this.searchMname,
        this.page - 1,
        this.pageSize
      )
        .then((response) => {
          const movie = response.data;
          this.movie = movie;
          console.log(response.data);
          // console.log(this.movie);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    handlePageChange(value) {
      this.page = value; // 매개변수값으로 현재페이지 변경
      this.retrieveMovie();
    },
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },

    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    // delete 버튼 클릭시 실행됨
    deleteMovie(data) {
      this.data = data;
        MovieDataService.delete(this.data.id)
        .then((response) => {
          console.log(response.data);
          alert("삭제되었습니다.")
          window.location.reload();
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>

<style lang="scss" scoped>
h4 {
  color: aliceblue;
  margin-right: 10%;
}
h6 {
  color: aliceblue;
}
.redbtn {
  height: 1% !important;
  float: right !important;
  box-shadow: none !important;
}
.regbtn {
  margin-top: 2% !important;
  background: rgb(255, 255, 0);
  width: 10%;
  border-radius: 25px;
  padding: 1%;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
.topbar-filter select {
  width: 215px;
  // -webkit-appearance: none;
  // -moz-appearance: none;
  float: right !important;
  // background: url(../images/uploads/drop-icon.png) no-repeat right 20px center;
  border-left: none !important;
  border-right: px solid #405266;
  border-top: none;
  border-bottom: none !important;
  color: #ffffff;
  font-weight: 400;
}
.topbar-filter {
  justify-content: flex-end !important;
  border-top: none !important;
}
.user-hero {
  height: 385px;
  // background: url("../images/uploads/user-hero-bg.jpg") no-repeat;
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test8.png") no-repeat;
}
</style>
