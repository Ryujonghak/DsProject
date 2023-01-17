<template>
  <div>
    <!--preloading-->
    <!-- <div id="preloader">
      <img class="logo" src="images/logo1.png" alt="" width="119" height="58" />
      <div id="status">
        <span></span>
        <span></span>
      </div>
    </div> -->

    <!-- 상단 페이지 제목 -->
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>{{ user.name }}’s q&a</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY Q&A</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 -->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-img">
                <!-- src="images/uploads/user-img.png" -->
                <img
                    class="profileImg"
                    src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                    alt=""
                />
                <br/>
              </div>
              <div class="user-fav">
                <ul>
                  <li class="active">
                    <router-link to="">프로필</router-link>
                  </li>
                  <!-- 프로필 로그인 정보 표시 시작-->
                  <li style="color: white">
                    <strong style="color: white">이름 </strong>
                    <label>{{ user.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ user.username }}</label>
                  </li>
                  <!-- 프로필 로그인 정보 표시 끝 -->
                </ul>
              </div>
              <div class="user-fav">
                <p>Account Details</p>
                <ul>
                  <li>
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li>
                    <router-link to="/myticket">예매내역</router-link>
                  </li>
                  <li>
                    <router-link to="/mywish">찜한 영화</router-link>
                  </li>
                  <li class="active">
                    <router-link to="/myqna">나의 문의내역</router-link>
                  </li>
                  <li>
                    <router-link to="/myprofile">개인정보 수정</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <p>Others</p>
                <ul>
                  <!--                  <li><a href="#">Log out</a></li>-->
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user">
              <p class="mytitle">나의 문의내역 <span>{{ totalQna }}</span> in total</p>
              <a href="/myqna" class="grid"
                ><i class="ion-grid"></i
              ></a>
              <!-- <select class="form-select" v-model="searchSelect">
                <option>-- name --</option>
                <option>-- 답변완료 --</option>
              </select> -->
            </div>

            <!-- TODO: v-if 넘어오는 데이터 없으면 뜨도록 -->
            <!-- <div> -->
            <div v-if="emptyQna == true" class="noQna">
              <h3>문의내역이 없습니다.</h3>
            </div>

            <!-- <div class="myqnaArea"> -->
            <div class="myqnaArea" v-if="emptyQna == false">
              <!-- 모든 qna -->
              <table class="qnabox">
                <colgroup>
                  <col style="width: 20px"/>
                  <col style="width: 35px"/>
                  <col style="width: 35px"/>
                  <col style="width: 10px"/>
                </colgroup>
                <thead>
                <tr>
                  <th class="myqna" scope="row">
                    <label for="name">제목</label>
                  </th>
                  <th class="myqna" scope="row">
                    <label for="name">문의</label>
                  </th>
                  <th class="myqna" scope="row">
                    <label for="name">답변</label>
                  </th>
                  <th class="myqna" scope="row">
                    <label for="name">문의삭제</label>
                  </th>
                </tr>
                </thead>
                <!-- data의 qna[] 배열 안의 qna에서 totalItems까지 다 담아옴 그래서 qna.qna -->
                <tbody v-for="(data, index) in qna.qna" :key="index">
                <!-- <tbody v-for="(data, index) in myqna" :key="index"> -->
                <tr>
                  <td class="myqnaTd">{{ data.qtitle }}</td>
                  <td class="myqnaTd">{{ data.qcontent }}</td>
                  <td class="myqnaTd">{{ data.qanswer }}</td>
                  <td class="myqnaTd">
                    <button class="deletebtn" @click="deletebtn(data.qid)">
                      Delete
                    </button>
                  </td>

                  <!-- <td class="myqnaTd">{{ data.qwriter }}</td> -->
                  <!-- <td>
                <router-link :to="'/qna/select/' + data.name"
                  ><span class="badge bg-success">Edit</span></router-link
                >
              </td> -->
                </tr>
                </tbody>
              </table>
            </div>

            <!-- 페이징처리-->
            <!-- total-rows : 전체 데이터 개수 -->
            <!-- per-page : 1페이지 당 개수 -->
            <!-- change : handlePageChange(), 페이지 번호 변경 시 실행되는 이벤트 -->
            <b-pagination
                v-model="page"
                :total-rows="qna.totalItems"
                :per-page="pageSize"
                pills
                size="sm"
                prev-text="<"
                next-text=">"
                @change="handlePageChange"
            ></b-pagination>

            <!-- TODO: 추가문의 시작 -->
            <div class="buttonArea">
              <a href="#" class="redbtn" @click="addQnaForm()">추가문의</a>
            </div>

            <div class="addqnaArea" v-show="addform">
              <!-- qna 추가 -->
              <table class="qnabox2">
                <colgroup>
                  <col style="width: 120px"/>
                  <col/>
                  <col style="width: 120px"/>
                  <col/>
                </colgroup>
                <tbody>
                <tr>
                  <th scope="row">
                    |
                    <label for="name">제목</label>
                  </th>
                  <td>
                    <input
                        type="text"
                        name="title"
                        id="qnaTitle"
                        class="boxing input-text"
                        maxlength="100"
                        placeholder="제목을 입력해주세요."
                        v-model="addQna.qtitle"
                    />
                  </td>
                </tr>
                <tr>
                  <th scope="row">
                    |
                    <label for="textarea">내용</label>
                  </th>
                  <td colspan="3" class="textarea">
                      <textarea
                          id="textarea"
                          name="content"
                          title="내용입력"
                          rows="5"
                          class="input-textarea boxing"
                          placeholder="내용을 입력해주세요."
                          v-model="addQna.qcontent"
                      >
                      </textarea>
                  </td>
                </tr>
                </tbody>
              </table>
              <div class="button">
                <a type="submit" class="redbtn" @click="createQna()"
                >전송하기</a
                >
              </div>
            </div>
            <!-- TODO: 추가문의 끝 -->
          </div>
        </div>
      </div>
    </div>
    <!-- TODO: 탑버튼 추가 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
  </div>
