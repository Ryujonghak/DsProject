<template>
  <div style="position: relative">
    <span style="position: absolute; top: 0; left: 50px">2D</span>
    <button class="runningtime-btn">
      <!-- :class="cinema == 'centum' ? 'active' : ''" -->
      <h5>11 : 00</h5>
      <!-- <h5>{{ schedule.starttime }}</h5> -->
    </button>
  </div>
</template>

<script>
export default {
  props: ["schedule"],
};
</script>

<style scoped>
.runningtime-btn {
  width: 110px;
  float: left;
  border: 0;
  background-color: #fff;
  margin: 27px 5px 5px;
}
.runningtime-btn h5 {
  padding: 9px;
  color: black;
}
.active {
  color: black;
  background-color: #fff;
}
</style>
