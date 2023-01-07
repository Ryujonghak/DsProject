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
                      <li>
                        <router-link to="/movie-admin">영화 관리</router-link>
                      </li>
                      <li class="active">
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

          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter">
              <h3 style="color: aliceblue">리뷰 관리</h3>
              <select
                id="select_value"
                name="selectBox"
                v-model="movienm"
                @change="retrieveReview"
              >
                <option selected value="">전체</option>
                <option v-for="(data, index) in movie" v-bind:key="index">
                  {{ data.movienm }}
                </option>
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
                      <th scope="col">NO</th>
                      <th scope="col">영화명</th>
                      <th scope="col">작성자 ID</th>
                      <th scope="col">리뷰</th>
                      <th scope="col">Delete Btn</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr
                      v-for="(data, index) in review.review"
                      v-bind:key="index"
                    >
                      <td>{{ data.rid }}</td>
                      <td>{{ data.movienm }}</td>
                      <td>{{ data.rwuser }}</td>
                      <td>{{ data.rucontent }}</td>
                      <td>
                        <button class="deletebtn" @click="deletebtn(data)">
                          삭제
                        </button>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <!--리뷰 테이블 관리 테이블 끝  -->
          </div>
          <!-- <!— 페이징 + 전체 목록 시작 —> -->
          <!-- <!— 페이징 양식 시작 —> -->
          <div class="col-md-12">
            <b-pagination
              v-model="page"
              :total-rows="review.totalItems"
              :per-page="pageSize"
              prev-text="Prev"
              next-text="Next"
              @change="handlePageChange"
            ></b-pagination>
          </div>
          <!-- <!— 페이징 양식 끝 —> -->
          <!-- 필터 페이지네이션 -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ReviewDataService from "@/services/ReviewDataService";
import MovieDataService from "@/services/MovieDataService";
export default {
  data() {
    return {
      board: false,
      selected: "",
      review: [],
      movienm: "",
      movie: [],
      selectMovienm: "",

      //페이징을 위한 변수 정의
      page: 1,
      count: 0,
      pageSize: 3,

      pageSizes: [3, 6, 9],
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

    handlePageChange(value) {
      this.page = value;
      this.retrieveReview();
    },
    // select박스 선택시 함수실행 
    retrieveReview() {
      ReviewDataService.getAll(this.movienm, this.page - 1, this.pageSize)
        .then((response) => {
          const review = response.data;
          this.review = review;
          //     var test = response.data;
          // alert(JSON.stringify(test));
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //삭제버튼 클릭시
    deletebtn(data) {
      this.review = data;
      // var test = this.review.rid;
      //     alert(JSON.stringify(test));
      ReviewDataService.delete(this.review.rid)
        .then((response) => {
          console.log(response.data);
          alert("삭제가 완료되었습니다.");
          window.location.reload();
        })
        .catch((e) => {
          console.log(e);
        });
    },
    //셀렉트박스 영화이름 가져오는 함수
    retrieveMovie() {
      MovieDataService.getMovieAll()
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
  },
  mounted() {
    this.retrieveReview();
    this.retrieveMovie();
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
.user-hero {
  height: 385px;
  // background: url("../images/uploads/user-hero-bg.jpg") no-repeat;
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test8.png")
    no-repeat;
}
//셀렉트박스 width
.topbar-filter select{
  width: 35% !important;
  background: url(../../../public/images/uploads/drop-icon.png) no-repeat right 20px center;

}
</style>
