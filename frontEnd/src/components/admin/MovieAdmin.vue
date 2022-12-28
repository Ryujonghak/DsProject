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
                  <li><a href="#">회원관리</a></li>
                  <li class="active">
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
                      <li><a>공지사항 관리</a></li>
                      <li>
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
                    <router-link to="/payment-admin">결제 관리</router-link>
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
          <!-- 영화관리 테이블 시작 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- <div style="width:215px; float:right;"> -->
            <div class="topbar-filter">
              <!-- <h5 style="justify-content:flex-start !important; color: aliceblue; margin-right: 1%;">sort by:</h5> -->
              <h5 style="color: aliceblue">sort by:</h5>
              <select>
                <option value="range">-- Choose option --</option>
                <option value="saab">-- Choose option 2--</option>
              </select>
              <!-- <button class="regbtn" style="color:aliceblue; width: 50% !important; height: 15%; margin-top: 20%; float: right;"> -->

              <button class="regbtn" style="width: 15%">
                <router-link to="/addMovie-admin">새 영화 등록</router-link>
              </button>
            </div>
            <div class="flex-wrap-movielist user-fav-list">
              <div class="movie-item-style-2">
                <img src=
                https://img.megabox.co.kr/SharedImg/2022/12/16/9vUySe7DNMro6tdYRPEbjzF2ebr48MwE_420.jpg
                alt="아바타 물의길" />
                <div class="mv-item-infor">
                  <h6 style="color: aliceblue">
                    영화이름:
                    <a href="#">아바타 : 물의길 <span>(2022)</span></a>
                  </h6>
                  <h6 style="color: aliceblue">
                    평점:
                    <p class="rate">
                      <i class="ion-android-star"></i><span>4.1</span> /5
                    </p>
                  </h6>
                  <p class="describe">
                    Earth's mightiest heroes must come together and learn to
                    fight as a team if they are to stop the mischievous Loki and
                    his alien army from enslaving humanity...
                  </p>
                  <p class="run-time">
                    상영시간: 2h21’ . <span>관람등급: PG-13 </span> .
                    <span>개봉날짜: 1 May 2015</span>
                  </p>
                  <p>감독: <a href="#">Joss Whedon</a></p>
                  <p>
                    출연진: <a href="#">Robert Downey Jr.,</a>
                    <a href="#">Chris Evans,</a>
                    <a href="#"> Chris Hemsworth</a>
                  </p>
                  <button class="redbtn">삭제</button>
                </div>
              </div>
            </div>
            <!-- <div class="topbar-filter">
              <div class="pagination2">
                <span>Page 1 of 2:</span>
                <a class="active" href="#">1</a>
                <a href="#">2</a>
                <a href="#">3</a>
                <a href="#">...</a>
                <a href="#">78</a>
                <a href="#">79</a>
                <a href="#"><i class="ion-arrow-right-b"></i></a>
              </div>
            </div> -->
          </div>
          <!-- 영화관리 테이블 끝 -->
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
.redbtn {
  height: 2% !important;
  float: right !important;
  box-shadow: none !important;
}
.regbtn {
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
