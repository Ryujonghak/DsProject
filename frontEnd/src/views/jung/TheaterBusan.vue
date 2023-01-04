<template>
  <div>
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

                    <!-- TODO) 탭2 : 서면 -->
                    <div id="aaaa" class="tab review">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <div class="rv-hd">
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->

                            <!-- <div class="topbar-filter">
                              <p>DS CINEMA 서면</p>
                              <h4>2023년 1월 9일 - 1월 13일</h4>
                            </div> -->

                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 서면 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input
                                id="all"
                                type="radio"
                                name="tab_item"
                                checked
                              />
                              <label class="tab_item" for="all">월</label>
                              <input
                                id="tuesday"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="tuesday">화</label>
                              <input
                                id="wednesday"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="wednesday">수</label>
                              <input
                                id="thursday"
                                type="radio"
                                name="tab_item"
                              />
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                          </div>
                        </div>
                        <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                      </div>
                      </div>

                      <!-- TODO) 탭3 : 센텀시티 -->
                      <div id="bbbb" class="tab">
                        <div class="row">
                          <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="rv-hd">
                              
                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input
                                id="all2"
                                type="radio"
                                name="tab_item"
                                checked
                              />
                              <label class="tab_item" for="all2">월</label>

                              <input
                                id="tuesday2"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="tuesday2">화</label>

                              <input
                                id="wednesday2"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="wednesday2">수</label>

                              <input
                                id="thursday2"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="thursday2">목</label>

                              <input id="friday2" type="radio" name="tab_item" />
                              <label class="tab_item" for="friday2">금</label>
                              <!-- 선택창 끝 -->

                              <!-- todo) 탭2 : 센텀시티 ---- 탭 시간표 선택 >>> 월요일 -->
                              <div class="tab_content" id="all2_content">
                                <!-- 월요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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

                            </div>
                          </div>
                        </div>
                      </div>

                      <!-- TODO) 탭4 : 부산대 -->
                      <div id="cccc" class="tab">
                        <div class="row">
                          <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="rv-hd">

                            <!-- 안쪽탭 ---------------------------------------------------------------------------->
                            <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택-->
                            <div class="InsideTab">
                              <!-- 선택창 시작 -->
                              <input
                                id="all3"
                                type="radio"
                                name="tab_item"
                                checked
                              />
                              <label class="tab_item" for="all3">월</label>

                              <input
                                id="tuesday3"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="tuesday3">화</label>

                              <input
                                id="wednesday3"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="wednesday3">수</label>

                              <input
                                id="thursday3"
                                type="radio"
                                name="tab_item"
                              />
                              <label class="tab_item" for="thursday3">목</label>

                              <input id="friday3" type="radio" name="tab_item" />
                              <label class="tab_item" for="friday3">금</label>
                              <!-- 선택창 끝 -->

                              <!-- todo) 탭2 : 부산대 ---- 탭 시간표 선택 >>> 월요일 -->
                              <div class="tab_content" id="all3_content">
                                <!-- 월요일 시간표 시작 -->
                                <div class="topbar-filter">
                                  <div class="mv-user-review-item">
                                    <!-- 상영작 1 ~ 8 시작-->
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
                                    <div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
                                                <p>17:30</p>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="movieIng">
                                        <a href="#" class="movieTitle"
                                          >눈의여왕5: 스노우프린세스와
                                          미러랜드의 비밀</a
                                        >
                                        <div class="col row">
                                          <div class="col-ms-10">
                                            <div class="user-infor col-ms-6">
                                              <div class="col-xs-2">
                                                <img
                                                  :src="Movie.posterURL"
                                                  alt="poster"
                                                  class="poster_thumb"
                                                />
                                              </div>
                                              <div class="col-xs-3 movieInfo">
                                                <span>
                                                  상영중 액션, 어드벤처, SF,
                                                  스릴러/ 192분/ 2022.12.14 개봉
                                                </span>
                                              </div>
                                              <div class="col-xs-1"></div>
                                            </div>

                                            <div class="user-infor col-ms-6">
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>10:30</p></a>
                                                <p>13:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>12:30</p></a>
                                                <p>15:30</p>
                                              </div>
                                              <div
                                                class="mv-user-review-item col-xs-2"
                                              >
                                                <br />
                                                <!-- 시작시간, 끝나는 시간 -->
                                                <a href="#"><p>14:30</p></a>
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
      movie: null,
      
    };
  },
  methods: {
    getMovie(moviecd) {
      MovieDataService.getMovieDetail(moviecd)
        .then((response) => {
          this.movie = response.data.MovieDetail[0];
          console.log(response.data);

          this.movie.actor = this.movie.actor.split(",");
          this.movie.cast = this.movie.cast.split(",");
          this.movie.imgurl = this.movie.imgurl.split(",");
          // 가져온 이미지 url 개수
          this.imageUrlLength = this.movie.imgurl.length;
          // 썸네일 이미지 2장만 보이게 설정
          this.tempImgUrl[0] = this.movie.imgurl[0];
          this.tempImgUrl[1] = this.movie.imgurl[1];
          // 데이터 들어온 평점 내림하기 (별 반복문 돌리기 위해서)
          this.starRating = Math.floor(this.movie.raiting);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    custom();
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
/* height 1100 -> 시간표에 영화 8개 표시 */
.tab_content {
  display: none;
  padding: 40px 40px 0;
  height: 1100px;
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
</style>
