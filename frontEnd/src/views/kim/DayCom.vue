<template>
  <!-- 날짜, 시간 버튼 시작 -->
  <div class="col-md-12 reset-padding">
    <!-- 날짜 버튼 시작 -->
    <div class="col-md-6 reset-padding" style="padding-right: 20px">
      <p class="title-text">
        {{ year }}년 {{ month }}월 {{ dayNumber }}일 (오늘)
      </p>
      <!-- 선택되면 3항 연산자로 뒤에 btn2가 붙도록 하면됨. -->
      <button @click="week('day1')" class="day-btn">
        <p style="margin-bottom: 10px">오늘</p>
        <!-- 선택되면 3항 연산자로 뒤에 bg가 붙도록 하면됨. -->
        <h4 class="day-h4">{{ dayNumber }}</h4>
      </button>
      <button class="day-btn2">
        <p style="margin-bottom: 10px">오늘</p>
        <h4 class="day-h4-bg">{{ dayNumber }}</h4>
      </button>

      <!-- 내일 -->
      <button @click="week('day2')" class="day-btn">
        <p style="margin-bottom: 10px">내일</p>
        <h4 class="day-h4">{{ dayNumber }}</h4>
      </button>
      <button class="day-btn2">
        <p style="margin-bottom: 10px">내일</p>
        <h4 class="day-h4-bg">{{ dayNumber }}</h4>
      </button>
    </div>
    <!-- 닐짜 버튼 끝 -->
    <!-- 시간 버튼 시작 -->
    <div class="col-md-6 reset-padding">
      <p class="title-text">상영시간</p>
      <!-- 시간은 아직 -->
    </div>
    <!-- 시간 버튼 끝 -->
  </div>
  <!-- 날짜, 시간 버튼 끝 -->
</template>

<script>
export default {
  mounted() {
    this.getDate();
  },
  data() {
    return {
      week: [
        "월요일",
        "화요일",
        "수요일",
        "목요일",
        "금요일",
        "토요일",
        "일요일",
      ],
      dates: [
        {
          year: "",
          month: "",
          dayNumber: "", // 16일
          day: "", // 월요일= 1 , 화요일= 2 , ... 일요일= 0
        },
      ],
      dateY: "", // 영화관 + 날짜 = 시간조회로 사용됨
    };
  },
  methods: {
    getDate() {
      let date = new Date();
      for (let i = 0; i < 14; i++) {
        date.setDate(date.getDate() + 1);
        if (date.getDate() === 1) {
          date.setMonth(date.getMonth());
        }
        this.dates[i] = [
          (this.year = date.getFullYear()),
          (this.month = date.getMonth() + 1),
          (this.dayNumber = date.getDate()),
          (this.day = date.getDay()),
        ];

        // FIXME: 1. 콘솔로그 찍을때 처음에 다 나옴.
        // FIXME: 2. 날짜에 0을 추가했는데 추가가 안됨. 고쳐야됨.
        console.log(this.dates);
        if (this.dates[i].month < 10) {
          this.dates[i].month = "0" + this.dates[i].month;
        }
      }
      this.dateY =
        String(this.year) + String(this.month) + String(this.dayNumber); // 20230416 이렇게 보냄
    },
  },
};
</script>

<style></style>
