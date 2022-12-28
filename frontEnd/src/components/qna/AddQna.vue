<template>
  <div class="qna">
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>1:1 문의하기</h1>
              <ul class="breadcumb">
                <li class="active"><router-link to="/">Home</router-link></li>
              </ul>
            </div>
            <!-- 안내메세지 -->
            <div class="information">
              <strong style="color: aliceblue"
                >-1:1 문의글 답변 운영시간 10:00 ~ 19:00</strong
              ><br />
              <strong style="color: aliceblue"
                >-접수 후 48시간 안에 답변 드리겠습니다.</strong
              ><br />
              <strong style="color: aliceblue"
                >-문의내역은 MY-PAGE에서 확인이 가능합니다.</strong
              ><br />
              <strong style="color: aliceblue"
                >- <em class="font-orange">*</em> 는 필수입력값 입니다.</strong
              ><br />
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="container">
      <!-- qna 테이블시작 -->
      <table class="qnabox">
        <colgroup>
          <col style="width: 120px" />
          <col />
          <col style="width: 120px" />
          <col />
        </colgroup>
        <tbody>
          <tr>
            <th scope="row">
              |
              <label for="name">이름</label>
              <em class="font-orange">*</em>
            </th>
            <td>
              <input
                type="text"
                id="name"
                class="input-text boxing"
                value
                maxlength="4"
                v-model="qna.name"
              />
            </td>
            <th scope="row">
            |
              <label for="name">이메일</label>
              <em class="font-orange">*</em>
            </th>
            <td>
              <input
                type="email"
                id="email"
                class="input-text boxing"
                value
                maxlength="50"
                placeholder="알맞은 이메일형식(@)을 입력해주세요."
                v-model="qna.email"
              />
              <div id="error_mail" class="result-email result-check"></div>
            </td>
          </tr>
          <tr>
            <th scope="row">
              |
              <label for="name">휴대전화</label>
              <em class="font-orange">*</em>
            </th>
            <td>
              <input
                type="text"
                name="hpNum"
                id="hpNum"
                class="boxing form-control"
                maxlength="12"
                placeholder="휴대폰번호 -제외 입력"
                v-model="qna.phonenumber"
              />
            </td>
          </tr>
          <tr>
            <th scope="row">
              |
              <label for="qnaTitle">제목</label>
              <em class="font-orange">*</em>
            </th>
            <td colspan="3">
              <input
                type="text"
                name="title"
                id="qnaTitle"
                class="boxing input-text"
                maxlength="100"
                placeholder="제목을 입력해주세요."
                v-model="qna.title"
              />
            </td>
          </tr>
          <tr>
            <th scope="row">
              |
              <label for="textarea">내용</label>
              <em class="font-orange">*</em>
            </th>
            <td colspan="3">
              <div class="textarea">
                <textarea
                  id="textarea"
                  name="custInqCn"
                  rows="5"
                  cols="30"
                  title="내용입력"
                  class="input-textarea boxing"
                  placeholder="내용을 입력해주세요."
                  v-model="qna.content"
                ></textarea>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
      <!-- qna 테이블 끝 -->
      <!-- 전송버튼 시작 -->
      <div class="button">
        <a type="submit" class="redbtn" @click="createQna">전송하기</a>
      </div>
      <!-- 전송버튼 끝 -->
    </div>
  </div>
</template>

<script>
import QnaDataService from "@/services/QnaDataService.js";
import email from "@/assets/js/email.js";
export default {
  mounted() {
    email();
  },
  data() {
    return {
      qna: {
        name: "",
        email: "",
        phonenumber: "",
        title: "",
        content: "",
      },
      // TODO: 정주희 추가
      submitted: false,
    };
  },
  methods: {
    createQna() {
      let data = {
        name: this.qna.name,
        email: this.qna.email,
        phonenumber: this.qna.phonenumber,
        title: this.qna.title,
        content: this.qna.content,
      };
      QnaDataService.create(data)
        // 성공하면 then() 결과가 전송됨
        .then((response) => {
          console.log(response.data);
          alert("등록이 완료되었습니다");
          this.submitted = true;  // TODO: 정주희 추가
          this.$router.push("/qna");
        })
        // 실패하면 .catch() 에러메세지가 전송됨
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>

<style>
.qnabox {
  border: 2px solid;
  color: aliceblue;
  padding: 5%;

}
.qna {
  background: black;
}
tbody {
  display: table-row-group;
  vertical-align: middle;
  border-color: whitesmoke;
}
.font-orange {
  color: red;
}
#hpNum1 {
  width: 50%;
}
.boxing {
  display: inline !important ;
  width: 100%;
  height: 70%;
  padding: 6px 12px;
  font-size: 14px;
  line-height: 1.42857143;
  color: #555555;
  background-color: #fff;
  background-image: none;
  /* border: 1px solid #aaa; */
}
.button {
  margin-top: 5%;
  text-align: center;
  box-shadow: none !important;
}
/* .information {
  margin-top: 3%;
  margin-left: 10%;
} */
</style>
