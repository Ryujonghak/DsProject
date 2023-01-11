<script src="../../model/Seat.js"></script>
<template>
  <div>
    <div
      style="background-color: black; position: relative"
      class="page-single movie_list"
    >
      <div
        style="
          position: absolute;
          top: 0;
          left: 0;
          width: 100%;
          height: 100%;
          background: rgba(0, 0, 0, 0.5);
          z-index: 30px;
        "
      ></div>
      <div class="container">
        <div class="row">
          <div>
            <div class="blog-detail-ct">
              <div style="position: relative">
                <!-- 이건 좌석 -->
                <div>
                  <div v-show="좌석" style="position: relative">
                    <div style="width: 370px; float: left">
                      <div style="width: 310px; margin: 0 30px 0 30px">
                        <img :src="data1.posterurln" alt="" />
                      </div>
                      <div
                        style="
                          text-align: center;
                          justify-content: center;
                          width: 100%;
                          height: 50px;
                        "
                      >
                        <span
                          style="
                            font-size: 20px;
                            margin-right: 10px;
                            color: white;
                          "
                          >성인</span
                        >
                        <button @click="adultmins()" style="margin-right: 10px">
                          -
                        </button>
                        <span
                          style="
                            color: white;
                            font-size: 20px;
                            margin-right: 10px;
                          "
                          >{{ adultcount }}</span
                        >
                        <button @click="adultplus()" style="margin-right: 10px">
                          +
                        </button>

                        <span
                          style="
                            font-size: 20px;
                            margin-right: 10px;
                            margin-left: 25px;
                            color: white;
                          "
                          >청소년</span
                        >
                        <button @click="teenmins()" style="margin-right: 10px">
                          -
                        </button>
                        <span
                          style="
                            color: white;
                            font-size: 20px;
                            margin-right: 10px;
                          "
                          >{{ teencount }}</span
                        >
                        <button @click="teenplus()" style="margin-right: 10px">
                          +
                        </button>
                      </div>
                      <!--  선택한 좌석 표시하는 곳 -->
                      <div
                        style="
                          text-align: center;
                          color: white;
                          justify-content: center;
                          width: 370px;
                          margin-bottom: 10px;
                        "
                      >
                        <span style="font-size: 20px; margin-right: 20px"
                          >선택한 좌석</span
                        >
                        <span
                          style="font-size: 20px"
                          v-for="(seat, index) in selected"
                          v-bind:key="index"
                          >{{ seat
                          }}{{ index + 1 < selected.length ? ", " : "" }}</span
                        >
                      </div>
                      <div
                        v-show="성인"
                        style="
                          width: 100%;
                          font-size: 20px;
                          font-size: 20px;
                          color: white;
                          margin-bottom: 10px;
                        "
                      >
                        <div style="width: 30%; display: inline-block">
                          성인
                        </div>
                        <div
                          style="
                            width: 30%;
                            display: inline-block;
                            text-align: center;
                          "
                        >
                          {{ this.adultcount }}
                        </div>
                        <div style="display: inline-block; float: right">
                          {{ this.adultcount * 100 }} 원
                        </div>
                      </div>
                      <div
                        v-show="청소년"
                        style="
                          width: 100%;
                          font-size: 20px;
                          font-size: 20px;
                          color: white;
                          clear: both;
                          margin-bottom: 10px;
                        "
                      >
                        <div style="width: 30%; display: inline-block">
                          청소년
                        </div>
                        <div
                          style="
                            width: 30%;
                            display: inline-block;
                            text-align: center;
                          "
                        >
                          {{ this.teencount }}
                        </div>
                        <div style="display: inline-block; float: right">
                          {{ this.teencount * 100 }} 원
                        </div>
                      </div>
                      <div
                        style="
                          width: 100%;
                          font-size: 20px;
                          font-size: 20px;
                          color: white;
                          clear: both;
                          margin-bottom: 10px;
                          border-top: 1px solid #dd003f;
                          padding-top: 5px;
                        "
                      >
                        <div
                          style="
                            display: inline-block;
                            float: left;
                            color: #dd003f;
                          "
                        >
                          결제 금액
                        </div>
                        <div style="display: inline-block; float: right">
                          {{ totalpay }} 원
                        </div>
                      </div>
                      <div style="width: 100%; clear: both">
                        <button
                          v-show="결제하기"
                          v-on:click="requestPay"
                          style="
                            width: 100%;
                            height: 60px;
                            border: 1px solid #333;
                            background-color: white;
                            color: black;
                            margin-top: 20px;
                          "
                        >
                          결제하기
                        </button>
                        <button
                          v-show="!결제하기"
                          v-on:click="requestPay"
                          style="
                            width: 100%;
                            height: 60px;
                            border: 1px solid #333;
                            background-color: black;
                            color: white;
                            margin-top: 20px;
                          "
                          disabled
                        >
                          결제하기
                        </button>
                      </div>
                    </div>
                    <div style="width: 780px; float: right; margin-left: 20px">
                      <!-- TODO: 영화관 시작-->
                      <div
                        style="
                          width: 780px;
                          color: white;
                          margin-top: 25px;
                          margin-bottom: 10px;
                        "
                      >
                        <span style="font-size: 2em; font-weight: bold">{{
                          data1.movienm
                        }}</span>
                        <br />
                        <span>{{ data1.watchgradenm }}</span>
                        <img
                          style="
                            width: 30px;
                            height: 30px;
                            background-color: white;
                            margin-left: 20px;
                            margin-top: 20px;
                          "
                          src="../../assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
                          alt=""
                        /><span style="margin-left: 10px"
                          >{{ data1.showtm }}분</span
                        >
                        <div
                          style="
                            width: 330px;
                            height: 85px;
                            border-bottom: 1px solid gray;
                            display: inline-block;
                            float: right;
                          "
                        >
                          <p
                            style="
                              width: 330px;
                              margin-bottom: 0;
                              color: gray;
                              padding: 5px 0 5px 0;
                              font-size: 16px;
                              font-weight: bold;
                              color: white;
                              border-bottom: 1px solid gray;
                            "
                          >
                            영화관
                          </p>
                          <button
                            v-show="centum"
                            @click="cinema('centum')"
                            style="
                              width: 110px;
                              height: 24px;
                              float: left;
                              border: 0;
                              background-color: black;
                              margin-top: 5px;
                            "
                          >
                            <h5
                              style="
                                color: white;
                                padding: 9px 9px 9px 9px;
                                margin-left: 3px;
                              "
                            >
                              센텀시티
                            </h5>
                          </button>
                          <button
                            v-show="!centum"
                            style="
                              width: 110px;
                              height: 24px;
                              float: left;
                              border: 0;
                              background-color: black;
                              margin-top: 5px;
                            "
                          >
                            <h5
                              style="
                                color: black;
                                padding: 9px 9px 9px 9px;
                                margin-left: 3px;
                                background-color: white;
                                border-radius: 9px;
                              "
                            >
                              센텀시티
                            </h5>
                          </button>

                          <button
                            v-show="Seomyeon"
                            @click="cinema('seomyeon')"
                            style="
                              width: 110px;
                              height: 24px;
                              float: left;
                              border: 0;
                              background-color: black;
                              margin-top: 5px;
                            "
                          >
                            <h5
                              style="
                                color: white;
                                padding: 9px 9px 9px 9px;
                                margin-left: 3px;
                              "
                            >
                              서면
                            </h5>
                          </button>
                          <button
                            v-show="!Seomyeon"
                            style="
                              width: 110px;
                              height: 24px;
                              float: left;
                              border: 0;
                              background-color: black;
                              margin-top: 5px;
                            "
                          >
                            <h5
                              style="
                                color: black;
                                padding: 9px 9px 9px 9px;
                                margin-left: 3px;
                                background-color: white;
                                border-radius: 9px;
                              "
                            >
                              서면
                            </h5>
                          </button>

                          <button
                            v-show="Busan"
                            @click="cinema('busan')"
                            style="
                              width: 110px;
                              height: 24px;
                              float: left;
                              border: 0;
                              background-color: black;
                              margin-top: 5px;
                            "
                          >
                            <h5
                              style="
                                color: white;
                                padding: 9px 9px 9px 9px;
                                margin-left: 3px;
                              "
                            >
                              부산대
                            </h5>
                          </button>
                          <button
                            v-show="!Busan"
                            style="
                              width: 110px;
                              height: 24px;
                              float: left;
                              border: 0;
                              background-color: black;
                              margin-top: 5px;
                            "
                          >
                            <h5
                              style="
                                color: black;
                                padding: 9px 9px 9px 9px;
                                margin-left: 3px;
                                background-color: white;
                                border-radius: 9px;
                              "
                            >
                              부산대
                            </h5>
                          </button>
                        </div>
                      </div>
                      <!-- TODO:영화관 끝-->

                      <!-- TODO:날짜 시작-->
                      <div
                        style="
                          width: 330px;
                          height: 140px;
                          border-bottom: 1px solid gray;
                          display: inline-block;
                          float: left;
                        "
                      >
                        <p
                          style="
                            width: 330px;
                            margin-bottom: 0;
                            color: gray;
                            padding: 15px 0 5px 0;
                            font-size: 16px;
                            font-weight: bold;
                            color: white;
                            border-bottom: 1px solid gray;
                          "
                        >
                          {{ yy }}년 {{ mm }}월 {{ dd }}일 (오늘)
                        </p>

                        <button
                          v-show="day1"
                          @click="week('day1')"
                          style="
                            width: 55px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">오늘</p>
                          <h4
                            style="
                              color: white;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                            "
                          >
                            {{ dd }}
                          </h4>
                        </button>
                        <button
                          v-show="!day1"
                          style="
                            width: 55px;
                            border-radius: 20px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: #1d1e2c;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">오늘</p>
                          <h4
                            style="
                              color: black;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                              background-color: white;
                              border-radius: 18px;
                            "
                          >
                            {{ dd }}
                          </h4>
                        </button>
                        <button
                          v-show="day2"
                          @click="week('day2')"
                          style="
                            width: 55px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">내일</p>
                          <h4
                            style="
                              color: white;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                            "
                          >
                            {{ dd + 1 }}
                          </h4>
                        </button>
                        <button
                          v-show="!day2"
                          style="
                            width: 55px;
                            border-radius: 20px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: #1d1e2c;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">내일</p>
                          <h4
                            style="
                              color: black;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                              background-color: white;
                              border-radius: 18px;
                            "
                          >
                            {{ dd + 1 }}
                          </h4>
                        </button>
                        <button
                          v-show="day3"
                          @click="week('day3')"
                          style="
                            width: 55px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">
                            {{ 요일[순서[2]] }}
                          </p>
                          <h4
                            style="
                              color: white;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                            "
                          >
                            {{ dd + 2 }}
                          </h4>
                        </button>
                        <button
                          v-show="!day3"
                          style="
                            width: 55px;
                            border-radius: 20px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: #1d1e2c;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">
                            {{ 요일[순서[2]] }}
                          </p>
                          <h4
                            style="
                              color: black;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                              background-color: white;
                              border-radius: 18px;
                            "
                          >
                            {{ dd + 2 }}
                          </h4>
                        </button>
                        <button
                          v-show="day4"
                          @click="week('day4')"
                          style="
                            width: 55px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">
                            {{ 요일[순서[3]] }}
                          </p>
                          <h4
                            style="
                              color: white;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                            "
                          >
                            {{ dd + 3 }}
                          </h4>
                        </button>
                        <button
                          v-show="!day4"
                          style="
                            width: 55px;
                            border-radius: 20px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: #1d1e2c;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">
                            {{ 요일[순서[3]] }}
                          </p>
                          <h4
                            style="
                              color: black;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                              background-color: white;
                              border-radius: 18px;
                            "
                          >
                            {{ dd + 3 }}
                          </h4>
                        </button>
                        <button
                          v-show="day5"
                          @click="week('day5')"
                          style="
                            width: 55px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">
                            {{ 요일[순서[4]] }}
                          </p>
                          <h4
                            style="
                              color: white;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                            "
                          >
                            {{ dd + 4 }}
                          </h4>
                        </button>
                        <button
                          v-show="!day5"
                          style="
                            width: 55px;
                            border-radius: 20px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: #1d1e2c;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px">
                            {{ 요일[순서[4]] }}
                          </p>
                          <h4
                            style="
                              color: black;
                              padding: 9px 25px 9px 13px;
                              margin-left: 3px;
                              background-color: white;
                              border-radius: 18px;
                            "
                          >
                            {{ dd + 4 }}
                          </h4>
                        </button>
                      </div>
                      <!-- TODO:날짜 끝 -->

                      <!-- TODO: 상영시간 시작 -->
                      <div
                        style="
                          width: 330px;
                          height: 140px;
                          border-bottom: 1px solid gray;
                          display: inline-block;
                          float: right;
                        "
                      >
                        <p
                          style="
                            width: 330px;
                            margin-bottom: 0;
                            color: gray;
                            padding: 15px 0 5px 0;
                            font-size: 16px;
                            font-weight: bold;
                            color: white;
                            border-bottom: 1px solid gray;
                          "
                        >
                          상영시간
                        </p>
                        <!-- 첫번째 시간 -->
                        <div
                          class="col-xs-3"
                          style="
                            width: 70px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px" v-if="schedule_1 != null">2D</p>
                          <button
                            id="first-div"
                            v-if="schedule_1 != null"
                            @click="
                              [selectedtime(schedule_1.starttime), coloredBtn()]
                            "
                            style="
                              color: black;
                              font-family: 'Dosis', sans-serif;
                              font-weight: bold;
                              font-size: 18px;
                              margin-top: 15px;
                              border-radius: 9px;
                              border: none;
                            "
                          >
                            {{ schedule_1.starttime }}
                          </button>
                        </div>
                        <!-- 두번째 시간 -->
                        <div
                          class="col-xs-3"
                          style="
                            width: 70px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px" v-if="schedule_2 != null">2D</p>
                          <button
                            id="second-div"
                            v-if="schedule_2 != null"
                            @click="
                              [selectedtime(schedule_2.starttime), coloredBtn()]
                            "
                            style="
                              color: black;
                              font-family: 'Dosis', sans-serif;
                              font-weight: bold;
                              font-size: 18px;
                              margin-top: 15px;
                              border-radius: 9px;
                              border: none;
                            "
                          >
                            {{ schedule_2.starttime }}
                          </button>
                        </div>
                        <!-- 세번째 시간 -->
                        <div
                          class="col-xs-3"
                          style="
                            width: 70px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px" v-if="schedule_3 != null">2D</p>
                          <button
                            id="third-div"
                            v-if="schedule_3 != null"
                            @click="
                              [selectedtime(schedule_3.starttime), coloredBtn()]
                            "
                            style="
                              color: black;
                              font-family: 'Dosis', sans-serif;
                              font-weight: bold;
                              font-size: 18px;
                              margin-top: 15px;
                              border-radius: 9px;
                              border: none;
                            "
                          >
                            {{ schedule_3.starttime }}
                          </button>
                        </div>
                        <!-- 네번째 시간 -->
                        <div
                          class="col-xs-3"
                          style="
                            width: 70px;
                            height: 80px;
                            float: left;
                            border: 0;
                            background-color: black;
                            margin-right: 5px;
                            margin-top: 5px;
                          "
                        >
                          <p style="color: white; margin-bottom: 10px" v-if="schedule_4 != null">2D</p>
                          <button
                            id="fourth-div"
                            v-if="schedule_4 != null"
                            @click="
                              [selectedtime(schedule_4.starttime), coloredBtn()]
                            "
                            style="
                              color: black;
                              font-family: 'Dosis', sans-serif;
                              font-weight: bold;
                              font-size: 18px;
                              margin-top: 15px;
                              border-radius: 9px;
                              border: none;
                            "
                          >
                            {{ schedule_4.starttime }}
                          </button>
                        </div>
                      </div>
                      <div
                        v-show="모달"
                        style="
                          position: absolute;
                          width: 820px;
                          height: 400px;
                          background-color: rgba(0, 0, 0, 0.6);
                          top: 300px;
                          right: -30px;
                          z-index: 99;
                          text-align: center;
                        "
                      >
                        <!--  위 공백처리 -->
                        <div style="margin-bottom: 80px; width: 100%"></div>
                        <!-- TODO:  -->
                        <span
                          v-show="runningTime"
                          style="color: white; font-size: 24px"
                          >시간을 선택해 주세요</span
                        >
                        <span
                          v-show="People"
                          style="color: white; font-size: 24px"
                          >관람인원을 선택해 주세요</span
                        >
                      </div>
                      <div style="width: 780px">
                        <!--  -->
                        <div
                          style="width: 780px; margin-bottom: 60px; position: "
                        >
                          <img
                            style="margin: 10px 0; width: 780px; height: 30px"
                            src="../../assets/images_kim/Views/ModalView/SCREEN.jpg"
                            alt=""
                          />
                          <p style="text-align: center">
                            S &nbsp;&nbsp;&nbsp; C &nbsp;&nbsp;&nbsp; R
                            &nbsp;&nbsp;&nbsp; E &nbsp;&nbsp;&nbsp; E
                            &nbsp;&nbsp;&nbsp; N
                          </p>
                        </div>
                        <div class="seat">
                          <!-- 좌석 A 시작 -->
                          <div class="seat-p">
                            <span class="font">A</span>
                            <div
                              style="position: absolute; left: 145px; top: 0px"
                            >
                              <button
                                @click="addseat('A01')"
                                v-show="seattest60[0] == 1"
                                class="seat-bg"
                              >
                                1
                              </button>
                              <button
                                @click="deleteseat('A01')"
                                v-show="seattest60[0] == 2"
                                class="seat-bg2"
                              >
                                1
                              </button>
                              <button
                                v-show="seattest60[0] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                1
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 185px; top: 0px"
                            >
                              <button
                                @click="addseat('A02')"
                                v-show="seattest60[1] == 1"
                                class="seat-bg"
                              >
                                2
                              </button>
                              <button
                                @click="deleteseat('A02')"
                                v-show="seattest60[1] == 2"
                                class="seat-bg2"
                              >
                                2
                              </button>
                              <button
                                v-show="seattest60[1] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                2
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 225px; top: 0px"
                            >
                              <button
                                @click="addseat('A03')"
                                v-show="seattest60[2] == 1"
                                class="seat-bg"
                              >
                                3
                              </button>
                              <button
                                @click="deleteseat('A03')"
                                v-show="seattest60[2] == 2"
                                class="seat-bg2"
                              >
                                3
                              </button>
                              <button
                                v-show="seattest60[2] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                3
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 325px; top: 0px"
                            >
                              <button
                                @click="addseat('A04')"
                                v-show="seattest60[3] == 1"
                                class="seat-bg"
                              >
                                4
                              </button>
                              <button
                                @click="deleteseat('A04')"
                                v-show="seattest60[3] == 2"
                                class="seat-bg2"
                              >
                                4
                              </button>
                              <button
                                v-show="seattest60[3] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                4
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 365px; top: 0px"
                            >
                              <button
                                @click="addseat('A05')"
                                v-show="seattest60[4] == 1"
                                class="seat-bg"
                              >
                                5
                              </button>
                              <button
                                @click="deleteseat('A05')"
                                v-show="seattest60[4] == 2"
                                class="seat-bg2"
                              >
                                5
                              </button>
                              <button
                                v-show="seattest60[4] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                5
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 405px; top: 0px"
                            >
                              <button
                                @click="addseat('A06')"
                                v-show="seattest60[5] == 1"
                                class="seat-bg"
                              >
                                6
                              </button>
                              <button
                                @click="deleteseat('A06')"
                                v-show="seattest60[5] == 2"
                                class="seat-bg2"
                              >
                                6
                              </button>
                              <button
                                v-show="seattest60[5] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                6
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 445px; top: 0px"
                            >
                              <button
                                @click="addseat('A07')"
                                v-show="seattest60[6] == 1"
                                class="seat-bg"
                              >
                                7
                              </button>
                              <button
                                @click="deleteseat('A07')"
                                v-show="seattest60[6] == 2"
                                class="seat-bg2"
                              >
                                7
                              </button>
                              <button
                                v-show="seattest60[6] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                7
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 545px; top: 0px"
                            >
                              <button
                                @click="addseat('A08')"
                                v-show="seattest60[7] == 1"
                                class="seat-bg"
                              >
                                8
                              </button>
                              <button
                                @click="deleteseat('A08')"
                                v-show="seattest60[7] == 2"
                                class="seat-bg2"
                              >
                                8
                              </button>
                              <button
                                v-show="seattest60[7] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                8
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 585px; top: 0px"
                            >
                              <button
                                @click="addseat('A09')"
                                v-show="seattest60[8] == 1"
                                class="seat-bg"
                              >
                                9
                              </button>
                              <button
                                @click="deleteseat('A09')"
                                v-show="seattest60[8] == 2"
                                class="seat-bg2"
                              >
                                9
                              </button>
                              <button
                                v-show="seattest60[8] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                9
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 625px; top: 0px"
                            >
                              <button
                                @click="addseat('A10')"
                                v-show="seattest60[9] == 1"
                                class="seat-bg"
                              >
                                10
                              </button>
                              <button
                                @click="deleteseat('A10')"
                                v-show="seattest60[9] == 2"
                                class="seat-bg2"
                              >
                                10
                              </button>
                              <button
                                v-show="seattest60[9] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                10
                              </button>
                            </div>
                            <span class="font2">A</span>
                          </div>
                          <!-- 좌석 B 시작 -->
                          <div class="seat-p">
                            <span class="font">B</span>
                            <div
                              style="
                                position: absolute;
                                left: 145px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B01')"
                                v-show="seattest60[10] == 1"
                                class="seat-bg"
                              >
                                1
                              </button>
                              <button
                                @click="deleteseat('B01')"
                                v-show="seattest60[10] == 2"
                                class="seat-bg2"
                              >
                                1
                              </button>
                              <button
                                v-show="seattest60[10] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                1
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 185px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B02')"
                                v-show="seattest60[11] == 1"
                                class="seat-bg"
                              >
                                2
                              </button>
                              <button
                                @click="deleteseat('B02')"
                                v-show="seattest60[11] == 2"
                                class="seat-bg2"
                              >
                                2
                              </button>
                              <button
                                v-show="seattest60[11] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                2
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 225px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B03')"
                                v-show="seattest60[12] == 1"
                                class="seat-bg"
                              >
                                3
                              </button>
                              <button
                                @click="deleteseat('B03')"
                                v-show="seattest60[12] == 2"
                                class="seat-bg2"
                              >
                                3
                              </button>
                              <button
                                v-show="seattest60[12] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                3
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 325px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B04')"
                                v-show="seattest60[13] == 1"
                                class="seat-bg"
                              >
                                4
                              </button>
                              <button
                                @click="deleteseat('B04')"
                                v-show="seattest60[13] == 2"
                                class="seat-bg2"
                              >
                                4
                              </button>
                              <button
                                v-show="seattest60[13] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                4
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 365px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B05')"
                                v-show="seattest60[14] == 1"
                                class="seat-bg"
                              >
                                5
                              </button>
                              <button
                                @click="deleteseat('B05')"
                                v-show="seattest60[14] == 2"
                                class="seat-bg2"
                              >
                                5
                              </button>
                              <button
                                v-show="seattest60[14] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                5
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 405px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B06')"
                                v-show="seattest60[15] == 1"
                                class="seat-bg"
                              >
                                6
                              </button>
                              <button
                                @click="deleteseat('B06')"
                                v-show="seattest60[15] == 2"
                                class="seat-bg2"
                              >
                                6
                              </button>
                              <button
                                v-show="seattest60[15] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                6
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 445px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B07')"
                                v-show="seattest60[16] == 1"
                                class="seat-bg"
                              >
                                7
                              </button>
                              <button
                                @click="deleteseat('B07')"
                                v-show="seattest60[16] == 2"
                                class="seat-bg2"
                              >
                                7
                              </button>
                              <button
                                v-show="seattest60[16] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                7
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 545px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B08')"
                                v-show="seattest60[17] == 1"
                                class="seat-bg"
                              >
                                8
                              </button>
                              <button
                                @click="deleteseat('B08')"
                                v-show="seattest60[17] == 2"
                                class="seat-bg2"
                              >
                                8
                              </button>
                              <button
                                v-show="seattest60[17] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                8
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 585px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B09')"
                                v-show="seattest60[18] == 1"
                                class="seat-bg"
                              >
                                9
                              </button>
                              <button
                                @click="deleteseat('B09')"
                                v-show="seattest60[18] == 2"
                                class="seat-bg2"
                              >
                                9
                              </button>
                              <button
                                v-show="seattest60[18] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                9
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 625px;
                                top: 42.5px;
                              "
                            >
                              <button
                                @click="addseat('B10')"
                                v-show="seattest60[19] == 1"
                                class="seat-bg"
                              >
                                10
                              </button>
                              <button
                                @click="deleteseat('B10')"
                                v-show="seattest60[19] == 2"
                                class="seat-bg2"
                              >
                                10
                              </button>
                              <button
                                v-show="seattest60[19] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                10
                              </button>
                            </div>
                            <span class="font2">B</span>
                          </div>
                          <!-- 좌석 C 시작 -->
                          <div class="seat-p">
                            <span class="font">C</span>
                            <div
                              style="position: absolute; left: 145px; top: 85px"
                            >
                              <button
                                @click="addseat('C01')"
                                v-show="seattest60[20] == 1"
                                class="seat-bg"
                              >
                                1
                              </button>
                              <button
                                @click="deleteseat('C01')"
                                v-show="seattest60[20] == 2"
                                class="seat-bg2"
                              >
                                1
                              </button>
                              <button
                                v-show="seattest60[20] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                1
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 185px; top: 85px"
                            >
                              <button
                                @click="addseat('C02')"
                                v-show="seattest60[21] == 1"
                                class="seat-bg"
                              >
                                2
                              </button>
                              <button
                                @click="deleteseat('C02')"
                                v-show="seattest60[21] == 2"
                                class="seat-bg2"
                              >
                                2
                              </button>
                              <button
                                v-show="seattest60[21] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                2
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 225px; top: 85px"
                            >
                              <button
                                @click="addseat('C03')"
                                v-show="seattest60[22] == 1"
                                class="seat-bg"
                              >
                                3
                              </button>
                              <button
                                @click="deleteseat('C03')"
                                v-show="seattest60[22] == 2"
                                class="seat-bg2"
                              >
                                3
                              </button>
                              <button
                                v-show="seattest60[22] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                3
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 325px; top: 85px"
                            >
                              <button
                                @click="addseat('C04')"
                                v-show="seattest60[23] == 1"
                                class="seat-bg"
                              >
                                4
                              </button>
                              <button
                                @click="deleteseat('C04')"
                                v-show="seattest60[23] == 2"
                                class="seat-bg2"
                              >
                                4
                              </button>
                              <button
                                v-show="seattest60[23] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                4
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 365px; top: 85px"
                            >
                              <button
                                @click="addseat('C05')"
                                v-show="seattest60[24] == 1"
                                class="seat-bg"
                              >
                                5
                              </button>
                              <button
                                @click="deleteseat('C05')"
                                v-show="seattest60[24] == 2"
                                class="seat-bg2"
                              >
                                5
                              </button>
                              <button
                                v-show="seattest60[24] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                5
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 405px; top: 85px"
                            >
                              <button
                                @click="addseat('C06')"
                                v-show="seattest60[25] == 1"
                                class="seat-bg"
                              >
                                6
                              </button>
                              <button
                                @click="deleteseat('C06')"
                                v-show="seattest60[25] == 2"
                                class="seat-bg2"
                              >
                                6
                              </button>
                              <button
                                v-show="seattest60[25] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                6
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 445px; top: 85px"
                            >
                              <button
                                @click="addseat('C07')"
                                v-show="seattest60[26] == 1"
                                class="seat-bg"
                              >
                                7
                              </button>
                              <button
                                @click="deleteseat('C07')"
                                v-show="seattest60[26] == 2"
                                class="seat-bg2"
                              >
                                7
                              </button>
                              <button
                                v-show="seattest60[26] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                7
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 545px; top: 85px"
                            >
                              <button
                                @click="addseat('C08')"
                                v-show="seattest60[27] == 1"
                                class="seat-bg"
                              >
                                8
                              </button>
                              <button
                                @click="deleteseat('C08')"
                                v-show="seattest60[27] == 2"
                                class="seat-bg2"
                              >
                                8
                              </button>
                              <button
                                v-show="seattest60[27] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                8
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 585px; top: 85px"
                            >
                              <button
                                @click="addseat('C09')"
                                v-show="seattest60[28] == 1"
                                class="seat-bg"
                              >
                                9
                              </button>
                              <button
                                @click="deleteseat('C09')"
                                v-show="seattest60[28] == 2"
                                class="seat-bg2"
                              >
                                9
                              </button>
                              <button
                                v-show="seattest60[28] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                9
                              </button>
                            </div>
                            <div
                              style="position: absolute; left: 625px; top: 85px"
                            >
                              <button
                                @click="addseat('C10')"
                                v-show="seattest60[29] == 1"
                                class="seat-bg"
                              >
                                10
                              </button>
                              <button
                                @click="deleteseat('C10')"
                                v-show="seattest60[29] == 2"
                                class="seat-bg2"
                              >
                                10
                              </button>
                              <button
                                v-show="seattest60[29] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                10
                              </button>
                            </div>
                            <span class="font2">C</span>
                          </div>
                          <!-- 좌석 D 시작 -->
                          <div class="seat-p">
                            <span class="font">D</span>
                            <div
                              style="
                                position: absolute;
                                left: 145px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D01')"
                                v-show="seattest60[30] == 1"
                                class="seat-bg"
                              >
                                1
                              </button>
                              <button
                                @click="deleteseat('D01')"
                                v-show="seattest60[30] == 2"
                                class="seat-bg2"
                              >
                                1
                              </button>
                              <button
                                v-show="seattest60[30] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                1
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 185px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D02')"
                                v-show="seattest60[31] == 1"
                                class="seat-bg"
                              >
                                2
                              </button>
                              <button
                                @click="deleteseat('D02')"
                                v-show="seattest60[31] == 2"
                                class="seat-bg2"
                              >
                                2
                              </button>
                              <button
                                v-show="seattest60[31] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                2
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 225px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D03')"
                                v-show="seattest60[32] == 1"
                                class="seat-bg"
                              >
                                3
                              </button>
                              <button
                                @click="deleteseat('D03')"
                                v-show="seattest60[32] == 2"
                                class="seat-bg2"
                              >
                                3
                              </button>
                              <button
                                v-show="seattest60[32] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                3
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 325px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D04')"
                                v-show="seattest60[33] == 1"
                                class="seat-bg"
                              >
                                4
                              </button>
                              <button
                                @click="deleteseat('D04')"
                                v-show="seattest60[33] == 2"
                                class="seat-bg2"
                              >
                                4
                              </button>
                              <button
                                v-show="seattest60[33] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                4
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 365px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D05')"
                                v-show="seattest60[34] == 1"
                                class="seat-bg"
                              >
                                5
                              </button>
                              <button
                                @click="deleteseat('D05')"
                                v-show="seattest60[34] == 2"
                                class="seat-bg2"
                              >
                                5
                              </button>
                              <button
                                v-show="seattest60[34] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                5
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 405px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D06')"
                                v-show="seattest60[35] == 1"
                                class="seat-bg"
                              >
                                6
                              </button>
                              <button
                                @click="deleteseat('D06')"
                                v-show="seattest60[35] == 2"
                                class="seat-bg2"
                              >
                                6
                              </button>
                              <button
                                v-show="seattest60[35] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                6
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 445px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D07')"
                                v-show="seattest60[36] == 1"
                                class="seat-bg"
                              >
                                7
                              </button>
                              <button
                                @click="deleteseat('D07')"
                                v-show="seattest60[36] == 2"
                                class="seat-bg2"
                              >
                                7
                              </button>
                              <button
                                v-show="seattest60[36] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                7
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 545px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D08')"
                                v-show="seattest60[37] == 1"
                                class="seat-bg"
                              >
                                8
                              </button>
                              <button
                                @click="deleteseat('D08')"
                                v-show="seattest60[37] == 2"
                                class="seat-bg2"
                              >
                                8
                              </button>
                              <button
                                v-show="seattest60[37] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                8
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 585px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D09')"
                                v-show="seattest60[38] == 1"
                                class="seat-bg"
                              >
                                9
                              </button>
                              <button
                                @click="deleteseat('D09')"
                                v-show="seattest60[38] == 2"
                                class="seat-bg2"
                              >
                                9
                              </button>
                              <button
                                v-show="seattest60[38] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                9
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 625px;
                                top: 127px;
                              "
                            >
                              <button
                                @click="addseat('D10')"
                                v-show="seattest60[39] == 1"
                                class="seat-bg"
                              >
                                10
                              </button>
                              <button
                                @click="deleteseat('D10')"
                                v-show="seattest60[39] == 2"
                                class="seat-bg2"
                              >
                                10
                              </button>
                              <button
                                v-show="seattest60[39] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                10
                              </button>
                            </div>
                            <span class="font2">D</span>
                          </div>
                          <!-- 좌석 E 시작 -->
                          <div class="seat-p">
                            <span class="font">E</span>
                            <div
                              style="
                                position: absolute;
                                left: 145px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E01')"
                                v-show="seattest60[40] == 1"
                                class="seat-bg"
                              >
                                1
                              </button>
                              <button
                                @click="deleteseat('E01')"
                                v-show="seattest60[40] == 2"
                                class="seat-bg2"
                              >
                                1
                              </button>
                              <button
                                v-show="seattest60[40] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                1
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 185px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E02')"
                                v-show="seattest60[41] == 1"
                                class="seat-bg"
                              >
                                2
                              </button>
                              <button
                                @click="deleteseat('E02')"
                                v-show="seattest60[41] == 2"
                                class="seat-bg2"
                              >
                                2
                              </button>
                              <button
                                v-show="seattest60[41] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                2
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 225px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E03')"
                                v-show="seattest60[42] == 1"
                                class="seat-bg"
                              >
                                3
                              </button>
                              <button
                                @click="deleteseat('E03')"
                                v-show="seattest60[42] == 2"
                                class="seat-bg2"
                              >
                                3
                              </button>
                              <button
                                v-show="seattest60[42] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                3
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 325px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E04')"
                                v-show="seattest60[43] == 1"
                                class="seat-bg"
                              >
                                4
                              </button>
                              <button
                                @click="deleteseat('E04')"
                                v-show="seattest60[43] == 2"
                                class="seat-bg2"
                              >
                                4
                              </button>
                              <button
                                v-show="seattest60[43] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                4
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 365px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E05')"
                                v-show="seattest60[44] == 1"
                                class="seat-bg"
                              >
                                5
                              </button>
                              <button
                                @click="deleteseat('E05')"
                                v-show="seattest60[44] == 2"
                                class="seat-bg2"
                              >
                                5
                              </button>
                              <button
                                v-show="seattest60[44] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                5
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 405px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E06')"
                                v-show="seattest60[45] == 1"
                                class="seat-bg"
                              >
                                6
                              </button>
                              <button
                                @click="deleteseat('E06')"
                                v-show="seattest60[45] == 2"
                                class="seat-bg2"
                              >
                                6
                              </button>
                              <button
                                v-show="seattest60[45] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                6
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 445px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E07')"
                                v-show="seattest60[46] == 1"
                                class="seat-bg"
                              >
                                7
                              </button>
                              <button
                                @click="deleteseat('E07')"
                                v-show="seattest60[46] == 2"
                                class="seat-bg2"
                              >
                                7
                              </button>
                              <button
                                v-show="seattest60[46] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                7
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 545px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E08')"
                                v-show="seattest60[47] == 1"
                                class="seat-bg"
                              >
                                8
                              </button>
                              <button
                                @click="deleteseat('E08')"
                                v-show="seattest60[47] == 2"
                                class="seat-bg2"
                              >
                                8
                              </button>
                              <button
                                v-show="seattest60[47] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                8
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 585px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E09')"
                                v-show="seattest60[48] == 1"
                                class="seat-bg"
                              >
                                9
                              </button>
                              <button
                                @click="deleteseat('E09')"
                                v-show="seattest60[48] == 2"
                                class="seat-bg2"
                              >
                                9
                              </button>
                              <button
                                v-show="seattest60[48] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                9
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 625px;
                                top: 169px;
                              "
                            >
                              <button
                                @click="addseat('E10')"
                                v-show="seattest60[49] == 1"
                                class="seat-bg"
                              >
                                10
                              </button>
                              <button
                                @click="deleteseat('E10')"
                                v-show="seattest60[49] == 2"
                                class="seat-bg2"
                              >
                                10
                              </button>
                              <button
                                v-show="seattest60[49] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                10
                              </button>
                            </div>
                            <span class="font2"> E</span>
                          </div>
                          <!-- 좌석 F 시작 -->
                          <div class="seat-p">
                            <span class="font">F</span>
                            <div
                              style="
                                position: absolute;
                                left: 145px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F01')"
                                v-show="seattest60[50] == 1"
                                class="seat-bg"
                              >
                                1
                              </button>
                              <button
                                @click="deleteseat('F01')"
                                v-show="seattest60[50] == 2"
                                class="seat-bg2"
                              >
                                1
                              </button>
                              <button
                                v-show="seattest60[50] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                1
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 185px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F02')"
                                v-show="seattest60[51] == 1"
                                class="seat-bg"
                              >
                                2
                              </button>
                              <button
                                @click="deleteseat('F02')"
                                v-show="seattest60[51] == 2"
                                class="seat-bg2"
                              >
                                2
                              </button>
                              <button
                                v-show="seattest60[51] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                2
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 225px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F03')"
                                v-show="seattest60[52] == 1"
                                class="seat-bg"
                              >
                                3
                              </button>
                              <button
                                @click="deleteseat('F03')"
                                v-show="seattest60[52] == 2"
                                class="seat-bg2"
                              >
                                3
                              </button>
                              <button
                                v-show="seattest60[52] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                3
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 325px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F04')"
                                v-show="seattest60[53] == 1"
                                class="seat-bg"
                              >
                                4
                              </button>
                              <button
                                @click="deleteseat('F04')"
                                v-show="seattest60[53] == 2"
                                class="seat-bg2"
                              >
                                4
                              </button>
                              <button
                                v-show="seattest60[53] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                4
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 365px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F05')"
                                v-show="seattest60[54] == 1"
                                class="seat-bg"
                              >
                                5
                              </button>
                              <button
                                @click="deleteseat('F05')"
                                v-show="seattest60[54] == 2"
                                class="seat-bg2"
                              >
                                5
                              </button>
                              <button
                                v-show="seattest60[54] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                5
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 405px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F06')"
                                v-show="seattest60[55] == 1"
                                class="seat-bg"
                              >
                                6
                              </button>
                              <button
                                @click="deleteseat('F06')"
                                v-show="seattest60[55] == 2"
                                class="seat-bg2"
                              >
                                6
                              </button>
                              <button
                                v-show="seattest60[55] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                6
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 445px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F07')"
                                v-show="seattest60[56] == 1"
                                class="seat-bg"
                              >
                                7
                              </button>
                              <button
                                @click="deleteseat('F07')"
                                v-show="seattest60[56] == 2"
                                class="seat-bg2"
                              >
                                7
                              </button>
                              <button
                                v-show="seattest60[56] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                7
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 545px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F08')"
                                v-show="seattest60[57] == 1"
                                class="seat-bg"
                              >
                                8
                              </button>
                              <button
                                @click="deleteseat('F08')"
                                v-show="seattest60[57] == 2"
                                class="seat-bg2"
                              >
                                8
                              </button>
                              <button
                                v-show="seattest60[57] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                8
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 585px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F09')"
                                v-show="seattest60[58] == 1"
                                class="seat-bg"
                              >
                                9
                              </button>
                              <button
                                @click="deleteseat('F09')"
                                v-show="seattest60[58] == 2"
                                class="seat-bg2"
                              >
                                9
                              </button>
                              <button
                                v-show="seattest60[58] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                9
                              </button>
                            </div>
                            <div
                              style="
                                position: absolute;
                                left: 625px;
                                top: 211px;
                              "
                            >
                              <button
                                @click="addseat('F10')"
                                v-show="seattest60[59] == 1"
                                class="seat-bg"
                              >
                                10
                              </button>
                              <button
                                @click="deleteseat('F10')"
                                v-show="seattest60[59] == 2"
                                class="seat-bg2"
                              >
                                10
                              </button>
                              <button
                                v-show="seattest60[59] == 0"
                                class="seat-bg3"
                                disabled
                              >
                                10
                              </button>
                            </div>
                            <span class="font2"> F</span>
                          </div>
                        </div>
                        <div
                          style="
                            display: inline-block;
                            width: 100%;
                            text-align: center;
                            padding-top: 32px;
                          "
                        >
                          <span style="color: white; margin: 9px"
                            ><img
                              style="
                                width: 13px;
                                height: 13px;
                                margin-top: 0px;
                                margin-bottom: 0px;
                              "
                              src="../../assets/images_kim/Views/ModalView/seat-img1.jpg"
                              alt=""
                            />
                            선택 가능
                          </span>
                          <span style="color: white; margin: 9px"
                            ><img
                              style="
                                width: 13px;
                                height: 13px;
                                margin-top: 0px;
                                margin-bottom: 0px;
                              "
                              src="../../assets/images_kim/Views/ModalView/seat-img2.jpg"
                              alt=""
                            />
                            선택 좌석
                          </span>
                          <span style="color: white; margin-bottom: 19px"
                            ><img
                              style="
                                width: 13px;
                                height: 13px;
                                margin-top: 0px;
                                margin-bottom: 0px;
                              "
                              src="../../assets/images_kim/Views/ModalView/seat-img3.jpg"
                              alt=""
                            />
                            예매 완료
                          </span>
                          <button
                            @click="test99()"
                            style="width: 100px; height: 50px"
                          >
                            결제후 페이지 가기(임시)
                          </button>
                        </div>
                      </div>
                    </div>

                    <!-- TODO: 상영시간 끝 -->
                  </div>
                </div>
                <div v-show="payment">
                  <div class="col-md-8" style="height: 600px">
                    <div class="col-md-5" style="float: left; margin-top: 3%">
                      <img
                        style="height: 500px"
                        :src="data1.posterurln"
                        alt=""
                      />
                    </div>
                    <div
                      class="col-md-7"
                      style="float: right; margin-top: 8%; color: white"
                    >
                      <span style="font-size: 24px; font-weight: bold">
                        {{ data1.movienm }}</span
                      ><span style="font-size: 24px; font-weight: bold"
                        >(2022)</span
                      >
                      <br />
                      <p style="margin: 10px 0 0 0">
                        감독 : {{ data1.directors }}
                      </p>
                      <p style="margin: 0">상영시간 : {{ data1.showtm }} 분</p>
                      <div
                        style="
                          border-bottom: 1px solid #1d1e2c;
                          margin-top: 10px;
                        "
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
                        style="
                          margin-right: 5px;
                          margin-left: 20px;
                          color: #abb7c4;
                        "
                        >관람좌석 :</span
                      ><span
                        v-for="(seat, index) in selected"
                        v-bind:key="index"
                        >{{ seat
                        }}{{ index + 1 < selected.length ? ", " : "" }}</span
                      >
                      <div
                        style="
                          border-bottom: 1px solid #1d1e2c;
                          margin-top: 20px;
                        "
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
                        <router-link to="/mypage"
                          ><button
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
                          </button></router-link
                        >
                      </div>
                    </div>
                  </div>
                  <div
                    class="col-md-4"
                    style="
                      height: 580px;
                      text-align: center;
                      position: relative;
                    "
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
                        <span style="font-size: 16px; color: blueviolet"
                          >DS</span
                        >
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
                      <span style="font-size: 30px; font-weight: bold">{{
                        moviestarttime
                      }}</span>
                      ~ <span>{{ movieendtime }}</span>
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
                      <span>성인 </span>
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
                      <span>성인 </span>
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
                      <span
                        >· 영화 상영시작시간 15분 전까지 취소가 가능하며</span
                      >
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
              </div>
            </div>
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
// import SeatAll from "@/model/SeatAll";
// import user from "@/services/user.service"       // 유저 조회해서 하는건가?

