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

    <!-- ㅇㅇㅇ 여기 div 원본은 testCom에 있음-->
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 -->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <!-- 프로필 이미지 업로드 추가 v-if -->
              <!-- <div v-if="images" class="user-img"> -->
              <div class="user-img">
                <img src="images/uploads/user-img.png" alt=""/>
                <br/>
                <!-- <a href="#" class="redbtn">Change avatar</a> -->
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
                  <li class="active">
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li>
                    <router-link to="/myticket">예매내역</router-link>
                  </li>
                  <li>
                    <router-link to="/mywish">찜한 영화</router-link>
                  </li>
                  <li>
                    <router-link to="/myprofile">개인정보 수정</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <p>Others</p>
                <ul>
                  <li>
                    <router-link to="/myqna">나의 문의내역</router-link>
                  </li>
                  <li><a href="#">Log out</a></li>
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
                    <input type="text" placeholder="홍길동" v-model="CurrentUser.name" />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>아이디</label>
                    <input type="text" placeholder="영문자 6자 이상" v-model="CurrentUser.username"/>
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>이메일</label>
                    <input type="text" placeholder="hong@gmail.com" v-model="CurrentUser.email"/>
                  </div>
                  <div class="col-md-6 form-it">
                    <label>@</label>
                    <select>
                      <option value="email">직접입력</option>
                      <option value="email">@naver.com</option>
                      <option value="email">@google.com</option>
                      <option value="email">@daum.net</option>
                    </select>
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>전화번호</label>
                    <input type="text" placeholder="010-1234-1234" v-model="CurrentUser.phone" />
                  </div>
                  <div class="col-md-6 form-it">
                    <label>주소</label>
                    <input
                      type="text"
                      placeholder="부산광역시 부산진구 중앙대로 668 "
                    />
                  </div>
                </div>
                <!-- 저장 버튼 -->
                <div class="row">
                  <div class="col-md-2">
                    <input class="submit" type="submit" value="save" />
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
                </div>
                <div class="row">
                  <div class="col-md-6 form-it">
                    <label>비밀번호 확인용 정답</label>
                    <input type="text" placeholder="정답을 한글로 입력하세요" v-model="CurrentUser.answer" />
                  </div>
                </div>
                <!-- TODO: 질문의 정답이 일치하면 아래 div 보이도록...ㅋ : class="pwcheck"-->
                <div class="pwcheck">
                  <div class="row">
                    <div class="col-md-6 form-it">
                      <label>변경할 비밀번호</label>
                      <input
                        type="text"
                        placeholder="영문자, 숫자, 특수문자 조합 8~12자리"
                        v-model="CurrentUser.password"
                      />
                    </div>
                  </div>
                  <div class="row">
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
                      <input class="submit" type="submit" value="change" />
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
import custom from '@/assets/js/custom';
import userService from "@/services/user.service";


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
      message: ""

    }
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
      username = "forbob"
      console.log(username);
      userService.getUserUsername(username)
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
            }
            console.log(this.CurrentUser);
            // console.log(response.data);
          }).catch(err => console.log(err));
    }
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터 
  }
};
</script>

<style></style>
