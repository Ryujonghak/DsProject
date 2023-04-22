<template>
  <!-- 날짜 버튼 시작 -->
  <div>
    <!-- 내일 -->
    <button
      @click="selectedDay"
      class="day-btn"
      :class="date.active ? 'active' : ''"
      style="position: relative"
    >
      <span v-if="date.id == 0" class="day-btn-text">오늘</span>
      <span v-else-if="date.id == 1" class="day-btn-text">내일</span>
      <span v-else class="day-btn-text3">{{ week[date.day] }}</span>
      <h4 class="day-textNumber" :class="date.active ? 'active' : ''">
        {{ date.dayNumber }}
      </h4>
    </button>
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
  margin-right: 15px;
}

.day-btn.active {
  background-color: #1d1e2c;
}

.day-btn-text {
  position: absolute;
  top: 7px;
  left: 13px;
  font-size: 14px;
}
.day-btn-text3 {
  position: absolute;
  top: 7px;
  left: 7px;
  font-size: 14px;
}
.day-textNumber {
  margin: 30px 0 0;
}
.day-textNumber.active {
  color: black;
  padding: 10px;
  background-color: white;
  border-radius: 20px;
}
</style>
