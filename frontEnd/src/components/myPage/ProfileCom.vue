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
              <h1>{{ User.name }}’s profile</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY PROFILE</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 - 여기만 프로필이미지변경 주석처리됨-->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <!-- 프로필 이미지 업로드 추가 v-if -->
              <div class="user-img">
                <img
                  class="profileImg"
                  src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                  alt=""
                />
                <!-- <img src="images/uploads/user-img.png" alt="" /> -->
                <br />
                <a href="#" class="redbtn">Change avatar</a>
              </div>
              <!-- 프로필 이미지 업로드 추가 v-else -->
              <!-- <div
                      v-else
                      class="w-full h-full flex items-center justify-center cursor-pointer hover:bg-pink-100"
                      @click="clickInputTag()"
                  >
                    <input
                        ref="image"
                        id="input"
                        type="file"
                        name="image"
                        accept="image/*"
                        multiple="multiple"
                        class="hidden"
                        @change="uploadImage()"
                    />
                    <svg
                        class="w-8 h-8"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                    >
                      <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M12 9v3m0 0v3m0-3h3m-3 0H9m12 0a9 9 0 11-18 0 9 9 0 0118 0z"
                      />
                    </svg>
                  </div> -->
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
                  <li>
                    <router-link to="/myqna">나의 문의내역</router-link>
                  </li>
                  <li class="active">
                    <router-link to="/myprofile">개인정보 수정</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <p>Others</p>
                <ul>
                  <!--                  TODO: logout 클릭이벤트-->
                  <!--                  <li><a href="#">Log out</a></li>-->
                  <!--                  <li><a @click="logout">Log out</a></li>-->
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                  <li><a href="#" @click.prevent="deleteId">탈퇴하기</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="form-style-1 user-pro" action="">
              <form action="" class="user">
                <h4>프로필 수정</h4>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>이름</label>
                    <input
                      type="text"
                      placeholder="홍길동"
                      class="form-control"
                      id="name"
                      v-model="CurrentUser.name"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>아이디</label>
                    <input
                      type="text"
                      placeholder="영문자 6자 이상"
                      class="form-control"
                      id="username"
                      v-model="CurrentUser.username"
                    />
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>이메일</label>
                    <input
                      type="text"
                      placeholder="hong@gmail.com"
                      class="form-control"
                      id="email"
                      v-model="CurrentUser.email"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>전화번호</label>
                    <input
                      type="text"
                      placeholder="010-1234-5678"
                      class="form-control"
                      id="phone"
                      v-model="CurrentUser.phone"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label for="password">변경할 비밀번호</label>
                    <input
                      type="password"
                      placeholder="영문자, 숫자, 특수문자 조합 8~12자리"
                      class="form-control"
                      v-model="CurrentUser.password"
                    />
                  </div>
                </div>

                <!-- 저장 버튼 -->
                <div class="row">
                  <div class="col-md-2">
                    <input
                      @click="
                        updateUserInfo(CurrentUser.id, changePwd, CurrentUser)
                      "
                      class="submit"
                      type="button"
                      value="저장하기"
                    />
                  </div>
                  <p>{{ message }}</p>
                </div>
              </form>
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
import User from "@/model/user";

export default {
  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      User: new User(),
      checkanswer: "", // 비번찾기문제 폼에 입력된 값
      changePwd: false, // 버튼 클릭시 true, 변경폼 나타남
      changePwdForm: false,
      // objanswer: "",
      // username: "",
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
      message: "",
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

    // 로그아웃 함수 -> 공통함수 호출 : FIXME: 로그아웃 안 됨. 그리고 alert("로그아웃이 완료되었습니다") 추가해야함
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },
    // 패스워드찾기 버튼 클릭시 실행됨 -> (유효성 검사) TODO: 비번질문 답 입력 후 제출버튼 클릭
    // TODO: 무조건 alert 보안질문 불일치로 넘어감..ㅋ
    // findpwd() {
    //    var objanswer = document.getElementById("answer");
    //   alert(this.objanswer)
    //   if (this.objanswer.value == null) {
    //     alert("비밀번호 확인용 질문의 정답을 입력하세요")
    //   } else {
    //     if (this.objanswer.value == this.User.answer) {
    //       // this.updatePwd(this.User.id, changePwd, this.User);
    //       alert("보안질문 일치");
    //       this.changePwdForm = true;  // v-show 숨겨진거 보이기
    //
    //     } else {
    //       this.changePwdForm = false;
    //       alert("보안질문 불일치");
    //     }
    //   }
    // },

    // 회원정보수정
    updateUserInfo(id, changePwd, user) {
      alert("수정시작");
      this.message = "";
      this.submitted = true;
      this.$validator.validate().then((isValid) => {
        if (isValid) {
          userService
            .update(id, changePwd, user)
            .then((response) => {
              console.log(response.data);
              alert("ddd")
              this.message = "The User was updated successfully!";
            })
            .catch((e) => {
              console.log(e);
            });
        }
      });

      // alert("수정시작")
      // userService
      //   .update(this.CurrentUser.username, this.CurrentUser)
      //   .then((response) => {
      //     console.log(response.data);
      //     this.message = "유저 정보가 성공적으로 수정되었습니다!";
      //   })
      //   .catch((e) => {
      //     console.log(e);
      //   });
      // 수정완료시 그 전페이지로 강제이동
      // this.$router.push("/mypage");
    },

    // 새비밀번호 변경하기
    // TODO:1222수정
    updatePwd(id, changePwd, User) {
      // this.User.id;
      // this.changePwd = true;
      // this.User;
      this.message = "";
      this.submitted = true; //
      User.password = this.password;
      // var test = this.User;
      // alert(JSON.stringify(test));
      // form 유효성 체크 검사
      // this.$validator.validate() : 유효하면 isValid = true , 아니면 isValid = false
      // this.$validator.validate().then((isValid) => {
      //   if (isValid) {
      // User 값 초기화
      // this.User = new User("", "", "", this.role);
      //  공유 저장소의 새사용자 등록 함수 실행
      userService
        .update(id, changePwd, User)
        .then((response) => {
          console.log(response.data);
          this.message = "The password was updated successfully!";
        })
        .catch((e) => {
          console.log(e);
        });
    },

    // 탈퇴하기
    deleteId() {
      userService
        .delete()
        .then((response) => {
          console.log(response.data);
          alert("탈퇴가 완료되었습니다.");
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    custom();
    // this.getUser(this.$route.params.id); // 종학이 백엔드 데이터
    this.getUser(); // 종학이 백엔드 데이터
  },
};
</script>

<style scoped>
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
