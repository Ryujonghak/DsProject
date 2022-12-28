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
                      <li><router-link to="/review-admin">리뷰관리</router-link></li>
                  <li><router-link to="/qna-admin">QnA 답변관리</router-link></li>
                    </ul>
                  </li>
                  <li><a href="#">결제관리</a></li>
                </ul>
              </div>
              <div class="user-fav">
                <ul>
                  <li><a href="#">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->

          <!-- 전체정렬 -->

          <!-- 본문 시작 -->
          <!-- 영화관리 테이블 시작 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user">
              <p>Found <span>1,608 movies</span> in total</p>
              <label>Sort by:</label>
              <select>
                <option value="range">-- Choose option --</option>
                <option value="saab">-- Choose option 2--</option>
              </select>
              <button class="regbtn" style="color:aliceblue">
                <router-link to="/addMovie-admin">등록</router-link>
              </button>
            </div>
            <div class="flex-wrap-movielist user-fav-list">
              <div class="movie-item-style-2">
                <img src=	https://img.megabox.co.kr/SharedImg/2022/12/16/9vUySe7DNMro6tdYRPEbjzF2ebr48MwE_420.jpg alt="아바타 물의길" />
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
                  <button class="redbtn" >삭제</button>
                </div>
              </div>
              <div class="movie-item-style-2">
                <img src="images/uploads/mv2.jpg" alt="" />
                <div class="mv-item-infor">
                  <h6>
                    <a href="#">into the wild <span>(2014)</span></a>
                  </h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.8</span> /10
                  </p>
                  <p class="describe">
                    As Steve Rogers struggles to embrace his role in the modern
                    world, he teams up with a fellow Avenger and S.H.I.E.L.D
                    agent, Black Widow, to battle a new threat...
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
                  <button class="redbtn" >삭제</button>
                </div>
              </div>
              <div class="movie-item-style-2">
                <img src="images/uploads/mv3.jpg" alt="" />
                <div class="mv-item-infor">
                  <h6>
                    <a href="#">blade runner <span>(2015)</span></a>
                  </h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.3</span> /10
                  </p>
                  <p class="describe">
                    Armed with a super-suit with the astonishing ability to
                    shrink in scale but increase in strength, cat burglar Scott
                    Lang must embrace his inner hero and help...
                  </p>
                  <p class="run-time">
                    Run Time: 2h21’ . <span>MMPA: PG-13 </span> .
                    <span>Release: 1 May 2015</span>
                  </p>
                  <p>Director: <a href="#">Peyton Reed</a></p>
                  <p>
                    Stars: <a href="#">Paul Rudd,</a>
                    <a href="#"> Michael Douglas</a>
                  </p>
                  <button class="redbtn" >삭제</button>
                </div>
              </div>
              <div class="movie-item-style-2">
                <img src="images/uploads/mv4.jpg" alt="" />
                <div class="mv-item-infor">
                  <h6>
                    <a href="#">Mulholland pride<span> (2013) </span></a>
                  </h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.2</span> /10
                  </p>
                  <p class="describe">
                    When Tony Stark's world is torn apart by a formidable
                    terrorist called the Mandarin, he starts an odyssey of
                    rebuilding and retribution.
                  </p>
                  <p class="run-time">
                    Run Time: 2h21’ . <span>MMPA: PG-13 </span> .
                    <span>Release: 1 May 2015</span>
                  </p>
                  <p>Director: <a href="#">Shane Black</a></p>
                  <p>
                    Stars: <a href="#">Robert Downey Jr., </a>
                    <a href="#"> Guy Pearce,</a><a href="#">Don Cheadle</a>
                  </p>
                  <button class="redbtn">삭제</button>
                </div>
              </div>
              <div class="movie-item-style-2">
                <img src="images/uploads/mv5.jpg" alt="" />
                <div class="mv-item-infor">
                  <h6>
                    <a href="#">skyfall: evil of boss<span> (2013) </span></a>
                  </h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.0</span> /10
                  </p>
                  <p class="describe">
                    When Tony Stark's world is torn apart by a formidable
                    terrorist called the Mandarin, he starts an odyssey of
                    rebuilding and retribution.
                  </p>
                  <p class="run-time">
                    Run Time: 2h21’ . <span>MMPA: PG-13 </span> .
                    <span>Release: 1 May 2015</span>
                  </p>
                  <p>Director: <a href="#">Alan Taylor</a></p>
                  <p>
                    Stars: <a href="#">Chris Hemsworth, </a>
                    <a href="#"> Natalie Portman,</a
                    ><a href="#">Tom Hiddleston</a>
                  </p>
                  <button class="redbtn" >삭제</button>
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
  box-shadow:none !important;
}
.regbtn{
  background: rgb(255, 255, 0);
  width: 10%;
  border-radius: 25px;
  padding: 1%;
}
button{
  border: none !important;
}
button:active {
  outline: none !important; 
  box-shadow: none !important;
}
</style>
