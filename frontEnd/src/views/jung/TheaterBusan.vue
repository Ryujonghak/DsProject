<template>
  <div>
    test
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>영화관 정보</h1>
              <ul class="breadcumb">
                <li class="active"><router-link to="/">Home</router-link></li>
                <li><span class="ion-ios-arrow-right"></span>Theater</li>
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
          <!-- <div class="col-md-8 col-sm-12 col-xs-12"> -->
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
                    <!-- TODO) 탭 : 전체상영관 -->
                    <div id="overview" class="tab active">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4>DS CINEMA 부산</h4>
                          <br />
                          <p>
                            시네마설명..? 서면, 센텀시티, 부산대 총 3개의 관
                            Tony Stark creates the Ultron Program to protect the
                            world, but when the peacekeeping program becomes
                            Earth's mightiest heroes must come together once
                            again to protect the world from global extinction.
                          </p>

                          <!-- 상영관 정보 1 -->
                          <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                              <div class="title-hd-sm">
                                <h4>서면</h4>
                                <a href="#" class="time"
                                  >자세한 영화관정보<i
                                    class="ion-ios-arrow-right"
                                  ></i
                                ></a>
                              </div>
                              <div class="col-xs-12">
                                <div class="mvsingle-item ov-item col-xs-4">
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image11.jpg"
                                    ><img
                                      src="images/uploads/image1.jpg"
                                      alt=""
                                  /></a>
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image21.jpg"
                                    ><img
                                      src="images/uploads/image2.jpg"
                                      alt=""
                                  /></a>
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image31.jpg"
                                    ><img
                                      src="images/uploads/image3.jpg"
                                      alt=""
                                  /></a>
                                </div>
                                <div class="col-xs-8">
                                  <h1>약도사진</h1>
                                </div>
                              </div>
                            </div>
                          </div>

                          <!-- 상영관 정보 2 -->
                          <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                              <div class="title-hd-sm">
                                <h4>센텀시티</h4>
                                <a href="#" class="time"
                                  >자세한 영화관정보<i
                                    class="ion-ios-arrow-right"
                                  ></i
                                ></a>
                              </div>
                              <div class="col-xs-12">
                                <div class="mvsingle-item ov-item col-xs-4">
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image11.jpg"
                                    ><img
                                      src="images/uploads/image1.jpg"
                                      alt=""
                                  /></a>
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image21.jpg"
                                    ><img
                                      src="images/uploads/image2.jpg"
                                      alt=""
                                  /></a>
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image31.jpg"
                                    ><img
                                      src="images/uploads/image3.jpg"
                                      alt=""
                                  /></a>
                                </div>
                                <div class="col-xs-8">
                                  <h1>약도사진</h1>
                                </div>
                              </div>
                            </div>
                          </div>

                          <!-- 상영관 정보 3 -->
                          <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                              <div class="title-hd-sm">
                                <h4>부산대</h4>
                                <a href="#" class="time"
                                  >자세한 영화관정보<i
                                    class="ion-ios-arrow-right"
                                  ></i
                                ></a>
                              </div>
                              <div class="col-xs-12">
                                <div class="mvsingle-item ov-item col-xs-4">
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image11.jpg"
                                    ><img
                                      src="images/uploads/image1.jpg"
                                      alt=""
                                  /></a>
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image21.jpg"
                                    ><img
                                      src="images/uploads/image2.jpg"
                                      alt=""
                                  /></a>
                                  <a
                                    class="img-lightbox"
                                    data-fancybox-group="gallery"
                                    href="images/uploads/image31.jpg"
                                    ><img
                                      src="images/uploads/image3.jpg"
                                      alt=""
                                  /></a>
                                </div>
                                <div class="col-xs-8">
                                  <h1>약도사진</h1>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>

                    <!-- TODO) 탭 : 서면 -->
                    <div id="aaaa" class="tab review">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <div class="rv-hd">
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->

                            <!-- ------------------------------------ -->
                            <div class="shcedule">
                            <div class="tabs">
                              <!-- TODO: 탭 바 -->
                              <ul class="tab-links tabs-mv">
                                <li class="active">
                                  <a href="#overview">월</a>
                                </li>
                                <li><a href="#2nd">화</a></li>
                                <li><a href="#3rd">수</a></li>
                                <li><a href="#4th">목</a></li>
                                <li><a href="#5th">금</a></li>
                              </ul>

                              <!-- TODO: 탭 내용 -->
                              <div class="tab-content">
                                <!-- TODO) 탭 : 월 -->
                                <div id="overview" class="tab active">
                                  <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                      <h4>DS CINEMA 부산</h4>
                                    </div>
                                  </div>
                                </div>
                              </div>
                            </div>
                              <!-- ------------------------------------ -->
                            </div>
                            <div class="topbar-filter">
                              <p>DS CINEMA 서면</p>
                              <select>
                                <option value="popularity">개봉일순</option>
                                <option value="popularity">개봉예정작</option>
                              </select>
                            </div>

                            <div class="title-hd-sm">
                              <h4>2023년 1월 9일 - 1월 13일</h4>
                            </div>
                            <div class="topbar-filter">
                              <div class="mv-user-review-item">
                                <div class="user-infor">
                                  <img src="images/uploads/cast1.jpg" alt="" />
                                  <a href="#">영웅</a>
                                </div>
                                <p>Run Time: 2h 21'</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>10:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>12:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>17:50</p>
                              </div>
                            </div>

                            <div class="topbar-filter">
                              <div class="mv-user-review-item">
                                <div class="user-infor">
                                  <img src="images/uploads/cast1.jpg" alt="" />
                                  <a href="#">영웅</a>
                                </div>
                                <p>Run Time: 2h 21'</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>10:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>12:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>17:50</p>
                              </div>
                            </div>
                          </div>
                        </div>
                        <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                        <div class="col-md-12 col-sm-12 col-xs-12"></div>
                      </div>

                      <!-- TODO) 탭 : 센텀시티 -->
                      <div id="bbbb" class="tab">
                        <div class="row">
                          <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="rv-hd">
                              <div class="div"></div>
                              <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                            </div>
                            <div class="topbar-filter">
                              <p>DS CINEMA 센텀시티</p>
                              <select>
                                <option value="popularity">개봉일순</option>
                                <option value="popularity">개봉예정작</option>
                              </select>
                            </div>

                            <div class="title-hd-sm">
                              <h4>2022년 12 / 21 - 12 / 26</h4>
                            </div>
                            <div class="topbar-filter">
                              <div class="mv-user-review-item">
                                <div class="user-infor">
                                  <img src="images/uploads/cast1.jpg" alt="" />
                                  <a href="#">영웅</a>
                                </div>
                                <p>Run Time: 2h 21'</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>10:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>12:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>17:50</p>
                              </div>
                            </div>

                            <div class="topbar-filter">
                              <div class="mv-user-review-item">
                                <div class="user-infor">
                                  <img src="images/uploads/cast1.jpg" alt="" />
                                  <a href="#">영웅</a>
                                </div>
                                <p>Run Time: 2h 21'</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>10:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>12:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>17:50</p>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>

                      <!-- TODO) 탭 : 부산대 -->
                      <div id="cccc" class="tab">
                        <div class="row">
                          <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="rv-hd">
                              <div class="div"></div>
                              <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                            </div>
                            <div class="topbar-filter">
                              <p>DS CINEMA 부산대</p>
                              <select>
                                <option value="popularity">개봉일순</option>
                                <option value="popularity">개봉예정작</option>
                              </select>
                            </div>

                            <div class="title-hd-sm">
                              <h4>2022년 12 / 21 - 12 / 26</h4>
                            </div>
                            <div class="topbar-filter">
                              <div class="mv-user-review-item">
                                <div class="user-infor">
                                  <img src="images/uploads/cast1.jpg" alt="" />
                                  <a href="#">영웅</a>
                                </div>
                                <p>Run Time: 2h 21'</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>10:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>12:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>17:50</p>
                              </div>
                            </div>

                            <div class="topbar-filter">
                              <div class="mv-user-review-item">
                                <div class="user-infor">
                                  <img src="images/uploads/cast1.jpg" alt="" />
                                  <a href="#">영웅</a>
                                </div>
                                <p>Run Time: 2h 21'</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>10:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>12:30</p>
                              </div>
                              <div class="mv-user-review-item">
                                <p>17:50</p>
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
    </div>
  </div>
</template>

<script>
import custom from "@/assets/js/custom";

export default {
  mounted() {
    custom();
  },
};
</script>

<style></style>
