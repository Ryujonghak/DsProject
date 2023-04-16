<template>
  <div>
    <div class="page-single movie_list bg-black">
      <div class="container">
        <div class="row">
          <div class="blog-detail-ct">
            <!-- 좌석예매 페이지 -->
            <div v-show="Seatpage" class="position-relative">
              <!-- 포스터 및 관람객인원 선택 시작 -->
              <div class="col-md-4 reset-padding">
                <!-- 선택된 이미지 -->
                <div class="col-md-12 reset-padding">
                  <img
                    class="col-md-12 reset-padding"
                    style="margin-top: 0; margin-bottom: 10px"
                    :src="data1.posterurln"
                    alt="PosterImg"
                  />
                </div>
                <!-- 인원수 체크 성인 & 청소년 -->
                <div class="col-md-12 reset-padding">
                  <!-- 성인 인원수 선택 시작 -->
                  <div class="col-md-6 display-li-b reset-padding">
                    <span class="seat-count-text">성인</span>
                    <button @click="adultmins()" class="mg-right10">-</button>
                    <span class="seat-count-text">{{ adultcount }}</span>
                    <button @click="adultplus()" class="mg-right10">+</button>
                  </div>
                  <!-- 성인 인원수 선택 끝 -->
                  <!-- 청소년 인원수 선택 시작 -->
                  <div
                    class="col-md-6 display-li-b reset-padding"
                    style="text-align: right"
                  >
                    <span class="seat-count-text">청소년</span>
                    <button @click="teenmins()" class="mg-right10">-</button>
                    <span class="seat-count-text">{{ teencount }}</span>
                    <button @click="teenplus()" class="mg-right10">+</button>
                  </div>
                  <!-- 청소년 인원수 선택 끝 -->
                </div>
                <!-- 선택한 좌석 ex) A01,A02 시작 -->
                <div class="col-md-12 reset-padding" style="margin: 10px 0">
                  <div class="col-md-4 display-li-b reset-padding">
                    <span class="seat-count-text"> 선택 좌석 </span>
                  </div>
                  <div class="col-md-8 display-li-b reset-padding">
                    <span
                      class="seat-count-text"
                      v-for="(seat, index) in selected"
                      v-bind:key="index"
                    >
                      {{ seat }}{{ index + 1 < selected.length ? ", " : "" }}
                    </span>
                  </div>
                </div>
                <!-- 선택한 좌석 ex) A01,A02 끝 -->
                <!-- 성인 결제 금액 표시 시작 -->
                <div class="col-md-12 seat-count-text reset-padding">
                  <div
                    style="float: left"
                    class="col-md-4 display-li-b reset-padding"
                  >
                    성인
                  </div>
                  <div
                    style="float: right; text-align: right"
                    class="col-md-4 display-li-b reset-padding"
                  >
                    {{ adultcount * 100 }} 원
                  </div>
                  <div
                    style="float: right; text-align: right"
                    class="col-md-4 display-li-b reset-padding"
                  >
                    {{ adultcount }}
                  </div>
                </div>
                <!-- 성인 결제 금액 표시 끝 -->
                <!-- 청소년 결제 금액 표시 시작 -->
                <div class="col-md-12 seat-count-text reset-padding">
                  <div
                    style="float: left"
                    class="col-md-4 display-li-b reset-padding"
                  >
                    청소년
                  </div>
                  <div
                    style="float: right; text-align: right"
                    class="col-md-4 display-li-b reset-padding"
                  >
                    {{ teencount * 100 }} 원
                  </div>
                  <div
                    style="float: right; text-align: right"
                    class="col-md-4 display-li-b reset-padding"
                  >
                    {{ teencount }}
                  </div>
                </div>
                <!-- 청소년 결제 금액 표시 끝 -->
                <!-- 토탈 금액 표시 시작 -->
                <div
                  class="col-md-12 reset-padding seat-count-text"
                  style="
                    color: #dd003f;
                    border-top: 1px solid #dd003f;
                    padding-top: 5px;
                    margin-top: 10px;
                  "
                >
                  <span style="float: left"> 결제 금액 </span>
                  <span style="float: right"> {{ totalpay }} 원 </span>
                </div>
                <!-- 토탈 금액 표시 끝 -->
                <!-- 결제 버튼 시작 -->
                <!-- plusSeat() 이거는 결제가 끝나고 날라가면 됨 -->
                <div class="col-md-12 reset-padding">
                  <button
                    class="col-md-12 reset-padding paybtn-black"
                    v-show="!paybtn"
                    disabled
                  >
                    결제하기
                  </button>
                  <button
                    class="col-md-12 reset-padding paybtn-white"
                    v-show="paybtn"
                    @click="onPayment()"
                  >
                    결제하기
                  </button>
                </div>
                <!-- 결제 버튼 끝 -->
              </div>
              <!-- 포스터 및 관람객인원 선택 끝 -->
              <!-- 좌석 및 영화관, 날짜, 시간 선택 시작 -->
              <div
                class="col-md-8 reset-padding"
                style="padding-left: 20px; color: white"
              >
                <!-- 영화 제목 -->
                <div class="col-md-12 reset-padding">
                  <p style="font-size: 38px; font-weight: bold">
                    {{ data1.movienm }}
                  </p>
                </div>
                <!-- 영화관 및 상영시간 시작 -->
                <div class="col-md-12 reset-padding">
                  <div class="col-md-6 reset-padding">
                    <span>{{ data1.watchgradenm }}</span>
                    <img
                      class="timeimg"
                      src="@/assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
                      alt=""
                    />
                    <span style="margin-left: 10px">{{ data1.showtm }}분</span>
                  </div>
                  <div class="col-md-6 reset-padding">
                    <p class="title-text">영화관</p>
                    <button
                      @click="cinema('centum')"
                      v-show="centum"
                      class="cinema-btn"
                    >
                      <h5 style="padding: 9px">센텀시티</h5>
                    </button>
                    <button v-show="!centum" class="cinema-btn">
                      <h5 class="selected-cinema-btn">센텀시티</h5>
                    </button>
                    <button
                      @click="cinema('seomyeon')"
                      v-show="seomyeon"
                      class="cinema-btn"
                    >
                      <h5 style="padding: 9px">서면</h5>
                    </button>
                    <button v-show="!seomyeon" class="cinema-btn">
                      <h5 class="selected-cinema-btn">서면</h5>
                    </button>
                    <button
                      @click="cinema('busan')"
                      v-show="busan"
                      class="cinema-btn"
                    >
                      <h5 style="padding: 9px">부산대</h5>
                    </button>
                    <button v-show="!busan" class="cinema-btn">
                      <h5 class="selected-cinema-btn">부산대</h5>
                    </button>
                  </div>
                </div>
                <!-- 영화관 및 상영시간 끝 -->
                <!-- 날짜, 시간 버튼 시작 -->
                <div class="col-md-12 reset-padding">
                  <!-- 날짜 버튼 시작 -->
                  <div
                    class="col-md-6 reset-padding"
                    style="padding-right: 20px"
                  >
                    <p class="title-text">
                      {{ yy }}년 {{ mm }}월 {{ dd }}일 (오늘)
                    </p>
                    <button v-show="day1" @click="week('day1')" class="day-btn">
                      <p style="margin-bottom: 10px">오늘</p>
                      <h4 class="day-h4">{{ dd }}</h4>
                    </button>
                    <button v-show="!day1" class="day-btn2">
                      <p style="margin-bottom: 10px">오늘</p>
                      <h4 class="day-h4-bg">{{ dd }}</h4>
                    </button>
                    <!-- 내일 -->
                    <button v-show="day2" @click="week('day2')" class="day-btn">
                      <p style="margin-bottom: 10px">내일</p>
                      <h4 class="day-h4">{{ dd + 1 }}</h4>
                    </button>
                    <button v-show="!day2" class="day-btn2">
                      <p style="margin-bottom: 10px">내일</p>
                      <h4 class="day-h4-bg">{{ dd + 1 }}</h4>
                    </button>
                    <!-- 내일 -->
                    <!-- 모레 TODO: dd + N 을 했을때 문제점 달이 바뀔때 1일이 되는게 아니라 그달의 마지막날 +N이 됨 -->
                    <!-- Day.js 를 사용해서 고칠순 있음 01/14 -->
                    <button v-show="day3" @click="week('day3')" class="day-btn">
                      <p style="margin-bottom: 10px">{{ 요일[순서[2]] }}</p>
                      <h4 class="day-h4">{{ dd + 2 }}</h4>
                    </button>
                    <button v-show="!day3" class="day-btn2">
                      <p style="margin-bottom: 10px">{{ 요일[순서[2]] }}</p>
                      <h4 class="day-h4-bg">{{ dd + 2 }}</h4>
                    </button>
                    <!-- 모레 -->

                    <!-- 글피 -->
                    <button v-show="day4" @click="week('day4')" class="day-btn">
                      <p style="margin-bottom: 10px">{{ 요일[순서[3]] }}</p>
                      <h4 class="day-h4">{{ dd + 3 }}</h4>
                    </button>
                    <button v-show="!day4" class="day-btn2">
                      <p style="margin-bottom: 10px">{{ 요일[순서[3]] }}</p>
                      <h4 class="day-h4-bg">{{ dd + 3 }}</h4>
                    </button>
                    <!-- 글피 -->
                    <!-- 그글피 -->
                    <button v-show="day5" @click="week('day5')" class="day-btn">
                      <p style="margin-bottom: 10px">{{ 요일[순서[4]] }}</p>
                      <h4 class="day-h4">{{ dd + 4 }}</h4>
                    </button>
                    <button v-show="!day5" class="day-btn2">
                      <p style="margin-bottom: 10px">{{ 요일[순서[4]] }}</p>
                      <h4 class="day-h4-bg">{{ dd + 4 }}</h4>
                    </button>
                    <!-- 그글피 -->
                  </div>
                  <!-- 닐짜 버튼 끝 -->
                  <!-- 시간 버튼 시작 -->
                  <div class="col-md-6 reset-padding">
                    <p class="title-text">상영시간</p>
                    <!-- 시간은 아직 -->
                  </div>
                  <!-- 시간 버튼 끝 -->
                </div>
                <!-- 날짜, 시간 버튼 끝 -->
                <!-- 좌석 선택전 모달창 -->
                <div v-show="modal" style="position: relative">
                  <div class="seat-modal">
                    <div style="margin-bottom: 50px; width: 100%"></div>
                    <!-- 위 공백 처리 -->
                    <span v-show="modaltime" style="font-size: 24px"
                      >시간을 선택해 주세요</span
                    >
                    <span v-show="modalpeople" style="font-size: 24px"
                      >관람인원을 선택해 주세요</span
                    >
                  </div>
                </div>
                <!-- 좌석 선택전 모달창 -->
                <!-- 스크린 이미지 , 좌석 시작 -->
                <div class="col-md-12 reset-padding">
                  <!-- 스크린 이미지 시작 -->
                  <img
                    style="height: 30px"
                    class="col-md-12 reset-padding"
                    src="../../assets/images_kim/Views/ModalView/SCREEN.jpg"
                    alt=""
                  />
                  <p style="text-align: center">
                    S &nbsp;&nbsp;&nbsp; C &nbsp;&nbsp;&nbsp; R
                    &nbsp;&nbsp;&nbsp; E &nbsp;&nbsp;&nbsp; E &nbsp;&nbsp;&nbsp;
                    N
                  </p>
                  <!-- 스크린 이미지 끝 -->
                  <!-- 좌석 시작 -->
                  <!-- FIXME: 선택한 좌석 이벤트 버스로 SeatView로 보내면됨. 인텔리제이 끝나서 백엔드 실행할 수 없음 -->
                  <MoveSeat />

                  <!-- 좌석 끝 -->
                  <!-- 좌석 type 이미지 시작 -->
                  <div style="text-align: center; padding-top: 32px">
                    <span style="margin: 9px">
                      <img
                        class="seat-type"
                        src="../../assets/images_kim/Views/ModalView/seat-img1.jpg"
                        alt=""
                      />
                      선택 가능
                    </span>
                    <span style="margin: 9px">
                      <img
                        class="seat-type"
                        src="../../assets/images_kim/Views/ModalView/seat-img2.jpg"
                        alt=""
                      />
                      선택 좌석
                    </span>
                    <span style="margin: 9">
                      <img
                        class="seat-type"
                        src="../../assets/images_kim/Views/ModalView/seat-img3.jpg"
                        alt=""
                      />
                      예매 완료
                    </span>
                  </div>
                  <!-- 좌석 type 이미지 끝 -->
                </div>
                <!-- 스크린 이미지 , 좌석 끝 -->
              </div>
              <!-- 좌석 및 영화관, 날짜, 시간 선택 끝 -->
            </div>
            <!-- 결제 후 페이지 시작 -->
            <div v-show="payment">
              <div class="col-md-8" style="height: 600px">
                <div class="col-md-5" style="float: left; margin-top: 3%">
                  <img style="height: 500px" :src="data1.posterurln" alt="" />
                </div>
                <div
                  class="col-md-7"
                  style="float: right; margin-top: 8%; color: white"
                >
                  <span style="font-size: 24px; font-weight: bold">
                    {{ data1.movienm }}
                  </span>
                  <span style="font-size: 24px; font-weight: bold">
                    (2022)
                  </span>
                  <br />
                  <p style="margin: 10px 0 0 0">감독 : {{ data1.directors }}</p>
                  <p style="margin: 0">상영시간 : {{ data1.showtm }} 분</p>
                  <div
                    style="border-bottom: 1px solid #1d1e2c; margin-top: 10px"
                  ></div>
                  <p style="margin: 20px 0 0 20px">
                    예매번호 : {{ data1.showtm }} 종학이형이 넘겨줘야됨
                  </p>
                  <p style="margin: 0 0 0 20px">
                    상영날짜 : {{ this.yy }}년 {{ this.mm }}월
                    {{ ticketinfo.selectedday }}일
                  </p>
                  <p style="margin: 0 0 0 20px">
                    관람극장 : {{ paymentcinema }}
                  </p>
                  <span
                    style="margin-right: 5px; margin-left: 20px; color: #abb7c4"
                  >
                    관람좌석 :
                  </span>
                  <span v-for="(seat, index) in selected" v-bind:key="index">
                    {{ seat
                    }}{{ index + 1 < selected.length ? ", " : "" }}</span
                  >
                  <div
                    style="border-bottom: 1px solid #1d1e2c; margin-top: 20px"
                  ></div>
                  <p
                    style="
                      margin-top: 20px;
                      margin-bottom: 20px;
                      margin-left: 20px;
                    "
                  >
                    결제금액 : {{ totalpay }} 원
                  </p>
                  <div style="margin-top: 80px; margin-left: 30%">
                    <router-link to="/mypage">
                      <button
                        style="
                          width: 150px;
                          height: 55px;
                          background-color: #dd003f;
                          color: white;
                          border: 0;
                          border-radius: 8px;
                          margin-left: 20px;
                        "
                      >
                        마이페이지
                      </button>
                    </router-link>
                  </div>
                </div>
              </div>
              <div
                class="col-md-4"
                style="height: 580px; text-align: center; position: relative"
              >
                <img
                  style="margin: 0; width: 100%"
                  src="@/assets/images_kim/Views/ModalView/Ticket.png"
                  alt=""
                />
                <div
                  style="
                    position: absolute;
                    top: 15px;
                    left: 40px;
                    width: 70%;
                    text-align: left;
                  "
                >
                  <span style="font-size: 18px; font-weight: bold">{{
                    data1.movienm
                  }}</span>
                  <p
                    style="
                      margin-bottom: 0;
                      margin-top: -5px;
                      font-weight: bold;
                    "
                  >
                    2D
                  </p>
                </div>
                <div
                  style="
                    position: absolute;
                    top: 95px;
                    left: 40px;
                    color: black;
                  "
                >
                  <h6>
                    <span style="font-size: 16px; color: blueviolet">DS</span>
                    CINEMA
                    <span style="font-size: 16px; color: red">{{
                      paymentcinema
                    }}</span>
                  </h6>
                </div>
                <div
                  style="
                    position: absolute;
                    top: 140px;
                    left: 40px;
                    color: black;
                    font-weight: bold;
                  "
                >
                  {{ mm }}/{{ ticketinfo.selectedday }}
                </div>
                <div
                  style="
                    position: absolute;
                    top: 160px;
                    left: 40px;
                    color: black;
                  "
                >
                  <span style="font-size: 30px; font-weight: bold">
                    {{ moviestarttime }}
                  </span>
                  ~
                  <span>{{ movieendtime }}</span>
                </div>
                <div
                  style="
                    position: absolute;
                    top: 150px;
                    left: 250px;
                    color: black;
                    width: 80px;
                  "
                >
                  <img
                    style="margin-top: 0"
                    src="@/assets/images_kim/Views/ModalView/QRcode.png"
                    alt=""
                  />
                </div>
                <div
                  v-show="adult"
                  style="position: absolute; top: 220px; left: 40px"
                >
                  <span>성인</span>
                  <span style="font-size: 16px; font-weight: bold">{{
                    adultcount
                  }}</span>
                </div>
                <div
                  v-show="teen"
                  style="position: absolute; top: 220px; left: 40px"
                >
                  <span>청소년 </span>
                  <span style="font-size: 16px; font-weight: bold">{{
                    teencount
                  }}</span>
                </div>
                <div
                  v-show="adultteen"
                  style="position: absolute; top: 220px; left: 40px"
                >
                  <span>성인</span>
                  <span style="font-size: 16px; font-weight: bold">{{
                    adultcount
                  }}</span
                  ><span>,청소년 </span>
                  <span style="font-size: 16px; font-weight: bold">{{
                    teencount
                  }}</span>
                </div>
                <div
                  style="
                    position: absolute;
                    top: 250px;
                    left: 40px;
                    width: 170px;
                    height: 30px;
                    border-radius: 10px;
                    background-color: skyblue;
                    line-height: 30px;
                  "
                >
                  <span
                    style=""
                    v-for="(seat, index) in selected"
                    v-bind:key="index"
                    >{{ seat
                    }}{{ index + 1 < selected.length ? ", " : "" }}</span
                  >
                </div>
                <div
                  style="
                    color: gray;
                    position: absolute;
                    top: 290px;
                    left: 40px;
                    font-size: 12px;
                  "
                >
                  <span>· 극장 이용 시 마스크 착용은 필수입니다.</span>
                </div>
                <div
                  style="
                    color: gray;
                    position: absolute;
                    top: 305px;
                    left: 48px;
                    font-size: 12px;
                  "
                >
                  <span>(미착용 시 입장 제한)</span>
                </div>
                <div
                  style="
                    color: gray;
                    position: absolute;
                    top: 320px;
                    left: 48px;
                    font-size: 12px;
                  "
                >
                  <span>입장 지연에 따른 관람 불편을 최소화하기 위해</span>
                </div>
                <div
                  style="
                    color: gray;
                    position: absolute;
                    top: 335px;
                    left: 48px;
                    font-size: 12px;
                  "
                >
                  <span>본 영화는 10분 후 상영이 시작됩니다.</span>
                </div>
                <div
                  style="
                    color: gray;
                    position: absolute;
                    top: 355px;
                    left: 40px;
                    font-size: 12px;
                  "
                >
                  <span>· 영화 상영시작시간 15분 전까지 취소가 가능하며</span>
                </div>
                <div
                  style="
                    color: gray;
                    position: absolute;
                    top: 370px;
                    left: 48px;
                    font-size: 12px;
                  "
                >
                  <span>캡쳐화면은 입장이 제한될 수 있습니다.</span>
                </div>
                <div
                  style="
                    position: absolute;
                    top: 450px;
                    left: 48px;
                    font-weight: bold;
                    height: 10px;
                    z-index: 2;
                  "
                >
                  역시, 영화에는 팝콘이지?!
                </div>
                <div
                  style="
                    position: absolute;
                    top: 460px;
                    left: 48px;
                    font-weight: bold;
                    height: 10px;
                    background-color: yellow;
                    width: 45%;
                    z-index: 1;
                  "
                ></div>
                <div
                  style="
                    position: absolute;
                    top: 445px;
                    left: 0px;
                    font-weight: bold;
                    width: 90%;
                  "
                >
                  <img
                    style="width: 30%; margin: 0; float: right"
                    src="@/assets/images_kim/Views/ModalView/free-icon-popcorn-864781.png"
                    alt=""
                  />
                </div>
                <div
                  style="
                    position: absolute;
                    top: 500px;
                    left: 40px;
                    width: 50%;
                    height: 8%;
                  "
                >
                  <button
                    @click="popcorn()"
                    style="
                      width: 100%;
                      height: 100%;
                      background-color: #dd003f;
                      border-radius: 5px;
                      color: white;
                      border: 0;
                    "
                  >
                    구매하기
                  </button>
                </div>
              </div>
            </div>
            <!-- 결제 후 페이지 끝 -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import BookingService from "@/services/BookingService";
