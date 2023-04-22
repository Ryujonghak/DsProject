<template>
  <!-- 날짜, 시간 버튼 시작 -->
  <div class="col-md-12 reset-padding">
    <div class="col-md-6 c-slider reset-padding">
      <p class="title-text" style="">
        {{ dates[0].year }}년 {{ dates[0].month }}월 {{ dates[0].dayNumber }}일
        (오늘)
      </p>
      <div
        class="c-slides"
        :style="{
          transform: 'translateX(' + -currentIndex * slideWidth + 'px)',
        }"
      >
        <div class="c-slide">
          <DateButton
            v-for="(date, index) in dates"
            :key="index"
            :date="date"
            @select-day="selectedDay"
          />
        </div>
      </div>
      <button class="prev" @click="prevSlide">
        <i class="bx bx-chevron-left"></i>
      </button>
      <button class="next" @click="nextSlide">
        <i class="bx bx-chevron-right"></i>
      </button>
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
      currentIndex: 0,
      slideWidth: 278,
      screenWidth: 0,
    };
  },
  methods: {
    getDate() {
      let date = new Date();
      for (let i = 0; i < 12; i++) {
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

      // console.log(this.dates);
    },
    nextSlide() {
      if (this.currentIndex == 2) {
        return;
      }
      this.currentIndex++;
    },
    prevSlide() {
      if (this.currentIndex == 0) {
        return;
      }
      this.currentIndex--;
    },
  },
};
</script>

<style scoped>
.reset-padding {
  padding: 0;
}
.title-text {
  color: gray;
  font-size: 16px;
  font-weight: bold;
  color: white;
  border-bottom: 1px solid gray;
  padding-right: 20px;
}
.c-slider {
  padding: 0 10px;
  overflow: hidden;
  height: 150px;
}
.c-slides {
  display: flex;
  transition: transform 0.5s ease-out;
}
.c-slide {
  flex: 0 0 1000px;
  /* margin-left: 2px; */
}

.prev {
  position: absolute;
  top: 25px;
  left: -10px;
  height: 110px;
  width: 20px;
  background-color: transparent;
  border: 0;
}
.next {
  position: absolute;
  top: 25px;
  right: 0;
  height: 110px;
  width: 20px;
  background-color: black;
  border: 0;
}
</style>
