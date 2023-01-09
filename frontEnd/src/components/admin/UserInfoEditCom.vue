<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2">
          <!-- <!— 왼쪽 메뉴바 시작 —> -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-fav">
                <p>관리자 목록</p>
                <ul>
                  <li class="active">
                    <router-link to="/userInfoAdmin">회원관리</router-link>
                  </li>
                  <li>
                    <a href="#"></a>
                    <a
                      class="btn btn-default dropdown-toggle"
                      data-toggle="dropdown"
                      @click="boardclick"
                    >
                      게시판관리
                      <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li>
                        <router-link to="/board-admin"
                          >공지사항 관리</router-link
                        >
                      </li>
                      <li>
                        <router-link to="/movie-admin">영화 관리</router-link>
                      </li>
                      <li>
                        <router-link to="/review-admin">리뷰관리</router-link>
                      </li>
                      <li>
                        <router-link to="/qna-admin">QnA 답변관리</router-link>
                      </li>
                    </ul>
                  </li>
                  <li>
                    <router-link to="/payment-admin">예매 내역</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <ul>
                  <li><a href="#" @click="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->
          <!-- 수정 양식 폼 시작 -->
          <div class="edit-form col-md-9 col-sm-12 col-xs-12">
            <h4 style="color: white">ID: {{ user.id }}</h4>
            <form>
              <!-- 사원명 -->
              <div class="form-group col-xs-12">
                <label for="username">username</label>
                <input
                  type="text"
                  class="form-control"
                  id="username"
                  v-model="user.username"
                />
              </div>

              <!-- 입사일 -->
              <div class="mt-3 form-group col-xs-12">
                <label for="answer">answer</label>
                <input
                  type="text"
                  class="form-control"
                  id="answer"
                  v-model="user.answer"
                />
              </div>
              <!-- 월급여 -->
              <div
                class="mt-3 form-group col-xs-12"
                style="padding-left: 0%; padding-right: 0%"
              >
                <label class="col-xs-12">생년월일</label>
                <div class="col-xs-4">
                  <input
                    type="text"
                    class="form-control"
                    id="year"
                    v-model="user.year"
                  />
                </div>
                <div class="col-xs-4">
                  <input
                    type="text"
                    class="form-control"
                    id="year"
                    v-model="user.month"
                  />
                </div>
                <div class="col-xs-4">
                  <input
                    type="text"
                    class="form-control"
                    id="year"
                    v-model="user.day"
                  />
                </div>
              </div>
              <!-- 인센티브 -->
              <div class="mt-3 form-group col-xs-12">
                <label for="email">email</label>
                <input
                  type="text"
                  class="form-control"
                  id="email"
                  v-model="user.email"
                />
              </div>
              <!-- 부서번호 -->
              <div class="mt-3 form-group col-xs-12">
                <label for="phone">phone</label>
                <input
                  type="text"
                  class="form-control"
                  id="phone"
                  v-model="user.phone"
                />
              </div>
            </form>

            <div>
              <a class="editbtn col-xs-12" @click="updateUser(user.id, changePwd, user)">수정</a>
              <!-- <button class="mt-3 btn btn-danger" @click="deleteEmp">
                Delete
              </button>

              <button
                type="submit"
                class="ms-3 mt-3 btn btn-success"
                @click="updateEmp"
              >
                Update
              </button> -->
              <p>{{ message }}</p>
            </div>
          </div>
          <!-- 수정 양식 폼 끝 -->
        </div>
      </div>
    </div>
    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
  </div>
</template>

<script>
import UserDataService from "@/services/user.service.js";

export default {
  mounted() {
    this.getUser(this.$route.params.username);
  },
  data() {
    return {
      board: false,
      user: null,
      message: "",
      changePwd: false
    };
  },
  methods: {
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },

    getUser(username) {
      UserDataService.getUserUsername(username)
        .then((response) => {
          this.user = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    updateUser(id, changePwd, user) {
      UserDataService.update(id, changePwd, user)
        .then((response) => {
          console.log(response.data);
          alert("수정되었습니다!");

          // 수정완료시 그 전 페이지로 강제 이동
          this.$router.push("/userInfoAdmin");
        })
        .catch((e) => {
          console.log(e);
          alert("수정실패")
        });
    },
  },
};
</script>

<style scoped>
.editbtn {
  font-family: "Dosis", sans-serif;
  font-size: 100%;
  text-align: center;
  color: black;
  font-weight: bold;
  width: 10%;
  height: 3%;
  background-color: #dcf836;
  padding: 1% 2%;
  margin-left: 45%;
  margin-top: 7%;
  border-radius: 5px;
}
.editbtn:hover {
  color: #fff;
}

/* 탑버튼 추가 _정주희 */
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}
</style>
