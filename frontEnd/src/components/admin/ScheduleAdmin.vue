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
export default {

}
</script>

<style>

</style>