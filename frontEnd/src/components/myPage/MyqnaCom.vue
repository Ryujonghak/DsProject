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
                  <li><a href="#">탈퇴하기</a></li>
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
            <div v-show="!submitted">
              <h3>문의내역이 없습니다.</h3>
            </div>

            <div v-show="submitted">
              <!-- TODO: qna 테이블시작 -->
              <table class="qnabox">
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
                      <input type="text" v-model="currentQna.phonenumber" />
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

              <!-- qna 테이블 v-for 버전 -->
              <!-- <table class="qnabox">
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
                  </tr>
                  <tr>
                    <td>{{ data.title }}</td>
                    <td>{{ data.content }}</td>
                  </tr>
                </tbody>
              </table> -->

              <!-- 수정버튼 시작 -->
              <div class="col-xs-4">
                <a href="#" class="redbtn" @click="updateQna">수정하기</a>
              </div>

              <div class="alert alert-success" role="alert" v-if="message">
                {{ message }}
              </div>
              
            </div>
          </div>
        </div>
      </div>
    </div>
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
      CurrentUser: {
        email: "",
        password: "",
        username: "",
        phone: null,
        year: null,
        month: null,
        day: null,
        name: "",
        answer: "",
      },
      // 수빈이 AddQna 받아오기
      // currentQna: null, // QnaDetail - qna 수정
      currentQna: {
        name: "강태경"
      }, // QnaDetail - qna 수정
      qna: [], // QnaList   - qna 조회
      message: "",
      // 하드코딩
      // qna: {
      //   name: "dd",
      //   email: "dd",
      //   phonenumber: "dd",
      //   title: "dd",
      //   content: "dd",
      // },

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
      username = "forbob";
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

    // 조회
    getQna(qno) {
      QnaDataService.get(qno)
        .then((response) => {
          this.currentQna = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    // 수정
    updateQna() {
      QnaDataService.update(this.currentQna.qno, this.currentQna)
        .then((response) => {
          console.log(response.data);
          this.message = "문의사항이 수정되었습니다!";
        })
        .catch((e) => {
          console.log(e);
        });
    },
    // 삭제

    // retrieveQna() {
    //   QnaDataService.getAll().catch((e) => {
    //     console.log(e);
    //   });
    // },
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터

    this.message = "";
    //  this.$route.params.qno : 이전페이지에서 전송한 매개변수는 $route.params 안에 있음
    // $route 객체 : 주로 url 매개변수 정보들이 있음
    // router/index.js 상세페이지 url의 매개변수명 : qno
    this.getQna(this.$route.params.qno);
  },
};
</script>

<style>
/* 수빈이 AddQna 양식 */
.qnabox {
  border: 2px solid;
  color: aliceblue;
  padding: 5%;
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
</style>
