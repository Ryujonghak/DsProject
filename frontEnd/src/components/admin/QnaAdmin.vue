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
                      <li>
                        <router-link to="/review-admin">리뷰관리</router-link>
                      </li>
                      <li class="active">
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
            <div class="topbar-filter" style="margin-bottom: 3%">
              <h3 style="color: aliceblue">QnA 관리</h3>
              <p style="color: aliceblue; float: right">
                답변완료버튼 클릭시 답변내용 확인가능
              </p>
            </div>

            <!-- 전체정렬 -->

            <!--qna 전체 테이블 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 5%" />
                    <col style="width: 10%" />
                    <col style="width: 20%" />
                    <col style="width: 40%" />
                    <col style="width: 10%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col">번호</th>
                      <th scope="col">ID</th>
                      <th scope="col">제목</th>
                      <th scope="col">내용</th>
                      <th scope="col">답변상태</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr
                      v-for="(currentQna, index) in question.qna"
                      v-bind:key="index"
                    >
                      <td>{{ currentQna.qid }}</td>
                      <td>{{ currentQna.qwriter }}</td>
                      <td>{{ currentQna.qtitle }}</td>
                      <td>{{ currentQna.qcontent }}</td>
                      <!-- <td>{{ currentQna.qanswer }}</td> -->
                      <td>
                        <button
                          v-if="currentQna.qanswer == null"
                          class="regbtn"
                          @click="setActiveNotice(currentQna, index)"
                        >
                          답변하기
                        </button>
                        <button
                          v-if="currentQna.qanswer == null"
                          class="deletebtn"
                          @click="deleteQna(currentQna.qid)"
                        >
                          삭제하기
                        </button>
                        <button
                          v-if="currentQna.qanswer != null"
                          class="successbtn"
                          @click="checkingQna(currentQna.qid)"
                        >
                          답변완료
                        </button>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <!--qna 전체조회 테이블 끝  -->
          </div>
          <!--qna 답변작성 폼 시작 (add)-->
          <div v-show="registerQna">
            <table class="answertable">
              <colgroup>
                <col style="width: auto" />
              </colgroup>
              <tbody>
                <tr>
                  <th scope="row" class="noticelabel">
                    |
                    <label for="textarea">답변내용</label>
                  </th>
                  <td colspan="5">
                    <div class="textarea">
                      <textarea
                        id="textarea"
                        name="custInqCn"
                        rows="5"
                        cols="30"
                        title="내용입력"
                        class="input-textarea boxing"
                        placeholder="내용을 입력해주세요."
                        v-model="qnaanswer"
                      ></textarea>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
            <div class="search">
              <button type="button" class="regbtn2" @click="registerAnswer()">
                등록하기
              </button>
            </div>
          </div>
          <!--qna 작성 폼 끝 -->

          <!-- 답변 확인 창 시작 -->
          <div v-show="checkQna">
            <table class="answertable">
              <colgroup>
                <col style="width: auto" />
              </colgroup>
              <tbody>
                <tr>
                  <th scope="row" class="noticelabel">
                    |
                    <label for="text">답변내용</label>
                  </th>
                  <td colspan="5">
                    <div class="checkqna">
                      <td>{{ replyQna.qanswer }}</td>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>

        <!-- 답변 확인 창 끝 -->

        <!-- <!— 페이징 + 전체 목록 시작 —> -->
        <!-- <!— 페이징 양식 시작 —> -->
        <div class="col-md-12">
          <b-pagination
            v-model="page"
            :total-rows="question.totalItems"
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
</template>

<script>
import QnaDataService from "@/services/QnaDataService";
export default {
  data() {
    return {
      question: [],
      textarea: "",
      searchSelect: "",
      searchKeyword: "",
      registerQna: false,
      board: false,
      editQna: [],
      currentQna: null,
      checkQna: false,
      qnaanswer: "",

      replyQna: {},

      //페이징을 위한 변수 정의
      page: 1,
      count: 0,
      pageSize: 5,

      pageSizes: [3, 6, 9],
    };
  },
  methods: {
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },
    handlePageChange(value) {
      this.page = value;
      this.retrieveQna();
    },

    //전체조회
    retrieveQna() {
      QnaDataService.getAll(
        this.searchSelect,
        this.searchKeyword,
        this.page - 1,
        this.pageSize
      )
        .then((response) => {
          this.question = response.data;
          console.log(response.data);
          console.log(this.question);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    //답변 등록하기 버튼 클릭시
    registerAnswer() {
      if (this.qnaanswer != null) {
        this.editQna.qanswer = this.qnaanswer;
        QnaDataService.update(this.editQna.qid, this.editQna)
          .then((response) => {
            // var test = this.editQna;
            // alert(JSON.stringify(test));
            console.log(response.data);
            alert("답변이 완료되었습니다.");
            this.registerQna = false;
            this.qnaanswer = "";
            this.retrieveQna();
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
        alert("실패");
        this.successAnswer = false;
      }
    },

    //답변하기 버튼 클릭시
    setActiveNotice(data, index) {
      this.editQna = data;
      this.currentIndex = index;
      this.registerQna = !this.registerQna;
      this.successAnswer = false;
      // var test = this.editQna;
      // alert(JSON.stringify(test));
    },

    //삭제하기 버튼 클릭시
    deleteQna(qid) {
      // this.currentQna = data;
      // var test = this.currentQna.qid;
      // alert(JSON.stringify(test));
      QnaDataService.delete(qid)
        .then((response) => {
          console.log(response.data);
          alert("삭제되었습니다.");
          this.retrieveQna();
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //qna 확인창
    checkingQna(qid) {
      this.checkQna = !this.checkQna;
      QnaDataService.get(qid)
        .then((response) => {
          this.replyQna = response.data[0];
          console.log(this.replyQna);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    this.retrieveQna();
  },
};
</script>

<style lang="scss" scoped>
th,
td {
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
}
textarea {
  width: 100%;
  height: 6.25em;
  border: none;
  resize: none;
  // margin-left: 20%;
}
.regbtn {
  background: rgb(255, 255, 0);
  color: black;
  border-radius: 20px;
  vertical-align: middle !important;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
.successbtn {
  background: rgb(83, 255, 74);
  color: black;
  border-radius: 20px;
  vertical-align: middle !important;
}
.topbar-filter {
  border-top: none !important;
}
.user-hero {
  height: 385px;
  // background: url("../images/uploads/user-hero-bg.jpg") no-repeat;
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test8.png")
    no-repeat;
}
.deletebtn {
  background: red !important;
  color: aliceblue !important;
  border-radius: 20px;
  margin-top: 6%;
}
.topbar-filter p {
    padding-right: 0 !important;
    margin-bottom: 0;
}
.answertable{
  width: 80%;
  margin-left:20%;
}
.regbtn2{
  background: rgb(255, 255, 0);
  color: black;
  border-radius: 20px;
  vertical-align: middle !important;
  margin-left: 20% ;
}
</style>
