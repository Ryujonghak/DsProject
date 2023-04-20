<template>
  <!-- 날짜, 시간 버튼 시작 -->
  <div class="col-md-12 reset-padding">
    <div class="col-md-6 reset-padding" style="padding-right: 20px">
      <p class="title-text">
        {{ dates[0].year }}년 {{ dates[0].month }}월 {{ dates[0].dayNumber }}일
        (오늘)
      </p>
      <DateButton
        v-for="(date, index) in dates"
        :key="index"
        :date="date"
        @select-day="selectedDay"
      />
    </div>
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
import DateButton from "./DateButton.vue";
export default {
  created() {
    this.getDate();
  },
  components: {
    DateButton,
  },
  data() {
    return {
      dates: [],
      dateY: "", // 영화관 + 날짜 = 시간조회로 사용됨
    };
  },
  methods: {
    getDate() {
      let date = new Date();
      for (let i = 0; i < 14; i++) {
        date.setDate(date.getDate() + (i == 0 ? 0 : 1));
        if (date.getDate() === 1) {
          date.setMonth(date.getMonth());
        }
        const day = {
          year: date.getFullYear(),
          month: date.getMonth() + 1,
          dayNumber: date.getDate(),
          day: date.getDay(),
          id: i,
          active: false,
        };
        this.dates.push(day);
      }
      this.dateY =
        String(this.year) + String(this.month) + String(this.dayNumber); // 20230416 이렇게 보내야 됨

      // if (this.dates[i].month < 10) {
      //   this.dates[i].month = "0" + this.dates[i].month;
      // }
    },
    selectedDay(id) {
      this.dates = this.dates.map(date => {
        if (date.id !== id) {
          return { ...date, active: false };
        } else {
          return { ...date, active: true };
        }
      });

      console.log(this.dates);
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
</style>