import custom from "@/assets/js/custom";
import Reservation from "@/model/Reservation";
import ReservationDataService from "@/services/ReservationDataService";
import ScheduleDataService from "@/services/ScheduleDataService";
import SeatDataService from "@/services/SeatDataService";
import Seat from "@/model/Seat.js";
import userService from "@/services/user.service";
import MoveSeat from "./MoveSeat.vue";
// import SeatAll from "@/model/SeatAll";

export default {
  props: ["movieProps2"],
  components: {
    MoveSeat,
  },
  created() {
    custom();
    this.date();
    this.vshowSeat();
  },
  mounted() {
    // window.scrollTo({top: 2250, behavior: "smooth"});  // 맥에서 높이 적당함
    window.scrollTo({ top: 2450, behavior: "smooth" }); // 윈도우에서 높이 적당함

    this.selectedday = this.dateY;
    this.selectedcinema = "centum";
    this.paymentcinema = "센텀시티";
    this.moviecd = this.data1.moviecd;
    this.ticketinfo.selectedday = this.dd;
    this.getUser();
    this.getFindAllByMoviecdAndLocationAndStartday();
  },
  data() {
    return {
      data1: this.movieProps2, //영화데이터 받아오기
      reservation: new Reservation(), // 모델 받아옴 // 나중에 정보를 담아서 백엔드에 보낼꺼임
      Seatpage: true, // 좌석페이지 v-show
      modal: true, // 좌석선택하기 전에 좌석을 클릭못하게 막는 모달창
      payment: false, // 결제 후에 보여주는 페이지 v-show

      paybtn: false, // 결제하기 버튼
      totalpay: 0, // 마지막 결제 금액
      adultcount: 0, //  성인 인원수 카운트
      teencount: 0, //  청소년 인원수 카운트

      centum: false, //  영화관 버튼 누르면 색 변경되는 v-show
      seomyeon: true, // 영화관 버튼 누르면 색 변경되는 v-show
      busan: true, //    영화관 버튼 누르면 색 변경되는 v-show

      modalpeople: false, // 인원 선택시 모달창 없어짐
      modaltime: true, // 시간선택시 모달창에서 글자 사라짐

      moviecd: "", // moviecd 코드를 받아와서 저장하는 곳
      selectedcinema: "", // 화면이 생길때 센텀시티를 넣고 조회 하기위해 만듬
      selectedday: "", // 날짜 위랑 동일

      adult: false, // 성인만 예매한 경우
      teen: false, // 청소년만 예매한 경우
      adultteen: false, // 성인,청소년 둘다 있을 경우

      day1: false, // 첫화면에 들어오면 day1 버튼이 선택 된것 처럼 보이게 함
      day2: true, // 날짜가 선택되면 false가 되면서 색깔이 바뀜
      day3: true, // 날짜가 선택되면 false가 되면서 색깔이 바뀜
      day4: true, // 날짜가 선택되면 false가 되면서 색깔이 바뀜
      day5: true, // 날짜가 선택되면 false가 되면서 색깔이 바뀜

      요일: [
        "일요일",
        "월요일",
        "화요일",
        "수요일",
        "목요일",
        "금요일",
        "토요일",
      ],
      dateY: "",
      yy: "",
      mm: "",
      dd: "",
      day: 0,
      순서: [], // 요일을 순서대로 나오게 하는 거

      Seat: new Seat(), // 모름
      seatdataAll: [], // 이전에 예매한 좌석과 비교할때 쓰임
      seatAll: [
        // 고정 좌석
        new Seat(null, "A1", "N", 1),
        new Seat(null, "A2", "N", 1),
        new Seat(null, "A3", "N", 1),
        new Seat(null, "A4", "N", 1),
        new Seat(null, "A5", "N", 1),
        new Seat(null, "A6", "N", 1),
        new Seat(null, "A7", "N", 1),
        new Seat(null, "A8", "N", 1),
        new Seat(null, "A9", "N", 1),
        new Seat(null, "A10", "N", 1),
        new Seat(null, "B1", "N", 1),
        new Seat(null, "B2", "N", 1),
        new Seat(null, "B3", "N", 1),
        new Seat(null, "B4", "N", 1),
        new Seat(null, "B5", "N", 1),
        new Seat(null, "B6", "N", 1),
        new Seat(null, "B7", "N", 1),
        new Seat(null, "B8", "N", 1),
        new Seat(null, "B9", "N", 1),
        new Seat(null, "B10", "N", 1),
        new Seat(null, "C1", "N", 1),
        new Seat(null, "C2", "N", 1),
        new Seat(null, "C3", "N", 1),
        new Seat(null, "C4", "N", 1),
        new Seat(null, "C5", "N", 1),
        new Seat(null, "C6", "N", 1),
        new Seat(null, "C7", "N", 1),
        new Seat(null, "C8", "N", 1),
        new Seat(null, "C9", "N", 1),
        new Seat(null, "C10", "N", 1),
        new Seat(null, "D1", "N", 1),
        new Seat(null, "D2", "N", 1),
        new Seat(null, "D3", "N", 1),
        new Seat(null, "D4", "N", 1),
        new Seat(null, "D5", "N", 1),
        new Seat(null, "D6", "N", 1),
        new Seat(null, "D7", "N", 1),
        new Seat(null, "D8", "N", 1),
        new Seat(null, "D9", "N", 1),
        new Seat(null, "D10", "N", 1),
        new Seat(null, "E1", "N", 1),
        new Seat(null, "E2", "N", 1),
        new Seat(null, "E3", "N", 1),
        new Seat(null, "E4", "N", 1),
        new Seat(null, "E5", "N", 1),
        new Seat(null, "E6", "N", 1),
        new Seat(null, "E7", "N", 1),
        new Seat(null, "E8", "N", 1),
        new Seat(null, "E9", "N", 1),
        new Seat(null, "E10", "N", 1),
        new Seat(null, "F1", "N", 1),
        new Seat(null, "F2", "N", 1),
        new Seat(null, "F3", "N", 1),
        new Seat(null, "F4", "N", 1),
        new Seat(null, "F5", "N", 1),
        new Seat(null, "F6", "N", 1),
        new Seat(null, "F7", "N", 1),
        new Seat(null, "F8", "N", 1),
        new Seat(null, "F9", "N", 1),
        new Seat(null, "F10", "N", 1),
      ],
      currentUser: this.$store.state.auth.user.username,

      Scheduldata: {
        // 선택 정보를 모델에 담아서 보냄
        moviecd: "",
        movienm: "",
        showtm: "",
        tid: "",
        starttime: "",
        endtime: "",
      },

      seattable: [], // 시간을 선택하면 그날 영화관,날짜,상영시간을 클릭하면 데이터가 여기에 담김
      schedule2: [], // 무비코드 + 영화관 + 날짜 = 그날에 해당되는 시간을 받아 옴
      seattest2: [], // Scon로 검색한 결과가 나옴  []

      selected: [], // 선택된 좌석 담는 배열
      ticketinfo: [], // 티켓정보를 담는 배열
      seattest60: [], // 좌석 배열

      paymentcinema: "", // 결제후 영화관 정보
      moviestarttime: "", // 결제후 영화관 정보
      movieendtime: "", // 결제후 영화관 정보

      selectPerson: 0, // 시간을 선택해야 인원을 선택할 수 있게 만듬

      // 아리누나꺼 인듯
      schedule_1: null,
      schedule_2: null,
      schedule_3: null,
      schedule_4: null,
      firstCheck: false,
      secondCheck: false,
      thirdCheck: false,
      fourthCheck: false,
      test1002: 0,
    };
  },
  methods: {
    adultmins() {
      if (this.selectPerson == 0) {
        alert("상영시간을 선택하세요.");
      } else {
        if (this.adultcount == 0) {
          alert("인원선택은 최소 1명 입니다.");
        } else if (this.teencount + this.adultcount == this.selected.length) {
          alert("좌석을 취소해 주세요.");
        } else {
          this.adultcount--;
          this.totalpay = this.totalpay - 100;
          if (
            this.teencount + this.adultcount == this.selected.length &&
            this.selected.length != 0
          ) {
            this.paybtn = false;
          }
        }
      }
    },
    adultplus() {
      if (this.adultcount != 0) {
        // 스케쥴 데이터가 없어서 임시로 변경함 원래는 this.selectPerson == 0 이게 들어가야 함
        alert("상영시간을 선택하세요.");
      } else {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.");
        } else {
          this.modal = false;
          this.adultcount++;
          this.totalpay = this.totalpay + 100;
        }
      }
    },
    teenmins() {
      if (this.selectPerson == 0) {
        alert("상영시간을 선택하세요.");
      } else {
        if (this.teencount == 0) {
          alert("인원선택은 최소 1명 입니다.");
        } else if (this.teencount + this.adultcount == this.selected.length) {
          alert("좌석을 취소해 주세요.");
        } else {
          this.teencount--;
          this.totalpay = this.totalpay - 100;
          if (
            this.teencount + this.adultcount == this.selected.length &&
            this.selected.length != 0
          ) {
            this.paybtn = false;
          }
        }
      }
    },
    teenplus() {
      if (this.selectPerson == 0) {
        alert("상영시간을 선택하세요.");
      } else {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.");
        } else {
          this.modal = false;
          this.teencount++;
          this.totalpay = this.totalpay + 100;
        }
      }
    },
    schedule_null() {
      this.schedule_1 = null;
      this.schedule_2 = null;
      this.schedule_3 = null;
      this.schedule_4 = null;
    },
    week(value) {
      // 날짜 선택함수
      this.resetinfor();
      this.selectPerson = 0; // 시간이 선택되어야 인원을 클릭할 수 있게 만듬 그래야 화면이 이상하게 안나옴
      this.modaltime = true;
      let temp;
      if (value == "day1") {
        this.day1 = false;
        this.day2 = true;
        this.day3 = true;
        this.day4 = true;
        this.day5 = true;
        temp = Number(this.dd);
      } else if (value == "day2") {
        this.day1 = true;
        this.day2 = false;
        this.day3 = true;
        this.day4 = true;
        this.day5 = true;
        temp = Number(this.dd) + 1;
      } else if (value == "day3") {
        this.day1 = true;
        this.day2 = true;
        this.day3 = false;
        this.day4 = true;
        this.day5 = true;
        temp = Number(this.dd) + 2;
      } else if (value == "day4") {
        this.day1 = true;
        this.day2 = true;
        this.day3 = true;
        this.day4 = false;
        this.day5 = true;
        temp = Number(this.dd) + 3;
      } else if (value == "day5") {
        this.day1 = true;
        this.day2 = true;
        this.day3 = true; // 버튼 색 변경
        this.day4 = true; // 버튼 색 변경
        this.day5 = false; // 버튼 색 변경
        temp = Number(this.dd) + 4;
      }
      this.schedule_null();
      this.ticketinfo.selectedday = temp;
      this.selectedday = String(this.yy) + String(this.mm) + String(temp);
      this.getFindAllByMoviecdAndLocationAndStartday();
      console.log(this.ticketinfo.selectedday);
    },
    date() {
      var date = new Date();
      this.yy = date.getFullYear(); // 년도
      this.mm = date.getMonth() + 1; // 월 , 달
      if (this.mm < 10) {
        this.mm = "0" + this.mm;
      }
      this.dd = date.getDate(); // 일수
      this.day = date.getDay(); // 요일

      this.dateY = String(this.yy) + String(this.mm) + String(this.dd);
      let i = this.day;
      for (i; i <= 6; i++) {
        this.순서 += i;
      }
      let j = 0;
      for (j; j < this.day; j++) {
        this.순서 += j;
      }
    },
    onPayment() {
      // 아임포트 결제창
      /* 1. 가맹점 식별하기 */
      const { IMP } = window;
      IMP.init("imp03367585");

      /* 2. 결제 데이터 정의하기 */
      const data = {
        pg: "html5_inicis", // PG사
        pay_method: "card", // 결제수단
        merchant_uid: `mid_${new Date().getTime()}`, // 주문번호
        amount: 100, // 결제금액
        name: "아임포트 결제 데이터 분석", // 주문명
        buyer_name: "홍길동", // 구매자 이름
        buyer_tel: "01012341234", // 구매자 전화번호
        buyer_email: "example@example", // 구매자 이메일
        buyer_addr: "신사동 661-16", // 구매자 주소
        buyer_postcode: "06018", // 구매자 우편번호
      };

      /* 4. 결제 창 호출하기 */
      IMP.request_pay(data, this.callback);
    },
    callback(response) {
      /* 3. 콜백 함수 정의하기 */
      const { success, merchant_uid, error_msg } = response;

      if (success) {
        alert("결제 성공");
        console.log(merchant_uid);
        this.payment = true;
        this.modal = false;
        this.Seatpage = false;
        this.plusSeat(), this.addReservation();
        this.seatcount();
      } else {
        alert(`결제 실패: ${error_msg}`);
      }
    },
    addReservation() {
      // 유저 정보를 DB에 보내는 함수 // 결제 끝났을때 사용
      let seatname = "";
      for (let i = 0; i < this.selected.length; i++) {
        seatname += this.selected[i];
        if (i + 1 < this.selected.length) {
          seatname += ", ";
        }
      }
      this.reservation.username = this.$store.state.auth.user.username;
      this.reservation.name = this.CurrentUser.name;
      this.reservation.moviecd = this.data1.moviecd;
      this.reservation.movienm = this.data1.movienm;
      this.reservation.rcount = this.adultcount + this.teencount;
      this.reservation.price = this.totalpay;
      this.reservation.paiddate = null;
      this.reservation.rno = null;
      this.reservation.startday = this.selectedday; // 선택한 날짜
      this.reservation.location = this.selectedcinema;
      this.reservation.seat = seatname;
      this.reservation.starttime = this.moviestarttime;
      this.reservation.endtime = this.movieendtime;

      this.reservation.scno = this.seattable[0].scno;
      console.log("유저데이터", this.$store.state.auth.user);
      ReservationDataService.create(
        this.$store.state.auth.user.username,
        this.reservation
      )
        .then(response => {
          console.log(response.data);
        })
        .catch(error => {
          console.log(error);
        });
    },
    plusSeat() {
      // 결제끝났을때 예매한 좌석 정보 생성
      for (let i = 0; i < this.selected.length; i++) {
        let data = new Seat(
          null,
          this.selected[i],
          "Y",
          this.seattable[0].scno
        );
        SeatDataService.create(data)
          .then(response => {
            console.log("********");
            console.log(response.data);
            console.log("********");
          })
          .catch(error => {
            console.log(error);
          });
      }
    },
    getUser() {
      userService
        .getUserUsername(this.$store.state.auth.user.username)
        .then(response => {
          this.CurrentUser = response.data;
          console.log(this.CurrentUser);
        })
        .catch(err => console.log(err));
    },
    // 팝콘 구매
    popcorn() {
      alert("현재 스토어서비스는 준비중입니다.");
    },
    // 스케쥴
    Schedulecreate() {
      this.Scheduldata.moviecd = this.data1.moviecd;
      this.Scheduldata.movienm = this.data1.movienm;
      this.Scheduldata.showtm = this.data1.showtm;
      this.Scheduldata.tid = this.Theater;
      this.Scheduldata.starttime = this.moviestarttime;
      this.Scheduldata.endtime = this.movieendtime;

      BookingService.createSchedule(this.Scheduldata)
        .then(response => {
          console.log(response.data);
        })
        .catch(error => {
          console.log(error);
        });
    },
    // 선택한 좌석 취소를 하면 다시 1로 변경해서 선택 가능한 좌석으로 만듬
    Seatupdate(value) {
      let tempVal = value.substr(0, 1); // 제일 앞에 있는 알파벳만 짤려서 나옴
      let tempVal2 = value.substring(1, value.length); // 알파벳 뒤의 숫자만 난옴
      let tempC;
      for (let i = 0; i < 1; i++) {
        //
        if (tempVal == "A") {
          this.seattest60[tempVal2 - 1] = 1;
        } else if (tempVal == "B") {
          tempC = Number(tempVal2) + 10;
          this.seattest60[tempC - 1] = 1;
        } else if (tempVal == "C") {
          tempC = Number(tempVal2) + 20;
          this.seattest60[tempC - 1] = 1;
        } else if (tempVal == "D") {
          tempC = Number(tempVal2) + 30;
          this.seattest60[tempC - 1] = 1;
        } else if (tempVal == "E") {
          tempC = Number(tempVal2) + 40;
          this.seattest60[tempC - 1] = 1;
        } else if (tempVal == "F") {
          tempC = Number(tempVal2) + 50;
          this.seattest60[tempC - 1] = 1;
        }
      }
      this.paybtn = false;
    },
    // 클릭을 하면 selected 배열에서 삭제를 함
    deleteseat(value) {
      for (let i = 0; i < 5; i++) {
        if (this.selected[i] == value) {
          // F10 이면
          this.selected.splice(i, 1); // 클릭을 하면 selected 배열에서 삭제를 함
          this.Seatupdate(value); // SeatA() 함수 실행
          break;
        }
      }
    },
    // 클릭을 하면 selected 배열에 담음
    addseat(value) {
      if (this.adultcount + this.teencount == 0) {
        alert("인원을 선택해 주십시오.");
      } else if (this.adultcount + this.teencount == this.selected.length) {
        alert("관람인원을 초과하셨습니다.");
      } else {
        this.selected.push(value); // value에 A14가 나온다고 치고 그럼
        let tempVal = value.substr(0, 1); // 이러면 제일 앞에 있는 알파벳만 짤려서 나옴
        console.log(tempVal);
        let tempVal2 = value.substring(1, value.length); // 뒤의 숫자만 짤려서 나옴 10
        console.log(tempVal2);
        let tempB;
        for (let i = 0; i < 1; i++) {
          // 알파벳이 무엇인지 알고 그걸 실행 시키면
          if (tempVal == "A") {
            this.seattest60[tempVal2 - 1] = 2;
          } else if (tempVal == "B") {
            tempB = Number(tempVal2) + 10;
            this.seattest60[tempB - 1] = 2;
          } else if (tempVal == "C") {
            tempB = Number(tempVal2) + 20;
            this.seattest60[tempB - 1] = 2;
          } else if (tempVal == "D") {
            tempB = Number(tempVal2) + 30;
            this.seattest60[tempB - 1] = 2;
          } else if (tempVal == "E") {
            tempB = Number(tempVal2) + 40;
            this.seattest60[tempB - 1] = 2;
          } else if (tempVal == "F") {
            tempB = Number(tempVal2) + 50;
            this.seattest60[tempB - 1] = 2;
          }
        }
        // console.log(tempVal2+10 -1);
        if (
          this.adultcount + this.teencount == this.selected.length &&
          this.adultcount + this.teencount != 0
        ) {
          this.paybtn = true;
        }
      }
    },
    // 티켓이미지 안에 들어갈 함수
    seatcount() {
      if (this.adultcount != 0 && this.teencount != 0) {
        // 성인과 청소년을 함께 예매한경우
        this.adultteen = true; // 성인과 청소년 글자가 true가 되고
      } else if (this.teencount == 0) {
        // 성인만 예매한경우 성인 글자만 true가 되고
        this.adult = true;
      } else {
        // 청소년만 예매한경우 청소년 글자만 true가 됨
        this.teen = true;
      }
    },
    // 선택된 시간값을 받음 ex) "12:00"
    selectedtime(value) {
      this.ticketinfo.tickettime = value; // 선택된 시간을 티켓 정보에 넣음
      this.selectPerson = 1; // 시간이 선택되어야 인원을 클릭할 수 있게 만듬 그래야 화면이 이상하게 안나옴
      this.modaltime = false;
      this.modalpeople = true;
      this.resetinfor();
      this.getfFndByMoviecdAndLocationAndStartdayAndStarttime(); // 시간을 선택하면 실행됨
    },
    getfFndByMoviecdAndLocationAndStartdayAndStarttime() {
      //  그날 스케쥴에 있는 scno를 비교하기 위해서 쓰임
      var moviecd2 = this.moviecd;
      var tempcinema = this.selectedcinema; //이건 영화관을 담는거
      var tempday = this.selectedday; //이건 날짜을 담는거
      var temptime = this.ticketinfo.tickettime;
      console.log(temptime);
      ScheduleDataService.getfFndByMoviecdAndLocationAndStartdayAndStarttime(
        moviecd2,
        tempcinema,
        tempday,
        temptime
      )
        .then(response => {
          this.seattable = response.data;
          this.moviestarttime = this.seattable[0].starttime;
          this.movieendtime = this.seattable[0].endtime;
          console.log(response.data); // scno가 나옴
          this.getSeatScno(this.seattable[0].scno);
        })
        .catch(error => {
          console.log(error);
        });
    },
    // 스케쥴번호에 해당하는 좌석 상태를 가져옴
    getSeatScno(scno) {
      SeatDataService.getScno(scno)
        .then(response => {
          var temp;
          this.seattest2 = [];
          temp = response.data;
          for (let i = 0; i < temp.length; i++) {
            this.seattest2.push(temp[i].seatposition);
          }

          // console.log(this.seattest2);
          this.SeatSet();
        })
        .catch(error => {
          console.log(error);
        });
    },
    // 데이터 베이스에서 자리가 있는지 확인
    SeatSet() {
      for (let k = 0; k < this.seatAll[k].seatposition.length; k++) {
        // 초기화
        this.seatdataAll[k] = "N";
      }
      for (let i = 0; i < this.seattest2.length; i++) {
        // 2번돔  Y가 들어옴 Y 는 좌석이 선택 된거임
        for (let j = 0; j < 60; j++) {
          if (this.seattest2[i] == this.seatAll[j].seatposition) {
            this.seatdataAll[j] = "Y";
          }
        }
      }
      // 이러면 좌석 데이터가 만들어짐 그럼 함수를 여기서 실행 시켜서 좌석에 뿌리면 됨
      console.log(this.seatdataAll);
      this.vshowSeat();
    },
    vshowSeat() {
      let j = 0;
      for (let i = 0; i < 60; i++) {
        if (this.seatdataAll[i] == "N") {
          // 자리가 있으면 true를 줌
          this.seattest60[j] = 1;
        } else {
          // 자리가 없으면 false
          this.seattest60[j] = 0;
        }
        j++;
      }
      console.log(this.seattest60);
    },

    cinema(value) {
      if (value == "centum") {
        this.paymentcinema = "센텀시티";
        this.centum = false;
        this.seomyeon = true;
        this.busan = true;
        this.Theater = 1;
      } else if (value == "seomyeon") {
        this.paymentcinema = "서면";
        this.centum = true;
        this.seomyeon = false;
        this.busan = true;
        this.Theater = 2;
      } else if (value == "busan") {
        this.paymentcinema = "부산대";
        this.centum = true;
        this.seomyeon = true;
        this.busan = false;
        this.Theater = 3;
      }
      this.modal = false;
      this.selectedday = String(this.yy) + String(this.mm) + String(this.dd); // 영화관을 클릭하면 오늘 날짜가 들어감
      this.selectPerson = 0;
      this.modaltime = true;
      this.resetinfor();
      this.selectedcinema = value; // 선택한 영화관이 들어감
      this.schedule_null();
      this.getFindAllByMoviecdAndLocationAndStartday();
      this.day1 = false; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day2 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day3 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day4 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day5 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      console.log(this.paymentcinema);

      // FIXME: 버튼 색상 초기화                    // 아리누나가 작성했봄
      var first = document.getElementById("first-div");
      var second = document.getElementById("second-div");
      var third = document.getElementById("third-div");
      var fourth = document.getElementById("fourth-div");

      this.firstCheck = false;
      this.secondCheck = false;
      this.thirdCheck = false;
      this.fourthCheck = false;
      first.style.backgroundColor = "#FFFFFF";
      second.style.backgroundColor = "#FFFFFF";
      third.style.backgroundColor = "#FFFFFF";
      fourth.style.backgroundColor = "#FFFFFF";
    },
    // FIXME: 상영시간별 버튼 색상 주기 함수 추가      // 아리누나가 만든듯
    coloredBtn() {
      var first = document.getElementById("first-div");
      var second = document.getElementById("second-div");
      var third = document.getElementById("third-div");
      var fourth = document.getElementById("fourth-div");

      first.onclick = function () {
        this.firstCheck = !this.firstCheck;
        if (this.firstCheck == true) {
          this.secondCheck = false;
          this.thirdCheck = false;
          this.fourthCheck = false;
          first.style.backgroundColor = "#FFFFFF";
          second.style.backgroundColor = "grey";
          third.style.backgroundColor = "grey";
          fourth.style.backgroundColor = "grey";
        } else {
          first.style.backgroundColor = "#FFFFFF";
          second.style.backgroundColor = "#FFFFFF";
          third.style.backgroundColor = "#FFFFFF";
          fourth.style.backgroundColor = "#FFFFFF";
        }
      };

      second.onclick = function () {
        this.secondCheck = !this.secondCheck;
        if (this.secondCheck == true) {
          this.firstCheck = false;
          this.thirdCheck = false;
          this.fourthCheck = false;
          first.style.backgroundColor = "grey";
          second.style.backgroundColor = "#FFFFFF";
          third.style.backgroundColor = "grey";
          fourth.style.backgroundColor = "grey";
        } else {
          first.style.backgroundColor = "#FFFFFF";
          second.style.backgroundColor = "#FFFFFF";
          third.style.backgroundColor = "#FFFFFF";
          fourth.style.backgroundColor = "#FFFFFF";
        }
      };

      third.onclick = function () {
        this.thirdCheck = !this.thirdCheck;
        if (this.thirdCheck == true) {
          this.firstCheck = false;
          this.secondCheck = false;
          this.fourthCheck = false;
          first.style.backgroundColor = "grey";
          second.style.backgroundColor = "grey";
          third.style.backgroundColor = "#FFFFFF";
          fourth.style.backgroundColor = "grey";
        } else {
          first.style.backgroundColor = "#FFFFFF";
          second.style.backgroundColor = "#FFFFFF";
          third.style.backgroundColor = "#FFFFFF";
          fourth.style.backgroundColor = "#FFFFFF";
        }
      };

      fourth.onclick = function () {
        this.fourthCheck = !this.fourthCheck;
        if (this.fourthCheck == true) {
          this.firstCheck = false;
          this.secondCheck = false;
          this.thirdCheck = false;
          first.style.backgroundColor = "grey";
          second.style.backgroundColor = "grey";
          third.style.backgroundColor = "grey";
          fourth.style.backgroundColor = "#FFFFFF";
        } else {
          first.style.backgroundColor = "#FFFFFF";
          second.style.backgroundColor = "#FFFFFF";
          third.style.backgroundColor = "#FFFFFF";
          fourth.style.backgroundColor = "#FFFFFF";
        }
      };
    },
    // 무비코드 + 영화관 + 날짜 = 그날에 해당되는 시간을 받아 옴
    getFindAllByMoviecdAndLocationAndStartday() {
      var moviecd2 = this.moviecd;
      var tempcinema = this.selectedcinema; //이건 영화관을 담는거
      var tempday = this.selectedday; //이건 날짜을 담는거

      console.log(moviecd2);
      console.log(tempcinema);
      console.log(tempday);

      ScheduleDataService.getFindAllByMoviecdAndLocationAndStartday(
        moviecd2,
        tempcinema,
        tempday
      )
        .then(response => {
          this.schedule2 = response.data;
          console.log("스케쥴이 있으면 나옴 : ", response.data); // 아리누나가 작성한듯

          if (this.schedule2[0] != null) {
            this.schedule_1 = this.schedule2[0];
          }
          if (this.schedule2[1] != null) {
            this.schedule_2 = this.schedule2[1];
          }
          if (this.schedule2[2] != null) {
            this.schedule_3 = this.schedule2[2];
          }
          if (this.schedule2[3] != null) {
            this.schedule_4 = this.schedule2[3];
          }
        })
        .catch(error => {
          console.log(error);
        });
    },
    resetinfor() {
      this.modal = true; // 이게 들어가야 인원수를 다시 클릭하라고 할 수 있음 그래야 좌석이 초기화 됨
      this.adultcount = 0; // 금액 초기화
      this.teencount = 0; // 금액 초기화
      this.totalpay = 0; // 금액 초기화
      this.paybtn = false;
      this.selected = [];
    },
  },
};
</script>

