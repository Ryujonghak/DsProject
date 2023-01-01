<template>
    <div>  
      <div style="height: 130px; background-color: black;">
      </div>
      <div style="padding: 50px 0 75px 0;background-color: black; " class="page-single movie_list">
        <div class="container">
          <div class="row">
            <div>
              <div class="blog-detail-ct">
                <div style="text-align: center;">
                  <!-- 상영시간도 클릭 못함 -->
                  <div style="width: 1020px; margin-left: 50px; " v-show="상영">
                    <button
                      style="height: 60px;width: 340px; background-color: #810CA8;border-radius: 10px 10px 0 0; border: 0; color: white;" disabled>
                      <span>01 . 상영시간</span>
                    </button>
                    <button style="height: 60px;width: 340px; border: 0; color: gray;border-radius: 10px 10px 0 0; background-color: #020d18;" disabled>
                      <span>02 . 좌석선택</span>
                    </button>
                    <button style="height: 60px;width: 340px; border: 0; color: gray; border-radius: 10px 10px 0 0;background-color: #020d18;" disabled>
                      <span>03 . 결제</span>
                    </button>
                  </div>
                  <!-- 상영시간,좌석선택 클릭가능, 상영시간을 클릭을 하면 위에 있는 상영시간만 클릭가능 -->
                  <div style="width: 1020px; margin-left: 50px; " v-show="좌석">
                    <button @click="Screen()" style="height: 60px;width: 340px; background-color: #810CA8;border-radius: 10px 10px 0 0; border: 0; color: white;">
                      <span>01 . 상영시간</span>
                    </button>
                    <button
                      style="height: 60px;width: 340px; background-color: #810CA8;border-radius: 10px 10px 0 0; border: 0; color: white;"
                      disabled>
                      <span>02 . 좌석선택</span>
                    </button>
                    <button style="height: 60px;width: 340px; border: 0; color: gray;border-radius: 10px 10px 0 0; background-color: #020d18;"
                      disabled>
                      <span>03 . 결제</span>
                    </button>
                  </div>
                  <!-- 결제페이지에서 상영,좌석,결제 갈 수 있음. 새로고침만 안하면 좌석선택에 있는게 남아 있을듯-->
                  <div style="width: 1020px; margin-left: 50px; " v-show="결제">
                    <button @click="Screen()"
                      style="height: 60px;width: 340px; background-color: #810CA8;border-radius: 10px 10px 0 0; border: 0; color: white;">
                      <span>01 . 상영시간</span>
                    </button>
                    <button @click="changeSeat()"
                      style="height: 60px;width: 340px; background-color: #810CA8;border-radius: 10px 10px 0 0; border: 0; color: white;">
                      <span>02 . 좌석선택</span>
                    </button>
                    <button
                      style="height: 60px;width: 340px; background-color: #810CA8;border-radius: 10px 10px 0 0; border: 0; color: white;"
                      disabled>
                      <span>03 . 결제</span>
                    </button>
                  </div>
                </div>
                <!-- 영화관 -->
                <div v-show="상영">
                  <div
                    style=" width: 255px; height: 620px; margin-left:50px; margin-right: 1px; float: left; background-color: #F7EBEC; border-radius: 0 0 0 10px; ">
                    <p
                      style=" width: 255px; margin-bottom: 0px; color:white; text-align: center; background-color: #462456; padding: 15px 0; ">
                      지역
                    </p> 
                    <button v-show="selectedseoul" @click="seoul('서울')"   class="div2">서울</button>
                    <button v-show="!selectedseoul" class="C_div2">서울</button>

                    <button v-show="selectedbusan" @click="busan('부산')"   class="div2">부산</button>
                    <button v-show="!selectedbusan"  class="C_div2">부산</button>
                  </div>
                  <div class="one"
                    style="width: 255px;  height: 620px;   float: left;  background-color:  #F7EBEC;  margin-right: 1px;">
                    <p
                      style="width: 255px; margin-bottom: 0px; color:white; text-align: center; padding: 15px 0;background-color: #462456; ">
                      영화관
                    </p>
  
                    <div class="two">
                      <div v-show="서울">
                        <button v-show="가산"   @click="cinema('가산디지털')" class="btndiv2">가산디지털</button>
                        <button v-show="!가산"  class="C_btndiv2">가산디지털</button>

                        <button v-show="강동"  @click="cinema('강동')" class="btndiv2">강동</button>
                        <button v-show="!강동"  class="C_btndiv2">강동</button>

                        <button v-show="건대입구"  @click="cinema('건대입구')" class="btndiv2">건대입구</button>
                        <button v-show="!건대입구"  class="C_btndiv2">건대입구</button>

                        <button v-show="김포공황"  @click="cinema('김포공황')" class="btndiv2">김포공황</button>
                        <button v-show="!김포공황"  class="C_btndiv2">김포공황</button>
                        
                        <button v-show="노원"  @click="cinema('노원')" class="btndiv2">노원</button>
                        <button v-show="!노원"  class="C_btndiv2">노원</button>
                        
                        <button v-show="도곡"  @click="cinema('도곡')" class="btndiv2">도곡</button>
                        <button v-show="!도곡"  class="C_btndiv2">도곡</button>
                        
                        <button v-show="독산"  @click="cinema('독산')" class="btndiv2">독산</button>
                        <button v-show="!독산" class="C_btndiv2">독산</button>
                        
                        <button v-show="브로드웨이"  @click="cinema('브로드웨이(신사)')" class="btndiv2">브로드웨이(신사)</button>
                        <button v-show="!브로드웨이" class="C_btndiv2">브로드웨이(신사)</button>
                        
                        <button v-show="서울대입구"  @click="cinema('서울대입구')" class="btndiv2">서울대입구</button>
                        <button v-show="!서울대입구" class="C_btndiv2">서울대입구</button>
                        
                        <button v-show="수락산"  @click="cinema('수락산')" class="btndiv2">수락산</button>
                        <button v-show="!수락산" class="C_btndiv2">수락산</button>
                        
                        <button v-show="수유"  @click="cinema('수유')" class="btndiv2">수유</button>
                        <button v-show="!수유" class="C_btndiv2">수유</button>
                        
                        <button v-show="신도림"  @click="cinema('신도림')" class="btndiv2">신도림</button>
                        <button v-show="!신도림" class="C_btndiv2">신도림</button>
                        
                        <button v-show="신림"  @click="cinema('신림')" class="btndiv2">신림</button>
                        <button v-show="!신림"  class="C_btndiv2">신림</button>
                        
                        <div class="cover-bar"></div>
                      </div>
                    </div>
                  </div>
                  <div
                    style="width: 510px; height: 620px; float: left; background-color:  #F7EBEC;  overflow: hidden; border-radius: 0 0 10px 0;">
                    <p
                      style="width: 510px;  margin-bottom: 0; color: gray;  padding: 15px 0 15px 0;  background-color: #462456;  color: white;text-align: center;">
                      {{ yy }}-{{ mm }}-{{ dd }}(오늘)
                    </p>
                    <div style="width: 1000px; height: 100px;">
                        <!-- TODO: 그냥 이것도 v-show 로 하겠움-->
                      <button v-show="오늘" @click="week('day1')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #8785A2; ">
                        <h4 style="color: white; padding: 10px 0 0 13px;">{{ dd }}</h4>
                        <p style="color: white;margin-top: 15px">오늘</p>
                      </button>
                      <button v-show="!오늘" @click="weekshow('day1')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0; background-color: #1D1E2C;">
                        <h4 style="color: white; padding: 10px 0 0 13px;">{{ dd }}</h4>
                        <p style="color: white;margin-top: 15px">오늘</p>
                      </button>

                      <button v-show="내일" @click="week('day2')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #8785A2; ">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 1 }}</h4>
                        <p style="color: white;margin-top: 15px;">내일</p>
                      </button>
                      <button v-show="!내일" @click="weekshow('day2')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #1D1E2C ">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 1 }}</h4>
                        <p style="color: white;margin-top: 15px;">내일</p>
                      </button>
                      
                      <button v-show="요일3" @click="week('day3')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #8785A2;">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 2 }}</h4>
                        <p style="color: white;margin-top: 15px;">{{ 요일[순서[2]] }}</p>
                      </button>
                      <button v-show="!요일3" @click="weekshow('day3')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #1D1E2C">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 2 }}</h4>
                        <p style="color: white;margin-top: 15px;">{{ 요일[순서[2]] }}</p>
                      </button>
                      <!-- 요일4를 클릭을 하면 배경색 변경이 되고, 티켓정보라는 배열에 정보를 넘김 -->
                      <button v-show="요일4" @click="week('day4')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #8785A2; ">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 3 }}</h4>
                        <p style="color: white;margin-top: 15px">{{ 요일[순서[3]] }}</p>
                      </button>
                      <button v-show="!요일4" @click="weekshow('day4')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #1D1E2C ">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 3 }}</h4>
                        <p style="color: white;margin-top: 15px">{{ 요일[순서[3]] }}</p>
                      </button>
                      <button v-show="요일5" @click="week('day5')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #8785A2; ">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 4 }}</h4>
                        <p style="color: white;margin-top: 15px">{{ 요일[순서[4]] }}</p>
                      </button>
                      <button v-show="!요일5" @click="weekshow('day5')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; margin: 15px;border: 0;background-color: #1D1E2C ">
                        <h4 style="color: white;padding: 10px 0 0 13px;">{{ dd + 4 }}</h4>
                        <p style="color: white;margin-top: 15px">{{ 요일[순서[4]] }}</p>
                      </button>
                      
                    </div>
                    <div style="clear: both;"></div>
                    <div style=" border-bottom: 1px solid; margin:  15px; float: left; width: 40px;">
                      2D
                    </div>
                    <div style="clear: both"></div>
                    <!-- TODO: 나중에 데이터 들어 오묜 반복문 걸어줘야함 -->
                    <div style="width: 400px; height: 200px; margin: 15px">
                      <button @click="selectedtime(시간[0])"
                        style="width: 90px;  height: 40px;  border-radius: 5px;  border: 1px solid #ddd;  background-color: #fafafa;  float: left;  margin: 5px;">
                        <h5>{{시간[0]}}</h5>
                      </button>
                      <button @click="selectedtime(시간[1])"
                        style="width: 90px;  height: 40px;  border-radius: 5px;  border: 1px solid #ddd;  background-color: #fafafa;  float: left;  margin: 5px;">
                        <h5>{{시간[1]}}</h5>
                      </button>
                    </div>
                  </div>
                </div>
                <!-- 영화관 -->
  
                <!-- 이건 좌석 -->
                <div v-show="좌석">
                  <div style="margin-left: 50px;">
                    
                    <div style="margin-bottom: 10px;padding: 7px 0; background-color: #F7EBEC;width: 1020px;">
                      <span style="font-size: 20px; margin: 0 10px; color: black;">관람인원 선택</span>
                      <span style="color: black;float: right; margin: 0 10px; padding-top: 5px;">· 인원은 최대 5명까지 선택 가능합니다.</span>
                    </div>
                    <div style="text-align: center; justify-content: center; width: 1020px; height: 50px;">
                       <span style="font-size: 20px; margin-right: 10px; margin-left:25px; color: white;">성인</span>
                       <button @click="adultmins()" style="margin-right: 10px;">-</button>
                       <span style="color: white;font-size:20px;margin-right: 10px;">{{ adultcount }}</span>
                       <button @click="adultplus()" style="margin-right: 10px;">+</button>
  
                       <span style="font-size: 20px; margin-right: 10px; margin-left:25px; color: white;">청소년</span>
                       <button @click="teenmins()" style="margin-right: 10px;">-</button>
                       <span style="color: white;font-size:20px;margin-right: 10px;">{{ teencount }}</span>
                       <button @click="teenplus()" style="margin-right: 10px;">+</button>
  
                       <button v-show="결제하기" @click="pay()" style="float: right; width: 100px;height: 40px; border-radius: 30px; background-color: #810CA8; color: white;">결제하기</button>
                       <button v-show="!결제하기" @click="pay()" style="float: right; width: 100px;height: 40px; border-radius: 30px; background-color: black; color: white; " disabled>결제하기</button>
                      
                    </div>
  
                    <div style="color: white;float: right; margin-right: 110px;">
                      <img style="width: 30px; height: 30px" src="../../assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
                        alt="" />
                      <span> 러닝 타임 </span>
                      <span style="margin-left: 10px">192분</span>
                    </div>
                    <div style="text-align: center; color: white; justify-content: center; width: 1020px; margin-top: 15px;">
                      <span style="font-size: 20px; margin-right: 20px;">선택한 좌석</span>
                      <span style="font-size: 20px;" v-for="(seat,index) in selected" v-bind:key="index">{{ seat }}{{ (index+1 < selected.length) ? ', ' : '' }}</span>
                    </div>
                    <div style="width: 1020px; margin-bottom: 90px;">
                      <img style="margin: 10px 0; width: 1020px; height: 30px; box-shadow: 0 3px 10px rgba(255, 255, 255, 0.7);" src="../../assets/images_kim/Views/ModalView/SCREEN.jpg" alt="" />
                      <p style="text-align: center;">S &nbsp; C &nbsp; R &nbsp; E &nbsp; E &nbsp; N</p>
                    </div>
  
                    <div class="seat">
                      <!-- 좌석 A 시작 -->
                      <div class="seat-p">
                        <span class="font">A</span>
                        <div style="position: absolute; left:180px; top: 0;">
                          <button @click="addseat('A01')" v-show="selectsA[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('A01')" v-show="selectsA[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsA[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:220px; top: 0;">
                          <button @click="addseat('A02')" v-show="selectsA[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('A02')" v-show="selectsA[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsA[1] == 0" class="seat-bg3" disabled>0 2</button>
                        </div>
                        <div style="position: absolute; left:260px; top: 0;">
                          <button @click="addseat('A03')" v-show="selectsA[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('A03')" v-show="selectsA[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsA[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:300px; top: 0;">
                          <button @click="addseat('A04')" v-show="selectsA[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('A04')" v-show="selectsA[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsA[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:395px; top: 0;">
                          <button @click="addseat('A05')" v-show="selectsA[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('A05')" v-show="selectsA[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsA[5] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:435px; top: 0;">
                          <button @click="addseat('A06')" v-show="selectsA[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('A06')" v-show="selectsA[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsA[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:475px; top: 0;">
                          <button @click="addseat('A07')" v-show="selectsA[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('A07')" v-show="selectsA[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsA[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:515px; top: 0;">
                          <button @click="addseat('A08')" v-show="selectsA[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('A08')" v-show="selectsA[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsA[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:555px;top: 0;">
                          <button @click="addseat('A09')" v-show="selectsA[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('A09')" v-show="selectsA[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsA[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:595px;top: 0;">
                          <button @click="addseat('A10')" v-show="selectsA[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('A10')" v-show="selectsA[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsA[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <div style="position: absolute; left:690px; top: 0;">
                          <button @click="addseat('A11')" v-show="selectsA[10] == 1" class="seat-bg">11</button>
                          <button @click="deleteseat('A11')" v-show="selectsA[10] == 2" class="seat-bg2">11</button>
                          <button v-show="selectsA[10] == 0" class="seat-bg3" disabled>11</button>
                        </div>
                        <div style="position: absolute; left:730px; top: 0;">
                          <button @click="addseat('A12')" v-show="selectsA[11] == 1" class="seat-bg">12</button>
                          <button @click="deleteseat('A12')" v-show="selectsA[11] == 2" class="seat-bg2">12</button>
                          <button v-show="selectsA[11] == 0" class="seat-bg3" disabled>12</button>
                        </div>
                        <div style="position: absolute; left:770px; top: 0;">
                          <button @click="addseat('A13')" v-show="selectsA[12] == 1" class="seat-bg">13</button>
                          <button @click="deleteseat('A13')" v-show="selectsA[12] == 2" class="seat-bg2">13</button>
                          <button v-show="selectsA[12] == 0" class="seat-bg3" disabled>13</button>
                        </div>
                        <div style="position: absolute; left:810px; top: 0;">
                          <button @click="addseat('A14')" v-show="selectsA[13] == 1" class="seat-bg">14</button>
                          <button @click="deleteseat('A14')" v-show="selectsA[13] == 2" class="seat-bg2">14</button>
                          <button v-show="selectsA[13] == 0" class="seat-bg3" disabled>14</button>
                        </div>
                      </div>
                      <!-- 좌석 B 시작 -->
                      <div class="seat-p">
                        <span class="font">B</span>
                        <div style="position: absolute; left:180px; top: 42.5px;">
                          <button @click="addseat('B01')" v-show="selectsB[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('B01')" v-show="selectsB[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsB[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:220px; top: 42.5px;">
                          <button @click="addseat('B02')" v-show="selectsB[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('B02')" v-show="selectsB[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsB[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:260px; top: 42.5px;">
                          <button @click="addseat('B03')" v-show="selectsB[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('B03')" v-show="selectsB[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsB[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:300px; top: 42.5px;">
                          <button @click="addseat('B04')" v-show="selectsB[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('B04')" v-show="selectsB[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsB[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:395px; top: 42.5px;">
                          <button @click="addseat('B05')" v-show="selectsB[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('B05')" v-show="selectsB[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsB[5] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:435px; top: 42.5px;">
                          <button @click="addseat('B06')" v-show="selectsB[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('B06')" v-show="selectsB[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsB[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:475px; top: 42.5px;">
                          <button @click="addseat('B07')" v-show="selectsB[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('B07')" v-show="selectsB[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsB[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:515px; top: 42.5px;">
                          <button @click="addseat('B08')" v-show="selectsB[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('B08')" v-show="selectsB[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsB[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:555px;top: 42.5px;">
                          <button @click="addseat('B09')" v-show="selectsB[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('B09')" v-show="selectsB[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsB[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:595px;top: 42.5px;">
                          <button @click="addseat('B10')" v-show="selectsB[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('B10')" v-show="selectsB[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsB[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <div style="position: absolute; left:690px; top: 42.5px;">
                          <button @click="addseat('B11')" v-show="selectsB[10] == 1" class="seat-bg">11</button>
                          <button @click="deleteseat('B11')" v-show="selectsB[10] == 2" class="seat-bg2">11</button>
                          <button v-show="selectsB[10] == 0" class="seat-bg3" disabled>11</button>
                        </div>
                        <div style="position: absolute; left:730px; top: 42.5px;">
                          <button @click="addseat('B12')" v-show="selectsB[11] == 1" class="seat-bg">12</button>
                          <button @click="deleteseat('B12')" v-show="selectsB[11] == 2" class="seat-bg2">12</button>
                          <button v-show="selectsB[11] == 0" class="seat-bg3" disabled>12</button>
                        </div>
                        <div style="position: absolute; left:770px; top: 42.5px;">
                          <button @click="addseat('B13')" v-show="selectsB[12] == 1" class="seat-bg">13</button>
                          <button @click="deleteseat('B13')" v-show="selectsB[12] == 2" class="seat-bg2">13</button>
                          <button v-show="selectsB[12] == 0" class="seat-bg3" disabled>13</button>
                        </div>
                        <div style="position: absolute; left:810px; top: 42.5px;">
                          <button @click="addseat('B14')" v-show="selectsB[13] == 1" class="seat-bg">14</button>
                          <button @click="deleteseat('B14')" v-show="selectsB[13] == 2" class="seat-bg2">14</button>
                          <button v-show="selectsB[13] == 0" class="seat-bg3" disabled>14</button>
                        </div>
                      </div>
                      <!-- 좌석 C 시작 -->
                      <div class="seat-p">
                        <span class="font">C</span>
                        <div style="position: absolute; left:180px; top: 85px;">
                          <button @click="addseat('C01')" v-show="selectsC[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('C01')" v-show="selectsC[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsC[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:220px; top: 85px;">
                          <button @click="addseat('C02')" v-show="selectsC[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('C02')" v-show="selectsC[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsC[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:260px; top: 85px;">
                          <button @click="addseat('C03')" v-show="selectsC[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('C03')" v-show="selectsC[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsC[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:300px; top: 85px;">
                          <button @click="addseat('C04')" v-show="selectsC[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('C04')" v-show="selectsC[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsC[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:395px; top: 85px;">
                          <button @click="addseat('C05')" v-show="selectsC[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('C05')" v-show="selectsC[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsC[5] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:435px; top: 85px;">
                          <button @click="addseat('C06')" v-show="selectsC[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('C06')" v-show="selectsC[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsC[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:475px; top: 85px;">
                          <button @click="addseat('C07')" v-show="selectsC[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('C07')" v-show="selectsC[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsC[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:515px; top: 85px;">
                          <button @click="addseat('C08')" v-show="selectsC[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('C08')" v-show="selectsC[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsC[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:555px;top: 85px;">
                          <button @click="addseat('C09')" v-show="selectsC[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('C09')" v-show="selectsC[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsC[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:595px;top: 85px;">
                          <button @click="addseat('C10')" v-show="selectsC[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('C10')" v-show="selectsC[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsC[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <div style="position: absolute; left:690px; top: 85px;">
                          <button @click="addseat('C11')" v-show="selectsC[10] == 1" class="seat-bg">11</button>
                          <button @click="deleteseat('C11')" v-show="selectsC[10] == 2" class="seat-bg2">11</button>
                          <button v-show="selectsC[10] == 0" class="seat-bg3" disabled>11</button>
                        </div>
                        <div style="position: absolute; left:730px; top: 85px;">
                          <button @click="addseat('C12')" v-show="selectsC[11] == 1" class="seat-bg">12</button>
                          <button @click="deleteseat('C12')" v-show="selectsC[11] == 2" class="seat-bg2">12</button>
                          <button v-show="selectsC[11] == 0" class="seat-bg3" disabled>12</button>
                        </div>
                        <div style="position: absolute; left:770px; top: 85px;">
                          <button @click="addseat('C13')" v-show="selectsC[12] == 1" class="seat-bg">13</button>
                          <button @click="deleteseat('C13')" v-show="selectsC[12] == 2" class="seat-bg2">13</button>
                          <button v-show="selectsC[12] == 0" class="seat-bg3" disabled>13</button>
                        </div>
                        <div style="position: absolute; left:810px; top: 85px;">
                          <button @click="addseat('C14')" v-show="selectsC[13] == 1" class="seat-bg">14</button>
                          <button @click="deleteseat('C14')" v-show="selectsC[13] == 2" class="seat-bg2">14</button>
                          <button v-show="selectsC[13] == 0" class="seat-bg3" disabled>14</button>
                        </div>
                      </div>
                      <!-- 좌석 D 시작 -->
                      <div class="seat-p">
                        <span class="font">D</span>
                        <div style="position: absolute; left:180px; top: 127px;">
                          <button @click="addseat('D01')" v-show="selectsD[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('D01')" v-show="selectsD[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsD[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:220px; top: 127px;">
                          <button @click="addseat('D02')" v-show="selectsD[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('D02')" v-show="selectsD[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsD[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:260px; top: 127px;">
                          <button @click="addseat('D03')" v-show="selectsD[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('D03')" v-show="selectsD[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsD[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:300px; top: 127px;">
                          <button @click="addseat('D04')" v-show="selectsD[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('D04')" v-show="selectsD[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsD[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:395px; top: 127px;">
                          <button @click="addseat('D05')" v-show="selectsD[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('D05')" v-show="selectsD[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsD[5] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:435px; top: 127px;">
                          <button @click="addseat('D06')" v-show="selectsD[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('D06')" v-show="selectsD[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsD[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:475px; top: 127px;">
                          <button @click="addseat('D07')" v-show="selectsD[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('D07')" v-show="selectsD[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsD[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:515px; top: 127px;">
                          <button @click="addseat('D08')" v-show="selectsD[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('D08')" v-show="selectsD[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsD[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:555px;top: 127px;">
                          <button @click="addseat('D09')" v-show="selectsD[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('D09')" v-show="selectsD[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsD[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:595px;top: 127px;">
                          <button @click="addseat('D10')" v-show="selectsD[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('D10')" v-show="selectsD[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsD[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <div style="position: absolute; left:690px; top: 127px;">
                          <button @click="addseat('D11')" v-show="selectsD[10] == 1" class="seat-bg">11</button>
                          <button @click="deleteseat('D11')" v-show="selectsD[10] == 2" class="seat-bg2">11</button>
                          <button v-show="selectsD[10] == 0" class="seat-bg3" disabled>11</button>
                        </div>
                        <div style="position: absolute; left:730px; top: 127px;">
                          <button @click="addseat('D12')" v-show="selectsD[11] == 1" class="seat-bg">12</button>
                          <button @click="deleteseat('D12')" v-show="selectsD[11] == 2" class="seat-bg2">12</button>
                          <button v-show="selectsD[11] == 0" class="seat-bg3" disabled>12</button>
                        </div>
                        <div style="position: absolute; left:770px; top: 127px;">
                          <button @click="addseat('D13')" v-show="selectsD[12] == 1" class="seat-bg">13</button>
                          <button @click="deleteseat('D13')" v-show="selectsD[12] == 2" class="seat-bg2">13</button>
                          <button v-show="selectsD[12] == 0" class="seat-bg3" disabled>13</button>
                        </div>
                        <div style="position: absolute; left:810px; top: 127px;">
                          <button @click="addseat('D14')" v-show="selectsD[13] == 1" class="seat-bg">14</button>
                          <button @click="deleteseat('D14')" v-show="selectsD[13] == 2" class="seat-bg2">14</button>
                          <button v-show="selectsD[13] == 0" class="seat-bg3" disabled>14</button>
                        </div>
                      </div>
                      <!-- 좌석 E 시작 -->
                      <div class="seat-p">
                        <span class="font">E</span>
                        <div style="position: absolute; left:180px; top: 169px;">
                          <button @click="addseat('E01')" v-show="selectsE[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('E01')" v-show="selectsE[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsE[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:220px; top: 169px;">
                          <button @click="addseat('E02')" v-show="selectsE[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('E02')" v-show="selectsE[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsE[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:260px; top: 169px;">
                          <button @click="addseat('E03')" v-show="selectsE[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('E03')" v-show="selectsE[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsE[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:300px; top: 169px;">
                          <button @click="addseat('E04')" v-show="selectsE[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('E04')" v-show="selectsE[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsE[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:395px; top: 169px;">
                          <button @click="addseat('E05')" v-show="selectsE[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('E05')" v-show="selectsE[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsE[5] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:435px; top: 169px;">
                          <button @click="addseat('E06')" v-show="selectsE[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('E06')" v-show="selectsE[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsE[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:475px; top: 169px;">
                          <button @click="addseat('E07')" v-show="selectsE[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('E07')" v-show="selectsE[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsE[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:515px; top: 169px;">
                          <button @click="addseat('E08')" v-show="selectsE[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('E08')" v-show="selectsE[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsE[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:555px;top: 169px;">
                          <button @click="addseat('E09')" v-show="selectsE[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('E09')" v-show="selectsE[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsE[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:595px;top: 169px;">
                          <button @click="addseat('E10')" v-show="selectsE[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('E10')" v-show="selectsE[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsE[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <div style="position: absolute; left:690px; top: 169px;">
                          <button @click="addseat('E11')" v-show="selectsE[10] == 1" class="seat-bg">11</button>
                          <button @click="deleteseat('E11')" v-show="selectsE[10] == 2" class="seat-bg2">11</button>
                          <button v-show="selectsE[10] == 0" class="seat-bg3" disabled>11</button>
                        </div>
                        <div style="position: absolute; left:730px; top: 169px;">
                          <button @click="addseat('E12')" v-show="selectsE[11] == 1" class="seat-bg">12</button>
                          <button @click="deleteseat('E12')" v-show="selectsE[11] == 2" class="seat-bg2">12</button>
                          <button v-show="selectsE[11] == 0" class="seat-bg3" disabled>12</button>
                        </div>
                        <div style="position: absolute; left:770px; top: 169px;">
                          <button @click="addseat('E13')" v-show="selectsE[12] == 1" class="seat-bg">13</button>
                          <button @click="deleteseat('E13')" v-show="selectsE[12] == 2" class="seat-bg2">13</button>
                          <button v-show="selectsE[12] == 0" class="seat-bg3" disabled>13</button>
                        </div>
                        <div style="position: absolute; left:810px; top: 169px;">
                          <button @click="addseat('E14')" v-show="selectsE[13] == 1" class="seat-bg">14</button>
                          <button @click="deleteseat('E14')" v-show="selectsE[13] == 2" class="seat-bg2">14</button>
                          <button v-show="selectsE[13] == 0" class="seat-bg3" disabled>14</button>
                        </div>
                      </div>
                    </div>
                    <div style="margin-top: 20px">
                      <span style="color: white; margin: 9px"><img style="width: 13px; height: 13px;"
                          src="../../assets/images_kim/Views/ModalView/seat-img1.jpg" alt="" />
                        선택 가능</span>
                      <span style="color: white; margin: 9px"><img style="width: 13px; height: 13px"
                          src="../../assets/images_kim/Views/ModalView/seat-img2.jpg" alt="" />
                        선택 좌석</span>
                      <span style="color: white; margin-bottom: 19px"><img style="width: 13px; height: 13px"
                          src="../../assets/images_kim/Views/ModalView/seat-img3.jpg" alt="" />
                        예매 완료</span>
                    </div>
  
                  </div>
                </div>
                <!-- 이건 좌석 -->
                <!-- 이건 결제 -->
                <div v-show="결제">
                  <div style="left: 50px; width: 1020px; height: 620px; position: relative;">
                    <div style="width: 340px; height: 620px; float: left; background-color: red; border-radius: 0 0 0 10px;">
                      이거는 영화 정보 및 선택한것들 띄우는 창
                    </div>
                    <div style="width: 340px;height: 620px; float: left; background-color: red;">
                      결제수단
                    </div>
                    <div style="width: 340px;height: 620px; float: left; background-color: red; border-radius: 0 0 10px 0;">
                      상품금액
                      할인금액
                      결제금액
                      결제하기
                     </div>
  
                  </div>
                </div>
                <!-- 이건 좌석 -->
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
    created() {
      custom();
      this.date();
      // this.color();
      this.seattestA();
      this.seattestB();
      this.seattestC();
      this.seattestD();
      this.seattestE();
    },
    data() {
      return {
        상영: true,  // 상영페이지 v-show
        좌석: false,  // 좌석페이지 v-show
        결제: false,   // 결제페이지 v-show
  
        selectedseoul : true,    // 클릭이벤트로 색변경
        selectedbusan : true,    // 클릭이벤트로 색변경

        가산 : true,
        강동 : true,
        건대입구 : true,
        김포공황 : true,
        노원 : true,
        도곡 : true,
        독산 : true,
        브로드웨이 : true,
        서울대입구 : true,
        수락산 : true,
        수유 : true,
        신도림 : true,
        신림 : true,

        결제하기 : false, // 좌석숫자랑 인원수랑 맞으면 true로 바뀜
        adultcount: 0, //  성인 인원수 카운트
        teencount : 0, //  청소년 인원수 카운트
  
        서울: false,   // 
        부산: false, 
        오늘 : true,
        내일 : true,
        요일3 : true,
        요일4 : true,
        요일5 : true,

        요일: ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일",],
        yy: "",
        mm: "",
        dd: "",
        day: 0,
        순서: [], // 요일을 순서대로 나오게 하는 거
        시간: ["16:00", "19:30"], // 나중에 테스트 할 시간 데이터

        selectedday : [], // 선택된 날짜를 담는 배열
        selected: [], // 선택된 좌석 담는 배열
        a: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        b: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        c: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        d: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        e: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
  
        // selectedseata: [1,1,1,1,1,1,1,1,1,1,1,1,1,1]
        selectsA: [],
        selectsB: [],
        selectsC: [],
        selectsD: [],
        selectsE: [],

        
        ticketinfor : [{local : '', cinema: '', selectedday :'',selectedtime:''}], // 티켓정보를 담는 배열
  
      };
    },
    methods: {
      seattestA() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 14; i++) {
          if (this.a[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsA[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsA[i] = 0;
          }
        }
      },
      seattestB() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 14; i++) {
          if (this.b[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsB[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsB[i] = 0;
          }
        }
      },
      seattestC() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 14; i++) {
          if (this.c[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsC[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsC[i] = 0;
          }
        }
      },
      seattestD() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 14; i++) {
          if (this.d[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsD[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsD[i] = 0;
          }
        }
      },
      seattestE() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 14; i++) {
          if (this.e[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsE[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsE[i] = 0;
          }
        }
      },
      selectedtime(value) {
        if((this.ticketinfor.local != null && this.ticketinfor.cinema != null) && (this.ticketinfor.selectedday != '' && this.ticketinfor.selectedday != null)) {
          this.ticketinfor.selectedtime = value;
          this.상영 = false;
          this.좌석 = true;
          this.결제 = false;
          console.log(this.ticketinfor);
        }else{
          alert("지역, 영화관, 날짜를 선택해 주세요.")
        }
      },
  
      addseat(value) {               // 클릭을 하면 selected 배열에 담음
        if (this.adultcount + this.teencount == 0) {
          alert("인원을 선택해 주십시오.")
        } else if (this.adultcount+ this.teencount == this.selected.length) {
          alert("관람인원을 초과하셨습니다.")
        } else {
          this.selected.push(value); // value에 A14가 나온다고 치고 그럼 
          let tempVal = value.substr(0, 1); // 이러면 제일 앞에 있는 알파벳만 짤려서 나옴
          let tempVal2 = value.substring(1, value.length); // 뒤의 숫자만 짤려서 나옴
          for (let i = 0; i < 1; i++) {     // 알파벳이 무엇인지 알고 그걸 실행 시키면 
            if (tempVal == 'A') {
              this.selectsA[tempVal2 - 1] = 2;
            }
            else if (tempVal == 'B') {
              this.selectsB[tempVal2 - 1] = 2;
            }
            else if (tempVal == 'C') {
              this.selectsC[tempVal2 - 1] = 2;
            }
            else if (tempVal == 'D') {
              this.selectsD[tempVal2 - 1] = 2;
            }
            else if (tempVal == 'E') {
              this.selectsE[tempVal2 - 1] = 2;
            }
          }
          if((this.adultcount + this.teencount == this.selected.length) && (this.adultcount + this.teencount != 0)){
          this.결제하기 = true;
        }
        }
      },
      deleteseat(value) {            // 클릭을 하면 selected 배열에서 삭제를 함
        for (let i = 0; i < 14; i++) {
          if (this.selected[i] == value) {
            this.selected.splice(i, 1);    // 클릭을 하면 selected 배열에서 삭제를 함
            this.Seat(value)            // SeatA() 함수 실행
            break;
          }
        }
      },
      Seat(value) {                      // 선택한 좌석 취소를 하면 다시 1로 변경해서 선택 가능한 좌석으로 만듬
        let tempVal = value.substr(0, 1); // 이러면 제일 앞에 있는 알파벳만 짤려서 나옴
        let tempVal2 = value.substring(1, value.length); // 알파벳 뒤의 숫자만 난옴
        for (let i = 0; i < 1; i++) { // 알파벳이 무엇인지 알고 그걸 실행 시키면  selectA이거 줄일 수 있지 않을까?
          if (tempVal == 'A') {
            this.selectsA[tempVal2 - 1] = 1;
          }
          else if (tempVal == 'B') {
            this.selectsB[tempVal2 - 1] = 1;
          }
          else if (tempVal == 'C') {
            this.selectsC[tempVal2 - 1] = 1;
          }
          else if (tempVal == 'D') {
            this.selectsD[tempVal2 - 1] = 1;
          }
          else if (tempVal == 'E') {
            this.selectsE[tempVal2 - 1] = 1;
          }
        }
        this.결제하기 = false;
      },
      adultmins() {
        if (this.adultcount + this.teencount == 0) {
          alert("인원선택은 최소 1명 입니다.")
        }
        else {
          this.adultcount--;
        }
      },
      adultplus() {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.")
        } else {
          this.adultcount++;
        }
      },
      teenmins() {
        if (this.adultcount + this.teencount == 0) {
          alert("인원선택은 최소 1명 입니다.")
        }
        else {
          this.teencount--;
        }
      },
      teenplus() {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.")
        } else {
          this.teencount++;
        }
      },
      seoul(value) {
        (this.서울 = true), (this.부산 = false);       // 서울을 클릭을 했을때 티켓정보를 넘기고 서울지역의 영화관을 보이게 함
        this.ticketinfor.local = value;
        this.selectedseoul = false;
        this.selectedbusan = true;
        console.log(this.ticketinfor);
      },
      busan(value) {
        (this.서울 = false), (this.부산 = true);      // 부산을 클릭을 했을때 티켓정보를 넘기고 부산지역의 영화관을 보이게 함
        this.ticketinfor.local = value;
        this.selectedseoul = true;
        this.selectedbusan = false;
        console.log(this.ticketinfor);
      },
      cinema(value) {
          this.가산 = true;
          this.강동 = true;
          this.건대입구 = true;
          this.김포공황 = true;
          this.노원 = true;
          this.도곡 = true;
          this.독산 = true;
          this.브로드웨이 = true;
          this.서울대입구 = true;
          this.수락산 = true;
          this.수유 = true;
          this.신도림 = true;
          this.신림 = true;
        if(value == '가산디지털'){
          this.가산 = false;
        }else if(value == '강동') {
          this.강동 = false;
        }else if(value == '건대입구') {
          this.건대입구 = false;
        }else if(value == '김포공황') {
          this.김포공황 = false;
        }else if(value == '도곡') {
          this.도곡 = false;
        }else if(value == '브로드웨이(신사)') {
          this.브로드웨이 = false;
        }else if(value == '서울대입구') {
          this.서울대입구 = false;
        }else if(value == '수락산') {
          this.수락산 = false;
        }else if(value == '수유') {
          this.수유 = false;
        }else if(value == '신도림') {
          this.신도림 = false;
        }else if(value == '신림') {
          this.신림 = false;
        }
        this.ticketinfor.cinema = value;
        console.log(this.ticketinfor);
      },
      Screen() {
        this.상영 = true;
        this.좌석 = false;
        this.결제 = false;
      },
      changeSeat () {
        this.상영 = false;
        this.좌석 = true;
        this.결제 = false;
      },
      pay() {
        this.좌석 = false;
        this.상영 = false;
        this.결제 = true;
      },
      week(value) {
        if(this.ticketinfor.selectedday != null){
            this.ticketinfor.selectedday = '';
        }
        if( value == 'day1'){
            this.오늘 = false;
            this.내일 = true;
            this.요일3 = true;
            this.요일4 = true;
            this.요일5 = true;
            this.ticketinfor.selectedday = value;
        }else if ( value == 'day2'){
            this.오늘 = true;
            this.내일 = false;
            this.요일3 = true;
            this.요일4 = true;
            this.요일5 = true;
            this.ticketinfor.selectedday = value;
        }else if ( value == 'day3'){
            this.오늘 = true;
            this.내일 = true;
            this.요일3 = false;
            this.요일4 = true;
            this.요일5 = true;
            this.ticketinfor.selectedday = value;
        }
        else if ( value == 'day4'){
            this.오늘 = true;
            this.내일 = true;
            this.요일3 = true;
            this.요일4 = false;
            this.요일5 = true;
            this.ticketinfor.selectedday = value;
        }
        else if ( value == 'day5'){
            this.오늘 = true;
            this.내일 = true;
            this.요일3 = true;
            this.요일4 = true;
            this.요일5 = false;
            this.ticketinfor.selectedday = value;
        }
      },
      weekshow(value) {                // 클릭을 하면 selectedday 배열에서 삭제를 함
        for (let i = 0; i < 1; i++) {
          if (this.ticketinfor.selectedday == value) {
            this.ticketinfor.selectedday = '';   
            break;
          }
        }if( value == 'day1'){
            this.오늘 = true;
        }else if ( value == 'day2'){
            this.내일 = true;
        }else if ( value == 'day3'){
            this.요일3 = true;
        }else if ( value == 'day4'){
            this.요일4 = true;
        }else if ( value == 'day5'){
            this.요일5 = true;
        }
      },
  
      date() {
        var date = new Date();
        this.yy = date.getFullYear(); // 년도
        this.mm = date.getMonth() + 1; // 월 , 달
        this.dd = date.getDate(); // 일수
        this.day = date.getDay(); // 요일
  
        let i = this.day;
        for (i; i <= 6; i++) {
          this.순서 += i;
        }
        let j = 0;
        for (j; j < this.day; j++) {
          this.순서 += j;
        }
      },
    },
  }
  </script>
  
  <style lang="scss" scoped>
  @import "@/assets/css/style.css";
  *{
    font-family: sans-serif;
  }
    
  .one {
    background-color: #F7EBEC;
    width: 175px;
    margin: 0 auto;
    /* 스크롤바가 absolute로 들어가기 때문에
       여기다가 relative를 준다 */
    position: relative;
  }
  
  .two {
    width: 100%;
    height: 565px;
    overflow-y: scroll; /* 여기다가 padding값 입력하면  스크롤바가 상자 밖으로 나감 */
  }
  
  .two::-webkit-scrollbar {
    /* 스크롤바 너비 조절하는 부분 */
    width: 10px;
  }
  
  .two::-webkit-scrollbar,
  .two::-webkit-scrollbar-thumb {
    overflow: visible;
    border-radius: 4px;
  }
  
  .two::-webkit-scrollbar-thumb {
    background: rgba(0, 0, 0, 0.2);
  }
  
  .cover-bar {
    width: 10px;
    height: 100%;
    position: absolute;
    top: 0;
    right: 0;
    transition: all 0.5s;
    opacity: 1;
    /* 배경색을 상자색과 똑같이 맞춰준다 */
    // background-color: rgb(222, 245, 229);
  }
  
  /* 중요한 부분 */
  .one:hover .cover-bar {
    opacity: 0;
    transition: all 0.5s;
  }
  
  .div2 {
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    border: 0;
    background-color: #F7EBEC;
  }
  .C_div2 {
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    color: white;
    border: 0;
    background-color: #1D1E2C;
  }
  
  .btndiv2 {
    border: 0;
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    background-color: #F7EBEC;
  
  } 
  .C_btndiv2 {
    border: 0;
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    color: white;
    background-color: #1D1E2C;
  
  }
  
 
  
  .clicked {
    color: white;
    background: #1D1E2C;
  }
  
  .seat {
    position: relative;
  }
  .seat-p {
    width: 950px;
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
  
  
  </style>
  