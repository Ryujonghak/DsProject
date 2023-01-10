<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4>스케쥴 관리 페이지</h4>
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
                  <li>
                    <router-link to="/userInfoAdmin">회원관리</router-link>
                  </li>
                  <li>
                    <a href="#"></a>
                    <a data-toggle="dropdown" @click="boardclick">
                      게시판관리
                      <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li class="active">
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

          <div class="topbar-filter">
            <div class="fiter" style="width: 40% !important">
              <label>지점 선택:</label>
              <select v-model="selectedValue" v-on:change="getlocation()">
                <option value="seomyeon">서면점</option>
                <option value="centum">센텀점</option>
                <option value="busan">부산대점</option>
              </select>
            </div>
            <input
                id="select_value"
                name="inputBox"
                type="text"
                placeholder="username을 입력하세요"
                style="width: 30%;"
              />
              <button class="searchbtn"
              @click="
              page = 1;
              findByMovienm();
            ">검색하기</button>
          </div>

          <!--공지사항 테이블 시작 (list)  -->
          <div class="movie-item-style-2 userrate">
            <div class="mv-item-infor">
              <table class="notice_table">
                <colgroup>
                  <col style="width: 10%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: auto" />
                </colgroup>
                <thead>
                  <tr>
                    <th scope="col">번호</th>
                    <th scope="col">영화이름</th>
                    <th scope="col">영화코드</th>
                    <th scope="col">시작시간(지점)</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="(data, index) in schedule" v-bind:key="index">
                    <td>{{ data.scno }}</td>
                    <td>{{ data.movienm }}</td>
                    <td>{{ data.moviecd }}</td>
                    <td>{{ data.starttime }} ({{ data.location }})</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
          <!--공지사항 테이블 끝  -->

          <!-- <!— 페이징 + 전체 목록 시작 —> -->
          <!-- <!— 페이징 양식 시작 —> -->
          <!-- <div class="col-md-12">
            <b-pagination
              v-model="page"
              :total-rows="notice.totalItems"
              :per-page="pageSize"
              prev-text="Prev"
              next-text="Next"
              @change="handlePageChange"
            ></b-pagination>
          </div> -->
          <!-- <!— 페이징 양식 끝 —> -->
          <!-- 필터 페이지네이션 -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ScheduleDataService from "@/services/ScheduleDataService";
export default {
  data() {
    return {
      board: false,
      schedule: [],
    };
  },
  methods: {
    //로그아웃
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },
    retrieveSchedule() {
      ScheduleDataService.getAll()
        .then((response) => {
          const schedule = response.data;
          this.schedule = schedule;
          console.log(this.schedule);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    this.retrieveSchedule();
  },
};
</script>

<style lang="scss" scoped>
tr {
  color: aliceblue !important;
}
.topbar-filter select {
  width: 215px;
  // -webkit-appearance: none;
  // -moz-appearance: none;
  float: right !important;
  background: url(../../../public/images/uploads/drop-icon.png) no-repeat right
    20px center;
  border-left: none !important;
  border-right: px solid #405266;
  border-top: none;
  border-bottom: none !important;
  color: #ffffff;
  font-weight: 400;
}
th {
  color: aliceblue;
  border: 1px solid aliceblue;
  //border-right: 2px solid aliceblue;
  text-align: center;
}
.searchbtn{
  box-sizing: border-box;
  border-radius: 4px;
  border: none !important;
  color:black !important;
  text-align: center;
  vertical-align: middle;
  background-color: #F5B409;
  display: inline !important;
  padding: 6px 12px;
}
input{
  border-radius: 4px;
  margin-right: 2%;
  background:inherit;
  color: aliceblue;
}

.topbar-filter {
  border-top: none !important;

}
td {
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
  text-align: center;
  vertical-align: middle !important;
}
</style>
