<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>DS CINEMA 가산 디지털</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>THEATER</li>
              </ul>
            </div>
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
                    <div style="position: absolute; width: 500px; height: 600px; background-color: white; z-index: 30; left: 300px; top: -30px; border-radius: 10px; border: 1px solid ;">
                      <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                        <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">지도</span>
                        <button @click="mapopen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                      </div>
                      <div style="margin: 25px;">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3166.295338823776!2d126.8869551155937!3d37.47735637981467!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357b61e07310d561%3A0xadeb3944fef847ff!2z7ISc7Jq47Yq567OE7IucIOq4iOyynOq1rCDrlJTsp4DthLjroZwxMOq4uCA5!5e0!3m2!1sko!2skr!4v1672765208027!5m2!1sko!2skr" width="450" height="500" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                      </div>
                    </div>
                </div>
                <div v-show="bus">
                    <div style="position: absolute; width: 600px; height: 500px; background-color: white; z-index: 30; left: 300px; top: -30px; border-radius: 10px; border: 1px solid ;">
                      <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                        <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">대중교통</span>
                        <button @click="busopen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                      </div>
                      <div style="width: 50px; height: 50px; float: left;">
                        <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-bus-4274245.png" alt="">
                      </div>
                      <div style="width: 480px; margin-left: 70px; float: right; ">
                        <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">버스로 오시는길</p>
                        <p style="margin-bottom:0;color: black;"> · [지선] 5536, 5616, 5712, 5714</p>
                        <p style="margin-bottom:0;color: black;"> · [간선] 503, 504, 571, 652</p>
                        <p style="margin-bottom:0;color: black;"> · 구로방면</p>
                        <p style="margin-bottom:0;color: black;">금천 패션아울렛 사거리 [W몰] 하차하여 현대아울렛까지 도보 2분 이동</p>
                        <p style="margin-bottom:0;color: black;"> · [간선] 503, 504, 571, 652</p>
                        <p style="margin-bottom:0;color: black;">금천 패션아울렛 사거리 [마리오 아울렛] 하차하여 현대아울렛까지 도보 2분 이동</p>
                      </div>
                      <div style="width: 50px; height: 50px; float: left;">
                        <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-subway-2385488.png" alt="">
                      </div>
                      <div style="width: 480px; margin-left: 70px; float: right; ">
                        <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">지하철로 오시는 길</p>
                        <p style="margin-bottom:0;color: black;"> · [1호선 가산디지털단지역 하차]</p>
                        <p style="margin-bottom:0;color: black;">1번 출구 앞 시내 버스 정류장에서 5616, 5712 이용하여 [W몰] 정류장 하차 후 현대아울렛까지 도보 2분 이동 / 4번 출구에서 도보 600M 이동</p>
                        
                      </div>
                    </div>
                </div>
                <div v-show="car">
                    <div style="position: absolute; width: 600px; height: 300px; background-color: white; z-index: 30; left: 300px; top: 0ㅔㅌ; border-radius: 10px; border: 1px solid ;">
                      <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                        <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">자가용</span>
                        <button @click="caropen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                      </div>
                      <div style="width: 50px; height: 50px; float: left;">
                        <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-car-635651.png" alt="">
                      </div>
                      <div style="width: 480px; margin-left: 70px; float: right; ">
                        <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">자가용으로 오시는길</p>
                        <p style="margin-bottom:0;color: black;"> · 네비게이션 이용 시 부산 금정구 중앙대로 1607 or 오투시네마로 검색</p>
                        <p style="margin-bottom:0;color: black;">서울시 금천구 디지털로 10길 9, 현대아울렛</p>
                        <p style="margin-bottom:0;color: black;"> · 남부순환도로 공항 방면으로 시흥IC를 500M 지나,</p>
                        <p style="margin-bottom:0;color: black;">디지털단지 오거리를 건넌 후, 고가 아래에서 U턴 → 가산로를 따라 100M 이동 후, 지웰에스테이트 골목으로 우회전 → 현대아울렛 후문에서 좌회전</p>
                      </div>
                    </div>
                </div>
                <img style="width:100%; margin-bottom: 0;" src="@/assets/images_kim/Views/ModalView/CGVgangnam.jpg" alt="">
                <div style="background-color: black; opacity: 0.8; position: absolute; width: 100%; bottom: 0; left: 0; height: 250px;">
                    <div style="margin-left: 20px; margin-top: 20px;">
                        <h2 style="margin-bottom: 10px;">가산디지털</h2>
                     <span > &nbsp;&nbsp;&nbsp; · 총 상영관 수 1개관 · 총 좌석수 97석</span>
                     <p style="margin: 0; margin-top: 10px; color: white; font-size: 18px; font-weight: bold;">서울 금천구 디지털로10길 9 (가산동)</p>
                    </div>

                    <button @click="mapopen()" style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; height: 1px">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px;  margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-map-1321246.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -140px;">지도</span>
                    </button>
                    <button @click="busopen()" style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; left: 130px; height: 1px;">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px;  margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-bus-4274245.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -180px;">대중교통</span>
                    </button>
                    <button @click="caropen()" style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; left: 300px; height: 1px;">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px; margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-car-635651.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -160px;">자가용</span>
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
    
    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
  </div>
</template>

<script>

export default {
  data() {
    return {
        극장정보: true,
        이벤트: false,
        입장료: false,
        map: false,
        bus: false,
        car: false,
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
      this.bus = false;
      this.car = false;
    },
    busopen() {
      this.bus = !this.bus;
      this.map = false;
      this.car = false;      
    },
    caropen() {
      this.bus = false;
      this.car = !this.car;
      this.map = false;
    },
  },
};
</script>

<style scoped>
/* 배경이미지 : 아리걸로 통일 */
.hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
  /* height: 598px; */
  width: 100%;
}


/* TODO: 탑버튼 추가_정주희*/
.topbutton{
    position:fixed; bottom:15px; right:15px; width:40px; height:40px; z-index:1; opacity:0.8;
}
</style>