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
              <h1>{{ CurrentUser.name }}’s q&a</h1>
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
                <br />
              </div>
              <div class="user-fav">
                <ul>
                  <li class="active">
                    <router-link to="">프로필</router-link>
                  </li>
                  <!-- 프로필 로그인 정보 표시 시작-->
                  <li style="color: white">
                    <strong style="color: white">이름 </strong>
                    <label>{{ CurrentUser.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ CurrentUser.username }}</label>
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
              <p>나의 문의내역</p>
              <select>
                <option value="range">-- 2022년 --</option>
                <option value="saab">-- 2021년 --</option>
              </select>
            </div>

            <!-- TODO: v-show 걸기. 넘어오는 데이터 없으면 뜨도록 -->
            <!-- <div v-show="!submitted"> -->
            <div>
              <h3>문의내역이 없습니다.</h3>
            </div>

            <!-- 모든 qna -->
            <table class="qnabox">
              <colgroup>
                <col style="width: 120px" />
                <col />
                <col style="width: 120px" />
                <col />
              </colgroup>
              <thead>
                <tr>
                  <th width="5%" scope="row"><label for="name">제목</label></th>
                  <th width="40%" cope="row"><label for="name">내용</label></th>
                  <th width="5%" scope="row"><label for="name">이름</label></th>
                  <th width="30%" scope="row"><label for="name">이메일</label></th>
                  <th width="20%" scope="row"><label for="name">휴대전화</label></th>
                </tr>
              </thead>
              <tbody v-for="(data, index) in qna" :key="index">
                <tr>
                  <td>{{ data.qtitle }}</td>
                  <td>{{ data.qcontent }}</td>
                  <td>{{ data.qwriter }}</td>
                  <td>{{ data.email }}</td>
                  <td>{{ data.phone }}</td>
                  <!-- <td>
                    <router-link :to="'/qna/select/' + data.name"
                      ><span class="badge bg-success">Edit</span></router-link
                    >
                  </td> -->
                </tr>
              </tbody>
            </table>

            <!-- <div class="col-lg-12 text-center mt-5">
              <table class="table table-striped table-dark">
                <thead>
                  <tr>
                    <th scope="col">제목</th>
                    <th scope="col">내용</th>
                    <th scope="col">이름</th>
                    <th scope="col">이메일</th>
                    <th scope="col">전화번호</th>
                    <th scope="col">Edit</th>
                  </tr>
                </thead>
                <tbody v-for="(data, index) in qna" :key="index">
                  <tr>
                    <td>{{ data.title }}</td>
                    <td>{{ data.content }}</td>
                    <td>{{ data.name }}</td>
                    <td>{{ data.email }}</td>
                    <td>{{ data.phone }}</td>
                    <td>
                      <router-link :to="'/qna/' + data.qno"
                        ><span class="badge bg-success">Edit</span></router-link
                      >
                    </td>
                  </tr>
                </tbody>
              </table>
            </div> -->

            <!-- 사용자 qna -->
            <div>
              <button @click="getMyQna()">나의 qna 보기</button>
            </div>
            <!-- <table class="qnabox" v-show="myQna">
              <colgroup>
                <col style="width: 120px" />
                <col />
                <col style="width: 120px" />
                <col />
              </colgroup>
              <thead>
                <tr>
                  <th scope="row"><label for="name">이름</label></th>
                  <th scope="row"><label for="name">이메일</label></th>
                  <th scope="row"><label for="name">휴대전화</label></th>
                  <th scope="row"><label for="name">제목</label></th>
                  <th scope="row"><label for="name">내용</label></th>
                </tr>
              </thead>
              <tbody v-for="(data, index) in qna" :key="index">
                <tr>
                  <td>{{ data.name }}</td>
                  <td>{{ data.email }}</td>
                  <td>{{ data.phone }}</td>
                  <td>{{ data.title }}</td>
                  <td>{{ data.content }}</td>
                </tr>
              </tbody>
            </table> -->

            <!-- <div v-show="submitted"> -->
            <div>
              <!-- TODO: 로그인한 사용자의 qna 폼 테이블시작 -->
              <table class="qnabox" v-show="myQna">
                <colgroup>
                  <col style="width: 120px" />
                  <col />
                  <col style="width: 120px" />
                  <col />
                </colgroup>
                <tbody>
                  <tr>
                    <th scope="row">
                      |
                      <label for="name">이름</label>
                    </th>
                    <td><input type="text" v-model="currentQna.name" /></td>
                    <th scope="row">
                      |
                      <label for="name">이메일</label>
                    </th>
                    <td><input type="text" v-model="currentQna.email" /></td>
                  </tr>
                  <tr>
                    <th scope="row">
                      |
                      <label for="name">휴대전화</label>
                    </th>
                    <td>
                      <input type="text" v-model="currentQna.phone" />
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">
                      |
                      <label for="qnaTitle">제목</label>
                    </th>
                    <td><input type="text" v-model="currentQna.title" /></td>
                  </tr>
                  <tr>
                    <th scope="row">
                      |
                      <label for="textarea">내용</label>
                    </th>
                    <td colspan="3">
                      <input type="text" v-model="currentQna.content" />
                    </td>
                  </tr>
                </tbody>
              </table>
              <!-- qna 테이블 끝 -->

              <!-- b-pagination : 부트스트랩 - 페이지 번호 컨트롤 -->
              <!-- total-rows : 전체 데이터 개수 -->
              <!-- per-page : 1페이지 당 개수 -->
              <!-- change : handlePageChange(), 페이지 번호 변경 시 실행되는 이벤트 -->
              <!-- <b-pagination
                v-model="page"
                :total-rows="count"
                :per-page="pageSize"
                prev-text="Prev"
                next-text="Next"
                @change="handlePageChange"
              ></b-pagination> -->

              <!-- 페이지박스 -->
              <!-- <div class="mb-3">
                Items per Page:
                <select
                  v-model="pageSize"
                  @change="handlePageSizeChange($event)"
                >
                  <option v-for="size in pageSizes" :key="size" :value="size">
                    {{ size }}
                  </option>
                </select>
              </div> -->
              <!-- 페이징 양식 끝 -->

              <!-- 수정버튼 시작 -->
              <!-- <div class="col-xs-4">
                <a href="#" class="redbtn" @click="updateQna">수정하기</a>
              </div> -->

              <!-- 
              <div class="alert alert-success" role="alert" v-if="message">
                {{ message }}
              </div> -->
            </div>
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

