<template>
  <!-- 영화관 -->
  <div class="col-md-12 reset-padding">
    <div class="col-md-6 reset-padding">
      <!-- FIXME: 백엔드에서 가져올 수 없어서 주석 처리하고. 관람이용가  -->
      <!-- <span>{{ currentMovie.watchgradenm }}</span> -->
      <span>12세 이상 관람가</span>
      <img
        class="timeimg"
        src="@/assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
        alt="시계"
      />
      <!-- FIXME: 백엔드에서 가져올 수 없어서 주석 처리하고. 러닝타임  -->
      <!-- <span>{{ currentMovie.showtm }}분</span> -->
      <span>130분</span>
    </div>
    <div class="col-md-6 reset-padding">
      <h6 class="cinema">영화관</h6>
      <button
        @click="selectedCinema('centum')"
        class="cinema-btn"
        :class="cinema == 'centum' ? 'active' : ''"
      >
        <h5>센텀시티</h5>
      </button>

      <button
        @click="selectedCinema('seomyeon')"
        class="cinema-btn"
        :class="cinema == 'seomyeon' ? 'active' : ''"
      >
        <h5>서면</h5>
      </button>

      <button
        @click="selectedCinema('busan')"
        class="cinema-btn"
        :class="cinema == 'busan' ? 'active' : ''"
      >
        <h5>부산대</h5>
      </button>
    </div>
  </div>
  <!-- 영화관 -->
</template>

<script>
export default {
  props: ["currentMovie"],
  emits: ["select-cinema"],
  created() {
    this.selectedCinema("centum");
  },
  data() {
    return {
      cinema: "",
    };
  },
  methods: {
    selectedCinema(value) {
      this.cinema = value;
      this.$emit("select-cinema", this.cinema);
    },
  },
};
</script>

<style scoped>
.reset-padding {
  padding: 0;
}
.timeimg {
  width: 30px;
  height: 30px;
  background-color: white;
  margin: 0 10px 0 20px;
}
.cinema {
  margin-bottom: 5px;
  padding-bottom: 10px;
  font-size: 16px;
  font-weight: bold;
  color: white;
  border-bottom: 1px solid gray;
  line-height: 1.5;
}

.cinema-btn {
  width: 110px;
  float: left;
  border: 0;
  background-color: transparent;
  margin: 5px;
}
.cinema-btn h5 {
  padding: 9px;
}
.active {
  color: black;
  background-color: #fff;
}
</style>
