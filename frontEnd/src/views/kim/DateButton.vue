<template>
  <!-- 날짜 버튼 시작 -->
  <div>
    <!-- 내일 -->
    <button @click="selectedDay" class="day-btn" style="position: relative">
      <p
        v-if="date.id == 0"
        style="margin: 10px 0; position: absolute; top: 0px; left: 13px"
      >
        오늘
      </p>
      <p v-else-if="date.id == 1" style="margin: 3px 0">내일</p>
      <p v-else style="margin: 3px 0">{{ week[date.day] }}</p>
      <h4 :class="btnActive ? 'day-h4-bg' : 'day-h4'">{{ date.dayNumber }}</h4>
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
  margin: 0;
}
.day-h4-bg {
  color: black;
  padding: 9px 25px 9px 13px;
  margin-left: 3px;
  background-color: white;
  border-radius: 18px;
}
</style>
