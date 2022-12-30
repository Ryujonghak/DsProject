<template>
  <div>
    <div v-for="(i, index) in movie" :key="index">{{ i.movieNm }}</div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      movie: [],
      searchMname: "",
      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 3, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수

      pageSizes: [3, 6, 9], // select box 에 넣을 기본 데이터
    };
  },
};
</script>

<style></style>
