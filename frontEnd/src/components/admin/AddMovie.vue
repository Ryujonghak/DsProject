<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4 style="color: aliceblue">영화등록 페이지</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2"></div>
        <!--  영화등록 테이블 시작 -->
        <div class="container">
          <table class="AddMovieBox" style="margin-top: 5%">
            <colgroup>
              <!-- <col style="width: 5%" /> -->
              <col style="width: 15%" />
              <col style="width: 10%" />
              <col style="width: auto" />
              <col style="width: 15%" />
              <col style="width: 15%" />
            </colgroup>
            <tbody>
              <!-- 첫번째줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="name">영화이름</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    id="name"
                    class="input-text boxing"
                    v-model="movie.movienm"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">ID</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.id"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">장르</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.genrenm"
                  />
                </td>
              </tr>
              <!-- 첫번째줄 끝 -->
              <!-- 두번째줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">러닝타임</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.showtm"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">감독</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.directors"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">캐스트</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.actor"
                  />
                </td>
              </tr>
              <!-- 두번째줄 끝 -->
              <!-- 세번째줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="textarea">줄거리</label>
                </th>
                <td colspan="8">
                  <div class="textarea">
                    <textarea
                      id="textarea"
                      name="custInqCn"
                      rows="5"
                      cols="30"
                      title="내용입력"
                      class="input-textarea boxing"
                      placeholder="내용을 입력해주세요."
                      v-model="movie.plot"
                    ></textarea>
                  </div>
                </td>
              </tr>
              <!-- 세번째줄 끝 -->
              <!-- 네번째줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">포스터 이미지</label>
                </th>
                <td colspan="2">
                  <ul class="footer-button-plus">
                    <input
                      type="text"
                      id="file"
                      class="inputfile"
                      v-model="movie.posterurln"
                    />
                  </ul>
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">개봉일</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.opendt"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">관람등급</label>
                </th>
                <td colspan="2">
                  <select name="관람등급" id="age" v-model="movie.watchgradenm">
                    <option value="전체관람가">ALL</option>
                    <option value="12세이상관람가">12+</option>
                    <option value="15세이상관람가">15+</option>
                    <option value="청소년관람불가">19+</option>
                  </select>
                </td>
              </tr>
              <!-- 네번째줄 끝  -->
              <!-- 다섯번째 줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">영화코드</label>
                </th>
                <td colspan="2">
                  <ul class="footer-button-plus">
                    <input
                      type="text"
                      id="file"
                      class="inputfile"
                      v-model="movie.moviecd"
                    />
                  </ul>
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">개봉(예정)</label>
                </th>
                <td colspan="2">
                  <select
                    name="개봉예정"
                    id="prdtstatnm"
                    v-model="movie.prdtstatnm"
                  >
                    <option value="개봉">개봉</option>
                    <option value="개봉예정">개봉예정</option>
                  </select>
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">개봉연도</label>
                </th>
                <td colspan="2">
                  <input
                    type="text"
                    name="title"
                    id="prdyear"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.prdtyear"
                  />
                </td>
              </tr>
              <!-- 다섯번째 줄 끝 -->
              <!-- 여섯번째 줄 : 정보를 추가로 받기위한 평점과 유튜브 주소창 (최아리 추가) -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">영화평점(최대10점)</label>
                </th>
                <td colspan="2">
                  <ul class="footer-button-plus">
                    <input
                      type="text"
                      id="file"
                      class="inputfile"
                      v-model="movie.raiting"
                    />
                  </ul>
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">유튜브 예고편 주소</label>
                </th>
                <td colspan="5">
                  <input
                    type="text"
                    name="title"
                    id="prdyear"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="movie.utubeurl"
                  />
                </td>
              </tr>
              <div
                style="
                  width: 300%;
                  margin-top: 5%;
                  margin-left: 455%;
                  color: #abb7c4;
                  font-size: small;
                "
              >
                <h6>*유튜브 주소 예시: https://youtu.be/dKWbgcKkn20</h6>
              </div>
              <!-- 여섯번째 줄 끝 -->
            </tbody>
          </table>
          <div class="search">
            <button
              type="submit"
              class="regbtn"
              style="float: right"
              @click="saveMovie()"
            >
              등록하기
            </button>
          </div>
        </div>
        <!-- 끝 -->
      </div>
    </div>
    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png" />
    </a>
  </div>
</template>

<script>
import MovieDataService from "@/services/MovieDataService";
export default {
  data() {
    return {
      // imgURL: "",
      movie: {
        id: null, //키값
        moviecd: "", //영화코드
        opendt: "", //개봉날짜
        watchgradenm: "전체관람가", //관람등급
        movienm: "", //영화이름
        plot: "", //영화줄거리
        showtm: "", //러닝타임
        genrenm: "", //장르
        directors: "", //감독
        actor: "", //출연진
        posterurln: "", //포스터
        prdtyear: "", // 제작년도
        prdtstatnm: "개봉", // 개봉작 or 개봉예정작
        raiting: null, // 영화 평점
        utubeurl: "", // 유튜브 예고편 주소
      },
    };
  },
  methods: {
    //영화 등록함수
    saveMovie() {
      // 영화평점이 10점이 초과가 되면 넘어가지 않도록 if (최아리 추가)
      if (this.movie.raiting > 10) {
        alert("영화평점을 10점 미만으로 다시 입력하세요.");
      } else {
        let data = {
          id: this.movie.id,
          moviecd: this.movie.moviecd,
          opendt: this.movie.opendt,
          watchgradenm: this.movie.watchgradenm,
          movienm: this.movie.movienm,
          plot: this.movie.plot,
          showtm: this.movie.showtm,
          genrenm: this.movie.genrenm,
          directors: this.movie.directors,
          actor: this.movie.actor,
          posterurln: this.movie.posterurln,
          prdtyear: this.movie.prdtyear,
          prdtstatnm: this.movie.prdtstatnm,
          raiting: this.movie.raiting,
          utubeurl: this.movie.utubeurl,
        };
        MovieDataService.create(data)
          .then((response) => {
            this.movie.id = response.data.id;
            console.log(response.data);
            alert("등록되었습니다.");
            alert(this.movie.raiting);
            this.$router.push("/movie-admin");
          })
          .catch((e) => {
            console.log(e);
          });
      }
    },
  },
};
</script>

<style lang="scss" scoped>
.AddMovieBox {
  background: inherit;
  color: aliceblue;
}
th,
td {
  border-bottom: 2px solid aliceblue;
  padding: 10px;
}
tr {
  margin-bottom: 1%;
}
textarea {
  width: 100%;
  height: 6.25em;
  border: none;
  resize: none;
}
.regbtn {
  background:#F5B409;
  color:black;
  border-radius: 5px !important;
  box-shadow: none !important;
  width: 10%;
  padding: 1%;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
.user-hero {
  height: 385px;
  // background: url("../images/uploads/user-hero-bg.jpg") no-repeat;
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test16.png") no-repeat;
}
h4 {
  color: aliceblue;
  margin-right: 10%;
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
