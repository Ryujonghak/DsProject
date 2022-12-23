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
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 - 여기만 프로필이미지변경 주석처리됨-->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <!-- 프로필 이미지 업로드 추가 v-if -->
              <!-- <div v-if="images" class="user-img"> -->
              <div class="user-img">
                <img src="images/uploads/user-img.png" alt=""/>
                <br/>
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
                    <label>{{ User.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ User.username }}</label>
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
                  <li><a href="#">탈퇴하기</a></li>
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
                        v-model="User.name"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>아이디</label>
                    <input
                        type="text"
                        placeholder="영문자 6자 이상"
                        v-model="User.username"
                    />
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>이메일</label>
                    <input
                        type="text"
                        placeholder="hong@gmail.com"
                        v-model="User.email"
                    />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>전화번호</label>
                    <input
                        type="text"
                        placeholder="010-1234-5678"
                        v-model="User.phone"
                    />
                  </div>
                </div>
                <!-- 저장 버튼 -->
                <div class="row">
                  <div class="col-md-2">
                    <input class="submit" type="submit" value="저장하기"/>
                  </div>
                </div>
              </form>

              <!-- 비밀번호 수정 -->
              <form action="" class="password">
                <h4>비밀번호 수정</h4>
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
                        v-model="checkanswer"
                    />
                  </div>
                </div>
                <!--                 TODO: 비밀번호 질문 정답 제출버튼 -> 버튼 클릭시 변경폼 보이도록 (type = button) -->
                <div class="row">
                  <div class="col-md-2">
                    <!--                      TODO: @click="findpwd"-->
                    <input class="submit" type="button" value="질문확인버튼" @click="findpwd"/>
                  </div>
                </div>
                <br>
                <br>
                <!-- TODO: 질문의 정답이 일치하면 아래 div 보이도록...ㅋ : v-show="changePwdForm"  class="pwcheck"-->
                <div v-show="changePwdForm" class="pwcheck">
                  <!--                <div>-->
                  <div class="row">
                    <div class="col-md-6 form-it">
                      <!--                      label 에 for="password" 추가 -->
                      <!--                      TODO: label 에 for="password" 추가 -->
                      <!--                      TODO: v-model에 User.password하면 기존 패스워드 들어감...숨겨야해 -->
                      <label for="password">변경할 비밀번호</label>
                      <input
                          type="text"
                          placeholder="영문자, 숫자, 특수문자 조합 8~12자리"
                          v-model="User.password"
                      />
                    </div>

                    <div class="col-md-6 form-it">
                      <label>비밀번호 확인</label>
                      <input
                          type="text"
                          placeholder="비밀번호를 재입력해주세요"
                      />
                    </div>
                  </div>
                  <!-- 제출 버튼 -->
                  <div class="row">
                    <div class="col-md-2">
                      <!--                      TODO: 비밀번호 변경 클릭 이벤트 : updatePwd -->
                      <input class="submit" type="submit" value="change" @click="updatePwd(password)"/>
                    </div>
                  </div>
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
// import axios from "axios";   // 프로필이미지 업로드
import custom from "@/assets/js/custom";
import UserService from "@/services/user.service.js";
import User from "@/model/user";

export default {
  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      // User: new User(),
      User: new User(),
      message: "",
      checkanswer: "",    // 비번찾기문제 폼에 입력된 값  TODO: 정주희 추가
      changePwdForm: false,
      // objanswer: "",
      // username: "",
    };
  },
  methods:
      {
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
          alert("getUser start");
          UserService
              .getUserUsername("forbob")
              .then((response) => {
                this.User = {
                  email: response.data.email,
                  username: response.data.username,
                  phone: response.data.phone,
                  year: response.data.year,
                  month: response.data.month,
                  day: response.data.day,
                  name: response.data.name,
                  answer: response.data.answer,
                };
                console.log(this.User);
                // console.log(response.data);
              })
              .catch((err) => console.log(err));
        },

        // 로그아웃 함수 -> 공통함수 호출
        logout() {
          // this.$store.dispatch("모듈명/함수명")
          this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
          alert("로그아웃 되었습니다")
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
          UserService
              .update(id, changePwd, User)
              .then((response) => {
                console.log(response.data);
                this.message = "The password was updated successfully!";
              })
              .catch((e) => {
                console.log(e);
              });
        },
      },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
  }
};
</script>

<style></style>
