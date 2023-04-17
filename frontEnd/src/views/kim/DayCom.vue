<template>
  <!-- 날짜, 시간 버튼 시작 -->
  <div class="col-md-12 reset-padding">
    <DateButton
      v-for="(date, index) in dates"
      :key="index"
      :id="index"
      :year="date.year"
      :month="date.month"
      :dayNumber="date.dayNumber"
      :day="date.day"
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
  mounted() {
    this.getDate();
  },
  components: {
    DateButton,
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
      dates: [],
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
        const day = [
          date.getFullYear(),
          date.getMonth() + 1,
          date.getDate(),
          date.getDay(),
        ];

        console.log(this.dates);
        this.dates.push(day);

        // FIXME: 1. 콘솔로그 찍을때 처음에 다 나옴.
        // FIXME: 2. 날짜에 0을 추가했는데 추가가 안됨. 고쳐야됨.
        // FIXME: 3. 객체배열에 year = ?? 이렇게 담고 싶은데 0으로 담김

        // if (this.dates[i].month < 10) {
        //   this.dates[i].month = "0" + this.dates[i].month;
        // }
      }
      this.dateY =
        String(this.year) + String(this.month) + String(this.dayNumber); // 20230416 이렇게 보내야 됨
    },
  },
};
</script>

<style></style>
