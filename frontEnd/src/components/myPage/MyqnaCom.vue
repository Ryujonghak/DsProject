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
              <h1>{{ CurrentUser.name }}’s profile</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>Profile</li>
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
                <img src="images/uploads/user-img.png" alt="" />
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

            <!-- TODO: v-if 걸기. 넘어오는 데이터 없으면 뜨도록..? -->
            <div v-if="!submitted">
              <p>문의내역이 없습니다.</p>
            </div>

            <div v-else>
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
                    <em class="font-orange">*</em>
                  </th>
                  <td>{{ qna.name }}</td>
                  <th scope="row">
                    |
                    <label for="name">이메일</label>
                    <em class="font-orange">*</em>
                  </th>
                  <td>{{ qna.email }}</td>
                </tr>
                <tr>
                  <th scope="row">
                    |
                    <label for="name">휴대전화</label>
                    <em class="font-orange">*</em>
                  </th>
                  <td>
                    {{ qna.phonenumber1 }} - {{ qna.phonenumber2 }} -
                    {{ qna.phonenumber3 }}
                  </td>
                </tr>
                <tr>
                  <th scope="row">
                    |
                    <label for="qnaTitle">제목</label>
                    <em class="font-orange">*</em>
                  </th>
                  <td>{{ qna.title }}</td>
                </tr>
                <tr>
                  <th scope="row">
                    |
                    <label for="textarea">내용</label>
                    <em class="font-orange">*</em>
                  </th>
                  <td colspan="3">{{ qna.content }}</td>
                </tr>
                </tbody>
              </table>
              <!-- qna 테이블 끝 -->
              <!-- 삭제버튼 시작 -->
              <div class="col-xs-4">
                <a href="#" class="redbtn" @click="d">삭제하기</a>
              </div>
              <!-- 삭제버튼 끝 -->
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
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
      message: "",
      // 수빈이 AddQna 받아오기
      qna: [], // TODO: 정주희 qna관련 추가_수빈이 addQna에서 보낸 qna 정보
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

    // 종학이 백엔드 데이터 받는 함수
    getUser(username) {
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

    // TODO: 수빈이 addQna 함수 받아서 데이터만 뿌리기
    retrieveQna() {
      QnaDataService.getAll().catch((e) => {
        console.log(e);
      });
    },
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
    this.retrieveQna(); // TODO: 수빈이 데이터 뿌리기..
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
</style>
