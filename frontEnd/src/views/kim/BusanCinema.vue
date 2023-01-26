<template>
  <div v-if="getMovieInfo">
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1 style="text-align:left">DS CINEMA 부산대</h1>
              <ul class="breadcumb" style="text-align:left">
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
              <div
                v-show="극장정보"
                class="col-md-12"
                style="
                  text-align: center;
                  color: white;
                  font-size: 24px;
                  padding: 0;
                "
              >
                <button
                  @click="info()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 0;
                    border-right: #faf8f1 1px solid;
                    border-top: #faf8f1 1px solid;
                    padding: 5px;
                    border-left: 1px solid #faf8f1;
                    color: #F5B409;
                  "
                >
                  <span>극장정보</span>
                </button>
                <button
                  @click="timetable()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 1px solid #faf8f1;
                    border-right: #405266 1px solid;
                    border-top: #405266 1px solid;
                    padding: 5px;
                  "
                >
                  <span>상영시간표</span>
                </button>
                <button
                  @click="event()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 1px solid #faf8f1;
                    border-right: #405266 1px solid;
                    border-top: #405266 1px solid;
                    padding: 5px;
                  "
                >
                  <span>이벤트</span>
                </button>
              </div>

              <div
                v-show="이벤트"
                class="col-md-12"
                style="
                  text-align: center;
                  color: white;
                  font-size: 24px;
                  padding: 0;
                "
              >
                <button
                  @click="info()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 1px solid #faf8f1;
                    border-left: #405266 1px solid;
                    border-top: #405266 1px solid;
                    padding: 5px;
                  "
                >
                  <span>극장정보</span>
                </button>
                <button
                  @click="timetable()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 1px solid #faf8f1;
                    border-right: #405266 1px solid;
                    border-top: #405266 1px solid;
                    padding: 5px;
                  "
                >
                  <span>상영시간표</span>
                </button>
                <button
                  @click="event()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 0;
                    border-right: #faf8f1 1px solid;
                    border-top: #faf8f1 1px solid;
                    padding: 5px;
                    border-left: 1px solid #faf8f1;
                    color: #F5B409;
                  "
                >
                  <span>이벤트</span>
                </button>
              </div>

              <div
                v-show="상영시간표"
                class="col-md-12"
                style="
                  text-align: center;
                  color: white;
                  font-size: 24px;
                  padding: 0;
                "
              >
                <button
                  @click="info()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 1px solid #faf8f1;
                    border-left: #405266 1px solid;
                    border-top: #405266 1px solid;
                    padding: 5px;
                  "
                >
                  <span>극장정보</span>
                </button>
                <button
                  @click="timetable()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 0;
                    border-right: #faf8f1 1px solid;
                    border-top: #faf8f1 1px solid;
                    padding: 5px;
                    border-left: 1px solid #faf8f1;
                    color:#F5B409;
                  "
                >
                  <span>상영시간표</span>
                </button>
                <button
                  @click="event()"
                  class="col-md-4"
                  style="
                    background-color: #020d18;
                    border-bottom: 1px solid #faf8f1;
                    border-left: #405266 1px solid;
                    border-top: #405266 1px solid;
                    padding: 5px;
                  "
                >
                  <span>이벤트</span>
                </button>
              </div>

              <div
                v-show="극장정보"
                class="col-md-12"
                style="
                  padding: 100px 0 0 0;
                  background-color: #020d18;
                  color: white;
                  position: relative;
                "
              >
                <!-- <span style="font-size:28px; padding-bottom: 10px; border-bottom: 1px solid #405266;">부산대</span> -->
                <div v-show="map">
                  <div
                    style="
                      position: absolute;
                      width: 500px;
                      height: 600px;
                      background-color: white;
                      z-index: 30;
                      left: 300px;
                      top: -30px;
                      border-radius: 10px;
                      border: 1px solid;
                    "
                  >
                    <div
                      style="
                        width: 100%;
                        height: 50px;
                        border-radius: 10px 10px 0 0;
                        padding-bottom: 5px;
                        border-bottom: 1px solid #405266;
                      "
                    >
                      <span
                        style="
                          font-size: 24px;
                          color: black;
                          width: 400px;
                          padding-top: 7px;
                          padding-left: 20px;
                          float: left;
                        "
                        >지도</span
                      >
                      <button
                        @click="mapopen()"
                        style="
                          width: 40px;
                          background-color: white;
                          height: 40px;
                          float: right;
                          margin-right: 10px;
                          margin-top: 5px;
                          border: 0;
                        "
                      >
                        <img
                          style="width: 30px; margin: 0"
                          src="@/assets/images_kim/Views/ModalView/xx.png"
                          alt=""
                        />
                      </button>
                    </div>
                    <div style="margin: 25px">
                      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3259.1228860184788!2d129.08764711554218!3d35.22831086228438!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x356893eadd1d30fd%3A0xceae3aedbd055a80!2z67aA7IKw6rSR7Jet7IucIOq4iOygleq1rCDspJHslZnrjIDroZwgMTYwNw!5e0!3m2!1sko!2skr!4v1672760900700!5m2!1sko!2skr" 
                        width="450" height="500" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
                        </iframe>
                    </div>
                  </div>
                </div>
                <div v-show="bus">
                    <div style="position: absolute; width: 600px; height: 400px; background-color: white; z-index: 30; left: 300px; top: -30px; border-radius: 10px; border: 1px solid ;">
                      <div style="width: 100%; height: 50px;border-radius: 10px 10px 0 0; padding-bottom: 5px; border-bottom: 1px solid #405266;">
                        <span style="font-size: 24px;color: black; width: 400px; padding-top: 7px;padding-left: 20px; float: left;">대중교통</span>
                        <button @click="busopen()" style="width: 40px;background-color: white; height: 40px; float: right; margin-right: 10px; margin-top: 5px; border: 0;"><img style="width: 30px;margin: 0;" src="@/assets/images_kim/Views/ModalView/xx.png" alt=""></button>
                      </div>
                      <div style="width: 50px; height: 50px; float: left;">
                        <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-bus-4274245.png" alt="">
                      </div>
                      <div style="width: 480px; margin-left: 70px; float: right; ">
                        <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">버스로 오시는길</p>
                        <p style="margin-bottom:0;color: black;"> · 시내버스</p>
                        <p style="margin-bottom:0;color: black;">347, 144, 130, 130-1, 29, 29-1, 49-1, 51, 77, 80, 80-1, 100, 100-1, 121, 144, 178, 183, 202, 301</p>
                      </div>
                      <div style="width: 50px; height: 50px; float: left;">
                        <img style="margin: 50px 40px 0 30px;" src="@/assets/images_kim/Views/ModalView/free-icon-subway-2385488.png" alt="">
                      </div>
                      <div style="width: 480px; margin-left: 70px; float: right; ">
                        <p style="margin-bottom:0;color: black;font-size: 18px; font-weight: bold;">지하철로 오시는 길</p>
                        <p style="margin-bottom:0;color: black;"> · 1호선 부산대역</p>
                        <p style="margin-bottom:0;color: black;">2번 출구 (전방 횡단보도 이용 > 우측 횡단보도 이용 > <br> 도보 직진 100미터 > 좌측 건물 진입 1층)</p>
                      </div>
                    </div>
                </div>
                <div v-show="car">
                    <div style="position: absolute; width: 600px; height: 200px; background-color: white; z-index: 30; left: 300px; top: 0ㅔㅌ; border-radius: 10px; border: 1px solid ;">
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
                      </div>
                    </div>
                </div>
                <img style="width:100%; margin-bottom: 0;" src="@/assets/images_kim/Views/ModalView/CGVdongnae.jpg" alt="">
                <div style="background-color: black; opacity: 0.8; position: absolute; width: 100%; bottom: 0; left: 0; height: 250px;">
                    <div style="margin-left: 20px; margin-top: 20px;">
                        <h2 style="margin-bottom: 10px;">부산대</h2>
                     <span > &nbsp;&nbsp;&nbsp; · 총 상영관 수 1개관 · 총 좌석수 97석</span>
                     <p style="margin: 0; margin-top: 10px; color: white; font-size: 18px; font-weight: bold;">부산 금정구 중앙대로 1607 (부곡동)</p>
                    </div>

                    <button @click="mapopen()"   style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; height: 1px">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px;  margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-map-1321246.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -140px;">지도</span>
                    </button>
                    <button @click="busopen()"   style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; left: 140px; height: 1px;">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px;  margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-bus-4274245.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -180px;">대중교통</span>
                    </button>
                    <button @click="caropen()"  style="position: relative; background-color: black; opacity: 1;width: 1px;top: 20px; left: 310px; height: 1px;">
                        <div style="margin-top: 20px; margin-left: 20px; width: 80px; height: 80px; background-color: white; border-radius: 40px;">
                            <img style="width: 50px; margin-top: 15px; margin-bottom: 20px;" src="@/assets/images_kim/Views/ModalView/free-icon-car-635651.png" alt="">
                        </div>
                        <span style="font-size: 18px; position: absolute; top: 50px; right: -160px;">자가용</span>
                    </button>
                </div>
               
              </div>

              <!-- 상영시간표 시작  ------------------------------------------------------------------------------------------------>
              <div
                v-show="상영시간표"
                class="col-md-12"
                style="
                  padding: 50px 0 0 0;
                  background-color: #020d18;
                  color: white;
                "
              >
                 <!-- TODO) 탭2 : 부산대 -->
                 <div id="aaaa" class="tab review">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4 class="timeline">{{ yy }}년 {{ mm }}월 {{ dd }}일 {{ Day[dayOrder[0]] }}(오늘) ~ {{ mm }}월 {{ dd+4 }}일 {{ Day[dayOrder[4]] }}</h4>
                          <br />
                          <div class="rv-hd">
                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input id="all" type="radio" name="tab_item" checked/>
                              <label class="tab_item" for="all">{{ Day[dayOrder[0]] }}</label>
                              <input id="tuesday" type="radio" name="tab_item"/>
                              <label class="tab_item" for="tuesday">{{ Day[dayOrder[1]] }}</label>
                              <input id="wednesday" type="radio" name="tab_item"/>
                              <label class="tab_item" for="wednesday">{{ Day[dayOrder[2]] }}</label>
                              <input id="thursday" type="radio" name="tab_item"/>
                              <label class="tab_item" for="thursday">{{ Day[dayOrder[3]] }}</label>
                              <input id="friday" type="radio" name="tab_item" />
                              <label class="tab_item" for="friday">{{ Day[dayOrder[4]] }}</label>
                              <!-- 선택창 끝 -->

                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 월요일 -->
                              <div class="tab_content" id="all_content">
                                <!-- 월요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <router-link :to="'/allMovie/' + data.moviecd">
                                          <span class="movieTitle">{{ data.movienm }}
                                            <i class="ion-ios-arrow-right"></i>
                                          </span>
                                        </router-link>
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="data.posterurln"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <br>
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <span>
                                                  {{ data.showtm}}분,
                                                </span>
                                                <span>{{data.opendt}}개봉</span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[0] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[1] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[2] }}</a>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                    <!-- 상영작 1 ~ 8 끝-->
                                  </div>
                                </div>
                                <!-- 월요일 시간표 끝 -->
                              </div>

                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 화요일 -->
                            <div class="tab_content" id="tuesday_content">
                                <!-- 화요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <router-link :to="'/allMovie/' + data.moviecd">
                                          <span class="movieTitle">{{ data.movienm }}
                                            <i class="ion-ios-arrow-right"></i>
                                          </span>
                                        </router-link>
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="data.posterurln"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <br>
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <span>
                                                  {{ data.showtm}}분,
                                                </span>
                                                <span>{{data.opendt}}개봉</span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[0] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[1] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[2] }}</a>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                    <!-- 상영작 1 ~ 8 끝-->
                                  </div>
                                </div>
                                <!-- 화요일 시간표 끝 -->
                              </div>
                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 수요일 -->
                              <div class="tab_content" id="wednesday_content">
                                <!-- 수요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <router-link :to="'/allMovie/' + data.moviecd">
                                          <span class="movieTitle">{{ data.movienm }}
                                            <i class="ion-ios-arrow-right"></i>
                                          </span>
                                        </router-link>
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="data.posterurln"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <br>
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <span>
                                                  {{ data.showtm}}분,
                                                </span>
                                                <span>{{data.opendt}}개봉</span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[0] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[1] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[2] }}</a>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                    <!-- 상영작 1 ~ 8 끝-->
                                  </div>
                                </div>
                                <!-- 수요일 시간표 끝 -->
                              </div>
                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 목요일 -->
                              <div class="tab_content" id="thursday_content">
                                <!-- 목요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <router-link :to="'/allMovie/' + data.moviecd">
                                          <span class="movieTitle">{{ data.movienm }}
                                            <i class="ion-ios-arrow-right"></i>
                                          </span>
                                        </router-link>
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="data.posterurln"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <br>
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <span>
                                                  {{ data.showtm}}분,
                                                </span>
                                                <span>{{data.opendt}}개봉</span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[0] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[1] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[2] }}</a>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                    <!-- 상영작 1 ~ 8 끝-->
                                  </div>
                                </div>
                                <!-- 목요일 시간표 끝 -->
                              </div>
                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 금요일 -->
                              <div class="tab_content" id="friday_content">
                                <!-- 금요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <router-link :to="'/allMovie/' + data.moviecd">
                                          <span class="movieTitle">{{ data.movienm }}
                                            <i class="ion-ios-arrow-right"></i>
                                          </span>
                                        </router-link>
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="data.posterurln"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <br>
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <span>
                                                  {{ data.showtm}}분,
                                                </span>
                                                <span>{{data.opendt}}개봉</span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[0] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[1] }}</a>
                                                <br>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br>
                                                <br>
                                                <a>{{ pnu[2] }}</a>
                                                <p>{{ data.showtm }}'</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                    <!-- 상영작 1 ~ 8 끝-->
                                  </div>
                                </div>
                                <!-- 금요일 시간표 끝 -->
                              </div>
                              <!-- 내용 끝 -->
                            </div>
                            <!-- 안쪽탭 끝 ---------------------------------------------------------------------------->
                            <!-- 탑 버튼 추가 -->
                            <a class="topbutton" href="#">
                             <img src="@/assets/images_jung/iconUp_48.png"/>
                            </a>
                          </div>
                        </div>
                      </div>
                    </div>

              </div>
              <!-- 상영시간표 끝  ------------------------------------------------------------------------------------------------>

              <div
                v-show="이벤트"
                class="col-md-12"
                style="
                  padding: 100px 0 0 0;
                  background-color: #020d18;
                  color: white;
                "
              >
                <div
                  style="
                    width: 100%;
                    height: 488px;
                    margin-top: 30px;
                    border: 1px solid white;
                    position: relative;
                  "
                >
                  <div
                    style="
                      margin-top: 30px;
                      font-size: 30px;
                      background-color: white;
                      color: #405266;
                      height: 350px;
                      width: 500px;
                      text-align: center;
                      margin-left: 330px;
                    "
                  >
                    서비스 점검중입니다.
                    <img
                      style="width: 50px"
                      src="@/assets/images_kim/Views/ModalView/free-icon-sad-face-in-rounded-square-42901.png"
                      alt=""
                    />
                    <div style="margin-top: 30px">
                      빠른 시일내에 다시 찾아 뵙겠습니다.
                    </div>
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
      <img src="@/assets/images_jung/iconUp_48.png" />
    </a>
  </div>
