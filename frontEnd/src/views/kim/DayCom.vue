<template>
  <!-- 날짜, 시간 버튼 시작 -->
  <div class="col-md-12 reset-padding" style="margin-top: 10px">
    <div class="col-md-6 c-slider reset-padding">
      <p class="title-text">
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
            @select-day="selectDay"
            @today="today"
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
    <div class="col-md-6 reset-padding" style="padding: 0 0 0 5px">
      <p class="title-text">상영시간</p>
      <div v-if="schedules.length !== 0">
        <RunningTimeCom
          v-for="(schedule, index) in schedules"
          :key="index"
          :schedule="schedule"
        />
      </div>
      <div v-else style="margin: 20px 0 0 0">
        <h3>조회 가능한 상영시간이 없습니다. 조건을 변경해주세요.</h3>
      </div>
    </div>
    <!-- 시간 버튼 끝 -->
  </div>
  <!-- 날짜, 시간 버튼 끝 -->
</template>

<script>
import DateButton from "./DateButton.vue";
import RunningTimeCom from "./RunningTimeCom.vue";
import ScheduleDataService from "@/services/ScheduleDataService";
export default {
  props: ["currentMovie", "selectedcinema"],
  created() {
    this.getDate(); // 날짜 생성
    this.today(); // 초기값으로 영화관 + 오늘 날짜
    this.getFindAllByMoviecdAndLocationAndStartday(); // 선택한 영화 + 선택한 영화관 + 선택한 날짜 = 그날에 해당되는 영화시간 받아옴
  },
  components: {
    DateButton,
    RunningTimeCom,
  },
  data() {
    return {
      dates: [],
      currentIndex: 0,
      slideWidth: 278,
      selectedday: "", // 영화관 + 날짜 = 시간조회로 사용됨
      schedules: [],
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
        if (day.month < 10) {
          day.month = "0" + (date.getMonth() + 1);
        }
        this.dates.push(day);
      }
    },
    today(date) {
      this.selectedday =
        String(date.year) + String(date.month) + String(date.dayNumber); // 20230416 이렇게 보내야 됨
    },
    selectDay(id, date) {
      this.dates = this.dates.map(date => {
        if (date.id !== id) {
          return { ...date, active: false };
        } else {
          return { ...date, active: true };
        }
      });
      this.today(date);
      this.getFindAllByMoviecdAndLocationAndStartday();
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
    // 무비코드 + 영화관 + 날짜 = 그날에 해당되는 시간을 받아 옴
    getFindAllByMoviecdAndLocationAndStartday() {
      ScheduleDataService.getFindAllByMoviecdAndLocationAndStartday(
        this.currentMovie.moviecd,
        this.selectedcinema,
        this.selectedday
      )
        .then(response => {
          this.schedules = response.data;
        })
        .catch(error => {
          console.log(error);
        });
    },
  },
};
</script>

<style scoped>
.reset-padding {
  padding: 0;
}
.title-text {
  margin-bottom: 5px;
  padding-bottom: 5px;
  font-size: 16px;
  font-weight: bold;
  color: white;
  border-bottom: 1px solid gray;
  line-height: 1.5;
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
