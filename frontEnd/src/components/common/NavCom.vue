<template>
  <div>
    <!--end of preloading-->

    <!--login form popup-->
    <div class="login-wrapper" id="login-content" v-show="popupClose">
      <div class="login-content" v-show="loginid">
        <!-- <a href="#" class="close">x</a> -->
        <h3>Login</h3>
        <!--        <div @submit.prevent="handleLogin">-->
        <!--        로그인 수정-->
        <div>
          <div class="row">
            <label for="username">
              Username:
              <input
                type="text"
                name="username"
                id="username"
                placeholder="username을 입력하세요"
                v-model="user.username"
              />
            </label>
          </div>
          <div class="row">
            <label for="password">
              Password:
              <input
                type="password"
                name="password"
                id="password"
                v-model="user.password"
              />
            </label>
          </div>

          <div class="row">
            <div class="remember">
              <button @click="toggleShow()" class="findbtn">
                아이디찾기 &nbsp; &nbsp;|
              </button>
              <button @click="togglePwd()" class="findbtn">비밀번호찾기</button>
            </div>
          </div>
          <div class="row">
            <button type="submit" @click="handleLogin()">Login</button>
          </div>
        </div>
        <div class="row">
          <p>Or social login</p>
          <div class="social-btn-2">
            <a
              class="img-fluid"
              href="http://localhost:8000/oauth2/authorization/google"
              role="button"
              ><img
                src="@/assets/images_kang/Components/common/Navcom/btn_googleSignUp.png"
                alt=""
            /></a>
            <a
              class="img-fluid"
              href="http://localhost:8000/oauth2/authorization/naver"
              role="button"
              ><img
                src="@/assets/images_kang/Components/common/Navcom/btn_naverSignUp.png.png"
                alt=""
            /></a>
            <a
              class="img-fluid"
              href="http://localhost:8000/oauth2/authorization/kakao"
              role="button"
              ><img
                src="@/assets/images_kang/Components/common/Navcom/btn_kakaoSignUp.png.png"
                alt=""
            /></a>
          </div>
        </div>
      </div>
      <!-- 로그인 화면  -->

      <!-- 아이디찾기 vshow -->
      <div class="login-content" v-show="findid">
        <a href="#" class="close">x</a>
        <h3>아이디 찾기</h3>
        <div>
          <div class="row">
            <label for="name">
              Name:
              <input
                type="text"
                name="name"
                id="name"
                placeholder="이름을 입력하세요"
                v-model="name"
              />
              <div
                v-if="errors.has('name')"
                class="alert alert-danger"
                role="alert"
              >
                name is required!
              </div>
            </label>
          </div>
          <div class="row">
            <label for="email">
              Email:
              <input type="email" name="email" id="email" v-model="email" />
            </label>
          </div>
          <div class="row">
            <button
              type="submit"
              class="findid-btn"
              id="submit"
              name="enter"
              @click="id_search()"
            >
              FIND ID
            </button>
            <button class="findid-btn" @click="cancelfindid()">취소</button>
          </div>
        </div>
      </div>
      <!-- 아이디찾기 vshow 끝 -->

      <!-- 비밀번호찾기 vshow 시작 -->
      <div class="login-content" v-show="findpwd">
        <a href="#" class="close">x</a>
        <h3>비밀번호 찾기</h3>
        <div>
          <div class="row">
            <label for="username">
              Username:
              <input
                type="text"
                name="username"
                id="username2"
                placeholder="username을 입력하세요"
                required
                value=""
                v-model="username"
              />
            </label>
          </div>
          <!-- 비밀번호 찾기 질문 -->
          <div class="row">
            <label for="pwdquestion">
              pwd question:
              <span class="signup-input">
                <select
                  id="signup-birth-mm"
                  class="selectbox"
                  name="findpwd"
                  style="width: 100%"
                  required
                  value=""
                >
                  <option value="ko" selected>나의 고향은?</option>
                  <option value="ko">어머니의 성함은?</option>
                  <option value="ko">아버지의 성함은?</option>
                </select>
              </span>
            </label>
          </div>
          <!-- 비밀번호 찾기 대답 -->
          <div class="row">
            <label for="answer">
              Pwd answer:
              <input
                type="text"
                name="answer"
                id="answer"
                required
                v-model="answer"
              />
            </label>
          </div>
          <div class="row">
            <button
              type="submit"
              id="submit"
              class="find-btn"
              @click="findpwd2()"
            >
              FIND PWD
            </button>
            <button class="findid-btn" @click="cancelfindpwd()">취소</button>
          </div>
        </div>
      </div>
      <!-- 비밀번호찾기 vshow 끝 -->

      <!-- 아이디찾기 성공시 뜨는 팝업 시작 -->
      <div class="login-content" v-show="findsuccess">
        <!-- <a href="" class="close">x</a> -->
        <h3>아이디 찾기</h3>
        <div>
          <div class="row">
            <label for="name">
              고객님의 아이디는 {{ username }} 입니다.
              <!-- 고객님의 아이디는 user.username 입니다. -->
            </label>
          </div>
          <!-- <div class="row">
            <label for="textbox">
              <input
                type="text"
                name="hidden"
                id="hidden"
                required
              />
            </label>
          </div> -->
          <div class="row">
            <button type="submit" @click="successlogin()">Login</button>
          </div>
          <!-- <li v-if="!currentUser" class="loginLink">
                  <a href="#">LOG In</a>
                </li> -->
        </div>
      </div>
      <!-- 아이디찾기 성공시 뜨는 팝업 끝  -->

      <!-- 패스워드찾기 성공시 뜨는 팝업 시작 -->
      <div class="login-content" v-show="findsuccessPwd">
        <!-- <a href="" class="close">x</a> -->
        <h3>비밀번호 찾기</h3>
        <div>
          <div class="row">
            <label for="password">
              새로운 Password:
              <input
                type="password"
                name="password"
                id="password"
                v-model="password"
              />
            </label>
          </div>
          <div class="row">
            <button type="submit" @click="updatePwd(user.id, changePwd, user)">
              수정하기
            </button>
            <button class="tohomelogin" @click="tohome()">로그인 하기</button>
          </div>
          <p>{{ message }}</p>
        </div>
      </div>
      <!-- 패스워드찾기 성공시 뜨는 팝업 끝  -->
    </div>
    <!--end of login form popup-->
    <!-- BEGIN | Header -->
    <header class="ht-header">
      <div class="container">
        <nav class="navbar navbar-default navbar-custom">
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div
            class="collapse navbar-collapse flex-parent"
            id="bs-example-navbar-collapse-1"
          >
            <div class="col-xs-5 navbar-menu">
              <ul class="nav navbar-nav flex-child-menu menu-left">
                <li class="hidden">
                  <a href="#page-top"></a>
                </li>

                <li><router-link to="/allMovie">전체보기</router-link></li>

                <li class="dropdown first">
                  <a
                    class="btn btn-default dropdown-toggle lv1 happy"
                    data-toggle="dropdown"
                    data-hover="dropdown"
                  >
                    영화<i class="fa fa-angle-down" aria-hidden="true"></i>
                  </a>
                  <ul class="dropdown-menu level1">
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                        >Movie grid<i class="ion-ios-arrow-forward"></i
                      ></a>
                      <ul class="dropdown-menu level2">
                        <li><a href="moviegrid.html">Movie grid</a></li>
                        <li>
                          <a href="moviegridfw.html">movie grid full width</a>
                        </li>
                      </ul>
                    </li>
                    <li><a href="movielist.html">Movie list</a></li>
                    <li><a href="moviesingle.html">Movie single</a></li>
                    <li class="it-last">
                      <a href="seriessingle.html">Series single</a>
                    </li>
                  </ul>
                </li>
                <li class="dropdown first">
                  <a
                    class="btn btn-default dropdown-toggle lv1 happy"
                    data-toggle="dropdown"
                    data-hover="dropdown"
                  >
                    영화관
                    <i class="fa fa-angle-down" aria-hidden="true"></i>
                  </a>
                  <ul class="dropdown-menu level1">
                    <li>
                      <a href="celebritygrid01.html">celebrity grid 01</a>
                    </li>
                    <li>
                      <a href="celebritygrid02.html">celebrity grid 02 </a>
                    </li>
                    <li><a href="celebritylist.html">celebrity list</a></li>
                    <li class="it-last">
                      <a href="celebritysingle.html">celebrity single</a>
                    </li>
                  </ul>
                </li>
                <li><router-link to="/test">test</router-link></li>
              </ul>
            </div>
            <div class="col-xs-2">
              <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
                <div
                  class="navbar-toggle"
                  data-toggle="collapse"
                  data-target="#bs-example-navbar-collapse-1"
                >
                  <span class="sr-only">Toggle navigation</span>
                  <div id="nav-icon1">
                    <span></span>
                    <span></span>
                    <span></span>
                  </div>
                </div>
                <router-link to="/">
                  <img
                    class="logo"
                    src="@/assets/images_kang/Components/common/Navcom/logo.png"
                    width="119"
                    height="58"
                /></router-link>
              </div>
            </div>
            <div class="col-xs-5 navbar-menu">
              <ul class="nav navbar-nav flex-child-menu menu-right col">
                <!-- 회원 로그인시 마이페이지  -->
                <li class="dropdown first" v-if="!currentUser">
                  <a
                    class="btn btn-default dropdown-toggle lv1"
                    data-toggle="dropdown"
                    data-hover="dropdown"
                  >
                    MY PAGE <i class="fa fa-angle-down" aria-hidden="true"></i>
                  </a>
                  <ul class="dropdown-menu level1">
                    <li><a href="/mypage">내정보</a></li>
                    <li><a href="404.html">결제내역</a></li>
                  </ul>
                </li>
                <!-- 회원 로그인시 마이페이지 끝  -->

                <li class="dropdown first">
                  <a
                    class="btn btn-default dropdown-toggle lv1"
                    data-toggle="dropdown"
                    data-hover="dropdown"
                  >
                    고객센터 <i class="fa fa-angle-down" aria-hidden="true"></i>
                  </a>
                  <ul class="dropdown-menu level1">
                    <li><a href="/notice">공지사항</a></li>
                    <li><router-link to="/faq">FAQ</router-link></li>
                    <li><router-link to="/addqna">QNA</router-link></li>
                  </ul>
                </li>

                <!-- 어드민 로그인시 어드민 나브바 시작-->
                <li class="dropdown first" v-if="currentUser">
                  <a
                    class="btn btn-default dropdown-toggle lv1"
                    data-toggle="dropdown"
                    data-hover="dropdown"
                  >
                    ADMIN <i class="fa fa-angle-down" aria-hidden="true"></i>
                  </a>
                  <ul class="dropdown-menu level1">
                    <li><a href="landing.html">회원관리</a></li>
                    <li><a href="404.html">게시판관리</a></li>
                    <li><a href="404.html">결제관리</a></li>
                  </ul>
                </li>
                <!-- 어드민 로그인시 어드민 나브바 끝-->

                <li v-if="!currentUser" class="loginLink">
                  <a href="#">LOG In</a>
                </li>
                <li v-if="!currentUser" class="btn signupLink">
                  <router-link to="/signup">sign up</router-link>
                </li>

                <!-- 로그인성공시 signup -> logout변경 -->
                <div v-if="currentUser">
                  <li class="logoutLink">
                    <a href="#" @click.prevent="logout">LOG Out</a>
                  </li>
                </div>
              </ul>
            </div>
          </div>
          <!-- <!— <!— /.navbar-collapse —> —> -->
        </nav>
      </div>
    </header>
    <!-- <!— <!— END | Header —> —> -->
  </div>
