<template>
  <div class="noticelist" style="background:black">
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>Notice 공지사항</h1>
              <ul class="breadcumb">
                <li class="active"><router-link to="/">Home</router-link></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- search 관련 div 시작 -->
    <div class="container" style="padding:3%; background: white;">
      <fieldset class="search_wrap" id="search_wrap1">
        <select class="ty3" title="검색조건 제목 선택" id="selectCondition1">
          <option value="1" selected>제목</option>
          <option value="2">내용</option>
        </select>
        <input
          type="text"
          placeholder="검색어를 입력하세요"
          id="searchKeyword1"
          style="width: 580px"
        />
        <div class="search">
          <button type="button" class="btn_col2">검색</button>
        </div>
      </fieldset>
      <!-- search 관련 div 끝 -->
      <!-- table 시작 -->
      <table class="notice_table">
        <colgroup>
          <col style="width: 10%" />
          <col style="width: 15%" />
          <col style="width: auto" />
          <col style="width: 15%" />
        </colgroup>
        <thead>
          <tr>
            <th scope="col">번호</th>
            <th scope="col">구분</th>
            <th scope="col">제목</th>
            <th scope="col">등록일</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
        </tbody>
      </table>
      <!-- table 끝 -->
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.ty3 {
  width: 10%;
  display: inline !important;
  border: 1px solid #ddd;
  border-radius: 4px;
  margin-right: 10px;
  color: #414141;
}
#searchKeyword1 {
  display: inline !important;
}
.notice_table {
  margin-top: 3%;
  text-align: center;
  color: inherit;
  background:whitesmoke;
}
tbody {
  display: table-row-group;
  vertical-align: middle;
  border-color: whitesmoke;
}
/* 셀렉트박스 */
.search_wrap {
  position: relative;
  border: 1px solid #dddddd;
  border-radius: 6px;
  background: #f8f8f8;
  padding: 22px 22px;
}
/* 버튼 */
.btn_col2 {
  box-sizing: border-box;
  border-radius: 4px;
  border: 1px solid #414141;
  color: #ffffff !important;
  text-align: center;
  vertical-align: middle;
  background-color: #414141;
  display: inline !important;
}
.search_wrap [class^="btn_col"] {
  width: 86px;
  height: 38px;
  line-height: 34px;
  vertical-align: middle;
}
.fieldset {
  margin-inline-start: 2px;
  margin-inline-end: 2px;
  padding-block-start: 0.35em;
  padding-inline-start: 0.75em;
  padding-inline-end: 0.75em;
  padding-block-end: 0.625em;
  min-inline-size: min-content;
}
.search_wrap input[type="text"] {
  width: 520px;
  margin-right: 4px;
  border-radius: 4px;
}
.search {
  display: inline !important;
}
th {
  text-align: center;
  color:#414141
}

</style>
