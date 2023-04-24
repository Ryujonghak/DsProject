<template>
  <div style="display: inline-block">
    <span style="padding-left: 50px">2D</span>
    <br />
    <button
      @click="selectedTime"
      class="runningtime-btn"
      :class="schedule.active ? 'active' : ''"
    >
      <!-- :class="cinema == 'centum' ? 'active' : ''" -->
      <!-- <h5>11 : 00</h5> -->
      <h5>{{ schedule.starttime }}</h5>
    </button>
  </div>
</template>

<script>
export default {
  props: ["schedule"],
  methods: {
    selectedTime() {
      this.$emit("select-time", this.schedule.scno, this.schedule.starttime);
    },
  },
};
</script>

<style scoped>
.runningtime-btn {
  width: 110px;
  border: 0;
  background-color: #fff;
  margin: 5px;
}
.runningtime-btn h5 {
  padding: 9px;
  color: black;
}
.active {
  border: 1px yellow solid;
}
</style>
