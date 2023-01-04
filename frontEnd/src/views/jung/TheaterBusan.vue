<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>DS CINEMA 상영시간표</h1>
              <ul class="breadcumb">
                <li class="active"><router-link to="/">Home</router-link></li>
                <li><span class="ion-ios-arrow-right"></span>TIME TABLE</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- 영화관 테스트 시작 -->
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="movie-single-ct main-content">
              <div class="movie-tabs">
                <div class="tabs">
                  <!-- TODO: 탭 바 -->
                  <ul class="tab-links tabs-mv">
                    <li class="active"><a href="#overview">전체 상영관</a></li>
                    <li><a href="#aaaa">서면</a></li>
                    <li><a href="#bbbb">센텀시티</a></li>
                    <li><a href="#cccc">부산대</a></li>
                  </ul>

                  <!-- TODO: 탭 내용 -->
                  <div class="tab-content">
                    <!-- TODO) 탭1 : 전체상영관 -->
                    <div id="overview" class="tab active">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4>DS CINEMA 부산</h4>
                          <br />
                          <p>
                            2023년 1월 둘째주 : 01/09(월) ~ 01/13(금)
                          </p>

                          <!-- 전체 상영시간표 시작 -->
                          <div class="row" v-for="(dataAll, indexAll) in movie" v-bind:key="indexAll">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                              <div class="title-hd-sm">
                                <a href="#" class="time"
                                  >{{ dataAll.movienm }}<i
                                    class="ion-ios-arrow-right"
                                  ></i
                                ></a>
                                <h4>dd</h4>
                              </div>
                              <!-- 시간표 시작 -->
                              <div class="movieIng">
                                <div class="col row">
                                  <div class="col-ms-12">
                                    <div class="user-infor col-ms-4">
                                      <div class="col-xs-2">
                                        <img
                                          :src="dataAll.posterurlkm"
                                          alt="poster"
                                          class="poster_thumb"
                                          :href="data"
                                        />
                                      </div>
                                      <div class="col-xs-2 movieInfo">
                                        <span>
                                          {{ dataAll.genrenm}}
                                        </span> 
                                        <br>
                                        <span>
                                          {{ dataAll.showtm}}분,
                                        </span><br>
                                        <span>{{dataAll.opendt}}개봉</span>
                                      </div>
                                    </div>

                                    <div class="user-infor col-ms-8">
                                      <div
                                        class="mv-user-review-item col-xs-2"
                                      >
                                      <router-link to="/reserveTicket">10:30<p>(서면)</p></router-link>
                                      <router-link to="/reserveTicket">10:30<p>(센텀시티)</p></router-link>
                                      <router-link to="/reserveTicket">10:30<p>(부산대)</p></router-link>
                                      </div>
                                      
                                      <div
                                        class="mv-user-review-item col-xs-2"
                                      >
                                      <router-link to="/reserveTicket">12:30<p>(서면)</p></router-link>
                                      <router-link to="/reserveTicket">12:30<p>(센텀시티)</p></router-link>
                                      <router-link to="/reserveTicket">12:30<p>(부산대)</p></router-link>
                                      </div>
                                      <div
                                        class="mv-user-review-item col-xs-2"
                                      >
                                      <router-link to="/reserveTicket">14:30<p>(서면)</p></router-link>
                                      <router-link to="/reserveTicket">15:30<p>(센텀시티)</p></router-link>
                                      <router-link to="/reserveTicket">16:30<p>(부산대)</p></router-link>
                                      </div>
                                    </div>
                                  </div>
                                </div>
                              </div>  
                            </div>
                          </div>
                          <!-- 전체 상영시간표 끝-->
                          <!-- FIXME: 탑 버튼 추가 -->
                          <a class="topbutton" href="#">
                             <img src="@/assets/images_jung/iconUp_48.png"/>
                          </a>
                          <!-- <a target="_blank" href="https://icons8.com/icon/63247/%EC%9B%90-%EC%85%B0%EB%B8%8C%EB%A1%A0-%EC%B5%9C%EB%8C%80">원 셰브론 최대</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a> -->
                       
                        </div>
                      </div>
                    </div>

                    <!-- TODO) 탭2 : 서면 -->
                    <div id="aaaa" class="tab review">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4>2023년 1월 둘째주 : 01/09(월) ~ 01/13(금)</h4>
                          <br />
                          <div class="rv-hd">
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                            <div class="topbar-filter">
                              <p>DS CINEMA 서면</p>
                              <h4>20230109 - 20230113</h4>
                            </div>


                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input id="all" type="radio" name="tab_item" checked/>
                              <label class="tab_item" for="all">월</label>
                              <input id="tuesday" type="radio" name="tab_item"/>
                              <label class="tab_item" for="tuesday">화</label>
                              <input id="wednesday" type="radio" name="tab_item"/>
                              <label class="tab_item" for="wednesday">수</label>
                              <input id="thursday" type="radio" name="tab_item"/>
                              <label class="tab_item" for="thursday">목</label>
                              <input id="friday" type="radio" name="tab_item" />
                              <label class="tab_item" for="friday">금</label>
                              <!-- 선택창 끝 -->

                              <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택 >>> 월요일 -->
                              <div class="tab_content" id="all_content">
                                <!-- 월요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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

                              <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택 >>> 화요일 -->
                              <div class="tab_content" id="tuesday_content">
                                <!-- 화요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택 >>> 수요일 -->
                              <div class="tab_content" id="wednesday_content">
                                <!-- 수요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택 >>> 목요일 -->
                              <div class="tab_content" id="thursday_content">
                                <!-- 목요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택 >>> 금요일 -->
                              <div class="tab_content" id="friday_content">
                                <!-- 금요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                            <!-- FIXME: 탑 버튼 추가 -->
                            <a class="topbutton" href="#">
                             <img src="@/assets/images_jung/iconUp_48.png"/>
                            </a>
                            <!-- <a target="_blank" href="https://icons8.com/icon/63247/%EC%9B%90-%EC%85%B0%EB%B8%8C%EB%A1%A0-%EC%B5%9C%EB%8C%80">원 셰브론 최대</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a> -->
                          </div>
                        </div>
                        <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                      </div>
                    </div>

                    <!-- TODO) 탭3 : 센텀시티 -->
                    <div id="bbbb" class="tab">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4>2023년 1월 둘째주 : 01/09(월) ~ 01/13(금)</h4>
                          <br />
                          <div class="rv-hd">
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                            <div class="topbar-filter">
                              <p>DS CINEMA 센텀시티</p>
                              <h4>20230109 - 20230113</h4>
                            </div>

                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input id="all2" type="radio" name="tab_item" checked/>
                              <label class="tab_item" for="all2">월</label>
                              <input id="tuesday2" type="radio" name="tab_item"/>
                              <label class="tab_item" for="tuesday2">화</label>
                              <input id="wednesday2" type="radio" name="tab_item"/>
                              <label class="tab_item" for="wednesday2">수</label>
                              <input id="thursday2" type="radio" name="tab_item"/>
                              <label class="tab_item" for="thursday2">목</label>
                              <input id="friday2" type="radio" name="tab_item"/>
                              <label class="tab_item" for="friday2">금</label>
                              <!-- 선택창 끝 -->

                              <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택 >>> 월요일 -->
                              <div class="tab_content" id="all2_content">
                                <!-- 월요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택 >>> 화요일 -->
                              <div class="tab_content" id="tuesday2_content">
                                <!-- 화요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택 >>> 수요일 -->
                              <div class="tab_content" id="wednesday2_content">
                                <!-- 수요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택 >>> 목요일 -->
                              <div class="tab_content" id="thursday2_content">
                                <!-- 목요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택 >>> 금요일 -->
                              <div class="tab_content" id="friday2_content">
                                <!-- 금요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                            <!-- FIXME: 탑 버튼 추가 -->
                            <a class="topbutton" href="#">
                             <img src="@/assets/images_jung/iconUp_48.png"/>
                            </a>
                            <!-- <a target="_blank" href="https://icons8.com/icon/63247/%EC%9B%90-%EC%85%B0%EB%B8%8C%EB%A1%A0-%EC%B5%9C%EB%8C%80">원 셰브론 최대</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a> -->
                          </div>
                        </div>
                      </div>
                    </div>

                    <!-- TODO) 탭4 : 부산대 -->
                    <div id="cccc" class="tab">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4>2023년 1월 둘째주 : 01/09(월) ~ 01/13(금)</h4>
                          <br />
                          <div class="rv-hd">
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                            <div class="topbar-filter">
                              <p>DS CINEMA 부산대</p>
                              <h4>20230109 - 20230113</h4>
                            </div>

                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input id="all3" type="radio" name="tab_item" checked/>
                              <label class="tab_item" for="all3">월</label>
                              <input id="tuesday3" type="radio" name="tab_item"/>
                              <label class="tab_item" for="tuesday3">화</label>
                              <input id="wednesday3" type="radio" name="tab_item"/>
                              <label class="tab_item" for="wednesday3">수</label>
                              <input id="thursday3" type="radio" name="tab_item"/>
                              <label class="tab_item" for="thursday3">목</label>
                              <input id="friday3" type="radio" name="tab_item"/>
                              <label class="tab_item" for="friday3">금</label>
                              <!-- 선택창 끝 -->

                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 월요일 -->
                              <div class="tab_content" id="all3_content">
                                <!-- 월요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <div class="tab_content" id="tuesday3_content">
                                <!-- 화요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <div class="tab_content" id="wednesday3_content">
                                <!-- 수요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <div class="tab_content" id="thursday3_content">
                                <!-- 목요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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
                              <div class="tab_content" id="friday3_content">
                                <!-- 금요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div v-for="(data, index) in movie" v-bind:key="index">
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle" 
                                          >{{ data.movienm }} </a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <!-- TODO: 이미지 url 안 나옴 FIXME: -->
                                                <img
                                                  :src="data.posterurlkm"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  {{ data.genrenm}}
                                                </span> 
                                                <br>
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
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">10:30</router-link>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">12:30</router-link>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <router-link to="/reserveTicket">14:30</router-link>
                                                <p>17:30</p>
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

                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                            <!-- FIXME: 탑 버튼 추가 -->
                            <a class="topbutton" href="#">
                             <img src="@/assets/images_jung/iconUp_48.png"/>
                            </a>
                            <!-- <a target="_blank" href="https://icons8.com/icon/63247/%EC%9B%90-%EC%85%B0%EB%B8%8C%EB%A1%A0-%EC%B5%9C%EB%8C%80">원 셰브론 최대</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a> -->
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
      </div>
    </div>
  </div>