</template>

<script>
import MovieDataService from "@/services/MovieDataService";
import custom from "@/assets/js/custom";

export default {
  data() {
    return {
      극장정보: true,
      이벤트: false,
      상영시간표: false,
      map: false,
      bus: false,
      car: false,

      // 상영시간표
      movie: [],
      Day : [
        "일요일",
        "월요일",
        "화요일",
        "수요일",
        "목요일",
        "금요일",
        "토요일",
      ],
      yy: "", // 년도
      mm: "", // 월
      dd: "", // 일
      today: 0,
      dayOrder: [], // 요일을 순서대로 출력
      pnu: ["10:30", "16:00"], // 나중에 테스트 할 시간 데이터
      selectedday: [], // 선택된 날짜를 담는 배열
    };
  },
  methods: {
    // 영화코드(moviecd)로 조회 요청하는 함수
    getMovieInfo() {
      MovieDataService.getMovieAll()
        .then((response) => {
          this.movie = response.data;
          console.log("response.data: ", response.data);
          console.log("MovieData: ", this.movie);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    // 날짜에 맞는 요일 표시
    date() {
      var date = new Date();
      this.yy = date.getFullYear(); // 년도
      this.mm = date.getMonth() + 1; // 월 , 달
      this.dd = date.getDate(); // 일수
      this.today = date.getDay(); // 요일

      let i = this.today;
      for (i; i <= 6; i++) {
        this.dayOrder += i;
      }
      let j = 0;
      for (j; j < this.today; j++) {
        this.dayOrder += j;
      }
    },

    // 클릭시 날짜 정보 넘기기
    week(value) {
      if (this.ticketinfor.selectedday != null) {
        this.ticketinfor.selectedday = "";
      }
      if (value == "day1") {
        this.오늘 = false;
        this.내일 = true;
        this.요일3 = true;
        this.요일4 = true;
        this.요일5 = true;
        this.ticketinfor.selectedday = value;
      } else if (value == "day2") {
        this.오늘 = true;
        this.내일 = false;
        this.요일3 = true;
        this.요일4 = true;
        this.요일5 = true;
        this.ticketinfor.selectedday = value;
      } else if (value == "day3") {
        this.오늘 = true;
        this.내일 = true;
        this.요일3 = false;
        this.요일4 = true;
        this.요일5 = true;
        this.ticketinfor.selectedday = value;
      } else if (value == "day4") {
        this.오늘 = true;
        this.내일 = true;
        this.요일3 = true;
        this.요일4 = false;
        this.요일5 = true;
        this.ticketinfor.selectedday = value;
      } else if (value == "day5") {
        this.오늘 = true;
        this.내일 = true;
        this.요일3 = true;
        this.요일4 = true;
        this.요일5 = false;
        this.ticketinfor.selectedday = value;
      }
    },

    info() {
      this.극장정보 = true;
      this.상영시간표 = false;
      this.이벤트 = false;
    },
    timetable() {
      this.극장정보 = false;
      this.상영시간표 = true;
      this.이벤트 = false;
    },
    event() {
      this.극장정보 = false;
      this.상영시간표 = false;
      this.이벤트 = true;
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
  mounted() {
    this.getMovieInfo();
    this.date();
    custom();
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
/* 탭 전체 스타일 */
.InsideTab {
  margin-top: 50px;
  padding-bottom: 40px;
  background-color: #ffffff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
  width: 1000px;
  margin: 0 auto;
}

/* 탭 스타일 */
.tab_item {
  width: calc(100% / 5);
  height: 50px;
  border-bottom: 3px solid #333333;
  background-color: #f8f8f8;
  line-height: 50px;
  font-size: 16px;
  text-align: center;
  color: #333333;
  display: block;
  float: left;
  text-align: center;
  font-weight: bold;
  transition: all 0.2s ease;
}
.tab_item:hover {
  opacity: 0.75;
}

/* 라디오 버튼 UI삭제*/
input[name="tab_item"] {
  display: none;
}

/* 탭 컨텐츠 스타일 */
/* height 1300 -> 시간표에 영화 10개 표시 */
.tab_content {
  display: none;
  padding: 40px 40px 0;
  /* height: 1300px; */
  clear: both;
  overflow: hidden;
}

/* 선택 된 탭 콘텐츠를 표시 */
#all:checked ~ #all_content,
#tuesday:checked ~ #tuesday_content,
#wednesday:checked ~ #wednesday_content,
#thursday:checked ~ #thursday_content,
#friday:checked ~ #friday_content {
  display: block;
}

/* 선택된 탭 스타일 _변경 */
input:checked + .tab_item {
  background-color: #333333;
  color: #fff;
}

/* 상영시간표 영화포스터 */
.poster_thumb {
  width: 100px;
  height: 130px;
  border-radius: 0%;
}
.movieTitle {
  color: darkblue;
  font-weight: bold;
}

.movieInfo {
  margin-top: 10px;
  color:cadetblue;
}

.movieIng {
  margin-top: 10px;
  margin-bottom: 0;
}

/* 탑버튼 추가_정주희*/
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}

/* 간격 좁히기 수정 */
.topbar-filter p {
  margin-bottom: 0%;
}

.user-infor{
  color: #333333;
}

.timeline{
  text-align: center;
  margin-block: 20px;
}
</style>
