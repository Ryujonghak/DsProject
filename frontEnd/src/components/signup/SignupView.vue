<template>
  <div class="noticelist" style="background: black">
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>SIGN UP 회원가입</h1>
              <ul class="breadcumb">
                <li class="active"><router-link to="/">Home</router-link></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--회원가입 부분-->
    <form class="signup-wrap container"  @submit.prevent="handleRegister">
      <div  v-if="!successful">
        <!--아이디,비번,비번재확인-->
        <h3>아이디</h3>
        <span class="signup-input">
          <input 
          id="signup-id" 
          type="text"
          v-model="user.username"
          name="username" />
          <span class="signup-at"></span>
        </span>

        <h3>비밀번호</h3>
        <span class="signup-input">
          <input
          v-model="user.password"
          placeholder="6자리 이상 숫자를 입력하세요."
          id="signup-pw" type="password" />
          <span class="pw-lock"></span>
        </span>

        <h3>비밀번호 재확인</h3>
        <span class="signup-input">
          <input id="signup-pww" type="password" />
          <span class="pww-lock"></span>
        </span>
      </div>

      <div style="margin-top: 35px">
        <!--이름,생년월일,이메일-->
        <h3>이름</h3>
        <span class="signup-input">
          <input id="signup-name" type="text" />
        </span>

        <h3>생년월일</h3>
        <span style="display: flex">
          <span class="signup-input-birth">
            <input id="signup-birth-yy" type="text" placeholder="년(4자)" 
            v-model="user.birthyy"/>
          </span>
          <span class="signup-input-birth" style="margin-left: 10px">
            <select
              id="signup-birth-mm"
              class="selectbox"
              name="month"
              onchange=""
              v-model="user.birthmm"
            >
              <option value="month" selected>월</option>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
            </select>
          </span>
          <span class="signup-input-birth" style="margin-left: 10px">
            <input id="signup-birth-dd" type="text" placeholder="일"
            v-model="user.birthdd" />
          </span>
        </span>

        <span class="choice">
          <h3>이메일</h3>
          <span></span>
        </span>
        <span class="signup-input">
          <input
          v-model="user.email"
            id="signup-email"
            type="email"
            placeholder="이메일양식(@)을 입력하세요"
          />
        </span>
      </div>

      <div style="margin-top: 35px">
        <!--휴대전화-->
        <h3>휴대전화</h3>
        <div style="display: flex">
          <span
            class="signup-input"
            style="width: 100%; margin: 10px 0px 0px 0px"
          >
            <input id="signup-phone" type="text" placeholder="전화번호 입력" 
            v-model="user.phonenumber"/>
          </span>
        </div>
      </div>

      <div style="margin-top: 35px">
        <h3>비밀번호 찾기 질문</h3>
        <span class="signup-input">
          <select
            id="signup-birth-mm"
            class="selectbox"
            name="findpwd"
            style="width: 100%"
            v-model="user.pwdquestion"
          >
            <option value="ko" selected>나의 고향은?</option>
            <option value="ko">어머니의 성함은?</option>
            <option value="ko">아버지의 성함은?</option>
          </select>
        </span>
      </div>

      <div style="margin-top: 35px">
        <!--비밀번호 질문 확인-->
        <h3>비밀번호 찾기 정답</h3>
        <div style="display: flex">
          <span
            class="signup-input"
            style="width: 100%; margin: 10px 0px 0px 0px"
          >
            <input
              id="signup-phone"
              type="text"
              placeholder="정답을 한글로 입력하세요."
              v-model="user.pwdanswer"
            />
          </span>
        </div>
      </div>
      <div>
        <!--가입하기-->
        <div class="signup-btn-wrap">
          <button id="signup-btn" class="submit">가입하기</button>
        </div>
      </div>
    </form>
    <div
        v-if="message"
        class="alert"
        :class="successful ? 'alert-success' : 'alert-danger'"
      >
        {{ message }}
      </div>
  </div>
</template>

<script>
import User from "../../model/user.js";

