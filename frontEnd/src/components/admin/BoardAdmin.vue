<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4>공지사항 관리 페이지</h4>
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
                    <a data-toggle="dropdown" @click="boardclick">
                      게시판관리
                      <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li class="active">
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
                  <!-- <a @click.prevent="logout">LOG OUT</a> -->
                  <li><a href="#" @click="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter">
              <!-- <h5 style="justify-content:flex-start !important; color: aliceblue; margin-right: 1%;">sort by:</h5> -->
              <h5 style="color: aliceblue">sort by:</h5>
              <select>
                <option value="range">-- Choose option --</option>
                <option value="saab">-- Choose option 2--</option>
              </select>
            </div>

            <!-- 전체정렬 -->

            <!--공지사항 테이블 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 10%" />
                    <col style="width: 15%" />
                    <col style="width: 15%" />
                    <col style="width: auto" />
                    <col style="width: 15%" />
                    <col style="width: 15%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col">번호</th>
                      <th scope="col">구분</th>
                      <th scope="col">제목</th>
                      <th scope="col">내용</th>
                      <th scope="col">등록일</th>
                      <th scope="col">EDIT</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr
                      v-for="(data, index) in notice.notice"
                      v-bind:key="index"
                    >
                      <td>{{ data.no }}</td>
                      <td>{{ data.type }}</td>
                      <td>{{ data.title }}</td>
                      <td>{{ data.content }}</td>
                      <td>{{ data.insertTime }}</td>
                      <td>
                        <button
                          class="editbtn"
                          @click="setActiveNotice(data, index)"
                        >
                          Edit
                        </button>
                        <button class="delbtn" @click="deleteNotice(data)">
                          delete
                        </button>
                      </td>
                    </tr>
                  </tbody>
                </table>
                <div class="search">
                  <button type="button" class="btn_col2" @click="writeNotice()">
                    글쓰기
                  </button>
                </div>
              </div>
            </div>
            <!--공지사항 테이블 끝  -->

            <!-- 공지사항 수정(edit) 폼 시작 -->
            <div v-show="update">
              <h5 style="color: aliceblue">공지사항 수정(EDIT)</h5>
              <table class="noticeboxnoticebox">
                <colgroup>
                  <col style="width: 10%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: auto" />
                  <col style="width: 15%" />
                </colgroup>
                <tbody>
                  <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="name">구분</label>
                    </th>
                    <td>
                      <input
                        type="text"
                        id="name"
                        class="input-text boxing"
                        v-model="currentNotice.type"
                      />
                    </td>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="noticeTitle">제목</label>
                    </th>
                    <td colspan="3">
                      <input
                        type="text"
                        name="title"
                        id="qnaTitle"
                        class="boxing input-text"
                        maxlength="100"
                        placeholder="제목을 입력해주세요."
                        v-model="currentNotice.title"
                      />
                    </td>
                  </tr>
                  <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="textarea">내용</label>
                    </th>
                    <td colspan="5">
                      <div class="textarea">
                        <textarea
                          id="textarea"
                          name="content"
                          rows="5"
                          cols="30"
                          title="내용입력"
                          class="input-textarea boxing"
                          placeholder="내용을 입력해주세요."
                          v-model="currentNotice.content"
                        ></textarea>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
              <div class="search">
                <button type="button" class="btn_col2" @click="updateNotice">
                  수정하기
                </button>
              </div>
              <p>{{ message }}</p>
            </div>
            <!-- 공지사항 수정 폼 끝 -->

            <!--공지사항 작성 폼 시작 (add)-->
            <div v-show="registerNotice">
              <h5 style="color: aliceblue">공지사항 등록(REG)</h5>
              <table class="noticeboxnoticebox">
                <colgroup>
                  <col style="width: 10%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: auto" />
                  <col style="width: 15%" />
                </colgroup>
                <tbody>
                  <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="name">구분</label>
                    </th>
                    <td>
                      <input
                        type="text"
                        id="name"
                        class="input-text boxing"
                        value
                        v-model="addnotice.type"
                      />
                    </td>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="noticeTitle">제목</label>
                    </th>
                    <td colspan="3">
                      <input
                        type="text"
                        name="title"
                        id="qnaTitle"
                        class="boxing input-text"
                        maxlength="100"
                        placeholder="제목을 입력해주세요."
                        v-model="addnotice.title"
                      />
                    </td>
                  </tr>
                  <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="textarea">내용</label>
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
                          v-model="addnotice.content"
                        ></textarea>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
              <div class="search">
                <button type="button" class="btn_col2" @click="createNotice">
                  등록하기
                </button>
              </div>
            </div>
            <!--공지사항 작성 폼 끝 -->
          </div>

          <!-- <!— 페이징 + 전체 목록 시작 —> -->
          <!-- <!— 페이징 양식 시작 —> -->
          <div class="col-md-12">
            <b-pagination
              v-model="page"
              :total-rows="notice.totalItems"
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
import NoticeDataService from "@/services/NoticeDataService";
export default {
  data() {
    return {
      notice: [],
      searchSelect: "",
      searchKeyword: "",
      message: "",
      currentNotice: [],
      currentIndex: -1,
      editData: "",

      addnotice: {
        no: null,
        title: "",
        content: "",
        type: "",
      },
      submitted: false,
      registerNotice: false, //공지사항 작성폼 vshow
      update: false, // 공지사항 수정폼 vshow

      // 게시판관리 v-show
      board: false,

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

    handlePageChange(value) {
      this.page = value;
      this.retrieveNotice();
    },

    //전체조회함수
    retrieveNotice() {
      NoticeDataService.getAll(
        this.searchSelect,
        this.searchKeyword,
        this.page - 1,
        this.pageSize
      )

        .then((response) => {
          const notice = response.data;
          this.notice = notice;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    // 목록을 클릭했을때 현재 객체, 인덱스번호를 저장하는 함수
    setActiveNotice(data, index) {
      this.currentNotice = data;
      this.currentIndex = index;
      this.update = !this.update; // update vshow
    },

    // 글쓰기 버튼 클릭시 글쓰기 테이블나옴
    writeNotice() {
      this.registerNotice = !this.registerNotice;
      this.update = false;
    },

    // 등록하기 버튼 클릭시 생성
    createNotice() {
      let data = {
        type: this.addnotice.type,
        title: this.addnotice.title,
        content: this.addnotice.content,
      };
      NoticeDataService.create(data)
        .then((response) => {
          this.addnotice.no = response.data.no;
          console.log(response.data);
          alert("등록되었습니다.");
          window.location.reload();
        })
        .catch((e) => {
          console.log(e);
        });
    },
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    // Edit 버튼 클릭시 적용
    updateNotice() {
      this.registerNotice = false;
      NoticeDataService.update(this.currentNotice.no, this.currentNotice)
        .then((response) => {
          console.log(response.data);
          alert("업데이트 되었습니다.");
          this.message = "업데이트 성공!";
          window.location.reload();
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //delete버튼 클릭시 적용
    deleteNotice(data) {
      this.currentNotice = data;
      NoticeDataService.delete(this.currentNotice.no)
        .then((response) => {
          console.log(response.data);
          alert("삭제되었습니다.");
          window.location.reload();
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    this.retrieveNotice();
    this.message = "";
    // this.getFindByNo(this.$route.params.no);
  },
};
</script>

<style lang="scss" scoped>
h4 {
  color: aliceblue;
  margin-right: 10%;
}
.notice_table {
  margin-top: 3%;
  text-align: center;
  color: aliceblue;
  background: inherit;
}
th,
td {
  border-bottom: 1px solid aliceblue;
  text-align: center;
}
.btn_col2 {
  box-sizing: border-box;
  border-radius: 25px;
  color: black !important;
  text-align: center;
  vertical-align: middle;
  background: rgb(255, 255, 0);
  display: inline !important;
  padding: 1%;
  width: 10%;
}
.noticebox {
  color: inherit;
  background: whitesmoke;
}
.btn_col {
  box-sizing: border-box;
  border-radius: 4px;
  border: 1px solid #414141;
  color: #ffffff !important;
  text-align: center;
  vertical-align: middle;
  background-color: #414141;
  display: inline !important;
  margin-bottom: 2%;
}

.noticelabel {
  color: #ffffff !important;
}
.editbtn {
  color: black;
  background: rgb(255, 255, 0);
  border-radius: 25px;
  width: 50%;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
textarea {
  width: 100%;
  height: 6.25em;
  border: none;
  resize: none;
}
.topbar-filter select {
  width: 215px;
  // -webkit-appearance: none;
  // -moz-appearance: none;
  float: right !important;
  // background: url(../images/uploads/drop-icon.png) no-repeat right 20px center;
  border-left: none !important;
  border-right: none !important;
  border-top: none;
  border-bottom: none !important;
  color: #ffffff;
  font-weight: 400;
}
.topbar-filter {
  justify-content: flex-end !important;
  border-top: none !important;
}
.delbtn {
  color: black;
  background: rgb(255, 0, 0);
  border-radius: 25px;
  width: 50%;
  margin-left: 1%;
  margin-top: 6%;
}
</style>