</template>

<script>
// import custom from "@/assets/js/custom.js";
// import FindIdVue from "../find/FindId.vue";
import User from "@/model/user.js";
import userService from "@/services/user.service";
export default {
  data() {
    return {
      user: new User(), // user 생성자 호출
      username: "", //id
      name: "",
      email: "",
      answer: "", //비밀번호찾기 문제 정답
      loading: false, // 로그인 버튼 활성화/비활성화 속성
      message: "",
      loginid: true, //로그인 창
      findid: false, //아이디찾기 창
      findpwd: false, //비밀번호찾기 창
      findsuccess: false, // 아이디 찾기 성공창
      findsuccessPwd: false, // 새 비밀번호 창
      password: "",
      changePwd: false,
      submitted: false,
      // Find 용
      findName: "",
      findEmail: "",
      findUsername: "",
      findAnswer: "",
      popupClose: true, // 팝업창 자동 닫힘
    };
  },
  computed: {
    currentUser() {
      return this.$store.state.auth.user;
    },
    // loggedIn 상태 확인
    loggedIn() {
      // this.$store.state.모듈명.state값
      return this.$store.state.auth.status.loggedIn;
    },
    // ROLE_ADMIN 만 보이는 메뉴(함수)
    showAdminBoard() {
      if (this.currentUser && this.currentUser.roles) {
        // if ROLE_ADMIN 있으면 true
        //               없으면 false
        return this.currentUser.roles.includes("ROLE_ADMIN");
      }
      // currentUser 없으면 false (메뉴가 안보임)
      return false;
    },
  },
  // created() : Vue 생성되자 마자 실행되는 이벤트(화면은 생성되지 않은 상태)
  created() {
    if (this.loggedIn) {
      // 로그인이 되어 있는 상태
      this.$router.push("/"); // 강제 /profile 로 이동
    }
  },
  methods: {
    // 로그인 버튼 클릭시 실행되는 함수
    handleLogin() {
      // 로그인 로직 처리
      this.loading = true;
      // vee-validate 함수 findid처리 방법
      this.$validator.validateAll().then((isValid) => {
        // validateAll() 모두 통과하면 -> isValid = true  (유효함)
        //                             -> isValid = false (유효하지 않음)
        if (!isValid) {
          this.loading = false;
          return; // 함수 탈출(break)
        }

        // isValid 가 true 이면 아래 로그인 실행(axios 실행)
        if (this.user.username && this.user.password) {
          // 공통함수 login 호출 :
          // this.$store.dispatch("모듈명/함수명", 매개변수)
          this.$store
            .dispatch("auth/login", this.user)
            .then(() => {
              alert("환영합니다");
              this.popupClose = !this.popupClose;
              window.location.reload();
              this.currentUser();
              this.showAdminBoard();
            })
            // 참고) if/else 문 대신에 -> or(||) and(&&) 연산자를 사용할때도 있음
            // 로직체크 순서 : true || false, false && true
            .catch((error) => {
              this.loading = false; // 로그인 버튼 활성화
              this.message =
                (error.response &&
                  error.response.data &&
                  error.response.data.message) ||
                error.message ||
                error.toString();
            });
        }
      });
    },
    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.popupClose = !this.popupClose;
      window.location.reload();
      this.adminlogin = false;
    },
    toggleShow() {
      this.loginid = false;
      this.findid = true;
      this.findpwd = false;
      this.findsuccess = false;
      this.findsuccessPwd = false;
    },
    togglePwd() {
      this.loginid = false;
      this.findpwd = true;
      this.findid = false;
      this.findsuccess = false;
      this.findsuccessPwd = false;
    },
    // 아이디찾기 취소버튼 눌릴시 로그인팝업으로
    cancelfindid() {
      this.loginid = true;
      this.findid = false;
      this.findpwd = false;
      this.findsuccess = false;
      this.findsuccessPwd = false;
    },
    // 패스워드 찾기 취소버튼 눌릴시 로그인팝업으로감
    cancelfindpwd() {
      this.loginid = true;
      this.findid = false;
      this.findpwd = false;
      this.findsuccess = false;
      this.findsuccessPwd = false;
    },

    //아이디찾기 버튼 클릭시 실행됨
    id_search() {
      var objName = document.getElementById("name"); //아이디
      var objEmail = document.getElementById("email"); //이메일
      if (objName.value == "") {
        alert("이름을 입력해주세요.");
        return false;
      } else {
        if (objEmail.value == "") {
          alert("이메일을 입력해주세요.");
          return false;
        } else {
          this.findsuccess = true;
          this.loginid = false;
          this.findid = false;
          this.findpwd = false;
          this.findsuccessPwd = false;
          this.findById();
        }
      }
    },

    // 패스워드찾기 버튼 클릭시 실행됨
    findpwd2() {
      var objUsername = document.getElementById("username2");
      var objanswer = document.getElementById("answer"); //answer
      if (objUsername.value == "") {
        alert("username 입력해주세요.");
        return false;
      } else {
        if (objanswer.value == "") {
          alert("answer을 입력해주세요.");
          return false;
        } else {
          this.findByPwd();
        }
      }
    },

    // 로그인 성공시
    successlogin() {
      this.loginid = true;
      this.findid = false;
      this.findpwd = false;
      this.findsuccess = false;
      this.findsuccessPwd = false;
    },

    // 아이디 찾기
    findById() {
      this.findName = this.name;
      this.findEmail = this.email;
      userService
        .getFindByIdName(this.findName, this.findEmail)
        .then((response) => {
          this.username = response.data.username;
          // alert(response.data.username);
          console.log(response.data.username);
        })
        .catch((error) => {
          console.log(error);
        });
    },

    // 비밀번호 확인 back으로 보내기
    // TODO: 1222 수정
    findByPwd() {
      this.findUsername = this.username;
      this.findAnswer = this.answer;
      userService
        .getFindByPassword(this.findUsername, this.findAnswer)
        .then((response) => {
          this.user = response.data;
          console.log(this.user);
          // var test = this.user;
          // alert(JSON.stringify(test));
          if (response.data.username == undefined) {
            //비밀번호 실패시 팝업이 넘어가지 않음
            this.loginid = false;
            this.findid = false;
            this.findpwd = true;
            this.findsuccess = false;
            this.findsuccessPwd = false;
          } else {
            //비밀번호 성공시 비밀번호 팝업이 뜸
            this.loginid = false;
            this.findid = false;
            this.findpwd = false;
            this.findsuccess = false;
            this.findsuccessPwd = true;
          }
        })
        .catch((error) => {
          console.log(error);
        });
    },

    // //새비밀번호 변경하기
    // TODO:1222수정
    updatePwd(id, changePwd, user) {
      // this.user.id;
      // this.changePwd = true;
      // this.user;
      this.message = "";
      this.submitted = true;
      user.password = this.password;
      // var test = this.user;
      // alert(JSON.stringify(test));
      // form 유효성 체크 검사
      // this.$validator.validate() : 유효하면 isValid = true , 아니면 isValid = false
      // this.$validator.validate().then((isValid) => {
      //   if (isValid) {
      // user 값 초기화
      // this.user = new User("", "", "", this.role);
      //  공유 저장소의 새사용자 등록 함수 실행
      userService
        .update(id, changePwd, user)
        .then((response) => {
          console.log(response.data);
          alert("새로운 비밀번호로 변경되었습니다.");
          this.message = "The password was updated successfully!";
        })
        .catch((e) => {
          console.log(e);
        });
      // }
      // });
    },
    // changePassword(){
    //   this.user.password="";
    //   this.changePwd=true;
    // }
    tohome() {
      this.loginid = true;
      this.findid = false;
      this.findpwd = false;
      this.findsuccess = false;
      this.findsuccessPwd = false;
    },
  },
};
</script>

<style lang="scss" scoped>
// .logo {
//   margin-left: %;
// }
.navbar-menu {
  margin-top: 2%;
}
// .hi{
//   justify-content: space-between;
//   margin-left: 3%;

//
.img-fluid {
  margin: 1%;
}

header .navbar-default .navbar-nav li a {
  font-family: "Dosis", sans-serif;
  /* font-size: 14px; */
  color: #abb7c4;
  font-weight: bold;
  text-transform: uppercase;
  cursor: pointer;
}
.remember {
  width: 50%;
  float: right !important;
}
.findbtn {
  margin-bottom: 2%;
}
.findbtn {
  background: none !important;
  color: black !important;
}
.findid-btn {
  margin-bottom: 2%;
}
.find-btn {
  margin-bottom: 2% !important;
}
input {
  text-transform: lowercase !important;
}
// #hidden{
//   background: none !important;
// }
.tohomelogin {
  background: none !important;
  color: black !important;
}
</style>
