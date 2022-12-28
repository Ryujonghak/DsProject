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
          <!-- 왼쪽 메뉴바 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-fav">
                <p>관리자 목록</p>
                <ul>
                  <li class="active"><a href="#">회원관리</a></li>
                  <li>
                    <a href="#">게시판관리</a>
                  </li>
                  <li><a href="/reservInfoAdmin">결제관리</a></li>
                </ul>
              </div>
              <div class="user-fav">
                <p>기타</p>
                <ul>
                  <li><a href="/adminInfoAdmin">관리자관리</a></li>
                  <li><a href="#">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 왼쪽 메뉴바 끝 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- TODO: 바로 밑 div 데이터 받아서 v-for 예정입니다. -->
            <div
              class="col-md-9 col-sm-12 col-xs-12"
              v-for="(data, index) in users"
              :key="index"
            >
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
                      <p>비밀번호 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>{{ data.password }}</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>{{ data.question }}</p>
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
                  <a href="/userInfoEdit" class="editbtn col-xs-12"
                    >수정</a
                  >
                  <a href="#" class="delbtn col-xs-12" @click="saveReview"
                    >삭제</a
                  >
                </div>
              </div>
            </div>
            <!-- 아래 페이징 시작 -->
            <div class="col-md-9 col-sm-12 col-xs-12">
              <div class="topbar-filter">
                <label>Movies per page:</label>
                <select>
                  <option value="range">20 Movies</option>
                  <option value="saab">10 Movies</option>
                </select>
                <div class="pagination2">
                  <span>Page 1 of 1:</span>
                  <a class="active" href="#">1</a>
                  <a href="#"><i class="ion-arrow-right-b"></i></a>
                </div>
              </div>
            </div>
            <!-- 아래 페이징 끝 -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      users: [
        {
          id: 97,
          username: "choiari1002",
          password: 12345678,
          question: "좋아하는 색깔은? (대충)",
          answer: "아이보리",
          year: 1994,
          month: 10,
          day: 2,
          email: "choiari1002@naver.com",
          phone: "7787518479",
        },
        {
          id: 98,
          username: "areerang",
          password: 12345678,
          question: "좋아하는 색깔은? (대충)",
          answer: "크림",
          year: 1994,
          month: 10,
          day: 2,
          email: "areerang@naver.com",
          phone: "01047123456",
        },
      ],
    };
  },
};
</script>

<style scoped>
/* .editbtn {
  display: inline-block;
  width: 30%;
  -webkit-border-radius: 25px;
  -moz-border-radius: 25px;
  border-radius: 25px;
} */

.editbtn {
  font-family: "Dosis", sans-serif;
  font-size: 100%;
  text-align: center;
  color: black;
  font-weight: bold;
  text-transform: uppercase;
  width: 70%;
  height: 30%;
  background-color: #dcf836;
  margin-top: 45%;
  margin-bottom: 7%;
  padding: 10% 15%;
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
  width: 70%;
  height: 30%;
  background-color: #dd003f;
  padding: 10% 20%;
  border-radius: 5px;
}
.delbtn:hover {
  color: #fff;
}
</style>
