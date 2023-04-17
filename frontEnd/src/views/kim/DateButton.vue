<template>
  <!-- 날짜 버튼 시작 -->
  <div class="col-md-6 reset-padding" style="padding-right: 20px">
    <p class="title-text">
      <!-- {{ year }}년 {{ month }}월 {{ dayNumber }}일 (오늘) -->
    </p>
    <!-- 선택되면 3항 연산자로 뒤에 btn2가 붙도록 하면됨. -->
    <button @click="week('day1')" class="day-btn">
      <p style="margin-bottom: 10px">오늘</p>
      <!-- 선택되면 3항 연산자로 뒤에 bg가 붙도록 하면됨. -->
      <!-- <h4 class="day-h4">{{ dayNumber }}</h4> -->
    </button>
    <button class="day-btn2">
      <p style="margin-bottom: 10px">오늘</p>
      <!-- <h4 class="day-h4-bg">{{ dayNumber }}</h4> -->
    </button>

    <!-- 내일 -->
    <button @click="week('day2')" class="day-btn">
      <p style="margin-bottom: 10px">내일</p>
      <!-- <h4 class="day-h4">{{ dayNumber }}</h4> -->
    </button>
    <button class="day-btn2">
      <p style="margin-bottom: 10px">내일</p>
      <!-- <h4 class="day-h4-bg">{{ dayNumber }}</h4> -->
    </button>
  </div>
  <!-- 닐짜 버튼 끝 -->
</template>

<script>
export default {};
</script>

<style></style>
