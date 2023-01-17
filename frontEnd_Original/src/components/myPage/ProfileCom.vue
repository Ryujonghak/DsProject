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
                <br/>
                <!-- <a href="#" class="redbtn">Change avatar</a> -->
                <!-- <a href="#" class="redbtn">프로필 수정</a> -->
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
                  <!-- <li><a href="#" @click="deleteId()">탈퇴하기</a></li> -->
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
                    <!--                    TODO: label 에 for="answer" 추가 -->
                    <!--                    TODO: v-model에 Current.answer하면 백엔연동시 답이 뜨므로 숨겨야 함...
                                                  폼에 입력된 값이랑 회원데이터값 비교해서 맞으면 changePwdForm 떠야하는데... -->
                    <label for="answer">비밀번호 확인용 정답</label>
                    <input
                        id="answer"
                        type="text"
                        placeholder="정답을 한글로 입력하세요"

                        v-model="answer"
                    />
                  </div>
                </div>
                <!--                 TODO: 비밀번호 질문 정답 제출버튼 -> 버튼 클릭시 변경폼 보이도록 (type = button) -->
                <div class="row">
                  <div class="col-md-2">
                    <!--                      TODO: @click="findpwd"-->
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
                <!-- TODO: 질문의 정답이 일치하면 아래 div 보이도록...ㅋ : v-show="changePwdForm"  class="pwcheck"-->
                <div v-show="changePwdForm" class="pwcheck">
                  <!--                <div>-->
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
                  <!-- 제출 버튼 -->
                  <div class="row">
                    <div class="col-md-2">
                      <!--                      TODO: 비밀번호 변경 클릭 이벤트 : updatePwd -->
                      <input
                          class="submit"
                          type="button"
                          @click="updatePwd"
                          value="변경하기"
                      />
                      <!-- <p>{{ message }}</p> --> 
                      <!-- 메세지 내용을 alert 사용할 예정(류종학_230108) -->
                    </div>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
      <!-- 모달 테스트 시작 -->
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
      <!-- 모달 테스트 끝 -->
  </div>
</template>

<script>
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
      user: new User(),
      checkanswer: "", // 비번찾기문제 폼에 입력된 값
      changePwd: false, // 버튼 클릭시 true, 변경폼 나타남
      changePwdForm: false,
      message: "",
      username: this.$store.state.auth.user.username,
      password: "",
      password2: "",
      answer: "",
      // name: this.user.name,

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
    getUser() {
      // username = this.$store.state.auth.user.username;
      console.log("username: " + this.username);
      userService
          .getUserUsername(this.username)
          // .getUserUsername(this.$store.state.auth.user.username)
          .then((response) => {
            this.user = response.data;
            console.log("getUser this.user: ", this.user);
            console.log("getUser response.data: ", response.data);
          })
          .catch((err) => console.log(err));
    },

    // 로그아웃 함수
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },

    // 회원정보수정
    updateUser() {
      // alert("updateUser 실행")
      // console.log(this.user);
      console.log("update this.user: ", this.user);
      // if()
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
      // 수정완료시 그 전페이지로 강제이동
      // this.$router.push("/mypage");
    },
    // 패스워드 질문 일치여부
    findPwd() {
      // alert("findPwd 실행")
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
      // alert("updatePwd 실행")
      if(this.password == this.password2) {
        // console.log(this.user);
        console.log("update this.user: ", this.user);
        this.user.password = this.password;
        // if()
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

      // 수정완료시 그 전페이지로 강제이동
      // this.$router.push("/mypage");
    },

    // 수빈이 회원삭제함수 참고
    // 탈퇴버튼 클릭시 열리는 모달창
    modal(){
      // alert("모달 실행");
      // this.currentUser = this.user;
      // this.currentUser = data;

      // alert(this.currentUser)
      const modal = document.getElementById("modal");
      modal.style.display="flex";
    },
    // 탈퇴하기 - 모달창 버전
    deleteUser() {
      // alert("되나?")
      console.log("user.id", this.user.id)
      userService.delete(this.user.id)
        .then((response) => {
          console.log(response.data);
          // this.retrieveUser();
          // this.user.splice(this.user.indexOf(this.user.id), 1);
          console.log(this.user.id)
          alert("탈퇴가 완료되었습니다.");
          const modal = document.getElementById("modal");
          modal.style.display = "none";
          this.logout();
          this.$router.push("/");
          // 모달 끄기
        })
        .catch((e) => {
          console.log(e);
          // window.location.reload();
        });
    },
    // 모달창 없이 바로 탈퇴하기
    // deleteId() {
    //   userService
    //     .delete(this.user.id)
    //     .then((response) => {
    //       console.log(response.data);
    //       alert("탈퇴가 완료되었습니다.");
    //       this.logout();
    //       this.$router.push("/");
    //     })
    //     .catch((e) => {
    //       console.log(e);
    //     });
    // },
  },
  mounted() {
    custom();
    this.getUser(); // 백엔드 데이터

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


/* 모달 */
/* 테스트 */
#modal.modal-overlay {
  /* width: 100%;
  height: 100%; */
  width: 100%;
  height: 2000px;
  position: absolute;
  left: 0;
  top: 0;
  display: none;
  /* display: flex; */
  flex-direction: column;
  align-items: center;
  justify-content: center;
  /* background: rgba(255, 255, 255, 0.25); */
  box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
  /* backdrop-filter: blur(1.5px); */
  /* -webkit-backdrop-filter: blur(1.5px); */
  border-radius: 10px;
  /* border: 1px solid rgba(255, 255, 255, 0.18); */
}
#modal .modal-window {
  background: white;
  /* background: rgba(69, 139, 197, 0.7); */
  /* box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37); */
  /* backdrop-filter: blur(13.5px);
  -webkit-backdrop-filter: blur(13.5px); */
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
  /* border: 200px; */
  /* text-shadow: 1px 1px 2px black; */
  color: grey;
}

#modal .content {
  margin-top: 20px;
  padding: 0px 10px;
  /* text-shadow: 1px 1px 2px gray; */
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
  /* height: 1%; */
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
  /* height: 1%; */
  background-color: #dd003f;
  padding: 3% 7%;
  margin-top: 7%;
  margin-right: 0%;
  border-radius: 5px;
}
</style>
