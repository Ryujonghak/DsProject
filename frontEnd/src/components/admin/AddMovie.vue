<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4 style="color:aliceblue">영화등록 페이지 입니다.</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2"></div>
        <!-- 시작 -->
        <div class="container">
          <table class="AddMovieBox" style="margin-top: 5%">
            <colgroup>
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
                    value
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">별점</label>
                </th>
                <td colspan="1">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                  />
                  /5.0
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">장르</label>
                </th>
                <td colspan="3">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    placeholder="제목을 입력해주세요."
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
                  placeholder="제목을 입력해주세요."
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
                  placeholder="제목을 입력해주세요."
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
                  placeholder="제목을 입력해주세요."
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
                    @change="upload"
                    type="file"
                    id="file"
                    class="inputfile"
                    accept="image/* "
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
                  placeholder="제목을 입력해주세요."
                />
                
              </td>
              <th scope="row" class="noticelabel">
                |
                <label for="noticeTitle">관람등급</label>
              </th>
              <td colspan="3">
              <select name="관람등급" id="age">
                <option value="1">ALL</option>
                <option value="2">12+</option>
                <option value="3">15+</option>
                <option value="4">19+</option>
              </select>
            </td>
          </tr>
            </tbody>
          </table>
          <div class="search">
            <button type="submit" class="btn_col" style="float: right">
              등록하기
            </button>
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
      imgURL: "",
    };
  },
  methods: {
    upload(e) {
      let imageFile = e.target.files; // 업로드한 파일의 데이터가 여기있음.

      // console.log(imageFile[0]);

      let url = URL.createObjectURL(imageFile[0]); // 파일의 필요한 데이터만을 url 변수에 넣음

      console.log(url); // 확인

      this.imageUrl = url; // 미리 작성해둔 imageUrl : ' ' 변수에 가지고있는 경로데이터 넣기

      this.step++;
    },
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
</style>