<style lang="scss" scoped>
@import "@/assets/css/style.css";

* {
  font-family: sans-serif;
}

.bg-black {
  background-color: black;
  position: relative;
}

.position-relative {
  position: relative;
}

.display-li-b {
  display: inline-block;
}

.mg-right10 {
  margin-right: 10px;
}

.reset-padding {
  padding: 0;
}

.seat-count-text {
  font-size: 20px;
  margin-right: 10px;
  color: white;
}

.paybtn-black {
  height: 60px;
  border: 1px solid #333;
  background-color: black;
  color: white;
  margin-top: 10px;
}

.paybtn-white {
  height: 60px;
  border: 1px solid #333;
  background-color: white;
  color: black;
  margin-top: 10px;
}
.timeimg {
  width: 30px;
  height: 30px;
  background-color: white;
  margin-left: 20px;
}

.title-text {
  color: gray;
  padding: 25px 0 5px 0;
  margin-bottom: 10px;
  font-size: 16px;
  font-weight: bold;
  color: white;
  border-bottom: 1px solid gray;
}
.cinema-btn {
  width: 30%;
  height: 10%;
  float: left;
  border: 0;
  background-color: black;
  margin-top: 5px;
}
.selected-cinema-btn {
  color: black;
  padding: 9px 9px 9px 9px;
  margin-left: 3px;
  background-color: white;
  border-radius: 9px;
}
.day-btn {
  width: 55px;
  height: 80px;
  float: left;
  border: 0;
  background-color: black;
  margin-right: 5px;
  margin-top: 5px;
}
.day-btn2 {
  width: 55px;
  border-radius: 20px;
  height: 80px;
  float: left;
  border: 0;
  background-color: #1d1e2c;
  margin-right: 5px;
  margin-top: 5px;
}

