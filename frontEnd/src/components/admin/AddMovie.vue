<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4 style="color:aliceblue">영화등록 페이지</h4>
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
              <col style="width: 15%" />
              <col style="width: auto" />
              <col style="width: 15%" />
            </colgroup>
            <tbody>
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
                <td colspan="1">
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
                <td colspan="1">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                   v-model="movie.genrenm"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">개봉연도</label>
                </th>
                <td colspan="1">
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
              <td colspan="1">
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
              <td colspan="3">
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
              <td colspan="1">
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
              <td colspan="3">
              <select name="관람등급" id="age" v-model="movie.watchgradenm">
                <option value="전체관람가">ALL</option>
                <option value="12세이상관람가">12+</option>
                <option value="15세이상관람가">15+</option>
                <option value="청소년관람불가">19+</option>
              </select>
            </td>
          </tr>
            </tbody>
          </table>
          <div class="search">
            <button type="submit" class="regbtn" style="float: right" @click="saveMovie()">
              등록하기
            </button>
          </div>
        </div>
        <!-- 끝 -->
      </div>
    </div>
  </div>
</template>

<script>
import MovieDataService from '@/services/MovieDataService';
export default {
  data() {
    return {
      // imgURL: "",
      movie: {
        id:null,
        opendt: "",
        watchgradenm: "",
        movienm:"",
        // raiting: "",
        plot:"",
        showtm: "",
        genrenm:"",
        directors:"",
        actor:"",
        posterurln:"",
        prdtyear:""
      },
    };
  },
  methods: {
    //영화 등록함수 
    saveMovie(){
      let data={
        id: this.movie.id,
        opendt: this.movie.opendt,
        watchgradenm: this.movie.watchgradenm,
        movienm:this.movie.movienm,
        // raiting: this.movie.raiting,
        plot:this.movie.plot,
        showtm: this.movie.showtm,
        genrenm:this.movie.genrenm,
        directors:this.movie.directors,
        actor:this.movie.actor,
        posterurln:this.movie.posterurln,
        prdtyear:this.movie.prdtyear
      }
      MovieDataService.create(data)
      .then(response => {
        this.movie.id = response.data.id;
        console.log(response.data);
        alert("등록되었습니다.");
        this.$router.push("/movie-admin");
      })
      .catch(e => {
        console.log(e);
      })
    }
  
  },
};
</script>

<style lang="scss" scoped>
.AddMovieBox {
  background:inherit;
  color: aliceblue;
}
th, td {
    border-bottom: 2px solid aliceblue;
    padding: 10px;
  }
tr{
  margin-bottom: 1%;
}
textarea {
    width: 100%;
    height: 6.25em;
    border: none;
    resize: none;
  }
  .regbtn {
  background: #DD003F;
  color:aliceblue;
  border-radius: 25px !important;
  box-shadow: none !important;
  width: 10%;
  padding: 1%;
}
button{
  border: none !important;
}
button:active {
  outline: none !important; 
  box-shadow: none !important;
}
.user-hero {
  height: 385px;
  // background: url("../images/uploads/user-hero-bg.jpg") no-repeat;
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test8.png") no-repeat;
}
h4 {
  color: aliceblue;
  margin-right: 10%;
}
</style>
