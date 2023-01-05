<template>
    <div>  
      <div style="background-color: black; position:relative;" class="page-single movie_list">
        <div v-show="모달창" style="position: absolute; top:0; left: 0; width: 100%; height: 100%; background: rgba(0,0,0,0.5); z-index: 30px;">

        </div>
        <div class="container">
          <div class="row">
            <div>
              <div class="blog-detail-ct">
                <div style="position: relative;">
                  
                  <div v-show="모달창">
                    <div style="background-color: white; position: absolute; top: 125px; left: 385px; width: 450px; height: 480px; z-index: 30; ">
                      <div style="height: 70px; border-bottom: 1px solid #666;">
                        <span style="width: 387px; float: left; height: 70px;line-height: 70px; color: black; font-size: 16px; padding-left: 20px;  ">{{data1.movienm}}</span>
                        <button @click="model()" style="width: 40px; height: 40px; float: right; margin-right: 13px; border: 0;  background-color: white;">
                          <img style="margin-top: 21px;" src="@/assets/images_kim/Views/ModalView/xx.png" alt="">
                        </button>
                      </div>
                      <div style="clear: both;"></div>
                      <div v-show="전체이용가"  style="width: 100%; ">
                        <div style="margin-left: 20px; margin-top: 20px;">
                          <img style="width: 80px;float: left;  margin-bottom: 0px; margin-top: 0;" src="@/assets/images_kim/Views/ModalView/ALL_56x56.png" alt=""> 
                          <span style="font-size:20px; width: 350px; float: right; padding-left: 40px;">전체관람가</span>
                        </div>
                        <div style="clear: both;"></div>  
                        <div style="width: 450px; margin-top: 30px; padding-left: 20px">
                          <p style="color: red;font-size: 14px;">※극장 이용시 항상 마스크 착용을 부탁드립니다※</p>
                        </div>
                      </div>
                      <div v-show="열두살" style="width: 100%; ">
                        <div style="margin-left: 20px; margin-top: 20px;">
                          <img style="width: 80px;float: left;  margin-bottom: 0px; margin-top: 0;" src="@/assets/images_kim/Views/ModalView/12_56x56.png" alt=""> 
                          <span style="font-size:20px; width: 350px; float: right; padding-left: 40px;">12세이상관람가</span>
                        </div>
                        <div style="clear: both;"></div>  
                        <div style="width: 450px; margin-top: 30px; padding-left: 20px">
                          <p style="color: black;font-size: 14px;" >만 12 세 미만의 고객님은(영,유아 포함)</p>
                          <p style="color: black;font-size: 14px;" >반드시 성인 보호자의 동반하에 관람이 가능합니다.</p>
                          <p style="color: black;font-size: 14px;" >(확인불가 시 입장제한)</p>
                          <p style="color: red;font-size: 14px;">※극장 이용시 항상 마스크 착용을 부탁드립니다※</p>
                        </div>
                      </div>
                      <div v-show="열다섯살"  style="width: 100%;">
                        <div style="margin-left: 20px; margin-top: 20px;">
                          <img style="width: 80px;float: left;  margin-bottom: 0px; margin-top: 0;" src="@/assets/images_kim/Views/ModalView/15_56x56.png" alt=""> 
                          <span style="font-size:20px; width: 350px; float: right; padding-left: 40px;">15세이상관람가</span>
                        </div>
                        <div style="clear: both;"></div>  
                        <div style="width: 450px; margin-top: 30px; padding-left: 20px">
                          <p style="color: black;font-size: 14px;" >만 15 세 미만의 고객님은(영,유아 포함)</p>
                          <p style="color: black;font-size: 14px;" >반드시 성인 보호자의 동반하에 관람이 가능합니다.</p>
                          <p style="color: black;font-size: 14px;" >(확인불가 시 입장제한)</p>
                          <p style="color: red;font-size: 14px;">※극장 이용시 항상 마스크 착용을 부탁드립니다※</p>
                        </div>
                      </div>
                      <div style="clear: both;"></div>
                      <div style="width: 100%; margin-top: 30px; position: absolute; top: 370px; left: 0;"> 
                        <button @click="model()" style="width: 175px; height: 55px;margin-left: 30px; background-color: #222; color: white;">취 소</button>
                        <button @click="seatview()" style="width: 175px; height: 55px;margin-left: 40px; background-color: #222;color: white;">인원/좌석</button>
                      </div>
                    </div>
                  </div>

                </div>
                <!-- 영화관 -->
                <div v-show="상영">
                  <div
                    style=" width: 291.5px; height: 705px; margin-right: 1px; float: left; background-color: #EEEEEE;">
                    <p
                      style=" width: 291.5px; margin-bottom: 0px; color:white; text-align: center; background-color: #1E212D; padding: 15px 0;">
                      지역
                    </p> 
                    <button v-show="selectedseoul" @click="seoul('서울')"   class="div2">서울</button>
                    <button v-show="!selectedseoul" class="C_div2">서울</button>

                    <button v-show="selectedbusan" @click="busan('부산')"   class="div2">부산</button>
                    <button v-show="!selectedbusan"  class="C_div2">부산</button>
                  </div>
                  <div class="one"
                    style="width: 291.5px;  height: 705px;   float: left;  background-color:  #F6F6F6;  margin-right: 1px;">
                    <p
                      style="width: 291.5px; margin-bottom: 0px; color:white; text-align: center; padding: 15px 0;background-color: #1E212D; ">
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
                      </div>
                    </div>
                    <div class="two">
                      <div v-show="부산">
                        <button v-show="서면"   @click="cinema('서면')" class="btndiv2">서면</button>
                        <button v-show="!서면"  class="C_btndiv2">서면</button>

                        <button v-show="센텀시티"  @click="cinema('센텀시티')" class="btndiv2">센텀시티</button>
                        <button v-show="!센텀시티"  class="C_btndiv2">센텀시티</button>

                        <button v-show="부산대"  @click="cinema('부산대')" class="btndiv2">부산대</button>
                        <button v-show="!부산대"  class="C_btndiv2">부산대</button>                        
                      </div>
                    </div>
                  </div>
                  <div
                    style="width: 585px; height: 705px; float: left; background-color:  #EEEEEE;  overflow: hidden;">
                    
                    
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
                  <div style="position: relative;">
                    
                    <!-- <div style=";padding: 7px 0; background-color: #1E212D;width: 1170px;">
                      <span style="font-size: 16px; margin: 0 10px; color: white;">관람인원 선택</span>
                      <span style="color: white;float: right; margin: 0 10px; padding-top: 5px;font-size: 14px;">· 인원은 최대 5명까지 선택 가능합니다.</span>
                    </div> -->
                    <!-- 여기 -->
                    
                    <div style="width: 370px; float: left;">
                      <div style="width:310px; margin: 0 30px 0 30px;">
                        <img :src="data1.posterurln" alt="">
                      </div>
                        <div style="text-align: center; justify-content: center; width: 100%; height: 50px;">
                         <span style="font-size: 20px; margin-right: 10px; color: white;">성인</span>
                         <button @click="adultmins()" style="margin-right: 10px;">-</button>
                         <span style="color: white;font-size:20px;margin-right: 10px;">{{ adultcount }}</span>
                         <button @click="adultplus()" style="margin-right: 10px;">+</button>
                        
                         <span style="font-size: 20px; margin-right: 10px; margin-left:25px; color: white;">청소년</span>
                         <button @click="teenmins()" style="margin-right: 10px;">-</button>
                         <span style="color: white;font-size:20px;margin-right: 10px;">{{ teencount }}</span>
                         <button @click="teenplus()" style="margin-right: 10px;">+</button>                     
                        </div>
                        <!--  선택한 좌석 표시하는 곳 -->
                        <div style="text-align: center; color: white; justify-content: center; width: 370px; margin-bottom: 10px;">
                          <span style="font-size: 20px; margin-right: 20px;">선택한 좌석</span>
                          <span style="font-size: 20px;" v-for="(seat,index) in selected" v-bind:key="index">{{ seat }}{{ (index+1 < selected.length) ? ', ' : '' }}</span>
                        </div>
                        <div v-show="성인" style="width:100%;font-size: 20px; font-size: 20px; color: white; margin-bottom: 10px;">
                          <div style="width: 30%; display: inline-block;">
                            성인
                          </div>
                          <div style="width: 30%; display: inline-block; text-align: center;">
                            {{this.adultcount}}
                          </div>
                          <div style="display: inline-block; float: right;">
                            {{this.adultcount * 100}} 원
                          </div>
                        </div>
                        <div  v-show="청소년" style="width:100%;font-size: 20px; font-size: 20px; color: white; clear: both;margin-bottom: 10px;">
                          <div style="width: 30%; display: inline-block;">
                            청소년
                          </div>
                          <div style="width: 30%; display: inline-block;text-align: center;">
                            {{this.teencount}}
                          </div>
                          <div style="display: inline-block; float: right;">
                            {{this.teencount * 100}} 원
                          </div>
                        </div>

                        <div style="width:100%;font-size: 20px; font-size: 20px; color: white;clear: both;margin-bottom: 10px; border-top: 1px solid #dd003f; padding-top: 5px;">
                          <div style=" display: inline-block; float:left; color: #dd003f;">
                             결제 금액
                          </div>
                          <div style=" display: inline-block; float: right;">
                            {{this.teencount * 100 + this.adultcount * 100}} 원
                          </div>
                        </div>
                        
                        <div style="width:100%; clear: both;">
                          <button v-show="결제하기"  v-on:click="requestPay" style="width:100%; height: 60px; border: 1px solid #333; background-color: white; color: black; margin-top: 20px;">결제하기</button>
                          <button v-show="!결제하기"  v-on:click="requestPay" style="width:100%; height: 60px; border: 1px solid #333; background-color: black; color: white;margin-top: 20px;" disabled>결제하기</button>
                        </div>
                    </div>
                    <div style="width: 780px; float: right; margin-left: 20px;">
                    <div style="width:780px; color:white; margin-top: 25px; ">
                      <span style="font-size: 2em;">{{data1.movienm}}</span>
                      <br>
                      <span>{{data1.watchgradenm}}</span> 
                      <img style="width: 30px; height: 30px; background-color: white; margin-left: 20px; margin-top: 20px;" src="../../assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
                        alt="" /><span style="margin-left: 10px;">{{data1.showtm}}분</span>
                      
                    </div>

                    <div style="width: 320px; height: 140px; border-bottom: 1px solid gray; display: inline-block;float: left; ">
                      <p
                      style="width: 320px;  margin-bottom: 0; color: gray;  padding: 15px 0 5px 0;  font-size: 16px; font-weight: bold; color: white; border-bottom: 1px solid gray;">
                      {{ yy }}년 {{ mm }}월 {{ dd }}일 (오늘)
                    </p>
                      <button v-show="오늘" @click="week('day1')"
                      style="width: 55px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">오늘</p>
                        <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd }}</h4>
                      </button>
                      <button v-show="!오늘" @click="weekshow('day1')"
                      style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C;  margin-right: 5px;margin-top: 5px;">
                      <p style="color: white;margin-bottom: 10px;">오늘</p>
                      <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd }}</h4>
                      </button>

                      <button v-show="내일" @click="week('day2')"
                        style="width: 55px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">내일</p>
                        <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+1 }}</h4>
                      </button>
                      <button v-show="!내일" @click="weekshow('day2')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">내일</p>
                        <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+1 }}</h4>
                      </button>
                      
                      <button v-show="요일3" @click="week('day3')"
                        style="width: 55px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[2]] }}</p>
                        <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+2 }}</h4>
                      </button>
                      <button v-show="!요일3" @click="weekshow('day3')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C; margin-right: 5px; margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[2]] }}</p>
                        <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+2 }}</h4>
                      </button>

                      <!-- 요일4를 클릭을 하면 배경색 변경이 되고, 티켓정보라는 배열에 정보를 넘김 -->
                      <button v-show="요일4" @click="week('day4')"
                        style="width: 55px; height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px; ">
                        <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[3]] }}</p>
                        <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+3 }}</h4>
                      </button>
                      <button v-show="!요일4" @click="weekshow('day4')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[3]] }}</p>
                        <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+3 }}</h4>
                      </button>

                      <button v-show="요일5" @click="week('day5')"
                        style="width: 55px; height: 80px; float: left; border: 0;background-color: black;  margin-top: 5px; ">
                        <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[4]] }}</p>
                        <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+4 }}</h4>
                      </button>
                      <button v-show="!요일5" @click="weekshow('day5')"
                        style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C;  margin-top: 5px; ">
                        <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[4]] }}</p>
                        <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+4 }}</h4>
                      </button>
                      
                    </div>

                    <div style="width: 320px; height: 140px; border-bottom: 1px solid gray; display: inline-block; float: right; ">
                      <p
                      style="width: 320px;  margin-bottom: 0; color: gray;  padding: 15px 0 5px 0;  font-size: 16px; font-weight: bold; color: white; border-bottom: 1px solid gray;">
                      2D
                    </p>
                      <button v-show="시간1" @click="selectedtime(시간[0])"
                      style="width: 70px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">2D</p>
                        <h4 style="color: white;padding: 9px 24px 9px 9px; margin-left: 3px;">{{ 시간[0] }}</h4>
                      </button>
                      <button v-show="!시간1" @click="unselectedtime(시간[0])"
                      style="width: 70px; border-radius: 20px; height: 80px; float: left; border: 0;background-color:black;  margin-right: 5px;margin-top: 5px;">
                      <p style="color: white;margin-bottom: 10px;">2D</p>
                      <h4 style="color: black;padding: 9px 22px 9px 9px; margin-left: 3px; background-color: white; width: 55px; ">{{ 시간[0] }}</h4>
                      </button>

                      <button v-show="시간2" @click="selectedtime(시간[1])"
                        style="width: 70px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">2D</p>
                        <h4 style="color: white;padding: 9px 24px 9px 9px; margin-left: 3px;">{{ 시간[1] }}</h4>
                      </button>
                      <button v-show="!시간2" @click="unselectedtime(시간[1])"
                        style="width: 70px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: black; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">2D</p>
                        <h4 style="color: black;padding: 9px 22px 9px 9px; margin-left: 3px; background-color: white; width: 55px; ">{{ 시간[1] }}</h4>
                      </button>                      
                    </div>
                    
                    <!-- <div style="width:100%; color: white;">
                      <div style="width:120px;display: inline-block;font-size: 20px;">
                        <span style="font-size: 14px; color: gray; ">지역</span>
                        <br>
                        <span style="font-weight: bold;">{{ticketinfor.local}}</span>
                      </div>
                      <div style="width:120px;display: inline-block;font-size: 20px;">
                        <span style="font-size: 14px; color: gray;">영화관</span>
                        <br>
                        <span style="font-weight: bold;">{{ticketinfor.cinema}}</span>
                      </div>
                      <div style="width:120px;display: inline-block; font-size: 20px;">
                        <span style="font-size: 14px; color: gray;">시간</span>
                        <br>
                        <span style="font-weight: bold;">{{ticketinfor.selectedtime}}</span>
                      </div>
                      
                    </div> -->

                    <!-- 이거는 오른쪽에 티켓 이미지 밑에 들어가는것 -->
                    

  
                    <!-- <div style="color: white;float: right; margin-right: 20px;">
                      <img style="width: 30px; height: 30px; background-color: white;" src="../../assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
                        alt="" />
                      <span> 러닝 타임 </span>
                      <span style="margin-left: 10px">192분</span>
                    </div> -->
                    <div v-show="true" style="position: absolute; width: 820px;height: 400px; background-color: rgba(0,0,0,.6);  top:300px; right: -30px; z-index: 99; text-align: center;">
                      
                      <h3 style="margin-top: 80px; color: white;">관람인원을 선택해 주세요</h3>
                    </div>
                    <div style="width: 800px; margin-bottom: 60px;">
                      <img style="margin: 10px 0; width: 800px; height: 30px;" src="../../assets/images_kim/Views/ModalView/SCREEN.jpg" alt="" />
                      <p style="text-align: center;">S &nbsp;&nbsp;&nbsp; C &nbsp;&nbsp;&nbsp; R &nbsp;&nbsp;&nbsp; E &nbsp;&nbsp;&nbsp; E &nbsp;&nbsp;&nbsp; N</p>
                    </div>
                    <div class="seat">
                      <!-- 좌석 A 시작 -->
                      <div class="seat-p">
                        <span class="font">A</span>
                        <div style="position: absolute; left:145px; top: 0px;">
                          <button @click="addseat('A01')" v-show="selectsA[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('A01')" v-show="selectsA[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsA[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 0px;">
                          <button @click="addseat('A02')" v-show="selectsA[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('A02')" v-show="selectsA[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsA[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 0px;">
                          <button @click="addseat('A03')" v-show="selectsA[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('A03')" v-show="selectsA[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsA[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 0px;">
                          <button @click="addseat('A04')" v-show="selectsA[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('A04')" v-show="selectsA[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsA[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 0px;">
                          <button @click="addseat('A05')" v-show="selectsA[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('A05')" v-show="selectsA[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsA[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 0px;">
                          <button @click="addseat('A06')" v-show="selectsA[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('A06')" v-show="selectsA[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsA[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px; top: 0px;">
                          <button @click="addseat('A07')" v-show="selectsA[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('A07')" v-show="selectsA[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsA[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 0px;">
                          <button @click="addseat('A08')" v-show="selectsA[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('A08')" v-show="selectsA[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsA[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 0px;">
                          <button @click="addseat('A09')" v-show="selectsA[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('A09')" v-show="selectsA[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsA[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 0px;">
                          <button @click="addseat('A10')" v-show="selectsA[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('A10')" v-show="selectsA[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsA[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">A</span>
                      </div>
                      <!-- 좌석 B 시작 -->
                      <div class="seat-p">
                        <span class="font">B</span>
                        <div style="position: absolute; left:145px; top: 42.5px;">
                          <button @click="addseat('B01')" v-show="selectsB[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('B01')" v-show="selectsB[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsB[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 42.5px;">
                          <button @click="addseat('B02')" v-show="selectsB[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('B02')" v-show="selectsB[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsB[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 42.5px;">
                          <button @click="addseat('B03')" v-show="selectsB[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('B03')" v-show="selectsB[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsB[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 42.5px;">
                          <button @click="addseat('B04')" v-show="selectsB[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('B04')" v-show="selectsB[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsB[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 42.5px;">
                          <button @click="addseat('B05')" v-show="selectsB[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('B05')" v-show="selectsB[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsB[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 42.5px;">
                          <button @click="addseat('B06')" v-show="selectsB[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('B06')" v-show="selectsB[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsB[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px; top: 42.5px;">
                          <button @click="addseat('B07')" v-show="selectsB[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('B07')" v-show="selectsB[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsB[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 42.5px;">
                          <button @click="addseat('B08')" v-show="selectsB[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('B08')" v-show="selectsB[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsB[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 42.5px;">
                          <button @click="addseat('B09')" v-show="selectsB[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('B09')" v-show="selectsB[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsB[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 42.5px;">
                          <button @click="addseat('B10')" v-show="selectsB[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('B10')" v-show="selectsB[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsB[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">B</span>
                      </div>
                      
                      <!-- 좌석 C 시작 -->
                      <div class="seat-p">
                        <span class="font">C</span>
                        <div style="position: absolute; left:145px; top: 85px;">
                          <button @click="addseat('C01')" v-show="selectsC[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('C01')" v-show="selectsC[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsC[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 85px;">
                          <button @click="addseat('C02')" v-show="selectsC[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('C02')" v-show="selectsC[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsC[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 85px;">
                          <button @click="addseat('C03')" v-show="selectsC[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('C03')" v-show="selectsC[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsC[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 85px;">
                          <button @click="addseat('C04')" v-show="selectsC[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('C04')" v-show="selectsC[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsC[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 85px;">
                          <button @click="addseat('C05')" v-show="selectsC[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('C05')" v-show="selectsC[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsC[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 85px;">
                          <button @click="addseat('C06')" v-show="selectsC[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('C06')" v-show="selectsC[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsC[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px; top: 85px;">
                          <button @click="addseat('C07')" v-show="selectsC[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('C07')" v-show="selectsC[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsC[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 85px;">
                          <button @click="addseat('C08')" v-show="selectsC[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('C08')" v-show="selectsC[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsC[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 85px;">
                          <button @click="addseat('C09')" v-show="selectsC[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('C09')" v-show="selectsC[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsC[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 85px;">
                          <button @click="addseat('C10')" v-show="selectsC[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('C10')" v-show="selectsC[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsC[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">C</span>
                      </div>
                      <!-- 좌석 D 시작 -->
                      <div class="seat-p">
                        <span class="font">D</span>
                        <div style="position: absolute; left:145px; top: 127px;">
                          <button @click="addseat('D01')" v-show="selectsD[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('D01')" v-show="selectsD[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsD[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 127px;">
                          <button @click="addseat('D02')" v-show="selectsD[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('D02')" v-show="selectsD[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsD[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 127px;">
                          <button @click="addseat('D03')" v-show="selectsD[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('D03')" v-show="selectsD[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsD[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 127px;">
                          <button @click="addseat('D04')" v-show="selectsD[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('D04')" v-show="selectsD[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsD[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 127px;">
                          <button @click="addseat('D05')" v-show="selectsD[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('D05')" v-show="selectsD[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsD[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 127px;">
                          <button @click="addseat('D06')" v-show="selectsD[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('D06')" v-show="selectsD[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsD[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px;top: 127px;">
                          <button @click="addseat('D07')" v-show="selectsD[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('D07')" v-show="selectsD[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsD[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 127px;">
                          <button @click="addseat('D08')" v-show="selectsD[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('D08')" v-show="selectsD[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsD[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 127px;">
                          <button @click="addseat('D09')" v-show="selectsD[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('D09')" v-show="selectsD[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsD[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 127px;">
                          <button @click="addseat('D10')" v-show="selectsD[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('D10')" v-show="selectsD[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsD[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">D</span>
                      </div>
                      <!-- 좌석 E 시작 -->
                      <div class="seat-p">
                        <span class="font">E</span>
                        <div style="position: absolute; left:145px; top: 169px;">
                          <button @click="addseat('E01')" v-show="selectsE[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('E01')" v-show="selectsE[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsE[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 169px;">
                          <button @click="addseat('E02')" v-show="selectsE[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('E02')" v-show="selectsE[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsE[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 169px;">
                          <button @click="addseat('E03')" v-show="selectsE[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('E03')" v-show="selectsE[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsE[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 169px;">
                          <button @click="addseat('E04')" v-show="selectsE[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('E04')" v-show="selectsE[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsE[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 169px;">
                          <button @click="addseat('E05')" v-show="selectsE[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('E05')" v-show="selectsE[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsE[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 169px;">
                          <button @click="addseat('E06')" v-show="selectsE[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('E06')" v-show="selectsE[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsE[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px;top: 169px;">
                          <button @click="addseat('E07')" v-show="selectsE[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('E07')" v-show="selectsE[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsE[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 169px;">
                          <button @click="addseat('E08')" v-show="selectsE[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('E08')" v-show="selectsE[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsE[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 169px;">
                          <button @click="addseat('E09')" v-show="selectsE[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('E09')" v-show="selectsE[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsE[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 169px;">
                          <button @click="addseat('E10')" v-show="selectsE[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('E10')" v-show="selectsE[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsE[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2"> E</span>
                      </div>
                       <!-- 좌석 F 시작 -->
                       <div class="seat-p">
                        <span class="font">F</span>
                        <div style="position: absolute; left:145px; top: 211px;">
                          <button @click="addseat('F01')" v-show="selectsF[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('F01')" v-show="selectsF[0] == 2" class="seat-bg2">1</button>
                          <button v-show="selectsF[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 211px;">
                          <button @click="addseat('F02')" v-show="selectsF[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('F02')" v-show="selectsF[1] == 2" class="seat-bg2">2</button>
                          <button v-show="selectsF[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 211px;">
                          <button @click="addseat('F03')" v-show="selectsF[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('F03')" v-show="selectsF[2] == 2" class="seat-bg2">3</button>
                          <button v-show="selectsF[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 211px;">
                          <button @click="addseat('F04')" v-show="selectsF[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('F04')" v-show="selectsF[3] == 2" class="seat-bg2">4</button>
                          <button v-show="selectsF[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 211px;">
                          <button @click="addseat('F05')" v-show="selectsF[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('F05')" v-show="selectsF[4] == 2" class="seat-bg2">5</button>
                          <button v-show="selectsF[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 211px;">
                          <button @click="addseat('F06')" v-show="selectsF[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('F06')" v-show="selectsF[5] == 2" class="seat-bg2">6</button>
                          <button v-show="selectsF[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px;top: 211px;">
                          <button @click="addseat('F07')" v-show="selectsF[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('F07')" v-show="selectsF[6] == 2" class="seat-bg2">7</button>
                          <button v-show="selectsF[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 211px;">
                          <button @click="addseat('F08')" v-show="selectsF[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('F08')" v-show="selectsF[7] == 2" class="seat-bg2">8</button>
                          <button v-show="selectsF[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 211px;">
                          <button @click="addseat('F09')" v-show="selectsF[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('F09')" v-show="selectsF[8] == 2" class="seat-bg2">9</button>
                          <button v-show="selectsF[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 211px;">
                          <button @click="addseat('F10')" v-show="selectsF[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('F10')" v-show="selectsF[9] == 2" class="seat-bg2">10</button>
                          <button v-show="selectsF[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2"> F</span>
                      </div>
                    </div>
                    <div style="display: inline-block; width: 100%; text-align: center; padding-top: 32px;">
                        <span style="color: white; margin: 9px"><img style="width: 13px; height: 13px; margin-top: 0px; margin-bottom: 0px;"
                          src="../../assets/images_kim/Views/ModalView/seat-img1.jpg" alt="" />
                        선택 가능
                      </span>
                      <span style="color: white; margin: 9px"><img style="width: 13px; height: 13px;margin-top: 0px; margin-bottom: 0px;"
                          src="../../assets/images_kim/Views/ModalView/seat-img2.jpg" alt="" />
                        선택 좌석
                      </span>
                      <span style="color: white; margin-bottom: 19px"><img style="width: 13px; height: 13px;margin-top: 0px; margin-bottom: 0px;"
                          src="../../assets/images_kim/Views/ModalView/seat-img3.jpg" alt="" />
                        예매 완료
                      </span>
                      </div>

                    </div>
                    
                    
                    
                    </div>
                  </div>
                </div>
                <!-- 이건 좌석 -->
                <!-- 이건 결제 -->
                <div v-show="결제">
                  <div style=" width: 1170px; height: 705px; position: relative;">
                    <div style="width: 390px; height: 40px; background-color: #1E212D; color: white; text-align: center;font-size: 20px; float: left;line-height: 40px; ">
                      예매정보
                    </div>
                    <div style="width: 390px; height: 40px; background-color: #1E212D; color: white; text-align: center;font-size: 20px; float: left;line-height: 40px; ">
                      결제수단
                    </div>
                    <div style="width: 390px; height: 40px; background-color: #1E212D; color: white; text-align: center;font-size: 20px; float: left;line-height: 40px;">
                      결제하기
                    </div>
                    <div style="width: 390px; height: 665px; float: left; background-color: #F7EBEC;border: 1px solid gray; border-radius: 0 0 0 10px;">
                      
                      <div style="width: 230px;">
                        <img style="margin-left: 80px; margin-top: 15px;" src="@/assets/images_kang/Views/HomeView/poster/ABATA.jpg" alt="">
                        <h4 style="width: 390px; color: black; text-align: center; margin-bottom: 10px; margin-top: 10px; ">아바타: 물의길</h4> 
                      </div>
                      <div style="border-top: 1px solid gray; padding-top: 5px;padding-left: 80px; ">
                        <h6 style="padding: 5px 0;"> 지역 :  <span style="font-size: 18px;">{{ ticketinfor.local }}</span></h6> 
                        <h6 style="padding: 5px 0;"> 영화관 : <span style="font-size: 18px;">{{ ticketinfor.cinema }}</span></h6> 
                        <h6 style="padding: 5px 0;"> 날짜 : <span style="font-size: 18px;">{{ ticketinfor.selectedday }}</span></h6> 
                        <h6 style="padding: 5px 0;"> 시간 : <span style="font-size: 18px;">{{ ticketinfor.selectedtime }}</span></h6> 
                      </div>
                    </div>
                    <div style="width: 390px;height: 665px; float: left; background-color: #F7EBEC; border: 1px solid gray;">
                      <p style="border-bottom: #1D1E2C 1px solid; padding-bottom: 10px; width: 90px; margin-left: 10px; margin-top: 10px; color: black;" >결제수단</p>
                      <button v-show="신용카드" @click="Paycard()" style="width: 105px; height: 50px; margin: 0 10px 10px 13px; border-radius: 15px; border: 1px solid #ddd;">
                        신용카드
                      </button>
                      <button v-show="!신용카드" style="width: 105px; height: 50px; margin: 0 10px 10px 13px; border-radius: 15px; border: 1px solid #ddd; background-color: #1D1E2C; color: white;">
                        신용카드
                      </button>
                      <button @click="No()" style="width: 105px; height: 50px; margin: 0 12.5px 10px 12.5px;border: 1px solid #ddd; border-radius: 15px;">
                        간편결제
                      </button>
                      <button @click="No()" style="width: 105px; height: 50px; margin: 0 13px 10px 10px; border-radius: 15px; border: 1px solid #ddd;">
                        휴대폰
                      </button>
                    </div>
                    <div style="width: 390px;height: 665px; float: left; background-color: #F7EBEC; border-radius: 0 0 10px 0;  border: 1px solid gray;">
                      <div style="width: 100%; background-color: #252A34; height: 50px; border-bottom: 1px solid gray; color: white; line-height:50px; padding-left: 10px;">
                        상품금액 <span style="float: right; margin-right: 10px;">{{ (adultcount * 100)  + (teencount * 100)}} 원</span>
                      </div>
                      <div style="width: 100%; background-color: #252A34; height: 50px; border-bottom: 1px solid gray; color: white; line-height:50px; padding-left: 10px;">
                        할인금액 <span style="float: right; margin-right: 10px;">0 원</span>
                      </div>
                      <div style="width: 100%; background-color: #252A34; height: 50px; border-bottom: 1px solid gray; color: white; line-height:50px; padding-left: 10px;">
                        결제금액 <span style="float: right; margin-right: 10px;" >{{ (adultcount * 100)  + (teencount * 100)}} 원</span>
                      </div>
                      
                      <button v-on:click="requestPay" style="width: 100%;background-color: #845bcb; height: 70px; border: 0; color: black; font-size: 20px;">
                        결 제 하 기
                      </button>
                     </div>
  
                  </div>
                </div>
                <!-- 이건 좌석 -->
                <!-- <div v-show="결제후">
                  <div style=" width: 1170px; height: 705px; position: relative;">
                     
                  </div>
                </div> -->
              </div>
            </div>
          </div>
        </div>
      </div>
    
  </template>
  
  <script>
  import custom from "@/assets/js/custom";
  export default {
    props: ["movieProps2"],

    created() {
      custom();
      this.date();
      // this.color();
      this.seattestA();
      this.seattestB();
      this.seattestC();
      this.seattestD();
      this.seattestE();
      this.seattestF();
    },
    mounted() {
      window.scrollTo({ top: 2430, behavior: "smooth" });
      this.temp();
    },
    data() {
      return {
        data1: this.movieProps2,
        모달창 : false,
        상영: false,  // 상영페이지 v-show
        좌석: true,  // 좌석페이지 v-show
        결제: false,   // 결제페이지 v-show
  
        selectedseoul : true,    // 클릭이벤트로 색변경
        selectedbusan : true,    // 클릭이벤트로 색변경
        
        영화이름 : "",
        가산 : true,
        강동 : true,
        건대입구 : true,
        서면 : true,
        센텀시티 : true,
        부산대 : true,
        신용카드: true,
        열두살 : false,
        열다섯살 : false,
        전체이용가: false,

        결제후: false,

        amount : 100, // 임시 결제 금액
    


        결제하기 : false, // 좌석숫자랑 인원수랑 맞으면 true로 바뀜
        adultcount: 0, //  성인 인원수 카운트
        teencount : 0, //  청소년 인원수 카운트

        성인: false,
        청소년: false,

  
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
        시간1: true,
        시간2: true,

        selectedday : [], // 선택된 날짜를 담는 배열
        selected: [], // 선택된 좌석 담는 배열
        a: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        b: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        c: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        d: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        e: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
        f: ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
  
        // selectedseata: [1,1,1,1,1,1,1,1,1,1,1,1,1,1]
        selectsA: [],
        selectsB: [],
        selectsC: [],
        selectsD: [],
        selectsE: [],
        selectsF: [],

        
        ticketinfor : [
              { 
                cinema: '',
                selectedday : '',
                selectedtime:'',}], // 티켓정보를 담는 배열
  
      };
    },
    methods: {
      seattestA() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 10; i++) {
          if (this.a[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsA[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsA[i] = 0;
          }
        }
      },
      seattestB() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 10; i++) {
          if (this.b[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsB[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsB[i] = 0;
          }
        }
      },
      seattestC() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 10; i++) {
          if (this.c[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsC[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsC[i] = 0;
          }
        }
      },
      seattestD() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 10; i++) {
          if (this.d[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsD[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsD[i] = 0;
          }
        }
      },
      seattestE() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 10; i++) {
          if (this.e[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsE[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsE[i] = 0;
          }
        }
      },
      seattestF() {            // 데이터 베이스에서 자리가 있는지 확인
        for (let i = 0; i < 10; i++) {
          if (this.f[i] == 'Y') {      // 자리가 있으면 true를 줌
            this.selectsF[i] = 1;
          } else {                     // 자리가 없으면 false
            this.selectsF[i] = 0;
          }
        }
      },

      selectedtime(value) {
        if(value == this.시간[0]){
          this.ticketinfor.selectedtime = this.시간[0];
          this.시간1 = false;
          this.시간2 = true;
        }else{
          this.ticketinfor.selectedtime = this.시간[1];
          this.시간2 = false;
          this.시간1 = true;
        }
      },
      unselectedtime(value) {
        if(value == this.시간[0]){
          this.ticketinfor.selectedtime = '';
          this.시간1 = true;
        }else{
          this.ticketinfor.selectedtime = '';
          this.시간2 = true;
        }
      },
      model(){
        this.모달창 = !this.모달창;
      },
      seatview() {
          this.상영 = false;
          this.좌석 = true;
          this.결제 = false;
          this.모달창 = !this.모달창;
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
            else if (tempVal == 'F') {
              this.selectsE[tempVal2 - 1] = 2;
            }
          }
          if((this.adultcount + this.teencount == this.selected.length) && (this.adultcount + this.teencount != 0)){
          this.결제하기 = true;
        }
        }
      },
      deleteseat(value) {            // 클릭을 하면 selected 배열에서 삭제를 함
        for (let i = 0; i < 10; i++) {
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
          else if (tempVal == 'F') {
            this.selectsE[tempVal2 - 1] = 1;
          }
        }
        this.결제하기 = false;
      },
      adultmins() {
        if (this.adultcount == 0) {
          alert("인원선택은 최소 1명 입니다.")
        }else if((this.teencount + this.adultcount) == this.selected.length) {
          alert("좌석을 취소해 주세요.")
        }
        else {
          this.adultcount--;
          if((this.teencount + this.adultcount) == this.selected.length) {
            this.결제하기 = true;
            if(this.adultcount == 0){
            this.성인 = false;
            }
          }
        }
      },
      adultplus() {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.")
        }else {
          this.adultcount++;
          this.결제하기 = false;
          this.성인 = true;
        }
      },
      teenmins() {
        if (this.teencount == 0) {
          alert("인원선택은 최소 1명 입니다.")
        }else if((this.teencount + this.adultcount) == this.selected.length) {
          alert("좌석을 취소해 주세요.")
        }
        else {
          this.teencount--;
          if((this.teencount + this.adultcount) == this.selected.length) {
            this.결제하기 = true;
            if(this.teencount == 0) {
              this.청소년 = false;
            }
          }
        }
      },
      teenplus() {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.")
        } else {
          this.teencount++;
          this.결제하기 = false;
          this.청소년 = true;
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
          this.서면 = true;
          this.센텀시티 = true;
          this.부산대 = true;
        if(value == '가산디지털'){
          this.가산 = false;
        }else if(value == '강동') {
          this.강동 = false;
        }else if(value == '건대입구') {
          this.건대입구 = false;
        }else if(value == '서면') {
          this.서면 = false;
        }else if(value == '센텀시티') {
          this.센텀시티 = false;
        }else if(value == '부산대') {
          this.부산대 = false;
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
      // 이용가 체크
      temp(){
        let temp = this.data1.watchgradenm;

        if(temp == "전체이용가"){
          this.전체이용가 = true;
          this.열두살  = false;
          this.열다섯살  = false;
        }else if(temp == "15세이상관람가") {
          this.열다섯살  = true;
          this.전체이용가 = false;
          this.열두살  = false

        }else if(temp == "12세이상관람가"){
          this.열다섯살  = false;
          this.전체이용가 = false;
          this.열두살  = true
        }else{
          this.열다섯살  = false;
          this.전체이용가 = true;
          this.열두살  = false;
        }
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
      No(){
        alert("현재 서비스는 점검중입니다.")
      },
      Paycard(){
        this.신용카드 = false;
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
          amount: this.amount,
          buyer_tel: "01077532889",
          buyer_name: "홍길동",
          buyer_email: "gildong@gmail.com",

        },
        function (rsp) {
          //콜백 함수
          if (rsp.success) {
            //결제 성공
			alert("결제성공")
          } else {
            //결제 실패
			alert("결제실패")
          }
        }
      );
    },
    },
  }
  </script>
  
  <style lang="scss" scoped>
  @import "@/assets/css/style.css";
  *{
    font-family: sans-serif;
  }  
  .div2 {
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    border: 0;
    background-color: #EEEEEE;
  }
  .C_div2 {
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    color: white;
    border: 0;
    background-color: #888888;
  }
  
  .btndiv2 {
    border: 0;
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    background-color: #F6F6F6;
  
  } 
  .C_btndiv2 {
    border: 0;
    width: 100%;
    height: 50px;
    display: flex;
    align-items: center;
    color: white;
    background-color: #888888;
  
  }
  .black-bg{
    width: 100%;
    height: 100%;
    background: rgba(0,0,0,0.5);
    position: fixed;
    padding: 20px;
  }
  .white-bg {
    width: 100%;
    background: white;
    border-radius: 8px;
    padding: 20px;
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
    left: 96%;
  }

  
  
  </style>
  