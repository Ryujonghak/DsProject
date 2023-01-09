<template>
  <div class="noticelist" style="background: black">
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
    <div class="container" style="padding: 3%; background: inherit; margin-top: 5%;">
      <fieldset class="search_wrap" id="search_wrap1">
        <select class="ty3" title="검색조건 제목 선택" id="selectCondition1" v-model="searchSelect">
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>
        <input
          type="text"
          placeholder="검색어를 입력하세요"
          id="searchKeyword1"
          style="width: 580px"
          v-model="searchKeyword"
        />
        <div class="search">
          <button
            type="button"
            class="btn_col2"
            @click="
              page = 1;
              retrieveNotice();
            "
          >
            검색
          </button>
        </div>
      </fieldset>
      <!-- search 관련 div 끝 -->
      <!-- table 시작 -->
      <table class="notice_table">
        <colgroup>
          <col style="width: 10%" />
          <col style="width: 15%" />
          <col style="width: 15%" />
          <col style="width: auto" />
          <col style="width: 15%" />
        </colgroup>
        <thead>
          <tr>
            <th scope="col">번호</th>
            <th scope="col">구분</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
            <th scope="col">등록일</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(data, index) in notice.notice" v-bind:key="index" class="item">
            <td>{{ data.nno }}</td>
            <td>{{ data.ntype }}</td>
            <td>{{ data.ntitle }}</td>
            <td>{{ data.ncontent }}</td>
            <td>{{ data.insertTime }}</td>
          </tr>
          

        </tbody>
      </table>
      <!-- table 끝 -->


      <!-- <!— 페이징 + 전체 목록 시작 —> -->
      <!-- <!— 페이징 양식 시작 —> -->
      <div class="col-md-12">
        <b-pagination
          v-model="page"
          :total-rows="notice.totalItems"
          :per-page="pageSize"
          prev-text="Prev"
          next-text="Next"
          @change="handlePageChange"
        ></b-pagination>
      </div>
      <!-- <!— 페이징 양식 끝 —> -->
      <!-- 필터 페이지네이션 -->

      <!-- TODO: 탑버튼 추가_정주희 -->
      <a class="topbutton" href="#">
        <img src="@/assets/images_jung/iconUp_48.png"/>
      </a>
    </div>
  </div>
</template>

<script>
import NoticeDataService from "@/services/NoticeDataService";
import notice from "@/assets/js/notice.js";


/* eslint-disable */
export default {
  data() {
    return {
      notice: [],
      searchSelect: "title",
      searchKeyword: "",

      page: 1,
      count: 0,
      pageSize: 10,
      pageSizes: [3, 6, 9],
    };
  },
  methods: {
    retrieveNotice() {
      NoticeDataService.getAll(
        this.searchSelect,
        this.searchKeyword,
        this.page - 1,
        this.pageSize
      )
        .then((response) => {
          const notice = response.data;
          this.notice = notice;
      //        var test = this.notice;
      // alert(JSON.stringify(test));
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },


    //페이지 변경시 실행됨 
    handlePageChange(value) {
      this.page = value;
      this.retrieveNotice();
    },
  },
  mounted() {
    this.retrieveNotice();
    notice();
  },
};
</script>

<style scoped>

/* TODO: 아코디언 css 디자인 */
.vsa-list {
  /* 사용자 지정 속성 변경 */
  --vsa-max-width: 100%;
  --vsa-min-width: 300px;
  --vsa-text-color: rgba(55, 55, 55, 1);
  --vsa-highlight-color: rgba(154, 157, 161);
  --vsa-bg-color:#f8f8f8;
  --vsa-border-color: rgba(0, 0, 0, 0.2);
  --vsa-border-width: 0.5px;
  --vsa-border-style: solid;
  --vsa-heading-padding: 1rem 1rem;
  --vsa-content-padding: 1rem 1rem;
  --vsa-default-icon-size: 1;

  margin-top: 2%;
}
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
  margin-top: 4%;
  text-align: center;
  color: inherit;
  background: whitesmoke;
  border-radius: 4px;
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
  color: #414141;
}
td {
  text-align: center !important;
}
.common-hero {
  height: 385px;
  /* // background: url("../images/uploads/user-hero-bg.jpg") no-repeat; */
  background: url("../assets/images_kang/Components/common/Navcom/back-img-test8.png") no-repeat !important;
}

/* TODO: 탑버튼 추가_정주희*/
.topbutton{
    position:fixed; bottom:15px; right:15px; width:40px; height:40px; z-index:1; opacity:0.8;
}
</style>
