<template>
  <div>
    <!-- 상단 페이지 제목 -->
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>{{ user.name }}’s profile</h1>
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
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <!-- 프로필 이미지 -->
              <div class="user-img">
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
                    <strong style="color: white">이름 : </strong>
                    <label>{{ user.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 : </strong>
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
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                  <li><a href="#" @click="modal()">탈퇴하기</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="form-style-1 user-pro" action="">
              <form action="" class="user">
                <h4>프로필</h4>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>이름</label>
                    <input
                        type="text"
                        placeholder="홍길동"
                        class="form-control"
                        id="name"
                        v-model="user.name"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>아이디</label>
                    <input
                        type="text"
                        placeholder="영문자 6자 이상"
                        class="form-control"
                        id="username"
                        v-model="user.username"
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
                        v-model="user.email"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>전화번호</label>
                    <input
                        type="text"
                        placeholder="010-1234-5678"
                        class="form-control"
                        id="phone"
                        v-model="user.phone"
                    />
                  </div>
                </div>

                <!-- 저장 버튼 -->
                <div class="row">
                  <div class="col-md-2">
                    <input
                        @click="updateUser"
                        class="submit"
                        type="button"
                        value="저장하기"
                    />
                  </div>
                </div>
              </form>

              <!-- 비밀번호 수정 -->
              <form action="" class="password">
                <h4>비밀번호</h4>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>비밀번호 확인용 질문</label>
                    <select>
                      <option value="pwquestion">질문을 선택하세요</option>
                      <option value="pwquestion">나의 고향은?</option>
                      <option value="pwquestion">어머니의 성함은?</option>
                      <option value="pwquestion">아버지의 성함은?</option>
                    </select>
                  </div>
                  <div class="col-md-6 form-it">
                    <label for="answer">비밀번호 확인용 정답</label>
                    <input
                        id="answer"
                        type="text"
                        placeholder="정답을 한글로 입력하세요"
                        v-model="answer"
                    />
                  </div>
                </div>
                <!-- 비밀번호 질문 정답 제출버튼 -->
                <div class="row">
                  <div class="col-md-2">
                    <input
                        class="submit"
                        type="button"
                        value="정답확인"
                        @click="findPwd"
                    />
                  </div>
                </div>
                <br/>
                <br/>
                <!-- 비밀번호 질문의 정답이 일치하면 아래 div 보이도록 -->
                <div v-show="changePwdForm" class="pwcheck">
                  <div class="row">
                    <div class="col-md-6 form-it">
                      <label for="password">변경할 비밀번호</label>
                      <input
                          type="password"
                          placeholder="영문자, 숫자, 특수문자 조합 8~12자리"
                          class="form-control"
                          v-model="password"
                      />
                    </div>

                    <div class="col-md-6 form-it">
                      <label>비밀번호 확인</label>
                      <input
                          type="password"
                          placeholder="비밀번호를 재입력해주세요"
                          v-model="password2"
                      />
                    </div>
                  </div>
                  <!-- 비밀번호 변경하기 버튼 -->
                  <div class="row">
                    <div class="col-md-2">
                      <input
                          class="submit"
                          type="button"
                          @click="updatePwd"
                          value="변경하기"
                      />
                    </div>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
      <!-- 모달 탈퇴 확인창 시작 -->
      <div id="modal" class="modal-overlay">
        <div class="modal-window">
          <div class="col-xs-12" style="padding-top: 5%">
            <div class="title col-xs-12">
              <h6>회원정보가 삭제됩니다. <br>탈퇴하시겠습니까? </h6>
            </div>
          </div>
          <div class="content col-xs-12" style="text-align: center">
            <a id="btn-modal" class="closebtn col-xs-6">아니요</a>
            <a id="btn-modal" class="finbtn col-xs-6" @click="deleteUser">예</a>
          </div>
        </div>
      </div>
      <!-- 모달 탈퇴 확인창 시작 -->
  </div>
</template>

<script>
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";
import User from "@/model/user";

export default {
  data() {
    return {
      user: new User(),
      checkanswer: "", // 비번찾기문제 폼에 입력된 값
      changePwd: false, // 버튼 클릭시 true, 변경폼 나타남
      changePwdForm: false,
      message: "",
      username: this.$store.state.auth.user.username,
      password: "",
      password2: "",
      answer: "",
    };
  },
  methods: {
    // 로그인 한 사용자정보 가져오기
    getUser() {
      console.log("username: " + this.username);
      userService
          .getUserUsername(this.username)
          .then((response) => {
            this.user = response.data;
            console.log("getUser this.user: ", this.user);
            console.log("getUser response.data: ", response.data);
          })
          .catch((err) => console.log(err));
    },

    // 로그아웃
    logout() {
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/");
    },

    // 회원정보수정
    updateUser() {
      console.log("update this.user: ", this.user);
      this.changePwd = false; // 비번변경 여부
      userService
          .update(this.user.id, this.changePwd, this.user)
          .then((response) => {
            console.log(response.data);
            this.message = "유저 정보가 성공적으로 수정되었습니다!";
            alert(this.message);
          })
          .catch((e) => {
            console.log(e);
          });
    },
    // 패스워드 질문 일치여부
    findPwd() {
      if (this.answer == this.user.answer) {
        userService
            .getFindByPassword(this.user.username, this.answer)
            .then((response) => {
              console.log("response.data", response.data);
              this.user = response.data;
              this.changePwdForm = true;
              alert("비밀번호를 변경할 수 있습니다.")
            })
            .catch((e) => {
              console.log(e);
              alert("비밀번호 답변이 정확하지 않습니다.")
            })
      } else {
        alert("비밀번호 답변이 정확하지 않습니다.")
      }
    },
    // 패스워드 변경
    updatePwd() {
      if(this.password == this.password2) {
        console.log("update this.user: ", this.user);
        this.user.password = this.password;
        this.changePwd = true; // 비번변경 여부
        userService
            .update(this.user.id, this.changePwd, this.user)
            .then((response) => {
              console.log(response.data);
              this.message = "유저 정보가 성공적으로 수정되었습니다!";
              alert(this.message);
              this.logout();
              this.$router.push("/");
            })
            .catch((e) => {
              console.log(e);
            });
      } else {
        alert("비밀번호 확인이 정확하지 않습니다.")
      }
    },

    // 탈퇴버튼 클릭시 열리는 모달창
    modal(){
      const modal = document.getElementById("modal");
      modal.style.display="flex";
    },
    // 탈퇴하기 - 모달창 버전
    deleteUser() {
      console.log("user.id", this.user.id)
      userService.delete(this.user.id)
        .then((response) => {
          console.log(response.data);
          console.log(this.user.id)
          alert("탈퇴가 완료되었습니다.");
          const modal = document.getElementById("modal");
          modal.style.display = "none";
          this.logout();
          this.$router.push("/");
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    custom();
    this.getUser();

    // 모달창 관련
    const modal = document.getElementById("modal");
    function modalOn() {
      modal.style.display = "flex";
    }
    function isModalOn() {
      return modal.style.display === "flex";
    }
    function modalOff() {
      modal.style.display = "none";
    }
    const btnModal = document.getElementById("btn-modal");
    btnModal.addEventListener("click", (e) => {
      modalOn(e);
    });
    const closeBtn2 = modal.querySelector(".closebtn");
    closeBtn2.addEventListener("click", (e) => {
      modalOff(e);
    });
    modal.addEventListener("click", (e) => {
      const evTarget = e.target;
      if (evTarget.classList.contains("modal-overlay")) {
        modalOff(e);
      }
    });
    window.addEventListener("keyup", (e) => {
      if (isModalOn() && e.key === "Escape") {
        modalOff(e);
      }
    });
  },
};
</script>

<style scoped>
/* 배경이미지 */
.user-hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
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


/* 모달 */
#modal.modal-overlay {
  width: 100%;
  height: 2000px;
  position: absolute;
  left: 0;
  top: 0;
  display: none;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
  border-radius: 10px;
}
#modal .modal-window {
  background: white;
  border-radius: 5px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  width: 20%;
  height: 7%;
  position: relative;
  top: -265px;
  padding: 10px;
}
#modal .title {
  padding-left: 0;
  display: inline;
  font-size: 5%;
  color: black;
}
#modal .title h2 {
  display: inline;
}
#modal .close-area {
  display: inline;
  float: right;
  padding-right: 0;
  margin-right: 0;
  cursor: pointer;
  color: grey;
}

#modal .content {
  margin-top: 20px;
  padding: 0px 10px;
  color: black;
}

#modal .closebtn {
  font-family: "Dosis", sans-serif;
  font-size: 100%;
  text-align: center;
  color: black;
  font-weight: bold;
  text-transform: uppercase;
  width: 48%;
  background-color: grey;
  padding: 3% 7%;
  margin-top: 7%;
  margin-right: 4%;
  border-radius: 5px;
}

#modal .finbtn {
  font-family: "Dosis", sans-serif;
  font-size: 100%;
  text-align: center;
  color: black;
  font-weight: bold;
  text-transform: uppercase;
  width: 48%;
  background-color: #dd003f;
  padding: 3% 7%;
  margin-top: 7%;
  margin-right: 0%;
  border-radius: 5px;
}
</style>
