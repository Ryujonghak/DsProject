<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
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

          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter">
              <h3 style="color: aliceblue">리뷰 관리</h3>
              <select id="selectBox" name="selectBox" v-model="searchMovieName">
                <option value="" selected="selected" @click="retrieveMovie">영화 전체</option>
                <option value="아바타:물의길"  @click="retrieveMovie">아바타:물의길</option>
                <option value="신비아파트"  @click="retrieveMovie">신비아파트</option>
                <option value="영웅"  @click="retrieveMovie">영웅</option>
              </select>
            </div>

            <!-- 전체정렬 -->
            <!--리뷰 테이블 관리 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 5%" />
                    <col style="width: 15%" />
                    <col style="width: 15%" />
                    <col style="width: 55%" />
                    <col style="width: 15%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col">id</th>
                      <th scope="col">영화명</th>
                      <th scope="col">작성자명</th>
                      <th scope="col">리뷰</th>
                      <th scope="col">Delete Btn</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr v-for="(data, index) in reviews" v-bind:key="index">
                      <td>{{ data.id }}</td>
                      <td>{{ data.movieCode }}</td>
                      <td>{{ data.username }}</td>
                      <td>{{ data.content }}</td>
                      <td>
                        <button class="deletebtn">삭제</button>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <!--리뷰 테이블 관리 테이블 끝  -->

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
          </div>
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
      selected: "" ,
      reviews: [
        {
          id:"1",
          movieCode: "아바타:물의길",
          username: "forbob",
          content:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
        },
        {
          id:"2",
          movieCode: "영웅",
          username: "forbob",
          content:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
        },
        {
          id:"3",
          movieCode: "신비아파트",
          username: "forbob",
          content:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
        },
        {
          id:"4",
          movieCode: "영웅",
          username: "subin",
          content:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
        },
        {
          id:"5",
          movieCode: "아바타:물의길",
          username: "subin",
          content:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
        },
        {
          id:"6",
          movieCode: "신비아파트",
          username: "subin",
          content:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
        },
      ],
    };
  },
  methods: {
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    //select박스 선택시 함수실행
    // retrieveMovie(){
    //   ReviewDataService.getAll(this.searchMovieName)
    //   .then((response) => {
    //     console.log(response.data);
    //   })
    //   .catch((e)=>{
    //     console.log(e);
    //   })
    // },

    //삭제버튼 클릭시 
    // deletebtn(){
    //   ReviewDataService.delete(this.currentUser.id)
    //     .then((response) => {
    //       console.log(response.data);
    //       this.$router.push("/review-admin");
    //     })
    //     .catch((e) => {
    //       console.log(e);
    //     });
    // }

  },
};
</script>

<style lang="scss" scoped>
th {
  color: aliceblue;
  border: 1px solid aliceblue;
  //border-right: 2px solid aliceblue;
  text-align: center;
}
td {
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
  text-align: center;
  vertical-align: middle !important;
}
.deletebtn {
  background: #dd003f;
  color: aliceblue;
  border-radius: 3px !important;
  box-shadow: none !important;
  width: 50%;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
</style>
