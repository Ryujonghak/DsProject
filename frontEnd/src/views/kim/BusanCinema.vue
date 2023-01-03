<template>
  <div>
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct"></div>
          </div>
        </div>
      </div>
    </div>
    <!-- blog detail section-->
    <div class="page-single">
      <div class="container">
        <div class="row">
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="blog-detail-ct">
              <div v-show="극장정보" class="col-md-12" style=" text-align: center; color: white; font-size: 24px; padding: 0;">
                <button
                  @click="info()"
                  class="col-md-4"
                  style=" background-color: #020d18; border-bottom: 0; border-right: #faf8f1 1px solid; border-top: #faf8f1 1px solid; padding: 5px; border-left: 1px solid #faf8f1; color: #503396;">
                  <span>극장정보</span>
                </button>
                <button @click="event()" class="col-md-4" style=" background-color: #020d18; border-bottom: 1px solid #faf8f1; border-right: #405266 1px solid; border-top: #405266 1px solid; padding: 5px; ">
                  <span>이벤트</span>
                </button>
                <button  @click="admissionfee()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 1px solid #faf8f1;    border-right: #405266 1px solid;    border-top: #405266 1px solid;    padding: 5px;  ">
                  <span>입장료</span>
                </button>
              </div>
              <div  v-show="이벤트"  class="col-md-12"  style="    text-align: center;    color: white;    font-size: 24px;    padding: 0;  ">
                <button  @click="info()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 1px solid #faf8f1;    border-left: #405266 1px solid;    border-top: #405266 1px solid;    padding: 5px;  ">
                  <span>극장정보</span>
                </button>
                <button  @click="event()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 0;    border-right: #faf8f1 1px solid;    border-top: #faf8f1 1px solid;    padding: 5px;    border-left: 1px solid #faf8f1;    color: #503396;  ">
                  <span>이벤트</span>
                </button>
                <button  @click="admissionfee()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 1px solid #faf8f1;    border-right: #405266 1px solid;    border-top: #405266 1px solid;    padding: 5px;  ">
                  <span>입장료</span>
                </button>
              </div>
              <div  v-show="입장료"  class="col-md-12"  style="    text-align: center;    color: white;    font-size: 24px;    padding: 0;  ">
                <button  @click="info()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 1px solid #faf8f1;    border-left: #405266 1px solid;    border-top: #405266 1px solid;    padding: 5px;  ">
                  <span>극장정보</span>
                </button>
                <button  @click="event()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 1px solid #faf8f1;    border-left: #405266 1px solid;    border-top: #405266 1px solid;    padding: 5px;  ">
                  <span>이벤트</span>
                </button>
                <button  @click="admissionfee()"  class="col-md-4"  style="    background-color: #020d18;    border-bottom: 0;    border-right: #faf8f1 1px solid;    border-top: #faf8f1 1px solid;    padding: 5px;    border-left: 1px solid #faf8f1;    color: #503396;  ">
                  <span>입장료</span>
                </button>
              </div>
              <div v-show="극장정보" class="col-md-12" style="padding: 100px 0 0 0; background-color: #020d18; color: white; position: relative;"> 
                <!-- <span style="font-size:28px; padding-bottom: 10px; border-bottom: 1px solid #405266;">부산대</span> -->
                <div v-show="map">
                    <div style="position: absolute; width: 500px; height: 600px; background-color: red; z-index: 30; left: 300px; top: -30px; border-radius: 10px;">
                        asdasdas
                    </div>
                </div>
                <img style="width:100%; margin-bottom: 0;" src="@/assets/images_kim/Views/ModalView/CGVdongnae.jpg" alt="">
                <div style="background-color: black; opacity: 0.8; position: absolute; width: 100%; bottom: 0; left: 0; height: 250px;">
                    <div style="margin-left: 20px; margin-top: 20px;">
                        <h2 style="margin-bottom: 10px;">부산대</h2>
                     <span > &nbsp;&nbsp;&nbsp; · 총 상영관 수 1개관 · 총 좌석수 97석</span>
                     <p style="margin: 0; margin-top: 10px; color: white; font-size: 18px; font-weight: bold;">부산 금정구 중앙대로 1607 (부곡동)</p>
                    </div>

                    <button @click="mapopen()" style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; height: 1px">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px;  margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-map-1321246.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -180px;">지도보기</span>
                    </button>
                    <button style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; left: 170px; height: 1px;">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px;  margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-bus-4274245.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -180px;">대중교통</span>
                    </button>
                    <button style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; left: 340px; height: 1px;">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px; margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-car-635651.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -180px;">자가용</span>
                    </button>
                </div>
              </div>
              <div v-show="이벤트" class="col-md-12" style="padding: 100px 0 0 0; background-color: #020d18; color: white;"> 
                <div style="width: 100%; height: 488px;  margin-top: 30px; border: 1px solid white; position: relative;">
                    <div style="margin-top: 30px; font-size: 30px; background-color: white; color: #405266; height: 350px; width: 500px; text-align: center;margin-left: 330px;">
                        서비스 점검중입니다.
                        <img style="width: 50px;" src="@/assets/images_kim/Views/ModalView/free-icon-sad-face-in-rounded-square-42901.png" alt="">
                        <div style="margin-top: 30px;">빠른 실내에 다시 찾아 뵙겠습니다.</div>
                    </div>
                </div>               
              </div>
              <div v-show="입장료" class="col-md-12" style="padding: 100px 0 0 0; background-color: #020d18; color: white;"> 
                <div style="width: 100%; height: 488px;  margin-top: 30px; border: 1px solid white; position: relative;">
                    <div style="margin-top: 30px; font-size: 30px; background-color: white; color: #405266; height: 350px; width: 500px; text-align: center;margin-left: 330px;">
                        서비스 점검중입니다.
                        <img style="width: 50px;" src="@/assets/images_kim/Views/ModalView/free-icon-sad-face-in-rounded-square-42901.png" alt="">
                        <div style="margin-top: 30px;">빠른 실내에 다시 찾아 뵙겠습니다.</div>
                    </div>
                </div>               
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  data() {
    return {
        극장정보: true,
        이벤트: false,
        입장료: false,
        map: true,
    };
  },
  methods: {
    info() {
        this.극장정보 = true;
        this.이벤트 = false;
        this.입장료 = false;
    },
    event() {
        this.극장정보 = false;
        this.이벤트 = true;
        this.입장료 = false;
    },
    admissionfee() {
        this.극장정보 = false;
        this.이벤트 = false;
        this.입장료 = true;
    },
    mapopen() {
        this.map = !this.map;
        console.log(this.map);
    }
  },
};
</script>

<style scoped>

</style>