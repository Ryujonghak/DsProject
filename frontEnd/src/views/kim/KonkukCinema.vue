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
                      <div style="position: absolute; width: 500px; height: 600px; background-color: white; z-index: 30; left: 300px; top: -30px; border-radius: 10px; border: 1px solid ;">
                        <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                          <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">지도</span>
                          <button @click="mapopen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                        </div>
                        <div style="margin: 25px;">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3163.7214824409994!2d127.07065856564755!3d37.538062233515255!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ca4e634a752a9%3A0x29ef8b681f44ce74!2z66Gv642w7Iuc64Sk66eIIOqxtOuMgOyeheq1rA!5e0!3m2!1sko!2skr!4v1672794859955!5m2!1sko!2skr" width="450" height="500" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                        </div>
                      </div>
                  </div>
                  <div v-show="bus">
                      <div style="position: absolute; width: 600px; height: 680px; background-color: white; z-index: 30; left: 300px; top: -30px; border-radius: 10px; border: 1px solid;">
                        <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                          <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">대중교통</span>
                          <button @click="busopen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                        </div>
                        <div style="width: 50px; height: 50px; float: left;">
                          <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-bus-4274245.png" alt="">
                        </div>
                        <div style="width: 480px; margin-left: 70px; float: right; margin-right: 20px; ">
                          <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">버스로 오시는길</p>
                          <p style="margin-bottom:0;color: black;"> · 건대역(건대입구 방면) _ 240, 721, 2222, 2224, 350, 광진05</p>
                          <p style="margin-bottom:0;color: black;">건대입구역 사거리 방면 직진 후 사거리에서 롯데백화점 우측으로 200m 직진(이마트 방향) >첫번째 횡단보도 지난 후 우측 <br>
                            스타시티 쇼핑몰(이마트) GATE 1 진입 > 좌측으로 5m 이동 후 엘리베이터 이용(2층) > 우측 홀 이동</p>
                          <p style="margin-bottom:0;color: black;"> · 건대역(대동아파트앞 방면) _ 240, 721, 2222, 2224, 3500, 광진05</p>
                          <p style="margin-bottom:0;color: black;">건대입구역 사거리 방면 직진 후 횡단보도 이용 롯데백화점 방면 이동 후 백화점 좌측으로 200m 직진(이마트 방향) >첫번째 횡단보도 지난 후 우측 스타시티 쇼핑몰(이마트) <br> GATE 1 진입 > 좌측으로 5m 이동 후 엘리베이터 이용(2층) > 우측 홀 이동</p>
                        </div>
                        <div style="width: 50px; height: 50px; float: left;">
                          <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-subway-2385488.png" alt="">
                        </div>
                        <div style="width: 480px; margin-left: 70px; float: right; margin-right: 20px;">
                          <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">지하철로 오시는 길</p>
                          <p style="margin-bottom:0;color: black;"> · 2호선 건대입구역 하차</p>
                          <p style="margin-bottom:0;color: black;">건대입구역 5번 출구 방향 이동 > 정면 횡단보도 이용 후 200m 직진 > 첫번째 횡단보도 지난 후 우측 스타시티 쇼핑몰(이마트) GATE 1 진입 > 좌측으로 5m 이동 후 엘리베이터 이용(2층) > 우측 홀 이동</p>
                          <p style="margin-bottom:0;color: black;"> · 7호선 건대입구역 하차</p>
                          <p style="margin-bottom:0;color: black;">건대입구역 4번 출구 방향 좌측 롯데백화점 연결 통로(B1층) 이용하여 스타시티 쇼핑몰 진입 >정면 에스컬레이터 이용 2층 이동>우측 Emoi 쌀국수 앞 구름다리 이용 롯데시네마 진입</p>
                          
                        </div>
                      </div>
                  </div>
                  <div v-show="car">
                      <div style="position: absolute; width: 600px; height: 400px; background-color: white; z-index: 30; left: 300px; top: 0ㅔㅌ; border-radius: 10px; border: 1px solid ;">
                        <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                          <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">자가용</span>
                          <button @click="caropen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                        </div>
                        <div style="width: 50px; height: 50px; float: left;">
                          <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-car-635651.png" alt="">
                        </div>
                        <div style="width: 480px; margin-left: 70px; float: right; margin-right: 20px; ">
                          <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">자가용으로 오시는길</p>
                          <p style="margin-bottom:0;color: black;"> · [내비게이션 검색] 롯데시네마 건대입구</p>
                          <p style="margin-bottom:0;color: black;">서울특별시 광진구 아차산로 272 (광진구 자양동 227-7)
스타시티 쇼핑몰(이마트) 지상 2층 위치</p>
<p style="margin-bottom:0;color: black;"> · [주차장 이용방법]</p>
                          <p style="margin-bottom:0;color: black;">(1)지하 주차장(건물 지하 2층 ~ 지하 3층)</p>
                          <p style="margin-bottom:0;color: black;">(2)주차 대수 (총 1,058대)</p>
                          <p style="margin-bottom:0;color: black;">(3)영화관 인접구역</p>
                          <p style="margin-bottom:0;color: black;">(4)영화관 오시는 길</p>
                          <p style="margin-bottom:0;color: black;"> 주차 후 영화관 인접구역 엘리베이터 탑승 > 지상 2층 하차 후 우측 롯데시네마 홀 이동</p>

                        </div>
                      </div>
                  </div>
                  <img style="width:100%; margin-bottom: 0;" src="@/assets/images_kim/Views/ModalView/noimage_final(43).jpg" alt="">
                  <div style="background-color: black; opacity: 0.8; position: absolute; width: 100%; bottom: 0; left: 0; height: 250px;">
                      <div style="margin-left: 20px; margin-top: 20px;">
                          <h2 style="margin-bottom: 10px;">건대입구</h2>
                       <span > &nbsp;&nbsp;&nbsp; · 총 상영관 수 1개관 · 총 좌석수 97석</span>
                       <p style="margin: 0; margin-top: 10px; color: white; font-size: 18px; font-weight: bold;">서울 광진구 아차산로 262 (자양동, 더샵스타시티)</p>
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
  
  </style>