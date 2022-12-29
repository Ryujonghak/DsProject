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
                  <li >
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
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter" style="margin-bottom: 3%">
              <h3 style="color: aliceblue">QnA 관리</h3>
            </div>

            <!-- 전체정렬 -->

            <!--qna 전체 테이블 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 5%" />
                    <col style="width: 10%" />
                    <col style="width: 15%" />
                    <col style="width: 15%" />
                    <col style="width: auto" />
                    <col style="width: 30%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col">번호</th>
                      <th scope="col">이름</th>
                      <th scope="col">이메일</th>
                      <th scope="col">휴대전화</th>
                      <th scope="col">제목</th>
                      <th scope="col">내용</th>
                      <th scope="col">답변하기</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr
                      v-for="(question, index) in questiones"
                      v-bind:key="index"
                    >
                      <td>{{ question.qno }}</td>
                      <td>{{ question.name }}</td>
                      <td>{{ question.email }}</td>
                      <td>{{ question.phone }}</td>
                      <td>{{ question.title }}</td>
                      <td>{{ question.content }}</td>
                      <td>
                        <button
                          class="regbtn"
                          @click="writeQna"
                          v-show="writeAnswer"
                        >
                          답변하기
                        </button>
                        <button class="successbtn" v-show="successAnswer">
                          답변완료
                        </button>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <!--qna 전체조회 테이블 끝  -->

            <!--qna 답변작성 폼 시작 (add)-->
            <div v-show="registerQna">
              <table class="noticeboxnoticebox">
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
                          v-model="textarea"
                        ></textarea>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
              <div class="search">
                <button type="button" class="regbtn" @click="registerAnswer">
                  등록하기
                </button>
              </div>
            </div>
            <!--공지사항 작성 폼 끝 -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
//import QnaDataService from '@/services/QnaDataService';
export default {
  data() {
    return {
      questiones: [
        {
          qno: 1,
          name: "강수빈",
          email: "isug1004@daum.net",
          phone: "010-6368-3193",
          title: "안녕하세요 문의합니다.",
          content:
            "안녕하세요, 영화관문의드립니다. 영화관에서는 외부음식 반입이 금지인가요? 아니면 가능한가요? 어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸어쩌구저쩌구저쩌구어쩌구저쩌꾸 ",
        },
      ],
      textarea: "",
      registerQna: false,
      successAnswer: false,
      writeAnswer: true,
      board: false,
      currentQna:null,
    };
  },
  methods: {
    logout() {
      this.$store.dispatch("auth/logout"); 
      this.$router.push("/");
    },
    //답변하기 버튼 클릭시
    writeQna() {
      this.registerQna = !this.registerQna;
      this.successAnswer = false;
    },
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    //답변 등록하기 버튼 클릭시
     registerAnswer() {
       if (this.textarea) {
           alert("답변이 완료되었습니다.");
          this.successAnswer = true;
          this.writeAnswer = false;
       }
    else{
        alert("실패");
       this.successAnswer = false;
      }
  },
  //},
},
}
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
.topbar-filter{
  border-top:none !important;
}

</style>
