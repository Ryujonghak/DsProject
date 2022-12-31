<template>
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
                  <li><router-link to="/userInfoAdmin">회원관리</router-link></li>
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
                      <li><router-link to="/board-admin">공지사항 관리</router-link></li>
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
                  <li><router-link to="/payment-admin">예매 내역</router-link></li>
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
          <!-- 영화관리 테이블 (보류) 시작 -->
          <!-- <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter">
              <h5 style="color: aliceblue">sort by:</h5>
              <select>
                <option value="range">-- Choose option --</option>
                <option value="saab">-- Choose option 2--</option>
              </select>

              <button class="regbtn" style="width: 15%">
                <router-link to="/addMovie-admin">새 영화 등록</router-link>
              </button>
            </div>
            <div class="flex-wrap-movielist user-fav-list">
              <div class="movie-item-style-2">
                <img src=
                https://img.megabox.co.kr/SharedImg/2022/12/16/9vUySe7DNMro6tdYRPEbjzF2ebr48MwE_420.jpg
                alt="아바타 물의길" />
                <div
                  class="mv-item-infor"
                  v-for="(movie, index) in movies"
                  v-bind:key="index"
                >
                  <h6 style="color: aliceblue">
                    영화이름:
                    <a href="#">{{ movie.movieNm }}</a>
                    <span>({{ movie.openDt }})</span>
                  </h6>
                  <h6 style="color: aliceblue">
                    평점:
                    <a href="#">{{ movie.rating }}</a>
                  </h6>
                  <h6 class="describe" style="color: aliceblue">
                    줄거리:
                    <p>{{ movie.description }}</p>
                  </h6>
                  <p class="run-time">
                    상영시간:
                    {{ movie.showTm }}
                  </p>
                  <p class="run-time">
                    관람등급:
                    {{ movie.watchGradeNm }}
                  </p>
                  <p>
                    감독:
                    {{ movie.directors }}
                  </p>
                  <p>
                    출연진:
                    {{ movie.actor }}
                  </p>
                  <button class="redbtn">삭제</button>
                </div>
                <div class="movie-item-style-2">
                  <img src="images/uploads/mv2.jpg" alt="" />
                  <div class="mv-item-infor">
                    <h6>
                      <a href="moviesingle.html"
                        >into the wild <span>(2014)</span></a
                      >
                    </h6>
                    <p class="rate">
                      <i class="ion-android-star"></i><span>7.8</span> /10
                    </p>
                    <p class="describe">
                      As Steve Rogers struggles to embrace his role in the
                      modern world, he teams up with a fellow Avenger and
                      S.H.I.E.L.D agent, Black Widow, to battle a new threat...
                    </p>
                    <p class="run-time">
                      Run Time: 2h21’ . <span>MMPA: PG-13 </span> .
                      <span>Release: 1 May 2015</span>
                    </p>
                    <p>
                      Director: <a href="#">Anthony Russo,</a
                      ><a href="#">Joe Russo</a>
                    </p>
                    <p>
                      Stars: <a href="#">Chris Evans,</a>
                      <a href="#">Samuel L. Jackson,</a>
                      <a href="#"> Scarlett Johansson</a>
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </div> -->
          <!-- 영화관리 테이블 끝 -->

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
                    v-for="(movie, index) in movies"
                    v-bind:key="index"
                  >
                    <img src=
                    https://img.megabox.co.kr/SharedImg/2022/12/16/9vUySe7DNMro6tdYRPEbjzF2ebr48MwE_420.jpg
                    alt="아바타 물의길" />
                    <div class="mv-item-infor">
                      <h6>
                        영화이름:
                        <a href="#">{{ movie.movieNm }}</a>
                        <span>({{ movie.prdtYear }})</span>
                      </h6>
                      <p class="rate">
                        평점:
                        <a href="#">{{ movie.rating }}</a>
                      </p>
                      <p class="describe">
                        줄거리:
                        {{ movie.description }}
                      </p>
                      <p class="run-time">
                        상영시간: {{ movie.showTm }}
                        <span>관람등급 {{ movie.watchGradeNm }}</span> 
                        <span>개봉일자: {{ movie.openDt }}</span>
                        장르 : {{ movie.genreNm }}
                      </p>
                      <p>
                        감독: <a href="#">{{ movie.directors }}</a>
                      </p>
                      <p>
                        출연진:
                        <a href="#"> {{ movie.actor }}</a>
                      </p>
                      <button class="redbtn">삭제</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- 새 영화관리 테이블 끝  -->
          <!-- 본문 끝 -->

          <!-- 필터 페이지네이션 -->

          <!-- 끝 -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      board: false,
      movies: [
        {
          movieNm: "아바타:물의길",
          prdtYear: "2022",
          openDt: "2022-12-20",
          rating: "4.5/5.0",
          description:
            "아바타 후속작 어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구",
          showTm: "2H20M",
          watchGradeNm: "15+",
          genreNm:"SF/판타지",
          directors: "subin Kang",
          actor:
            "ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,",
        },
        {
          movieNm: "아바타:물의길",
          prdtYear: "2022",
          openDt: "2022-12-20",
          rating: "4.5/5.0",
          description:
            "아바타 후속작 어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구",
          showTm: "2H20M",
          watchGradeNm: "15+",
          genreNm:"SF/판타지",
          directors: "subin Kang",
          actor:
            "ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,",
        },        {
          movieNm: "아바타:물의길",
          prdtYear: "2022",
          openDt: "2022-12-20",
          rating: "4.5/5.0",
          description:
            "아바타 후속작 어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구어쩌구저쩌구",
          showTm: "2H20M",
          watchGradeNm: "15+",
          genreNm:"SF/판타지",
          directors: "subin Kang",
          actor:
            "ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,ari Choi, subin Kang,juhee Jeong,",
        },
      ],
    };
  },
  methods: {
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },

    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    // delete 버튼 클릭시 실행됨
    // deleteMovie() {
    //     QnaDataService.delete(this.currentData.qno)
    //     .then((response) => {
    //       console.log(response.data);
    //       alert("삭제되었습니다.")
    //       this.$router.push("/qna");
    //     })
    //     .catch((e) => {
    //       console.log(e);
    //     });
    // },
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
</style>