.day-h4 {
  padding: 9px 25px 9px 13px;
  margin-left: 3px;
}
.day-h4-bg {
  color: black;
  padding: 9px 25px 9px 13px;
  margin-left: 3px;
  background-color: white;
  border-radius: 18px;
}
.seat-modal {
  position: absolute;
  width: 100%;
  height: 400px;
  background-color: rgba(0, 0, 0, 0.6);
  // background-color: red;
  top: 300px;
  right: 0;
  z-index: 99;
  text-align: center;
}

.seat {
  position: relative;
}

.seat-p {
  width: 819px;
}

.seat-bg {
  background: #e8e8e8;
  width: 31px;
  height: 26px;
  text-align: center;
  overflow: hidden;
  color: #000;
  letter-spacing: -0.5px;
  box-sizing: border-box;
  border-radius: 7px 7px 2px 0px;
  position: absolute;
}

.seat-bg2 {
  background: #845bcb;
  width: 31px;
  height: 26px;
  text-align: center;
  overflow: hidden;
  color: #000;
  letter-spacing: -0.5px;
  box-sizing: border-box;
  border-radius: 7px 7px 2px 0px;
  position: absolute;
}

.seat-bg3 {
  background: #757575;
  width: 31px;
  height: 26px;
  text-align: center;
  overflow: hidden;

  color: #000;
  letter-spacing: -0.5px;
  box-sizing: border-box;
  border-radius: 7px 7px 2px 0px;
  position: absolute;
}

.seat-p {
  margin-bottom: 20px;
}

.font {
  color: white;
  position: relative;
  // left: -20px;
}

.font2 {
  color: white;
  position: relative;
  left: 90%;
}
.seat-type {
  width: 13px;
  height: 13px;
  margin-top: 0px;
  margin-bottom: 0px;
}
</style>