</template>

<script>
/* eslint-disable */
import custom from "@/assets/js/custom";
// User Part
import User from "@/model/user";
import userService from "@/services/user.service";
// Qna Part
import qnaDataService from "@/services/QnaDataService.js";
import Qna from "@/model/qna";


export default {
  data() {
    return {
      username: this.$store.state.auth.user.username,
      // 사용자 정보 받아오기
      user: new User(),
      // AddQna 받아오기
      qna: [],
      totalQna: 0,  // 갯수 세기
      // AddQna.vue 에서 submit 버튼을 클릭하면(출력할 qna데이터가 생기면) true(백엔, insert)가 되고, You submitted successfully! 화면에 출력됨
      addQna: new Qna(),
      submitted: true,
      // 빈 값으로 넘겨도 기본 값 writer로 검색
      searchSelect: "", // 기본값
      // searchKeyword: "" ,
      searchKeyword: "", // 검색어

      emptyQna: true,

      //페이징을 위한 변수 정의
      page: 1,
      count: 0,
      pageSize: 5,
      pageSizes: [5, 10, 15],

      addform: false,
    };
  },
  methods: {
    // 백엔드 데이터 받는 함수 + username으로 qna 조회
    getUser() {
      // username = this.$store.state.auth.user.username;
      console.log("username: " + this.username);
      userService
          .getUserUsername(this.username)
          .then((response) => {
            this.user = response.data;
            this.qwriter = this.user.name;  // 사용자이름으로 qna 검색
            console.log("getUser this.user: ", this.user);
            console.log("getUser response.data: ", response.data);
            // FIXME: user 정보 가져오는걸 성공하면 this.searchKeyword = this.user.name; 이렇게 값 넣고 함수 실행!
            this.getQna();
          })
          .catch((err) => console.log(err));
    },
    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },
    // 전체조회
    // getQna() {
    //   qnaDataService
    //       .getAll(this.searchSelect, this.searchKeyword, this.page - 1,
    //           this.pageSize)
    //       .then(response => {
    //         console.log("getQna response.data: ", response.data);
    //         this.qna = response.data; // data 안에서 qna만 표시
    //         console.log("qna: ", this.qna);
    //       })
    //       .catch((err) => console.log(err));
    // },

    // 내꺼만 조회하기
    getQna() {
      qnaDataService
          .getQnaQwriter(
              this.username,
              this.page - 1,
              this.pageSize
          )
          .then((response) => {
            console.log("getQna response.data: ", response.data);
            this.qna = response.data; // data 안에서 qna만 표시
            this.totalQna = this.qna.qna.length;  // 갯수세기 추가
            console.log("qna: ", this.qna);
            this.findQna();
          })
          .catch((err) => console.log(err));
    },

    // 페이지 출력 갯수 변경
    handlePageChange(value) {
      this.page = value;
      this.getQna();
    },

    // 삭제
    deletebtn(qid) {
      qnaDataService
          .delete(qid)
          .then((response) => {
            console.log(response.data);
            alert("문의사항이 삭제되었습니다.");
            this.getQna();      
            // this.$router.push("/mypage");
          })
          .catch((e) => {
            console.log(e);
          });
    },
    addQnaForm() {
      this.addform = !this.addform;
    },
    // qna 추가
    createQna() {
      this.addQna.qwriter = this.username;
      qnaDataService
          .create(this.addQna)
          // 성공하면 then() 결과가 전송됨
          .then((response) => {
            console.log(response.data);
            alert("등록이 완료되었습니다");
            this.getQna();      
            // this.$router.push("/mypage");
            // window.location.reload();
          })
          // 실패하면 .catch() 에러메세지가 전송됨
          .catch((e) => {
            console.log(e);
          });
    },
    findQna() {
      if(this.qna.length == 0) {
        this.emptyQna = true;
      } else {
        this.emptyQna = false;
      }
      console.log("findQna", this.qna);
    }
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
    // FIXME: 언니 원래 여기서 QNA까지 실행했었는데 그렇게 하니까 searchKeyword이 유저함수에서 값을 늦게 받아오는 경우가 생겨서 그냥 유저 받아오는거 성공하면 바로 QNA함수 실행되도록 안에 넣어뒀어!
    // this.getQna();
  },
};
</script>