export default {
  props: ["movieProps2"],

  created() {
    custom();
    this.date();
    this.vshowSeat();
  },
  mounted() {
    // window.scrollTo({top: 2250, behavior: "smooth"});  // 맥에서 높이 적당함
    window.scrollTo({ top: 2400, behavior: "smooth" }); // 윈도우에서 높이 적당함

    this.selectedday = this.dateY;
    this.defaultcinema = "centum";
    this.paymentcinema = "센텀시티";
    this.moviecd = this.data1.moviecd;
    this.ticketinfo.selectedday = this.dd;
    this.getUser();

    this.getFindAllByMoviecdAndLocationAndStartday();
  },
  data() {
    return {
      data1: this.movieProps2, //영화데이터 받아오기
      data2: [], // 몰루
      reservation: new Reservation(), // 모델 받아옴 // 나중에 정보를 담아서 백엔드에 보낼꺼임

      People: false,
      runningTime: true,
      모달: true, // 좌석선택하기 전에 좌석을 클릭못하게 막는 모달창
      좌석: true, // 좌석페이지 v-show
      payment: false, // 결제 후에 보여주는 페이지 v-show

      centum: false, // 센텀시티 버튼 누르면 색 변경되는 v-show
      Seomyeon: true, // 센텀시티 버튼 누르면 색 변경되는 v-show
      Busan: true, // 센텀시티 버튼 누르면 색 변경되는 v-show
      moviecd: "", // moviecd 코드를 받아와서 저장하는 곳
      defaultcinema: "", // 화면이 생길때 센텀시티를 넣고 조회 가능하게 하는곳
      selectedday: "", // 날짜 위랑 동일

      amount: 100, // 임시 결제 금액
      totalpay: 0, // 마지막 결제 금액
      결제하기: false, // 좌석숫자랑 인원수랑 맞으면 true로 바뀜
      adultcount: 0, //  성인 인원수 카운트
      teencount: 0, //  청소년 인원수 카운트
      성인: false, // 성인 인원수가 올라가면 false가 true로 바뀜
      청소년: false, // 청소년 인원수가 올라가면 false가 true로 바뀜

      // TODO: 오류 수정 해야됨
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

      time1: true,

      selected: [], // 선택된 좌석 담는 배열

      // selectedseata: [1,1,1,1,1,1,1,1,1,1,1,1,1,1]
      selects99: [],

      Seat: new Seat(), // 모름
      resetseatdataAll: [
        // n값으로 초기화
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
      ],
      seatdataAll: [
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
        "N",
      ], //seatdataAll 에 있는 배열을 옮기고 싶음
      seatAll: [
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

      selects998: ["1A1", "N"], // data2에 있는 좌석데이터를 담는곳 센텀시티
      selects903: ["N"], // 좌석 상태를 날리는 배열 좌석예매할때쓰임
      selects904: ["Y"], // 좌석 상태를 날리는 배열 좌석취소할때쓰임

      Scheduldata: {
        // 선택 정보를 모델에 담아서 보냄
        moviecd: "",
        movienm: "",
        showtm: "",
        tid: "",
        starttime: "",
        endtime: "",
      },

      schedule2: [], // 무비코드 + 영화관 + 날짜 = 그날에 해당되는 시간을 받아 옴

      ticketinfo: [], // 티켓정보를 담는 배열\
      seattest60: [], // 좌석 배열

      paymentcinema: "", // 결제후 영화관 정보
      moviestarttime: "", // 결제후 영화관 정보
      movieendtime: "", // 결제후 영화관 정보
      seattest2: [], // Scon로 검색한 결과가 나옴  []
      schedule_1: null,
      schedule_2: null,
      schedule_3: null,
      schedule_4: null,

      ticketinfor: [], // 티켓정보를 담는 배열
      firstCheck: false,
      secondCheck: false,
      thirdCheck: false,
      fourthCheck: false,

      seattable: [], // 시간을 선택하면 그날 영화관,날짜,상영시간을 클릭하면 데이터가 여기에 담김
      selectPerson: 0, // 시간을 선택해야 인원을 선택할 수 있게 만드는 변수? 몰?루 졸려서 아무생각안남
    };
  },
  methods: {
    // FIXME: 상영시간별 버튼 색상 주기 함수 추가
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
    test99() {
      this.payment = true;
      this.모달 = false;
      this.좌석 = false;
      this.addReservation();
      this.seatcount();
    },

    getFindAllByMoviecdAndLocationAndStartday() {
      // 무비코드 + 영화관 + 날짜 = 그날에 해당되는 시간을 받아 옴
      var moviecd2 = this.moviecd;
      var tempcinema = this.defaultcinema; //이건 영화관을 담는거
      var tempday = this.selectedday; //이건 날짜을 담는거

      console.log(moviecd2);
      console.log(tempcinema);
      console.log(tempday);

      ScheduleDataService.getFindAllByMoviecdAndLocationAndStartday(
        moviecd2,
        tempcinema,
        tempday
      )
        .then((response) => {
          this.schedule2 = response.data;
          console.log("스케쥴이 있으면 나옴 : ",response.data);

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
        .catch((error) => {
          console.log(error);
        });
    },
    resetinfor() {
      this.모달 = true; // 이게 들어가야 인원수를 다시 클릭하라고 할 수 있음 그래야 좌석이 초기화 됨
      this.adultcount = 0; // 금액 초기화
      this.teencount = 0; // 금액 초기화
      this.totalpay = 0; // 금액 초기화
      this.성인 = false; // 글자 초기화
      this.청소년 = false;
      this.결제하기 = false;
      this.selected = [];
    },

    cinema(value) {
      this.time1 = true; // v-for문 가 보임  클릭을 하고 넘어 갔을때 선택된게 남아 있는걸 방지하고자 만듬
      this.selectedday = String(this.yy) + String(this.mm) + String(this.dd); // 영화관을 클릭하면 오늘 날짜가 들어감
      this.selectPerson = 0;
      this.runningTime = true;
      this.resetinfor();
      this.resetSeat();
      if (value == "centum") {
        this.paymentcinema = "센텀시티";
        this.defaultcinema = value; // 선택한 날짜에 센텀시티가 들어감
        this.centum = false;
        this.Seomyeon = true;
        this.Busan = true;
        this.Theater = 1;
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
      } else if (value == "seomyeon") {
        this.paymentcinema = "서면";
        this.defaultcinema = value;
        this.centum = true;
        this.Seomyeon = false;
        this.Busan = true;
        this.Theater = 2;
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
      } else if (value == "busan") {
        this.paymentcinema = "부산대";
        this.defaultcinema = "busan";
        this.centum = true;
        this.Seomyeon = true;
        this.Busan = false;
        this.Theater = 3;
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
      }
      this.getFindAllByMoviecdAndLocationAndStartday();
      this.day1 = false; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day2 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day3 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day4 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      this.day5 = true; // 영화관을 변경을 하면 날짜는 오늘 날짜인 버튼을 보이게함
      console.log(this.paymentcinema);

      // FIXME: 버튼 색상 초기화
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

    selectedtime(value) {
      // 선택된 시간값을 받음 ex) "12:00"
      this.ticketinfo.tickettime = value; // 선택된 시간을 티켓 정보에 넣음
      this.time1 = !this.time1; // v-show
      this.selectPerson = 1; // 시간이 선택되어야 인원을 클릭할 수 있게 만듬 그래야 화면이 이상하게 안나옴
      this.runningTime = false;
      this.People = true;
      this.resetinfor();
      this.resetSeat(); // 좌석 보기 싫음
      this.getfFndByMoviecdAndLocationAndStartdayAndStarttime(); // 시간을 선택하면 실행됨
    },

    getfFndByMoviecdAndLocationAndStartdayAndStarttime() {
      //  그날 스케쥴에 있는 scno를 비교하기 위해서 쓰임
      var moviecd2 = this.moviecd;
      var tempcinema = this.defaultcinema; //이건 영화관을 담는거
      var tempday = this.selectedday; //이건 날짜을 담는거
      var temptime = this.ticketinfo.tickettime;
      console.log(temptime);
      ScheduleDataService.getfFndByMoviecdAndLocationAndStartdayAndStarttime(
        moviecd2,
        tempcinema,
        tempday,
        temptime
      )
        .then((response) => {
          this.seattable = response.data;
          this.moviestarttime = this.seattable[0].starttime;
          this.movieendtime = this.seattable[0].endtime;
          console.log(response.data); // scno가 나옴
          this.getSeatScno(this.seattable[0].scno);
        })
        .catch((error) => {
          console.log(error);
        });
    },

    getSeatScno(scno) {
      // 스케쥴번호에 해당하는 좌석 상태를 가져옴
      SeatDataService.getScno(scno)
        .then((response) => {
          var temp;
          this.seattest2 = [];
          temp = response.data;
          for (let i = 0; i < temp.length; i++) {
            this.seattest2.push(temp[i].seatposition);
          }

          // console.log(this.seattest2);
          this.SeatSet();
        })
        .catch((error) => {
          console.log(error);
        });
    },
    SeatSet() {
      // 데이터 베이스에서 자리가 있는지 확인  TODO:
      for (let k = 0; k < this.seatdataAll.length; k++) {
        // 초기화
        this.seatdataAll[k] = "N";
      }
      // console.log(this.seatdataAll);
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
      // console.log(this.seattest60);
    },

    resetSeat() {
      // 시네마를 클릭 했을때 다른 영화관 좌석이 보이는게 싫어서 만든거임
      let j = 0;
      for (let i = 0; i < 60; i++) {
        if (this.resetseatdataAll[i] == "N") {
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
            this.결제하기 = true;
          }
          if (this.adultcount == 0) {
            this.성인 = false;
          }
        }
      }
    },
    adultplus() {
      if (this.selectPerson == 0) {
        alert("상영시간을 선택하세요.");
      } else {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.");
        } else {
          this.모달 = false;
          this.adultcount++;
          this.결제하기 = false;
          this.성인 = true;
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
          if (this.teencount == 0) {
            this.청소년 = false;
          }
          if (
            this.teencount + this.adultcount == this.selected.length &&
            this.selected.length != 0
          ) {
            this.결제하기 = true;
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
          this.모달 = false;
          this.teencount++;
          this.결제하기 = false;
          this.청소년 = true;
          this.totalpay = this.totalpay + 100;
        }
      }
    },

    unselectedtime() {
      // 시간
      this.time1 = !this.time1;
    },

    // seattest97() {
    //   for (let i = 0; i < this.selected.length; i++) {
    //     BookingService.SelectSeat(this.selected[i], this.selects903[0])
    //         .then((response) => {
    //           console.log(response.data);
    //         })
    //         .catch((e) => {
    //           console.log(e);
    //         });
    //   }
    // },
    seatcount() {
      // 티켓이미지 안에 들어갈 함수
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

    addseat(value) {
      // 클릭을 하면 selected 배열에 담음
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
          this.결제하기 = true;
        }
      }
    },
    deleteseat(value) {
      // 클릭을 하면 selected 배열에서 삭제를 함
      for (let i = 0; i < 5; i++) {
        if (this.selected[i] == value) {
          // F10 이면
          this.selected.splice(i, 1); // 클릭을 하면 selected 배열에서 삭제를 함
          this.Seatupdate(value); // SeatA() 함수 실행
          break;
        }
      }
    },
    Seatupdate(value) {
      // 선택한 좌석 취소를 하면 다시 1로 변경해서 선택 가능한 좌석으로 만듬
      let tempVal = value.substr(0, 1); // 이러면 제일 앞에 있는 알파벳만 짤려서 나옴
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
      this.결제하기 = false;
    },
    Schedulecreate() { 
      this.Scheduldata.moviecd = this.data1.moviecd;
      this.Scheduldata.movienm = this.data1.movienm;
      this.Scheduldata.showtm = this.data1.showtm;
      this.Scheduldata.tid = this.Theater;
      this.Scheduldata.starttime = this.moviestarttime;
      this.Scheduldata.endtime = this.movieendtime;

      BookingService.createSchedule(this.Scheduldata)
        .then((response) => {
          console.log(response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    },

    // 팝콘 구매
    popcorn() {
      alert("현재 스토어서비스는 준비중입니다.");
    },
    getUser() {
      // 종학이 백엔드 데이터 받는 함수
      
      // username = "forbob";
      userService
        .getUserUsername(this.$store.state.auth.user.username)
        .then((response) => {
         this.CurrentUser = response.data;
          console.log("찍히냐????",this.CurrentUser);
          // console.log(response.data);
        })
        .catch((err) => console.log(err));
    },

    addReservation() {
      this.reservation.username =this.$store.state.auth.user.username;
      this.reservation.name = this.CurrentUser.name; // 현재 하드코딩상태 getUser 함수 생성하여 데이터 넣어야함. (류종학, 230109)
      this.reservation.moviecd = this.data1.moviecd;
      this.reservation.movienm = this.data1.movienm;
      this.reservation.rcount = this.adultcount + this.teencount;
      this.reservation.price = this.totalpay;
      this.reservation.paiddate = null;
      this.reservation.rno = null;
      this.reservation.startday = this.selectedday; // 선택한 날짜
      this.reservation.location = this.defaultcinema;
      this.reservation.seat = this.selected;
      this.reservation.starttime = this.moviestarttime;
      this.reservation.endtime = this.movieendtime;

      this.reservation.scno = this.seattable[0].scno;
      console.log("유저데이터",this.$store.state.auth.user);
      ReservationDataService.create(
        this.$store.state.auth.user.username,
        this.reservation
      )
        .then((response) => {
          console.log(response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    },
    week(value) {
      this.resetinfor();
      this.selectPerson = 0; // 시간이 선택되어야 인원을 클릭할 수 있게 만듬 그래야 화면이 이상하게 안나옴
      this.time1 = true;
      this.resetSeat(); // 좌석 보기 싫음
      this.runningTime = true;
      let temp;
      if (value == "day1") {
        this.day1 = false;
        this.day2 = true;
        this.day3 = true;
        this.day4 = true;
        this.day5 = true;
        temp = Number(this.dd);
        this.ticketinfo.selectedday = temp;
        this.selectedday = String(this.yy) + String(this.mm) + String(temp);
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
        this.getFindAllByMoviecdAndLocationAndStartday();
      } else if (value == "day2") {
        this.day1 = true;
        this.day2 = false;
        this.day3 = true;
        this.day4 = true;
        this.day5 = true;
        temp = Number(this.dd) + 1;
        this.ticketinfo.selectedday = temp;
        this.selectedday = String(this.yy) + String(this.mm) + String(temp);
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
        this.getFindAllByMoviecdAndLocationAndStartday();
      } else if (value == "day3") {
        this.day1 = true;
        this.day2 = true;
        this.day3 = false;
        this.day4 = true;
        this.day5 = true;
        temp = Number(this.dd) + 2;
        this.ticketinfo.selectedday = temp;
        this.selectedday = String(this.yy) + String(this.mm) + String(temp);
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
        this.getFindAllByMoviecdAndLocationAndStartday();
      } else if (value == "day4") {
        this.day1 = true;
        this.day2 = true;
        this.day3 = true;
        this.day4 = false;
        this.day5 = true;
        temp = Number(this.dd) + 3;
        this.ticketinfo.selectedday = temp;
        this.selectedday = String(this.yy) + String(this.mm) + String(temp);
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
        this.getFindAllByMoviecdAndLocationAndStartday();
      } else if (value == "day5") {
        this.day1 = true;
        this.day2 = true;
        this.day3 = true; // 버튼 색 변경
        this.day4 = true; // 버튼 색 변경
        this.day5 = false; // 버튼 색 변경
        temp = Number(this.dd) + 4;
        this.ticketinfo.selectedday = temp;
        this.selectedday = String(this.yy) + String(this.mm) + String(temp);
        this.schedule_1 = null;
        this.schedule_2 = null;
        this.schedule_3 = null;
        this.schedule_4 = null;
        this.getFindAllByMoviecdAndLocationAndStartday();
      }
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
    requestPay: function () {
      //1. 객체 초기화 (가맹점 식별코드 삽입)
      var IMP = window.IMP;
      IMP.init("imp03367585");
      //3. 결제창 호출
      IMP.request_pay(
        {
          pg: "html5_inicis",
          pay_method: "card",
          merchant_uid: "merchant_" + new Date().getTime(),
          name: "영화티켓",
          amount: this.totalpay,
          buyer_tel: "000-0000-0000",
          buyer_name: "홍길동",
          buyer_email: "gildong@gmail.com",
        },
        function (rsp) {
          //콜백 함수
          if (rsp.success) {
            //결제 성공
            this.addReservation();
            alert("결제성공");
            this.seattest97();
            this.payment = true;
            this.seatcount();
          } else {
            //결제 실패
            alert("결제실패");
          }
        }
      );
    },
  },
};
</script>

<style lang="scss" scoped>
@import "@/assets/css/style.css";

* {
  font-family: sans-serif;
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
  left: 95%;
}

.selected-btn {
  color: white;
  padding: 9px 24px 9px 9px;
  margin-left: 3px;
}

.selected-btn:hover {
  color: black;
  padding: 9px 22px 9px 9px;
  margin-left: 3px;
  background-color: white;
  width: 55px;
}

.selected-btn:focus {
  color: black;
  padding: 9px 22px 9px 9px;
  margin-left: 3px;
  background-color: white;
  width: 55px;
}
</style>
