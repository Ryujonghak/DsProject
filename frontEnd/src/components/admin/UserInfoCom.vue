<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4>회원 관리 페이지</h4>
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
                    <a data-toggle="dropdown" @click="boardclick">
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
                    <router-link to="/schedule-admin">스케쥴 관리</router-link>
                  </li>
                  <li>
                    <router-link to="/payment-admin">예매 내역</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <ul>
                  <!-- <a @click.prevent="logout">LOG OUT</a> -->
                  <li><a href="#" @click="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- <a id="btn-modal" class="delbtn col-xs-12">삭제</a> -->
            <!-- TODO: 바로 밑 div 데이터 받아서 v-for 예정입니다. -->
            <div class="col-xs-12" v-for="(data, index) in user" :key="index">
              <div class="movie-item-style-2 userrate">
                <div class="mv-item-infor col-xs-9">
                  <div>
                    <div>
                      <h6>
                        {{ data.id }}
                      </h6>
                    </div>
                    <div class="col-xs-6">
                      <p>아이디 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>{{ data.username }}</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 확인 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>{{ data.answer }}</p>
                    </div>
                    <div class="col-xs-6">
                      <p>생년월일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>
                        {{ data.year }} &nbsp;/&nbsp;
                        {{ data.month }} &nbsp;/&nbsp;
                        {{ data.day }}
                      </p>
                    </div>
                    <div class="col-xs-6">
                      <p>이메일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>{{ data.email }}</p>
                    </div>
                    <div class="col-xs-6">
                      <p>휴대전화 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>{{ data.phone }}</p>
                    </div>
                  </div>
                </div>
                <div class="col-xs-3">
                  <router-link
                    :to="'/userInfoAdmin/' + data.username"
                    class="editbtn col-xs-12"
                    >수정</router-link
                  >
                  <div class="col-xs-12"></div>
                  <a
                    id="btn-modal"
                    class="delbtn col-xs-12"
                    @click="modal(data)"
                    >삭제</a
                  >
                </div>
              </div>
            </div>
            <!-- Todo : page 바 시작 -->
            <div class="col-md-12">
              <b-pagination
                v-model="page"
                :total-rows="count"
                :per-page="pageSize"
                prev-text="<"
                next-text=">"
                @change="handlePageChange"
              ></b-pagination>
            </div>
            <!-- Todo : page 바 끝 -->
          </div>
        </div>
      </div>
      <!-- 모달 테스트 시작 -->
      <div id="modal" class="modal-overlay">
        <div class="modal-window">
          <div class="col-xs-12" style="padding-top: 5%">
            <div class="title col-xs-12">
              <h6>이 회원을 정말 삭제하시겠습니까?</h6>
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
    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
  </div>
</template>

<script>
import UserService from "@/services/user.service.js";

export default {
  mounted() {
    this.retrieveUser();

    // 모달 테스트
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
  data() {
    return {
      // 게시판관리 v-show
      board: false,
      user: [],
      currentUser: null,
      searchUsername: "",
      message: "",

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 3, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수

      pageSizes: [3, 6, 9], // select box 에 넣을 기본 데이터
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
    retrieveUser() {
      UserService.getAll(this.searchUsername, this.page - 1, this.pageSize)
        .then((response) => {
          const { user, totalItems } = response.data;
          this.user = user;
          this.count = totalItems;

          console.log(response.data);
        })
        .catch((e) => {
          alert("then 못 가고 실패");
          console.log(e);
        });
    },
    // currentUser 에 데이터 넣고 첫 모달창 열어주는 함수
    modal(data) {
      this.currentUser = data;

      const modal = document.getElementById("modal");
      modal.style.display = "flex";
    },
    deleteUser() {
      UserService.delete(this.currentUser.id)
        .then((response) => {
          console.log(response.data);
          // this.retrieveUser();
          this.user.splice(this.user.indexOf(this.currentUser.id), 1);
          console.log("*********8")
          console.log(this.user)
          console.log("********8")

          // 모달 끄기
          const modal = document.getElementById("modal");
          modal.style.display = "none";
        })
        .catch((e) => {
          console.log(e);
          // window.location.reload();
        });
    },
    handlePageSizeChange(event) {
      this.pageSize = event.target.value; // 한페이지당 개수 저장(3, 6, 9)
      this.page = 1;
      // 재조회 함수 호출
      this.retrieveUser();
    },
    // 페이지 번호 변경시 실행되는 함수(재조회)
    handlePageChange(value) {
      this.page = value; // 매개변수값으로 현재페이지 변경
      // 재조회 함수 호출
      this.retrieveUser();
    },
  },
};
</script>

<style scoped>
h4 {
  color: aliceblue;
  margin-right: 10%;
}
.user-hero {
  height: 385px;
  /* // background: url("../images/uploads/user-hero-bg.jpg") no-repeat; */
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test16.png") no-repeat;
}
.editbtn {
  font-family: "Dosis", sans-serif;
  font-size: 100%;
  text-align: center;
  color: black;
  font-weight: bold;
  text-transform: uppercase;
  width: 50%;
  height: 30%;
  background-color: #dcf836;
  margin-top: 20%;
  margin-bottom: 7%;
  padding: 7% 10%;
  border-radius: 5px;
}
.editbtn:hover {
  color: #fff;
}
.delbtn {
  font-family: "Dosis", sans-serif;
  font-size: 100%;
  text-align: center;
  color: black;
  font-weight: bold;
  text-transform: uppercase;
  width: 50%;
  height: 30%;
  background-color: #dd003f;
  padding: 7% 10%;
  border-radius: 5px;
}
.delbtn:hover {
  color: #fff;
}
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
