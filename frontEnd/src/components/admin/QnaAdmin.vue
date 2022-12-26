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
                  <li><a href="#">회원관리</a></li>
                  <li class="active">
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
                      <li><a>공지사항 관리</a></li>
                      <li>
                        <router-link to="/movie-admin">영화 관리</router-link>
                      </li>
                      <li>
                        <router-link to="/theater-admin"
                          >영화관 관리</router-link
                        >
                      </li>
                    </ul>
                  </li>
                  <li><a href="#">결제관리</a></li>
                </ul>
              </div>
              <div class="user-fav">
                <p>기타</p>
                <ul>
                  <li><router-link to="/review-admin">리뷰관리</router-link></li>
                  <li><router-link to="/qna-admin">QnA 답변관리</router-link></li>
                  <li><a href="#">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div style="margin-bottom:3%">
              <h3 style="color: aliceblue">QnA 관리</h3>
            </div>

            <!-- 전체정렬 -->

            <!--qna 전체 테이블 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 10%" />
                    <col style="width: 15%" />
                    <col style="width: 15%" />
                    <col style="width: 10%" />
                    <col style="width: auto%" />
                    <col style="width: 15%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col">이름</th>
                      <th scope="col">이메일</th>
                      <th scope="col">휴대전화</th>
                      <th scope="col">제목</th>
                      <th scope="col">내용</th>
                      <th scope="col">답변여부</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr >
                     <td>이름</td>
                     <td>이메일</td>
                     <td>휴대전화</td>
                     <td>제목</td>
                     <td>내용</td>
                    </tr>
                  </tbody>
                </table>
                <div class="search">
                  <button type="button" class="btn_col2" @click="writeNotice">
                    답변하기
                  </button>
                </div>
              </div>
            </div>
            <!--qna 전체조회 테이블 끝  -->

            <!--qna 답변작성 폼 시작 (add)-->
            <div v-show="registerNotice">
              <table class="noticeboxnoticebox">
                <colgroup>
                  <col style="width: 10%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: auto" />
                  <col style="width: 15%" />
                </colgroup>
                <tbody>
                  <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="textarea">답변내용</label>
                    </th>
                    <td colspan="5">
                      <div class="textarea">
                        <textarea
                          id="textarea"
                          name="custInqCn"
                          rows="5"
                          cols="30"
                          title="내용입력"
                          class="input-textarea boxing"
                          placeholder="내용을 입력해주세요."
                        ></textarea>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
              <div class="search">
                <button type="button" class="btn_col2" @click="createNotice">
                  등록하기
                </button>
              </div>
            </div>
            <!--공지사항 작성 폼 끝 -->
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
        </div>
      </div>
    </div>
 </div>
</template>

<script>
export default {

}
</script>

<style lang="scss" scoped>
th,td{
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
}
</style>