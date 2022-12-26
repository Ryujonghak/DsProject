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
                      <li>
                        <router-link to="/theater-admin"
                          >영화관 관리</router-link
                        >
                      </li>
                    </ul>
                  </li>
                  <li><a href="#">결제관리</a></li>
                </ul>
              </div>
              <div class="user-fav">
                <p>기타</p>
                <ul>
                  <li><router-link to="/review-admin">리뷰관리</router-link></li>
                  <li><router-link to="/qna-admin">QnA 답변관리</router-link></li>
                  <li><a href="#">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter">
              <h3 style="color: aliceblue">공지사항 관리</h3>
              <label>Sort by:</label>
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
                    <tr v-for="notice in notices" v-bind:key="notice">
                      <td>{{ notice.id }}</td>
                      <td>{{ notice.type }}</td>
                      <td>{{ notice.title }}</td>
                      <td>{{ notice.content }}</td>
                      <td>{{ notice.regdate }}</td>
                      <td><button class="editbtn">Edit</button></td>
                    </tr>
                  </tbody>
                </table>
                <div class="search">
                  <button type="button" class="btn_col2" @click="writeNotice">
                    글쓰기
                  </button>
                </div>
              </div>
            </div>
            <!--공지사항 테이블 끝  -->

            <!--공지사항 작성 폼 시작 (add)-->
            <div v-show="registerNotice">
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
import NoticeDataService from "@/services/NoticeDataService.js";
export default {
  data() {
    return {
      data: [],
      addnotice: {
        id: null,
        type: "",
        title: "",
        content: "",
      },
      notices:[
        {
          id: 1,
          type: "success",
          title: "cusseess",
          content: "dfdafafd",
        },
      ],
      registerNotice: false,

      // 게시판관리 v-show
      board: false,
      //페이징을 위한 변수 정의
      page: 1,
      count: 0, //전체 데이터 건수
      pageSize: 3,

      pageSizes: [3, 6, 9], //select box에 넣을 기본 데이터
    };
  },
  methods: {
    retrieveNotice() {
      NoticeDataService.getAll(this.title, this.page - 1, this.pageSize) 
       
        .then((response) => {
          const { data, totalItems } = response.data;
          this.data = data; 
          this.count = totalItems; 
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
    },

    // 글쓰기 버튼 클릭시 글쓰기 테이블나옴
    writeNotice() {
      this.registerNotice = !this.registerNotice;
    },

    // 등록하기 버튼 클릭시 생성
    createNotice() {
      let data = {
        type: this.type,
        title: this.title,
        content: this.content,
      };
      NoticeDataService.create(data)
        // 성공하면 then() 결과가 전송됨
        .then((response) => {
          this.notice.id = response.data.id;
          // 콘솔 로그 출력(response.data)
          console.log(response.data);
          // 변수 submitted
          this.submitted = true;
        })
        // 실패하면 .catch() 결과가 전송됨
        .catch((e) => {
          console.log(e);
        });
    },
    boardclick() {
      this.board = !this.board;
    },
  },
};
</script>

<style lang="scss" scoped>
.notice_table {
  margin-top: 3%;
  text-align: center;
  color: aliceblue;
  background: inherit;
}
th,td{
  border-bottom: 1px solid aliceblue;
  border-right:1px solid aliceblue;
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
.editbtn{
  color:black;
  background: rgb(255, 255, 0);
  border-radius: 25px;
  width: 50%;
}
button{
  border: none !important;
}
button:active {
  outline: none !important; 
  box-shadow: none !important;
}
</style>