<style scoped>
.qnabox {
  width: 820px;
  table-layout: fixed;
  word-break: break-all;
  height: auto;
  border-block-color: none;
}

.qnabox2 {
  color: #fff;
}

.qna {
  background: black;
}

.buttonArea {
  padding-top: 30px;
  padding-bottom: 50px;
}

tbody {
  display: table-row-group;
  vertical-align: middle;
  border-color: whitesmoke;
}

.font-orange {
  color: red;
}

#hpNum1 {
  width: 60px;
}

#hpNum2 {
  width: 60px;
}

#hpNum3 {
  width: 60px;
}

.boxing {
  display: inline !important;
  width: 100%;
  height: 70%;
  padding: 6px 12px;
  font-size: 14px;
  line-height: 1.42857143;
  color: #555555;
  background-color: #fff;
  background-image: none;
  /* border: 1px solid #aaa; */
}

.button {
  margin-top: 5%;
  text-align: center;
  box-shadow: none !important;
  margin-bottom: 5%;
}

/* .information {
  margin-top: 3%;
  margin-left: 10%;
} */

/* 배경이미지 : 아리걸로 통일 */
.user-hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
  /* height: 598px; */
  width: 100%;
}

/* 마이페이지-프로필 이미지크기 수정 */
.profileImg {
  -ms-interpolation-mode: bicubic;
  border: 0;
  /* height: auto; */
  max-height: 120px;
  /* max-width: 100%; */
  max-width: 120px;
  vertical-align: middle;
}

/* TODO: 탑버튼 추가 */
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}

/* qna 보기 표 디자인 */
.myqnaArea {
  height: 300px;
}

.myqna {
  color: aliceblue;
  border: 1px solid aliceblue;
  text-align: center;
}

.myqnaTd {
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
  text-align: center;
  vertical-align: middle !important;
}

.deletebtn {
  color: red;
  font-weight: bold;
}

textarea {
  width: 100%;
  height: 6.25em;
  border: none;
  resize: none;
}

/* 문의내역없음 */
.noQna {
  color:lightslategray;
}

.mytitle{
  color: azure;
}
/*
.form-style-1 {
    background-color:none;
    border: none;
    padding: 15px;
} */
</style>