</template>

<script>
import custom from "@/assets/js/custom";
import MovieDataService from "@/services/MovieDataService";

export default {
  data() {
    return {
      movie: [],
    };
  },
  methods: {
    // 영화코드(moviecd)로 조회 요청하는 함수
    getMovieInfo() {
      MovieDataService.getMovieAll()
        .then((response) => {
          this.movie = response.data;
          console.log(response.data);

          // 가져온 이미지 url 개수
          // this.imageUrlLength = this.movie.imgurl.length;
          // 썸네일 이미지 2장만 보이게 설정
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    custom();
    this.getMovieInfo();
  },
};
</script>

<style scoped>
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
  height: 1300px;
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

#all2:checked ~ #all2_content,
#tuesday2:checked ~ #tuesday2_content,
#wednesday2:checked ~ #wednesday2_content,
#thursday2:checked ~ #thursday2_content,
#friday2:checked ~ #friday2_content {
  display: block;
}

#all3:checked ~ #all3_content,
#tuesday3:checked ~ #tuesday3_content,
#wednesday3:checked ~ #wednesday3_content,
#thursday3:checked ~ #thursday3_content,
#friday3:checked ~ #friday3_content {
  display: block;
}

/* 선택된 탭 스타일 */
.tabs input:checked + .tab_item {
  background-color: #333333;
  color: #fff;
}

/* 상영시간표 영화포스터 */
.poster_thumb {
  width: 80px;
  height: 100px;
}
.movieTitle {
  color: darkblue;
  font-weight: bold;
}

.movieInfo {
  margin-top: 10px;
}

.movieIng {
  margin-top: 10px;
}

/* 배경이미지 : 아리걸로 통일 */
.hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
  /* height: 598px; */
  width: 100%;
}

/* 탑버튼 */
.topbutton{
    position:fixed; bottom:15px; right:15px; width:40px; height:40px; z-index:1; opacity:0.8;
}

</style>