// import axios from "axios";   // 프로필이미지 업로드
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";

// 수빈이 addQna 에서 등록한거 불러오려고 함
import QnaDataService from "@/services/QnaDataService.js";
// import email from "@/assets/js/email.js";

export default {
  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      // 사용자 정보 받아오기
      CurrentUser: {
        email: "",
        password: "",
        username: "",
        phone: null,
        year: null,
        month: null,
        day: null,
        name: "",
        answer: "", // 비번확인용 정답
      },
      // AddQna 받아오기
      qna: [],
      // currentQna: null,
      // TODO: 하드코딩
      // 현재 로그인된 사용자 이름으로 검색해서 나온 qna 결과만 출력되도록...
      currentQna: {
        name: "",
        email: "",
        phone: "",
        title: "",
        content: "",
      },
      myQna: false, // 나의qa 보기 버튼 클릭하면 true

      // TODO: AddQna.vue 에서 submit 버튼을 클릭하면(출력할 qna데이터가 생기면) true(백엔, insert)가 되고, You submitted successfully! 화면에 출력됨
      // 조회한 데이터가 있으면 submitted true, 없으면 false
      submitted: true,
    };
  },
  methods: {
    // uploadImage: function () {
    //   let form = new FormData();
    //   let image = this.$refs["image"].files[0];
    //
    //   form.append("image", image);
    //
    //   axios
    //     .post("/upload", form, {
    //       header: { "Content-Type": "multipart/form-data" },
    //     })
    //     .then(({ data }) => {
    //       this.images = data;
    //     })
    //     .catch((err) => console.log(err));
    // },
    // clickInputTag: function () {
    //   this.$refs["image"].click();
    // },

    getUser(username) {
      // 종학이 백엔드 데이터 받는 함수
      username = this.$store.state.auth.user.username;
      // username = "forbob";
      console.log(username);
      userService
        .getUserUsername(username)
        .then((response) => {
          this.CurrentUser = {
            email: response.data.email,
            password: response.data.password,
            username: response.data.username,
            phone: response.data.phone,
            year: response.data.year,
            month: response.data.month,
            day: response.data.day,
            name: response.data.name,
            answer: response.data.answer,
          };
          console.log(this.CurrentUser);
          // console.log(response.data);
        })
        .catch((err) => console.log(err));
    },
    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },

    // 전체조회 TODO: 0102
    getAllQna() {
      console.log;
      QnaDataService.getAllQna()
        .then((response) => {
          console.log(response);
          console.log(response.data);

          this.qna = response.data; // qna 배열

          console.log(this.qna);
        })
        .catch((e) => console.log(e));
    },

    // qna name 검색 :FIXME:
    getMyQna(name) {
      this.myQna = !this.myQna;

      console.log;
      QnaDataService.getMyQna(name)
        .then((response) => {
          this.currentQna = response.data;
          console.log(response);
          console.log(response.data);
        })
        .catch((e) => console.log(e));
    },

    // // 수정
    // updateQna() {
    //   QnaDataService.update(this.currentQna.qno, this.currentQna)
    //     .then((response) => {
    //       console.log(response.data);
    //       this.message = "문의사항이 수정되었습니다!";
    //     })
    //     .catch((e) => {
    //       console.log(e);
    //     });
    // },
    // 삭제
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
    this.getAllQna(); // 전체 qna 조회
    this.getMyQna(this.$route.params.name); // 내 qna만 조회
  },
};
</script>

<style scoped>
/* 수빈이 AddQna 양식 */
.qnabox {
  border: 2px solid;
  color: aliceblue;
  padding: 5%;

  width: 820px;
  table-layout: fixed;
  word-break: break-all;
  height: auto;
}

.qna {
  background: black;
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
  display: inline !important ;
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
.topbutton{
    position:fixed; bottom:15px; right:15px; width:40px; height:40px; z-index:1; opacity:0.8;
}
</style>
