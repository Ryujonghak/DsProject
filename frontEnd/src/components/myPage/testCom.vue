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
                  <!-- 탭 바 -->
                  <ul class="tab-links tabs-mv">
                    <li class="active"><a href="#overview">전체 상영관</a></li>
                    <li><a href="#aaaa">가산디지털</a></li>
                    <li><a href="#bbbb">강동</a></li>
                    <li><a href="#cccc">건대입구</a></li>
                  </ul>

                  <!-- TODO) 탭 : 전체 상영관 -->
                  <div class="tab-content">
                    <!-- class="tab active"로 해야 전체 내용 보임 -->
                    <!-- tab overview로 하면 상영시간표만 보임 -->
                    <div id="overview" class="tab active">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <h4>DS CINEMA 서울</h4>
                          <br />
                          <p>
                            시네마설명..? 가산디지털, 강동, 건대입구 총 3개의 관
                            Tony Stark creates the Ultron Program
                            to protect the world, but when the peacekeeping
                            program becomes Earth's mightiest heroes must come
                            together once again to protect the world from global
                            extinction.
                          </p>

                          <!-- 상영관 정보 1 -->
                          <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                              <div class="title-hd-sm">
                                <h4>가산디지털</h4>
                                <a href="#" class="time"
                                  >전체 시간표 보기<i
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
                                <h4>강동</h4>
                                <a href="#" class="time"
                                  >전체 시간표 보기<i
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
                                <h4>건대입구</h4>
                                <a href="#" class="time"
                                  >전체 시간표 보기<i
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

                    <!-- TODO) 탭 : 가산디지털 -->
                    <div id="aaaa" class="tab review">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <div class="rv-hd">
                            <div class="div">
                            </div>
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                          </div>
                          <div class="topbar-filter">
                            <p>DS CINEMA 가산디지털</p>
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
                          <!-- 페이지 -->
                          <div class="topbar-filter">
                            <label>Reviews per page:</label>
                            <select>
                              <option value="range">5 Movie</option>
                              <option value="saab">10 Movie</option>
                            </select>
                            <div class="pagination2">
                              <span>Page 1 of 6:</span>
                              <a class="active" href="#">1</a>
                              <a href="#">2</a>
                              <a href="#">3</a>
                              <a href="#">4</a>
                              <a href="#">5</a>
                              <a href="#">6</a>
                              <a href="#"><i class="ion-arrow-right-b"></i></a>
                            </div>
                          </div>
                        </div>
                      </div>
                      <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                      <div class="col-md-12 col-sm-12 col-xs-12"></div>
                    </div>

                    <!-- TODO) 탭 : 강동 -->
                    <!-- <div id="cast" class="tab"> -->
                    <div id="bbbb" class="tab">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <div class="rv-hd">
                            <div class="div">
                            </div>
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                          </div>
                          <div class="topbar-filter">
                            <p>DS CINEMA 강동</p>
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
                          <!-- 페이지 -->
                          <div class="topbar-filter">
                            <label>Reviews per page:</label>
                            <select>
                              <option value="range">5 Movie</option>
                              <option value="saab">10 Movie</option>
                            </select>
                            <div class="pagination2">
                              <span>Page 1 of 6:</span>
                              <a class="active" href="#">1</a>
                              <a href="#">2</a>
                              <a href="#">3</a>
                              <a href="#">4</a>
                              <a href="#">5</a>
                              <a href="#">6</a>
                              <a href="#"><i class="ion-arrow-right-b"></i></a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>

                    <!-- TODO) 탭 : 건대입구 -->
                    <!-- <div id="cast" class="tab"> -->
                    <div id="cccc" class="tab">
                      <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                          <div class="rv-hd">
                            <div class="div">
                            </div>
                            <!-- <a href="#" class="redbtn">자주가는 영화관 등록</a> -->
                          </div>
                          <div class="topbar-filter">
                            <p>DS CINEMA 건대입구</p>
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
                          <!-- 페이지 -->
                          <div class="topbar-filter">
                            <label>Reviews per page:</label>
                            <select>
                              <option value="range">5 Movie</option>
                              <option value="saab">10 Movie</option>
                            </select>
                            <div class="pagination2">
                              <span>Page 1 of 6:</span>
                              <a class="active" href="#">1</a>
                              <a href="#">2</a>
                              <a href="#">3</a>
                              <a href="#">4</a>
                              <a href="#">5</a>
                              <a href="#">6</a>
                              <a href="#"><i class="ion-arrow-right-b"></i></a>
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
