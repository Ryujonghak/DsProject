<template>
  <!-- 날짜 버튼 시작 -->
  <div
    class="col-md-6 reset-padding"
    style="padding-right: 20px; display: inline-block"
  >
    <p v-if="today" class="title-text">
      {{ date.year }}년 {{ date.month }}월 {{ date.dayNumber }}일 (오늘)
    </p>
    <!-- 내일 -->
    <button @click="selectedDay" class="day-btn">
      <p style="margin-bottom: 10px">오늘 내일 수정</p>
      <h4 class="day-h4">{{ date.dayNumber }}</h4>
    </button>
    <!-- <button class="day-btn2">
      <p style="margin-bottom: 10px">내일</p>
      <h4 class="day-h4-bg">{{ dayNumber }}</h4>
    </button> -->
  </div>
  <!-- 닐짜 버튼 끝 -->
</template>

<script>
export default {
  props: ["date"],
  created() {
    this.todayActive();
  },
  data() {
    return {
      today: false,
      btnActive: false,
      active: this.date.active,
      week: [
        "월요일",
        "화요일",
        "수요일",
        "목요일",
        "금요일",
        "토요일",
        "일요일",
      ],
    };
  },
  methods: {
    todayActive() {
      if (this.date.id === 0) {
        this.today = true;
        this.$emit("today", this.date);
        // FIXME: 이거 그냥 Vuex로 사용할 예정.
      }
    },
    selectedDay() {
      this.$emit("select-day", this.date.id);
    },
  },
  watch: {
    active(value) {
      if (value == true) {
        this.btnActive = true;
      } else {
        this.btnActive = false;
      }
    },
  },
};
</script>

<style scoped>
.title-text {
  color: gray;
  /* padding: 25px 0 5px 0; */
  /* margin-bottom: 10px; */
  font-size: 16px;
  font-weight: bold;
  color: white;
  border-bottom: 1px solid gray;
}
.reset-padding {
  padding: 0;
}
.day-btn {
  width: 55px;
  height: 80px;
  border-radius: 20px;

  float: left;
  border: 0;
  background-color: black;
  margin-right: 5px;
  margin-top: 5px;
}
.day-btn2 {
  width: 55px;
  border-radius: 20px;
  height: 80px;
  float: left;
  border: 0;
  background-color: #1d1e2c;
  margin-right: 5px;
  margin-top: 5px;
}

.day-h4 {
  padding: 9px 25px 9px 13px;
  margin-left: 3px;
}
.day-h4-bg {
  color: black;
  padding: 9px 25px 9px 13px;
  margin-left: 3px;
  background-color: white;
  border-radius: 18px;
}
</style>
