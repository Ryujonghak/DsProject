<template>
  <!-- 날짜, 시간 버튼 시작 -->
  <div class="col-md-12 reset-padding">
    <DateButton
      v-for="(date, index) in dates"
      :key="index"
      :date="date"
      @select-day="selectedDay"
    />
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
      console.log(id);
      // 선택된 날짜 출력하고 active로 css 컨트롤 할꺼임
    },
  },
};
</script>

<style></style>
