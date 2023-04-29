<template>
  <div>
    <div
      class="page-single movie_list bg-black"
      style="background-color: black"
    >
      <div class="container">
        <div class="row">
          <div class="blog-detail-ct">
            <!-- 좌석예매 -->
            <div class="SeatBooking">
              <div class="col-md-4 reset-padding seat-count-text">
                <!-- 선택된 이미지 -->
                <div class="col-md-12 reset-padding">
                  <!-- FIXME: 선택한 이미지 정보를 받아 올 수 없어서. 임시 이미지로 씀.  -->
                  <!-- <img
                    class="col-md-12 reset-padding"
                    style="margin-top: 0; margin-bottom: 10px"
                    :src="currentMovie.posterurln"
                    alt="PosterImg"
                  /> -->
                  <img
                    class="col-md-12 reset-padding"
                    style="margin-top: 0; margin-bottom: 10px"
                    src="@/assets/f5907P7GdAGI22PHNRfqoKCAcDR.jpg"
                    alt="PosterImg"
                  />
                </div>
                <!-- 인원수 체크 성인 & 청소년 -->
                <div class="col-md-12 HeadCount">
                  <!-- 성인 인원수 선택 시작 -->
                  <span>성인</span>
                  <div class="count-wrap">
                    <button @click="minus('adult')">-</button>
                    <span style="margin: 0 10px">{{ adultcount }}</span>
                    <button @click="plus('adult')">+</button>
                  </div>
                  <!-- 성인 인원수 선택 끝 -->

                  <!-- 청소년 인원수 선택 시작 -->
                  <span>청소년</span>
                  <div class="count-wrap">
                    <button @click="minus()">-</button>
                    <span style="margin: 0 10px">{{ teencount }}</span>
                    <button @click="plus()">+</button>
                  </div>

                  <!-- 청소년 인원수 선택 끝 -->
                </div>
                <!-- 선택한 좌석 ex) A01,A02 시작 -->
                <div class="col-md-12 reset-padding" style="margin: 10px 0">
                  <div class="col-md-4 display-li-b reset-padding">
                    <span> 선택 좌석 </span>
                  </div>
                  <div class="col-md-8 display-li-b reset-padding">
                    <span v-for="(seat, index) in selectedseat" :key="index">
                      {{ seat
                      }}{{ index + 1 < selectedseat.length ? ", " : "" }}
                    </span>
                  </div>
                </div>
                <!-- 선택한 좌석 ex) A01,A02 끝 -->
                <!-- 성인 결제 금액 표시 시작 -->
                <div class="col-md-12 reset-padding">
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
                </div>
                <!-- 성인 결제 금액 표시 끝 -->
                <!-- 청소년 결제 금액 표시 시작 -->
                <div class="col-md-12 reset-padding">
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
                </div>
                <!-- 청소년 결제 금액 표시 끝 -->
                <!-- 토탈 금액 표시 시작 -->
                <div class="col-md-12 reset-padding payment">
                  <span style="float: left"> 결제 금액 </span>
                  <span style="float: right">
                    {{ teencount * 100 + adultcount * 100 }} 원
                  </span>
                </div>
                <!-- 토탈 금액 표시 끝 -->
                <!-- 결제 버튼 시작 -->
                <!-- plusSeat() 이거는 결제가 끝나고 날라가면 됨 -->
                <div class="col-md-12 reset-padding">
                  <button
                    class="col-md-12 reset-padding"
                    :class="!payment ? 'paybtn-black' : 'paybtn-white'"
                    :disabled="!payment"
                    @click="payment()"
                  >
                    결제하기
                  </button>
                </div>
                <!-- 결제 버튼 끝 -->
              </div>
              <div
                class="col-md-8 reset-padding"
                style="padding-left: 20px; color: #fff"
              >
                <!-- 영화 제목 -->
                <div
                  class="col-md-12 reset-padding"
                  style="margin-bottom: 20px"
                >
                  <!-- FIXME: 백엔드에서 가져올 수 없어서 주석 처리하고. 임시 포스터 영화 제목 입력함 -->
                  <!-- <h2 style="margin-left: 33%">
                    {{ currentMovie.movienm }}
                  </h2> -->
                  <h2 style="margin-left: 33%">샤잠! 신들의 분노</h2>
                </div>
                <!-- 영화관 -->
                <CinemaCom
                  :currentMovie="currentMovie"
                  @select-cinema="selectedcinema"
                />
                <!-- 영화관 -->
                <!-- 날짜, 상영시간 -->
                <DayCom
                  :currentMovie="currentMovie"
                  :selectedcinema="cinema"
                  @getSeatposition="getSeatposition"
                />
                <MoveSeat :getSeatpositions="getSeatpositions" />
                <!-- 날짜, 상영시간 끝 -->
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import CinemaCom from "./CinemaCom.vue";
import DayCom from "./DayCom.vue";
import MoveSeat from "./MoveSeat.vue";
export default {
  props: ["movieProps2"],
  components: {
    CinemaCom,
    DayCom,
    MoveSeat,
  },
  data() {
    return {
      currentMovie: this.movieProps2,
      adultcount: 0,
      teencount: 0,
      selectedseat: [],
      cinema: "",
      payment: false,
      getSeatpositions: [],
    };
  },
  methods: {
    minus(value) {
      if (value == "adult") {
        this.adultcount -= 1;
      } else {
        this.teencount -= 1;
      }
    },
    plus(value) {
      if (this.adultcount + this.teencount == 5) {
        return alert("최대 5자리 까지만 예약이 가능합니다.");
      }
      if (value == "adult") {
        this.adultcount += 1;
      } else {
        this.teencount += 1;
      }
    },
    selectedcinema(value) {
      this.cinema = value;
    },
    getSeatposition(value) {
      this.getSeatpositions = value;
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
        amount: this.teencount * 100 + this.adultcount * 100, // 결제금액
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
  },
  watch: {
    teencount(value) {
      if (value < 0) {
        return (this.teencount = 0);
      }
    },
    adultcount(value) {
      if (value < 0) {
        return (this.adultcount = 0);
      }
    },
    selectedseat(value) {
      if (
        value.length == this.teencount + this.adultcount &&
        value.length.trim() !== 0
      ) {
        return;
      }
    },
  },
};
</script>

<style scoped>
.reset-padding {
  padding: 0;
}

.SeatBooking {
  position: relative;
}

.seat-count-text {
  font-size: 20px;
  color: #fff;
}

.HeadCount {
  display: flex;
  justify-content: space-between;
  padding: 0;
}
.count-wrap {
  display: inline-block;
}
.count-wrap button {
  border: 0;
  background: #ffffff;
  color: #020d18;
  width: 30px;
  height: 30px;
}
.count-wrap button:hover {
  background: #f4eee0;
  transition: 0.5s all ease-in;
}

.payment {
  color: #dd003f;
  border-top: 1px solid #dd003f;
  padding-top: 5px;
  margin-top: 10px;
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
</style>
