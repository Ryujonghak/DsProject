<template>
    <div>  
      <div style="background-color: black; position:relative;" class="page-single movie_list">
        <div style="position: absolute; top:0; left: 0; width: 100%; height: 100%; background: rgba(0,0,0,0.5); z-index: 30px;">
        </div>
        <div class="container">
          <div class="row">
            <div>
              <div class="blog-detail-ct">
                <div style="position: relative;">  
                  <!-- 이건 좌석 -->
                  <div v-show="좌석">
                  <div style="position: relative;">                    
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
                          <!-- <span style="font-size: 20px;" v-for="(data,index) in data2" v-bind:key="index">{{data.seatyn}}</span> -->
                          
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
                          <div style="display: inline-block; float: right;">
                            {{ totalpay }} 원
                          </div>
                        </div>
                        
                        <div style="width:100%; clear: both;">
                          <button v-show="결제하기"  v-on:click="requestPay" style="width:100%; height: 60px; border: 1px solid #333; background-color: white; color: black; margin-top: 20px;">결제하기</button>
                          <button v-show="!결제하기"  v-on:click="requestPay" style="width:100%; height: 60px; border: 1px solid #333; background-color: black; color: white;margin-top: 20px;" disabled>결제하기</button>
                        </div>
                    </div>
                    <div style="width: 780px; float: right; margin-left: 20px;">
                    <div style="width:780px; color:white; margin-top: 25px; margin-bottom: 10px;">
                      <span style="font-size: 2em; font-weight: bold;">{{data1.movienm}}</span>
                      <br>
                      <span>{{data1.watchgradenm}}</span> 
                      <img style="width: 30px; height: 30px; background-color: white; margin-left: 20px; margin-top: 20px;" src="../../assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
                        alt="" /><span style="margin-left: 10px;">{{data1.showtm}}분</span>
                      <div style="width: 330px; height: 85px; border-bottom: 1px solid gray; display: inline-block; float: right;">
                      <p
                      style="width: 330px;  margin-bottom: 0; color: gray;  padding: 5px 0 5px 0;  font-size: 16px; font-weight: bold; color: white; border-bottom: 1px solid gray;">
                      영화관
                       </p>
                      <button v-show="센텀시티" @click="cinema('센텀시티')"
                      style="width: 110px;  height: 24px; float: left; border: 0;background-color: black; margin-top: 5px;">
                      <h5 style="color: white;padding: 9px 9px 9px 9px; margin-left: 3px;">센텀시티</h5>
                      </button>
                      <button v-show="!센텀시티"
                      style="width: 110px; height: 24px; float: left; border: 0;background-color:black; margin-top: 5px;">
                      <h5 style="color: black;padding: 9px 9px 9px 9px; margin-left: 3px; background-color: white; border-radius: 9px;">센텀시티</h5>
                      </button>

                      <button v-show="서면" @click="cinema('서면')"
                      style="width: 110px;  height: 24px; float: left; border: 0;background-color: black; margin-top: 5px;">
                      <h5 style="color: white;padding: 9px 9px 9px 9px; margin-left: 3px;">서면</h5>
                      </button>
                      <button v-show="!서면" 
                      style="width: 110px; height: 24px; float: left; border: 0;background-color:black;  margin-top: 5px;">
                      <h5 style="color: black;padding: 9px 9px 9px 9px; margin-left: 3px; background-color: white; border-radius: 9px;">서면</h5>
                      </button>
                      
                      <button v-show="부산대" @click="cinema('부산대')"
                      style="width: 110px;  height: 24px; float: left; border: 0;background-color: black;  margin-top: 5px;">
                      <h5 style="color: white;padding: 9px 9px 9px 9px; margin-left: 3px;">부산대</h5>
                      </button>
                      <button v-show="!부산대" 
                      style="width: 110px; height: 24px; float: left; border: 0;background-color:black;  margin-top: 5px;">
                      <h5 style="color: black;padding: 9px 9px 9px 9px; margin-left: 3px; background-color: white; border-radius: 9px;">부산대</h5>
                      </button>
            
                        </div>
                      </div>
                        <div style="width: 330px; height: 140px; border-bottom: 1px solid gray; display: inline-block;float: left; ">
                          <p
                          style="width: 330px;  margin-bottom: 0; color: gray;  padding: 15px 0 5px 0;  font-size: 16px; font-weight: bold; color: white; border-bottom: 1px solid gray;">
                          {{ yy }}년 {{ mm }}월 {{ dd }}일 (오늘)
                          </p>
                          <button v-show="오늘" @click="week('day1')"
                          style="width: 55px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px;">
                            <p style="color: white;margin-bottom: 10px;">오늘</p>
                            <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd }}</h4>
                          </button>
                          <button v-show="!오늘" 
                          style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C;  margin-right: 5px;margin-top: 5px;">
                          <p style="color: white;margin-bottom: 10px;">오늘</p>
                          <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd }}</h4>
                          </button>
                          <button v-show="내일" @click="week('day2')"
                            style="width: 55px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px;  margin-top: 5px;">
                            <p style="color: white;margin-bottom: 10px;">내일</p>
                            <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+1 }}</h4>
                          </button>
                          <button v-show="!내일" 
                            style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C; margin-right: 5px;  margin-top: 5px;">
                            <p style="color: white;margin-bottom: 10px;">내일</p>
                            <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+1 }}</h4>
                          </button>
                          <button v-show="요일3" @click="week('day3')"
                            style="width: 55px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px;">
                            <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[2]] }}</p>
                            <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+2 }}</h4>
                          </button>
                          <button v-show="!요일3" 
                            style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C; margin-right: 5px; margin-top: 5px;">
                            <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[2]] }}</p>
                            <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+2 }}</h4>
                          </button>
                          <button v-show="요일4" @click="week('day4')"
                            style="width: 55px; height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px; ">
                            <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[3]] }}</p>
                            <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+3 }}</h4>
                          </button>
                          <button v-show="!요일4"
                            style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C; margin-right: 5px;  margin-top: 5px;">
                            <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[3]] }}</p>
                            <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+3 }}</h4>
                          </button>
                          <button v-show="요일5" @click="week('day5')"
                            style="width: 55px; height: 80px; float: left; border: 0;background-color: black;  margin-top: 5px; ">
                            <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[4]] }}</p>
                            <h4 style="color: white;padding: 9px 25px 9px 13px; margin-left: 3px;">{{ dd+4 }}</h4>
                          </button>
                          <button v-show="!요일5" 
                            style="width: 55px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: #1D1E2C;  margin-top: 5px; ">
                            <p style="color: white;margin-bottom: 10px;">{{ 요일[순서[4]] }}</p>
                            <h4 style="color: black;padding: 9px 25px 9px 13px; margin-left: 3px; background-color: white; border-radius: 18px;">{{ dd+4 }}</h4>
                          </button>
                        </div>
                        <div style="width: 330px; height: 140px; border-bottom: 1px solid gray; display: inline-block; float: right; ">
                      <p
                      style="width: 330px;  margin-bottom: 0; color: gray;  padding: 15px 0 5px 0;  font-size: 16px; font-weight: bold; color: white; border-bottom: 1px solid gray;">
                      상영시간
                    </p>
                      <button v-show="시간1" @click="selectedtime(시간[0])"
                      style="width: 70px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px; margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">2D</p>
                        <h4 style="color: white;padding: 9px 24px 9px 9px; margin-left: 3px;">{{ 시간[0] }}</h4>
                      </button>
                      <button v-show="!시간1" 
                      style="width: 70px; border-radius: 20px; height: 80px; float: left; border: 0;background-color:black;  margin-right: 5px;margin-top: 5px;">
                      <p style="color: white;margin-bottom: 10px;">2D</p>
                      <h4 style="color: black;padding: 9px 22px 9px 9px; margin-left: 3px; background-color: white; width: 55px; ">{{ 시간[0] }}</h4>
                      </button>

                      <button v-show="시간2" @click="selectedtime(시간[1])"
                        style="width: 70px;  height: 80px; float: left; border: 0;background-color: black; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">2D</p>
                        <h4 style="color: white;padding: 9px 24px 9px 9px; margin-left: 3px;">{{ 시간[1] }}</h4>
                      </button>
                      <button v-show="!시간2" 
                        style="width: 70px; border-radius: 20px; height: 80px; float: left; border: 0;background-color: black; margin-right: 5px;  margin-top: 5px;">
                        <p style="color: white;margin-bottom: 10px;">2D</p>
                        <h4 style="color: black;padding: 9px 22px 9px 9px; margin-left: 3px; background-color: white; width: 55px; ">{{ 시간[1] }}</h4>
                      </button>                      
                        </div>
                        <div v-show="모달" style="position: absolute; width: 820px;height: 400px; background-color: rgba(0,0,0,.6);  top:300px; right: -30px; z-index: 99; text-align: center;">
                      <div style="margin-bottom: 80px; width: 100%;"></div>
                      <!-- TODO: 콤마 처리생각해야됨 01-09 -->
                      <span style=" color: white; font-size: 24px;" v-if="modalcinema">영화관</span>
                      <span style=" color: white; font-size: 24px;" v-if="modalday"> 날짜</span>
                      <span style=" color: white; font-size: 24px;" v-if="modaltime"> 시간</span>
                      <span style=" color: white; font-size: 24px;" v-if="modalpeople"> 관람인원</span>
                      <span style=" color: white; font-size: 24px;">을 선택해 주세요</span>
                      
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
                          <button @click="addseat('A01')" v-show="Seat[0] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('A01')" v-show="Seat[0] == 2" class="seat-bg2">1</button>
                          <button v-show="Seat[0] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 0px;">
                          <button @click="addseat('A02')" v-show="Seat[1] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('A02')" v-show="Seat[1] == 2" class="seat-bg2">2</button>
                          <button v-show="Seat[1] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 0px;">
                          <button @click="addseat('A03')" v-show="Seat[2] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('A03')" v-show="Seat[2] == 2" class="seat-bg2">3</button>
                          <button v-show="Seat[2] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 0px;">
                          <button @click="addseat('A04')" v-show="Seat[3] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('A04')" v-show="Seat[3] == 2" class="seat-bg2">4</button>
                          <button v-show="Seat[3] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 0px;">
                          <button @click="addseat('A05')" v-show="Seat[4] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('A05')" v-show="Seat[4] == 2" class="seat-bg2">5</button>
                          <button v-show="Seat[4] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 0px;">
                          <button @click="addseat('A06')" v-show="Seat[5] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('A06')" v-show="Seat[5] == 2" class="seat-bg2">6</button>
                          <button v-show="Seat[5] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px; top: 0px;">
                          <button @click="addseat('A07')" v-show="Seat[6] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('A07')" v-show="Seat[6] == 2" class="seat-bg2">7</button>
                          <button v-show="Seat[6] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 0px;">
                          <button @click="addseat('A08')" v-show="Seat[7] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('A08')" v-show="Seat[7] == 2" class="seat-bg2">8</button>
                          <button v-show="Seat[7] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 0px;">
                          <button @click="addseat('A09')" v-show="Seat[8] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('A09')" v-show="Seat[8] == 2" class="seat-bg2">9</button>
                          <button v-show="Seat[8] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 0px;">
                          <button @click="addseat('A10')" v-show="Seat[9] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('A10')" v-show="Seat[9] == 2" class="seat-bg2">10</button>
                          <button v-show="Seat[9] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">A</span>
                      </div>
                      <!-- 좌석 B 시작 -->
                      <div class="seat-p">
                        <span class="font">B</span>
                        <div style="position: absolute; left:145px; top: 42.5px;">
                          <button @click="addseat('B01')" v-show="Seat[10] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('B01')" v-show="Seat[10] == 2" class="seat-bg2">1</button>
                          <button v-show="Seat[10] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 42.5px;">
                          <button @click="addseat('B02')" v-show="Seat[11] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('B02')" v-show="Seat[11] == 2" class="seat-bg2">2</button>
                          <button v-show="Seat[11] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 42.5px;">
                          <button @click="addseat('B03')" v-show="Seat[12] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('B03')" v-show="Seat[12] == 2" class="seat-bg2">3</button>
                          <button v-show="Seat[12] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 42.5px;">
                          <button @click="addseat('B04')" v-show="Seat[13] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('B04')" v-show="Seat[13] == 2" class="seat-bg2">4</button>
                          <button v-show="Seat[13] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 42.5px;">
                          <button @click="addseat('B05')" v-show="Seat[14] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('B05')" v-show="Seat[14] == 2" class="seat-bg2">5</button>
                          <button v-show="Seat[14] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 42.5px;">
                          <button @click="addseat('B06')" v-show="Seat[15] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('B06')" v-show="Seat[15] == 2" class="seat-bg2">6</button>
                          <button v-show="Seat[15] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px; top: 42.5px;">
                          <button @click="addseat('B07')" v-show="Seat[16] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('B07')" v-show="Seat[16] == 2" class="seat-bg2">7</button>
                          <button v-show="Seat[16] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 42.5px;">
                          <button @click="addseat('B08')" v-show="Seat[17] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('B08')" v-show="Seat[17] == 2" class="seat-bg2">8</button>
                          <button v-show="Seat[17] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 42.5px;">
                          <button @click="addseat('B09')" v-show="Seat[18] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('B09')" v-show="Seat[18] == 2" class="seat-bg2">9</button>
                          <button v-show="Seat[18] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 42.5px;">
                          <button @click="addseat('B10')" v-show="Seat[19] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('B10')" v-show="Seat[19] == 2" class="seat-bg2">10</button>
                          <button v-show="Seat[19] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">B</span>
                      </div>
                      
                      <!-- 좌석 C 시작 -->
                      <div class="seat-p">
                        <span class="font">C</span>
                        <div style="position: absolute; left:145px; top: 85px;">
                          <button @click="addseat('C01')" v-show="Seat[20] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('C01')" v-show="Seat[20] == 2" class="seat-bg2">1</button>
                          <button v-show="Seat[20] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 85px;">
                          <button @click="addseat('C02')" v-show="Seat[21] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('C02')" v-show="Seat[21] == 2" class="seat-bg2">2</button>
                          <button v-show="Seat[21] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 85px;">
                          <button @click="addseat('C03')" v-show="Seat[22] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('C03')" v-show="Seat[22] == 2" class="seat-bg2">3</button>
                          <button v-show="Seat[22] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 85px;">
                          <button @click="addseat('C04')" v-show="Seat[23] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('C04')" v-show="Seat[23] == 2" class="seat-bg2">4</button>
                          <button v-show="Seat[23] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 85px;">
                          <button @click="addseat('C05')" v-show="Seat[24] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('C05')" v-show="Seat[24] == 2" class="seat-bg2">5</button>
                          <button v-show="Seat[24] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 85px;">
                          <button @click="addseat('C06')" v-show="Seat[25] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('C06')" v-show="Seat[25] == 2" class="seat-bg2">6</button>
                          <button v-show="Seat[25] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px; top: 85px;">
                          <button @click="addseat('C07')" v-show="Seat[26] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('C07')" v-show="Seat[26] == 2" class="seat-bg2">7</button>
                          <button v-show="Seat[26] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 85px;">
                          <button @click="addseat('C08')" v-show="Seat[27] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('C08')" v-show="Seat[27] == 2" class="seat-bg2">8</button>
                          <button v-show="Seat[27] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 85px;">
                          <button @click="addseat('C09')" v-show="Seat[28] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('C09')" v-show="Seat[28] == 2" class="seat-bg2">9</button>
                          <button v-show="Seat[28] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 85px;">
                          <button @click="addseat('C10')" v-show="Seat[29] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('C10')" v-show="Seat[29] == 2" class="seat-bg2">10</button>
                          <button v-show="Seat[29] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">C</span>
                      </div>
                      <!-- 좌석 D 시작 -->
                      <div class="seat-p">
                        <span class="font">D</span>
                        <div style="position: absolute; left:145px; top: 127px;">
                          <button @click="addseat('D01')" v-show="Seat[30] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('D01')" v-show="Seat[30] == 2" class="seat-bg2">1</button>
                          <button v-show="Seat[30] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 127px;">
                          <button @click="addseat('D02')" v-show="Seat[31] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('D02')" v-show="Seat[31] == 2" class="seat-bg2">2</button>
                          <button v-show="Seat[31] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 127px;">
                          <button @click="addseat('D03')" v-show="Seat[32] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('D03')" v-show="Seat[32] == 2" class="seat-bg2">3</button>
                          <button v-show="Seat[32] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 127px;">
                          <button @click="addseat('D04')" v-show="Seat[33] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('D04')" v-show="Seat[33] == 2" class="seat-bg2">4</button>
                          <button v-show="Seat[33] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 127px;">
                          <button @click="addseat('D05')" v-show="Seat[34] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('D05')" v-show="Seat[34] == 2" class="seat-bg2">5</button>
                          <button v-show="Seat[34] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 127px;">
                          <button @click="addseat('D06')" v-show="Seat[35] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('D06')" v-show="Seat[35] == 2" class="seat-bg2">6</button>
                          <button v-show="Seat[35] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px;top: 127px;">
                          <button @click="addseat('D07')" v-show="Seat[36] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('D07')" v-show="Seat[36] == 2" class="seat-bg2">7</button>
                          <button v-show="Seat[36] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 127px;">
                          <button @click="addseat('D08')" v-show="Seat[37] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('D08')" v-show="Seat[37] == 2" class="seat-bg2">8</button>
                          <button v-show="Seat[37] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 127px;">
                          <button @click="addseat('D09')" v-show="Seat[38] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('D09')" v-show="Seat[38] == 2" class="seat-bg2">9</button>
                          <button v-show="Seat[38] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 127px;">
                          <button @click="addseat('D10')" v-show="Seat[39] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('D10')" v-show="Seat[39] == 2" class="seat-bg2">10</button>
                          <button v-show="Seat[39] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2">D</span>
                      </div>
                      <!-- 좌석 E 시작 -->
                      <div class="seat-p">
                        <span class="font">E</span>
                        <div style="position: absolute; left:145px; top: 169px;">
                          <button @click="addseat('E01')" v-show="Seat[40] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('E01')" v-show="Seat[40] == 2" class="seat-bg2">1</button>
                          <button v-show="Seat[40] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 169px;">
                          <button @click="addseat('E02')" v-show="Seat[41] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('E02')" v-show="Seat[41] == 2" class="seat-bg2">2</button>
                          <button v-show="Seat[41] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 169px;">
                          <button @click="addseat('E03')" v-show="Seat[42] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('E03')" v-show="Seat[42] == 2" class="seat-bg2">3</button>
                          <button v-show="Seat[42] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 169px;">
                          <button @click="addseat('E04')" v-show="Seat[43] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('E04')" v-show="Seat[43] == 2" class="seat-bg2">4</button>
                          <button v-show="Seat[43] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 169px;">
                          <button @click="addseat('E05')" v-show="Seat[44] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('E05')" v-show="Seat[44] == 2" class="seat-bg2">5</button>
                          <button v-show="Seat[44] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 169px;">
                          <button @click="addseat('E06')" v-show="Seat[45] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('E06')" v-show="Seat[45] == 2" class="seat-bg2">6</button>
                          <button v-show="Seat[45] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px;top: 169px;">
                          <button @click="addseat('E07')" v-show="Seat[46] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('E07')" v-show="Seat[46] == 2" class="seat-bg2">7</button>
                          <button v-show="Seat[46] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 169px;">
                          <button @click="addseat('E08')" v-show="Seat[47] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('E08')" v-show="Seat[47] == 2" class="seat-bg2">8</button>
                          <button v-show="Seat[47] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 169px;">
                          <button @click="addseat('E09')" v-show="Seat[48] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('E09')" v-show="Seat[48] == 2" class="seat-bg2">9</button>
                          <button v-show="Seat[48] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 169px;">
                          <button @click="addseat('E10')" v-show="Seat[49] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('E10')" v-show="Seat[49] == 2" class="seat-bg2">10</button>
                          <button v-show="Seat[49] == 0" class="seat-bg3" disabled>10</button>
                        </div>
                        <span class="font2"> E</span>
                      </div>
                       <!-- 좌석 F 시작 -->
                       <div class="seat-p">
                        <span class="font">F</span>
                        <div style="position: absolute; left:145px; top: 211px;">
                          <button @click="addseat('F01')" v-show="Seat[50] == 1" class="seat-bg">1</button>
                          <button @click="deleteseat('F01')" v-show="Seat[50] == 2" class="seat-bg2">1</button>
                          <button v-show="Seat[50] == 0" class="seat-bg3" disabled>1</button>
                        </div>
                        <div style="position: absolute; left:185px; top: 211px;">
                          <button @click="addseat('F02')" v-show="Seat[51] == 1" class="seat-bg">2</button>
                          <button @click="deleteseat('F02')" v-show="Seat[51] == 2" class="seat-bg2">2</button>
                          <button v-show="Seat[51] == 0" class="seat-bg3" disabled>2</button>
                        </div>
                        <div style="position: absolute; left:225px; top: 211px;">
                          <button @click="addseat('F03')" v-show="Seat[52] == 1" class="seat-bg">3</button>
                          <button @click="deleteseat('F03')" v-show="Seat[52] == 2" class="seat-bg2">3</button>
                          <button v-show="Seat[52] == 0" class="seat-bg3" disabled>3</button>
                        </div>
                        <div style="position: absolute; left:325px; top: 211px;">
                          <button @click="addseat('F04')" v-show="Seat[53] == 1" class="seat-bg">4</button>
                          <button @click="deleteseat('F04')" v-show="Seat[53] == 2" class="seat-bg2">4</button>
                          <button v-show="Seat[53] == 0" class="seat-bg3" disabled>4</button>
                        </div>
                        <div style="position: absolute; left:365px; top: 211px;">
                          <button @click="addseat('F05')" v-show="Seat[54] == 1" class="seat-bg">5</button>
                          <button @click="deleteseat('F05')" v-show="Seat[54] == 2" class="seat-bg2">5</button>
                          <button v-show="Seat[54] == 0" class="seat-bg3" disabled>5</button>
                        </div>
                        <div style="position: absolute; left:405px; top: 211px;">
                          <button @click="addseat('F06')" v-show="Seat[55] == 1" class="seat-bg">6</button>
                          <button @click="deleteseat('F06')" v-show="Seat[55] == 2" class="seat-bg2">6</button>
                          <button v-show="Seat[55] == 0" class="seat-bg3" disabled>6</button>
                        </div>
                        <div style="position: absolute; left:445px;top: 211px;">
                          <button @click="addseat('F07')" v-show="Seat[56] == 1" class="seat-bg">7</button>
                          <button @click="deleteseat('F07')" v-show="Seat[56] == 2" class="seat-bg2">7</button>
                          <button v-show="Seat[56] == 0" class="seat-bg3" disabled>7</button>
                        </div>
                        <div style="position: absolute; left:545px; top: 211px;">
                          <button @click="addseat('F08')" v-show="Seat[57] == 1" class="seat-bg">8</button>
                          <button @click="deleteseat('F08')" v-show="Seat[57] == 2" class="seat-bg2">8</button>
                          <button v-show="Seat[57] == 0" class="seat-bg3" disabled>8</button>
                        </div>
                        <div style="position: absolute; left:585px; top: 211px;">
                          <button @click="addseat('F09')" v-show="Seat[58] == 1" class="seat-bg">9</button>
                          <button @click="deleteseat('F09')" v-show="Seat[58] == 2" class="seat-bg2">9</button>
                          <button v-show="Seat[58] == 0" class="seat-bg3" disabled>9</button>
                        </div>
                        <div style="position: absolute; left:625px; top: 211px;">
                          <button @click="addseat('F10')" v-show="Seat[59] == 1" class="seat-bg">10</button>
                          <button @click="deleteseat('F10')" v-show="Seat[59] == 2" class="seat-bg2">10</button>
                          <button v-show="Seat[59] == 0" class="seat-bg3" disabled>10</button>
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

                      <button @click="test99()" style="width: 100px; height: 50px;">
                        결제후 페이지 가기(임시)
                      </button>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div v-show="결제후페이지">
                    <div class="col-md-8" style="height: 600px;">
                      <div class="col-md-5" style=" float: left; margin-top: 3%;">
                        <img style="height: 500px;" :src="data1.posterurln" alt="">
                        
                      </div>
                      <div class="col-md-7" style="float: right;  margin-top: 8%; color: white;">
                        <span style="font-size: 24px; font-weight: bold;"> {{ data1.movienm }}</span><span style="font-size: 24px; font-weight: bold;">({{ data1.prdtyear }})</span>
                        <br>
                        <p style="margin: 10px 0 0 0;">감독 : {{ data1.directors }} </p>
                        <p  style="margin:0;">상영시간 : {{ data1.showtm }} 분</p>
                        <div style="border-bottom: 1px solid #1D1E2C; margin-top: 10px; "></div>
                        <p  style="margin: 20px 0 0 20px;">예매번호 : {{ data1.showtm }} 종학이형이 넘겨줘야됨</p>
                        <p  style="margin: 0 0 0 20px;">상영날짜 : {{this.yy}}년 {{this.mm}}월 {{ ticketinfor.selectedday }}일</p>
                        <p  style="margin: 0 0 0 20px;">관람극장 : {{ ticketinfor.cinema }}</p>
                        <span style="margin-right: 5px; margin-left: 20px; color: #abb7c4;">관람좌석 :</span><span v-for="(seat,index) in selected" v-bind:key="index">{{ seat }}{{ (index+1 < selected.length) ? ', ' : '' }}</span>
                        <div style="border-bottom: 1px solid #1D1E2C; margin-top: 20px; "></div>
                        <p style="margin-top:20px; margin-bottom: 20px; margin-left: 20px;">결제금액 : {{ totalpay }} 원</p>
                        <div style="margin-top: 80px;">
                          <button style="width: 150px; height: 55px; background-color: #dd003f; color: white; border: 0; border-radius: 8px;margin-left: 20px;"><router-link to="/mypage"></router-link>마이페이지</button>
                          <button style="width: 150px; height: 55px; background-color: #dd003f; color: white; border: 0; border-radius: 8px; margin-left: 30px;"><router-link to="/"></router-link>홈페이지</button>
                        </div>
                      </div>
                    </div>
                    <div class="col-md-4" style="height: 580px; text-align: center; position: relative;">
                      <img style="margin: 0; width:100%;" src="@/assets/images_kim/Views/ModalView/Ticket.png" alt="">
                      <div style="position: absolute; top: 15px; left: 40px; width: 70%; text-align: left;"><span style="font-size: 18px; font-weight: bold;">{{ data1.movienm }}</span><p style="margin-bottom: 0; margin-top: -5px; font-weight: bold;">2D</p>
                      </div>
                      <div style="position: absolute; top: 95px; left: 40px; color: black;">
                        <!-- <h6><span style="font-size:16px; color: blueviolet;">DS</span> CINEMA <span style="font-size:16px; color: red;">서면</span></h6> -->
                        <h6><span style="font-size:16px; color: blueviolet;">DS</span> CINEMA <span style="font-size:16px; color: red;">{{ ticketinfor.cinema }}</span></h6>
                      </div>
                      <div style="position: absolute; top: 140px; left: 40px; color: black; font-weight: bold;">{{mm}}/{{ticketinfor.selectedday}}</div>
                      <div style="position: absolute; top: 160px; left: 40px; color: black;"><span style="font-size: 30px; font-weight: bold;">19:35</span> ~ <span>21:59</span>    시작 시작 끝 시간 데이터 받야함</div>
                      <div style="position: absolute; top: 170px; left: 200px; color: black;">큐알태그</div>
                      <!-- TODO: 성인인지 청소년인지 확인하는 함수 만들어야 됨 -->
                      <div v-show="adult" style="position: absolute; top: 220px; left: 40px;"><span>성인 </span> <span style="font-size: 16px; font-weight: bold;">{{ adultcount }}</span></div>
                      <div v-show="teen" style="position: absolute; top: 220px; left: 40px;"><span>청소년 </span> <span style="font-size: 16px; font-weight: bold;">{{ teencount }}</span></div>
                      <div v-show="adultteen" style="position: absolute; top: 220px; left: 40px;"><span>성인 </span> <span style="font-size: 16px; font-weight: bold;">{{ adultcount }}</span><span>,청소년 </span> <span style="font-size: 16px; font-weight: bold;">{{ teencount }}</span></div>
                      <div style="position: absolute; top: 250px; left: 40px; width: 170px; height: 30px; border-radius: 10px; background-color: skyblue; line-height: 30px;"><span style="" v-for="(seat,index) in selected" v-bind:key="index">{{ seat }}{{ (index+1 < selected.length) ? ', ' : '' }}</span></div>
                      <div style="color: gray;position: absolute; top: 290px; left: 40px; font-size: 12px;"><span>· 극장 이용 시 마스크 착용은 필수입니다.</span></div>
                      <div style="color: gray;position: absolute; top: 305px; left: 48px;font-size: 12px;"><span>(미착용 시 입장 제한)</span></div>
                      <div style="color: gray;position: absolute; top: 320px; left: 48px;font-size: 12px;"><span>입장 지연에 따른 관람 불편을 최소화하기 위해</span></div>
                      <div style="color: gray;position: absolute; top: 335px; left: 48px;font-size: 12px;"><span>본 영화는 10분 후 상영이 시작됩니다.</span></div>
                      <div style="color: gray;position: absolute; top: 355px; left: 40px;font-size: 12px;"><span>· 영화 상영시작시간 15분 전까지 취소가 가능하며</span></div>
                      <div style="color: gray;position: absolute; top: 370px; left: 48px;font-size: 12px;"><span>캡쳐화면은 입장이 제한될 수 있습니다.</span></div>
                      <div style="position: absolute; top: 450px; left: 48px; font-weight: bold;height: 10px; z-index: 2;">역시, 영화에는 팝콘이지?!</div>
                      <div style="position: absolute; top: 460px; left: 48px; font-weight: bold;height: 10px; background-color: yellow; width: 45%; z-index: 1;"></div>
                      <div style=" position: absolute; top: 445px; left: 0px; font-weight: bold; width: 90%;"><img style="width:30%; margin:0; float: right;" src="@/assets/images_kim/Views/ModalView/free-icon-popcorn-864781.png" alt=""></div>
                      <div style=" position: absolute; top: 500px; left: 40px; width:50%; height: 8%;">
                      <button @click="popcorn()" style="width: 100%; height: 100%; background-color: #dd003f; border-radius: 5px; color: white; border: 0;">구매하기</button>
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
  export default {
    props: ["movieProps2"],

    created() {
      custom();
      this.getSeatAll();
      this.date();
    },
    mounted() {
      window.scrollTo({ top: 2250, behavior: "smooth" });
    },
    data() {
      return {
        data1: this.movieProps2, //영화데이터 받아오기
        data2: [],
        
        모달 : true,
        좌석: true,  // 좌석페이지 v-show
        결제후페이지 : false,
        reservation : new Reservation(),
        
        영화이름 : "",
        서면 : true,
        센텀시티 : true,
        부산대 : true,
        결제후: false,
        amount : 100, // 임시 결제 금액
        totalpay : 0,
        결제하기 : false, // 좌석숫자랑 인원수랑 맞으면 true로 바뀜
        adultcount: 0, //  성인 인원수 카운트
        teencount : 0, //  청소년 인원수 카운트
        성인: false,      // 성인 인원수가 올라가면 false가 true로 바뀜
        청소년: false, // 청소년 인원수가 올라가면 false가 true로 바뀜

        modalday : true,      // 날짜를 선택하면 모달창에 있는 글자가 사라짐
        modalcinema : true,    // 영화관를 선택하면 모달창에 있는 글자가 사라짐
        modaltime : true,   // 모달시간를 선택하면 모달창에 있는 글자가 사라짐
        modalpeople : true, //  인원을 클릭을 하면 모달창에 있는 글자가 사라짐
  
        adult : false,      // 성인만 예매한 경우
        teen : false,       // 청소년만 예매한 경우
        adultteen : false, // 성인,청소년 둘다 있을 경우


        오늘 : true,
        내일 : true,
        요일3 : true,
        요일4 : true,
        요일5 : true,

        요일: ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일",],
        yy: "",
        mm: "",
        dd: "",
        selectday: 0,
        day: 0,
        순서: [], // 요일을 순서대로 나오게 하는 거
        시간: ["16:00", "19:30"], // 나중에 테스트 할 시간 데이터
        시간1: true,
        시간2: true,

        selected: [], // 선택된 좌석 담는 배열

        // selectedseata: [1,1,1,1,1,1,1,1,1,1,1,1,1,1]
        selects99: [], 

        Seat: [], // data2에 있는 좌석데이터를 담는곳


        selects998: [ "1A1", "N"], // data2에 있는 좌석데이터를 담는곳 센텀시티
        selects903: ["N"], // 좌석 상태를 날리는 배열 좌석예매할때쓰임
        selects904: ["Y"], // 좌석 상태를 날리는 배열 좌석취소할때쓰임
        i : 1,        
        ticketinfor : [
              { 
                cinema: '',
                selectedday : '',
                selectedtime:'',}], // 티켓정보를 담는 배열
  
      };
    },
    methods: {
      test99(){
        this.결제후페이지 = true;
        this.모달 = false;
        this.좌석 = false;
      },
    getSeatAll() {
    BookingService.getSeatAll()
      .then((response) => {
        this.data2 = response.data;
        console.log(this.data2);
      })
      .catch((e) => {
        console.log(e);
      });
    },
    seattest97() {
      for(let i = 0; i<this.selected.length; i++){
        BookingService.SelectSeat(this.selected[i],this.selects903[0])
        .then((response) => {
        console.log(response.data);
        })
        .catch((e) => {
        console.log(e);
        });
      }
    },
    seatcount(){                                          // 티켓이미지 안에 들어갈 함수   
      if(this.adultcount != 0 && this.teencount != 0){    // 성인과 청소년을 함께 예매한경우
        this.adultteen = true;                            // 성인과 청소년 글자가 true가 되고
      }else if(this.teencount == 0){                      // 성인만 예매한경우 성인 글자만 true가 되고
        this.adult = true; 
      }else{                                              // 청소년만 예매한경우 청소년 글자만 true가 됨
        this.teen = true;
      }
    },
    modaloff(){
      if((this.modalcinema == false && this.modalday == false) && (this.modaltime == false && this.modalpeople == false)){
        this.모달 = false;
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
      this.modaltime = false;
      this.modaloff();
    },
    addseat(value) {               // 클릭을 하면 selected 배열에 담음
      if (this.adultcount + this.teencount == 0) {
        alert("인원을 선택해 주십시오.")
    
      } else if (this.adultcount+ this.teencount == this.selected.length) {
        alert("관람인원을 초과하셨습니다.")
      } else {
        this.selected.push(value); // value에 A14가 나온다고 치고 그럼 
        let tempVal = value.substr(0, 1); // 이러면 제일 앞에 있는 알파벳만 짤려서 나옴
        console.log(tempVal);
        let tempVal2 = value.substring(1, value.length); // 뒤의 숫자만 짤려서 나옴 10
        console.log(tempVal2);
        let tempB;
        for (let i = 0; i < 1; i++) {     // 알파벳이 무엇인지 알고 그걸 실행 시키면 
          if (tempVal == 'A') {
            this.Seat[tempVal2 - 1] = 2;
          }
          else if (tempVal == 'B') {
           tempB = Number(tempVal2)+10;
            this.Seat[tempB - 1] = 2;
          }
          else if (tempVal == 'C') {
           tempB = Number(tempVal2)+20;
            this.Seat[tempB - 1] = 2;
          }
          else if (tempVal == 'D') {
            tempB = Number(tempVal2)+30;
            this.Seat[tempB - 1] = 2;
          }
          else if (tempVal == 'E') {
            tempB = Number(tempVal2)+40;
            this.Seat[tempB - 1] = 2;
          }
          else if (tempVal == 'F') {
            tempB = Number(tempVal2)+50;
            this.Seat[tempB - 1] = 2;
          }
        }
        // console.log(tempVal2+10 -1);
        if((this.adultcount + this.teencount == this.selected.length) && (this.adultcount + this.teencount != 0)){
        this.결제하기 = true;
        }
      }
    },
      deleteseat(value) {            // 클릭을 하면 selected 배열에서 삭제를 함
        for (let i = 0; i < 5; i++) {
          if (this.selected[i] == value) {  // F10 이면
            this.selected.splice(i, 1);    // 클릭을 하면 selected 배열에서 삭제를 함
            this.Seatupdate(value)            // SeatA() 함수 실행
            break;
          }
        }
      },
      Seatupdate(value) {                      // 선택한 좌석 취소를 하면 다시 1로 변경해서 선택 가능한 좌석으로 만듬
        let tempVal = value.substr(0, 1); // 이러면 제일 앞에 있는 알파벳만 짤려서 나옴
        let tempVal2 = value.substring(1, value.length); // 알파벳 뒤의 숫자만 난옴
        let tempC;
        for (let i = 0; i < 1; i++) { // 알파벳이 무엇인지 알고 그걸 실행 시키면  selectA이거 줄일 수 있지 않을까?
          if (tempVal == 'A') {
            this.Seat[tempVal2 - 1] = 1;
          }
          else if (tempVal == 'B') {
            tempC = Number(tempVal2)+10;
            this.Seat[tempC - 1] = 1;
          }
          else if (tempVal == 'C') {
            tempC = Number(tempVal2)+20;
            this.Seat[tempC - 1] = 1;
          }
          else if (tempVal == 'D') {
            tempC = Number(tempVal2)+30;
            this.Seat[tempC - 1] = 1;
          }
          else if (tempVal == 'E') {
            tempC = Number(tempVal2)+40;
            this.Seat[tempC - 1] = 1;
          }
          else if (tempVal == 'F') {
            tempC = Number(tempVal2)+50;
            this.Seat[tempC - 1] = 1;
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
          if((this.teencount + this.adultcount) == this.selected.length && this.selected.length != 0) {
            this.결제하기 = true; 
          }
          if(this.adultcount == 0){
            this.성인 = false;
            }
        }
        this.totalpay = this.totalpay-100;
      },
      adultplus() {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.")
        }else {
          this.adultcount++;
          this.결제하기 = false;
          this.성인 = true;
          this.modaloff();
        }
        this.modalpeople = false;
        this.totalpay = this.totalpay+100;
      },
      teenmins() {
        if (this.teencount == 0) {
          alert("인원선택은 최소 1명 입니다.")
        }else if((this.teencount + this.adultcount) == this.selected.length) {
          alert("좌석을 취소해 주세요.")
        }
        else {
          this.teencount--;
          if(this.teencount == 0) {
              this.청소년 = false;
            }
          if((this.teencount + this.adultcount) == this.selected.length && this.selected.length != 0) {
            this.결제하기 = true;
          }
        }
        this.totalpay = this.totalpay-100;
      },
      teenplus() {
        if (this.adultcount + this.teencount == 5) {
          alert("인원선택은 최대 5명까지 입니다.")
        } else {
          this.teencount++;
          this.결제하기 = false;
          this.청소년 = true;
          this.modaloff();
        }
        this.modalpeople = false;
        this.totalpay = this.totalpay+100;
      },
      cinema(value) {
          this.서면 = true;
          this.센텀시티 = true;
          this.부산대 = true;
          // let temp;
        if(value == '서면'){
          this.서면 = false;
          this.SeomyeonCinema();
          for(let i = 0; i<this.selected.length; i++) {
            this.Seatupdate(this.selected[i]);
          }
          this.selected = [];
        }else if(value == '센텀시티') {
          this.센텀시티 = false;
          this.CentumSeatCinema();
          for(let i = 0; i<this.selected.length; i++) {
            this.Seatupdate(this.selected[i]);
          }
          this.selected = [];
          // this.
        }else if(value == '부산대') {
          this.부산대 = false;
          this.BusanCinema();
          for(let i = 0; i<this.selected.length; i++) {
            this.Seatupdate(this.selected[i]);
          }
          this.selected = [];
        }
        this.modalcinema = false;
        this.ticketinfor.cinema = value;
        this.modaloff();
      },
      CentumSeatCinema() {            // 데이터 베이스에서 자리가 있는지 확인
        let j = 0;
        for (let i = 0; i < 60; i++) {
          if (this.data2[i].seatyn == 'N') {      // 자리가 있으면 1를 줌
            this.Seat[j] = 1;
          } else {                     // 자리가 없으면 0
            this.Seat[j] = 0;
          }
          j++;
        }
      },
      SeomyeonCinema(){
        let j = 0;
        for (let i = 60; i < 120; i++) {
          if (this.data2[i].seatyn == 'N') {      // 자리가 있으면 true를 줌
            this.Seat[j] = 1;
          } else {                     // 자리가 없으면 false
            this.Seat[j] = 0;
          }
          j++;
        }
      },  
      BusanCinema(){
        let j = 0;
        for (let i = 120; i < 180; i++) {
          if (this.data2[i].seatyn == 'N') {      // 자리가 있으면 true를 줌
            this.Seat[j] = 1;
          } else {                     // 자리가 없으면 false
            this.Seat[j] = 0;
          }
          j++;
        }
      },
      // 팝콘 구매
      popcorn() {
        alert("현재 스토어서비스는 준비중입니다.")
      },
      addReservation(){
        this.reservation.username = this.$store.state.auth.user.username;
        this.reservation.moviecd = this.data1.moviecd;
        this.reservation.movienm = this.data1.movienm;
        this.reservation.rcount = this.adultcount + this.teencount;
        this.reservation.price = "100";
        this.reservation.paiddate = new Date();
        this.reservation.scno = null;
      },
      week(value) {
        let temp;
        if(this.ticketinfor.selectedday != null){
          this.ticketinfor.selectedday = '';
        }
        if( value == 'day1'){
            this.오늘 = false;
            this.내일 = true;
            this.요일3 = true;
            this.요일4 = true;
            this.요일5 = true;
              temp = Number(this.dd);
            this.ticketinfor.selectedday = temp;
        }else if ( value == 'day2'){
            this.오늘 = true;
            this.내일 = false;
            this.요일3 = true;
            this.요일4 = true;
            this.요일5 = true;
            temp = Number(this.dd) + 1;
            this.ticketinfor.selectedday = temp;
        }else if ( value == 'day3'){
            this.오늘 = true;
            this.내일 = true;
            this.요일3 = false;
            this.요일4 = true;
            this.요일5 = true;
            temp = Number(this.dd) + 2;
            this.ticketinfor.selectedday = temp;
        }
        else if ( value == 'day4'){
            this.오늘 = true;
            this.내일 = true;
            this.요일3 = true;
            this.요일4 = false;
            this.요일5 = true;
            temp = Number(this.dd) + 3;
            this.ticketinfor.selectedday = temp;
        }
        else if ( value == 'day5'){
            this.오늘 = true;
            this.내일 = true;
            this.요일3 = true;
            this.요일4 = true;
            this.요일5 = false;
            temp = Number(this.dd) + 4;
            this.ticketinfor.selectedday = temp;
        }
        this.modalday = false;
        this.modaloff();
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
          amount: this.totalpay,
          buyer_tel: "01000000000",
          buyer_name: "홍길동",
          buyer_email: "gildong@gmail.com",

        },
        function (rsp) {
          //콜백 함수
          if (rsp.success) {
            //결제 성공
			alert("결제성공")
      this.addReservation();
      this.seattest97();
      this.결제후페이지 = true;
      this.seatcount();
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
  