export default {
    data() {
    return {
      user: new User("","","",null,null,null,null,"",""),
      submitted: false,
      successful: false,
      message: "",
    };
  },
  computed: {
    // loggedIn 상태 확인
    loggedIn() {
      return this.$store.state.auth.status.loggedIn;
    },
  },
  // created() : Vue 생성되자 마자 실행되는 이벤트(화면은 생성되지 않은 상태)
  created() {
    if (this.loggedIn) {
      // 로그인이 되어 있는 상태
      this.$router.push("/"); 
    }
  },
  methods: {
    // 회원가입 버튼 클릭시 실행되는 함수
    handleRegister() {
      this.message = "";
      this.submitted = true; 
      this.$validator.validateAll().then((isValid) => {
        if (!isValid) {
          return; // 함수 탈출(break)
        }
        this.$store.dispatch("auth/register", this.user)
          .then((response) => {
            this.message = response.message;
            this.successful = true;
            alert("회원가입이 완료되었습니다.")
          })
          .catch((error) => {
            this.successful = false; 
            this.message =
              (error.response &&
                error.response.data &&
                error.response.data.message) ||
              error.message ||
              error.toString();
          });
      });
    },
  },
};
</script>

<style lang="scss" scoped>
body {
  background-color: #f5f6f7;
}
select {
  width: 85px;
  height: 25px;
  outline: none;
  background: #f5f6f7;
  border: 1px solid #999;
}
a {
  color: black;
  text-decoration: none;
}
.main {
  text-align: center;
  margin-top: 20px;
}
input {
  cursor: pointer;
}
.main-signup {
  text-align: center;
  width: 460px;
  margin: auto;
}
h3 {
  margin: 19px 0px 8px;
  text-align: left;
  font-size: 16px;
  color: #dadada;
}
.signup-input {
  display: flex;
  /* margin: 0px 10px 8px 10px; */
  padding: 10px;
  border: solid 1px #dadada;
  background: #fff;
  cursor: pointer;
}
.signup-input-c {
  display: flex;
  /* margin: 0px 10px 8px 10px; */
  padding: 10px;
  border: solid 1px #dadada;
  background: #f5f6f7;
  cursor: pointer;
}
.signup-input-c input {
  background: #f5f6f7;
}
#signup-id,
#signup-pw,
#signup-pww {
  height: 29px;
  border: none;
  outline: none;
  width: 100%;
}
.signup-at {
  color: rgb(150, 150, 150);
  font-size: 15px;
  font-family: Dotum, "돋움", Helvetica, sans-serif;
  margin-top: 8px;
}
.pw-lock {
  /* content: ''; */
  /* display: inline-block; */
  top: 50%;
  right: 13px;
  width: 24px;
  height: 24px;
  margin-top: 5px;
  background-image: url(https://static.nid.naver.com/images/ui/join/m_icon_pw_step.png);
  background-size: 125px 75px;
  cursor: pointer;
}
.pww-lock {
  /* content: ''; */
  /* display: inline-block; */
  top: 50%;
  right: 13px;
  width: 24px;
  height: 24px;
  margin-top: 5px;
  background-image: url(https://static.nid.naver.com/images/ui/join/m_icon_pw_step.png);
  background-size: 125px 75px;
  cursor: pointer;
}

.signup-input-birth {
  display: block;
  position: relative;
  width: 100%;
  height: 51px;
  border: solid 1px #dadada;
  padding: 10px;
  background: #fff;
  box-sizing: border-box;
}
#signup-birth-yy,
#signup-birth-mm,
#signup-birth-dd {
  width: 113px;
  height: 29px;
  border: none;
  outline: none;
}
#signup-name,
#signup-email,
#signup-country,
#signup-phone,
#signup-cnum {
  width: 100%;
  height: 29px;
  border: none;
  outline: none;
}
// #signup-gender {
//   background-color: white;
// }
// #signup-country {
//   background-color: white;
// }
#signup-birth-mm {
  background-color: white;
}
/*본인 확인 이메일*/
.choice {
  display: flex;
}
/*회원가입버튼박스*/
.signup-btn-wrap {
  height: 52px;
  line-height: 55px;
  margin: 10px 0px 50px 0px;
  margin-top: 10%;
  border: solid 1px rgba(0, 0, 0, 0.1);
  background-color: #8813b6;
  color: #fff;
  cursor: pointer;
}
/*회원가입버튼*/
#signup-btn {
  display: inline;
  margin-left: 40%;
  background-color: #8813b6;
  border: none;
  color: #fff;
  font-size: 20px;
  outline: none;
  cursor: pointer;
}
.signup-wrap {
  width: 30%;
  margin: 0 auto;
}
.alert{
  width: 28%;
  margin: 0 auto;
}
.common-hero {
  height: 385px;
  /* // background: url("../images/uploads/user-hero-bg.jpg") no-repeat; */
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test8.png") no-repeat !important;
}
</style>
