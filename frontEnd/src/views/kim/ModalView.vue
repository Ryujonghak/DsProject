<template>
  <div class="home">
    <div v-show="model" class="black-bg2">
      <div class="white-bg">
        <div style="padding-right: 0" class="col-md-12 col-sm-12 col-xs-12">
          <div style="text-align: center">
            <h1 style="height: 70px; padding-top: 15px" class="bd-hd">
                <button class="e" @click="mo2()">
                  <img src="@/assets/images_kim/Views/ModalView/xx.png" alt="" />
                </button>

            </h1>
          </div>
          <span class="bx_num">성인</span>
          <button @click="mins()" class="btn_mins">-</button> <span  class="bx_num">{{ count}}</span>
            <button @click="plus()" class="btn_plus">+</button>
          <span style="float: right; color: black;">· 인원은 최대 5명까지 선택 가능합니다.</span>
          <p class="choice">선택 좌석 : A열 2번, B열 2번</p>
          <div style="margin-top: 20px;margin-bottom: 20px;color: white;float: right;">

            <span>러닝 타임 </span>
            <img
              style="width: 30px; height: 30px"
              src="@/assets/images_kim/Views/ModalView/free-icon-time-6659457.png"
              alt=""
            /><span style="margin-left: 10px">192분</span>
          </div>

          <img
            style="width: 100%; height: 30px"
            src="@/assets/images_kim/Views/ModalView/SCREEN.jpg"
            alt=""
          />
          <p style="text-align: center">S &nbsp; C &nbsp; R &nbsp; E &nbsp; E &nbsp; N</p>
          <div class="seat">
            <div class="seat-p">
              <span class="font">A</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">B</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">C</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">D</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">E</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">F</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">G</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>
            <div class="seat-p">
              <span class="font">H</span>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 5%" >1</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 5%" >1</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 10%" >2</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 10%" >2</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 15%" >3</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 15%" >3</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 20%" >4</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 20%" >4</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 37%" >5</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 37%" >5</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 37%" >5</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 42%" >6</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 42%" >6</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 47%" >7</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 47%"  >7</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 47%"  >7</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 52%"  >8</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 52%"  >8</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 57%" >9</span>
                <span  v-show="seat2"  class="seat-bg2"  style="position: absolute; left: 57%"  >9</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 57%"  >9</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 62%"  >10</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 62%" >10</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 62%" >10</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 77%" >11</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 77%">11</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 77%" >11</span>
              </a>
              <a href="#">
                <span v-show="seat1" class="seat-bg" style="position: absolute; left: 82%" >12</span >
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 82%" >12</span>
                <span v-show="seat3" class="seat-bg3" style="position: absolute; left: 82%" >12</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 87%"  >13</span>
                <span   v-show="seat2"   class="seat-bg2"   style="position: absolute; left: 87%"   >13</span>
                <span   v-show="seat3"   class="seat-bg3"   style="position: absolute; left: 87%"   >13</span>
              </a>
              <a href="#">
                <span  v-show="seat1"  class="seat-bg"  style="position: absolute; left: 92%"  >14</span>
                <span v-show="seat2" class="seat-bg2" style="position: absolute; left: 92%" >14</span>
                <span  v-show="seat3"  class="seat-bg3"  style="position: absolute; left: 92%"  >14</span>
              </a>
            </div>

          </div>
          <div class="col-md-12" style="margin-top: 20px">
            <span style="color: white; margin: 9px"
              ><img
                style="width: 13px; height: 13px;"
                src="@/assets/images_kim/Views/ModalView/seat-img1.jpg"
                alt=""
              />
              선택 가능</span
            >
            <span style="color: white; margin: 9px"
              ><img
                style="width: 13px; height: 13px"
                src="@/assets/images_kim/Views/ModalView/seat-img2.jpg"
                alt=""
              />
              선택 좌석</span
            >
            <span style="color: white; margin-bottom: 19px"
              ><img
                style="width: 13px; height: 13px"
                src="@/assets/images_kim/Views/ModalView/seat-img3.jpg"
                alt=""
              />
              예매 완료</span
            >
          </div>



        </div>
      </div>
    </div>
<!--    <div v-show="model" class="black-bg2">-->
<!--      <div class="white-bg">-->
<!--        <div style="padding-right: 0" class="col-md-12 col-sm-12 col-xs-12">-->
<!--          &lt;!&ndash; 닫기 버튼 시작 &ndash;&gt;-->
<!--          <div  class="col-md-12" style="text-align: center; padding-right: 0">-->
<!--            <h1 style="height: 70px; padding-top: 15px" class="bd-hd">-->
<!--                <button class="e" @click="mo2()">-->
<!--                  <img src="../assets/images_kim/xx.png" alt="" />-->
<!--                </button>-->
<!--            </h1>-->
<!--          </div>-->
<!--          &lt;!&ndash; 닫기 버튼 끝 &ndash;&gt;-->

<!--          &lt;!&ndash; 지역 / 영화관 / 시간 선택  시작 &ndash;&gt;-->
<!--          <div style=" overflow: hidden; height: 550px; border-radius: 20px; background-color: #FFFFFF; position: relative; padding-right: 0; padding-left: 0;" class="col-md-12">-->
<!--            <header class="col-md-12" style="background-color: black; color: white; position: absolute; top: 0px; left: 0; padding-right: 0; padding-left: 0;">-->
<!--             <div style="color: white; text-align: center; border-bottom:solid 1px #DDDDDD;  position: relative; top: 0; left: 0; padding-top:15px; padding-bottom: 15px;" class="col-md-4">영화관-->
<!--              &lt;!&ndash; TODO: 12/22 수정 button을 라디오 박스로 변경 이유 : custom 파일에 소스 추가를 안해도 됨&ndash;&gt;-->
<!--              <div style="background-color: #DDDDDD; height: 300px;top: 54px; left: 0; position: absolute" class="col-md-12">-->
<!--                <RadioToggleButtons v-model='currentValue' :values='values'  color='purple' textColor='#000' selectedTextColor='#fff' @change="test()"/>-->
<!--                <RadioToggleButtons  v-show="testt"	v-model='currentValue2'	:values='values2'	color='black'	textColor='#000'	selectedTextColor='#fff'/>-->
<!--              </div>-->
<!--            </div>-->
<!--            </header>-->
<!--            &lt;!&ndash; 공간 블럭 &ndash;&gt;-->
<!--            <div class="col-md-12" style="height: 50px;"></div>-->
<!--            &lt;!&ndash; 공간 블럭 &ndash;&gt;-->
<!--            &lt;!&ndash; 지역 시작 &ndash;&gt;-->
<!--            &lt;!&ndash; <div style="width: 16.66666667%; float: left;">-->
<!--              <button id="button1" class="" @click="seoul()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">-->
<!--                <span style="float: left; ">서울</span> -->
<!--              </button>-->
<!--              <button id="button2"  @click="gyeonggi()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">-->
<!--                <span style="float: left; ">경기/인천</span> -->
<!--              </button>-->
<!--              <button id="button3"  @click="chungcheong()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">-->
<!--                <span style="float: left; ">충청/대전</span> -->
<!--              </button>-->
<!--              <button id="button4"  @click="jeolla()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">   -->
<!--                <span style="float: left; ">전라/광주</span>-->
<!--              </button>-->
<!--              <button id="button5"  @click="gyeongbuk()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">-->
<!--                <span style="float: left; ">경북/대구</span>-->
<!--              </button>-->
<!--              <button id="button6"  @click="busan()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">-->
<!--                <span style="float: left; ">경남/부산/울산</span>-->
<!--              </button>-->
<!--              <button id="button7"  @click="gangwon()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;">-->
<!--                <span style="float: left; ">강원</span>-->
<!--              </button>-->
<!--              <button id="button8"  @click="jeju()" style="width: 100%; padding: 5px; background-color: #F5F5F5; border: 0;"> -->
<!--                <span style="float: left; ">제주</span>-->
<!--              </button>-->
<!--            </div> &ndash;&gt;-->
<!--            &lt;!&ndash; 지역 끝 &ndash;&gt;-->

<!--            &lt;!&ndash; 서울 영화관 시작 &ndash;&gt;-->
<!--            <div v-show="서울" style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">가산디지털-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">가양-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">강동-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">건대입구-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">김포공황-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">노원-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">도곡-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">독산-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">브로드웨이(신사)-->
<!--                </span>-->
<!--              </button><button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">서울대입구-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">가산디지털-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">수락산-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">수유-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">신도림-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">신림-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 서울 영화관 끝 &ndash;&gt;-->

<!--            &lt;!&ndash; 경기 / 인천 시작 &ndash;&gt;-->
<!--            <div v-show="경기"  style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">동탄-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">위례-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 경기 / 인천 끝 &ndash;&gt;-->

<!--            &lt;!&ndash; 충청 / 대전 시작 &ndash;&gt;-->
<!--            <div v-show="충청"  style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">대전센트럴-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">대전(백화점)-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 충청 / 대전 끝 &ndash;&gt;-->

<!--            &lt;!&ndash; 전라 / 광주 시작  &ndash;&gt;-->
<!--            <div  v-show="전라" style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">광주(백화점)-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">전주(백화점)-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 전라 / 광주 끝  &ndash;&gt;-->

<!--            &lt;!&ndash; 경북 / 대구  &ndash;&gt;-->
<!--            <div v-show="경북"  style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">동성로-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 경북 / 대구  &ndash;&gt;-->

<!--            &lt;!&ndash; 경남 부산 울산 &ndash;&gt;-->
<!--            <div v-show="부산"  style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">서면(전포동)-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">부산명지-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">부산본점-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">센텀시티-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">김해부원-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">김해아울렛(장유)-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">진해-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">창원-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 경 부 울 &ndash;&gt;-->

<!--            &lt;!&ndash; 강원 &ndash;&gt;-->
<!--            <div v-show="강원"  style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">속초-->
<!--                </span>-->
<!--              </button>-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">동해-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 강원 &ndash;&gt;-->

<!--            &lt;!&ndash; 제주 &ndash;&gt;-->
<!--            <div v-show="제주"  style="width: 16.66666667%; float: left;">-->
<!--              <button style="width: 100%; padding: 5px; background-color: #FFFFFF; border: 0;">-->
<!--                <span style="float: left;">서귀포-->
<!--                </span>-->
<!--              </button>-->
<!--            </div>-->
<!--            &lt;!&ndash; 제주 &ndash;&gt;-->
<!--            -->
<!--    -->
<!--            -->
<!--          </div>-->

<!--          -->
<!--          &lt;!&ndash; 지역 / 영화괸 / 시간 선택 끝 &ndash;&gt;-->
<!--        </div>-->
<!--      </div>-->
<!--    </div>-->
    <button @click="mo()">
        클릭하면 페이지 나옴
    </button>
    
  </div>
</template>

<script>
/* eslint-disable */
import custom from "@/assets/js/custom.js";
export default {
  data() {
    return {
      model : false,
      seat1: true,
      seat2: false,
      seat3: false,
      count : 0,
      서울 : false,
      경기 : false,
      충청 : false,
      전라 : false,
      경북 : false,
      부산 : false,
      강원 : false,
      제주 : false,

      values: [
				{ label: '서울', value: '1' },
				{ label: 'Value 2', value: '2' },
				{ label: 'Value 3', value: '3' },
			],
            values2: [
				{ label: 'Value 1', value: '1' },
				{ label: 'Value 2', value: '2' },
				{ label: 'Value 3', value: '3' },
			],
			currentValue: '',
            currentValue2: '',
            testt : false

    }
  },
  methods: {
    likeSave() {
      alert("저장되었습니다. 마이페이지에서 확인 가능합니다 :)");
    },
    test() {
            if(this.currentValue == 1) {
                this.testt = true;
                console.log(this.currentValue);
            }
            
            else{
                console.log(22);
            }
        },
    mo() {
      this.model = true;
    },
    mo2() {
      this.model = false;
    },
    mins() {
      if( this.count == 0 ) {
      }
      else {
        this.count--;
      }
    },
    plus(){
      if(this.count == 5 ){
      }else{
        this.count++;
      }
    },
    seoul() {
      this.서울 = true,
      this.경기 = false,
      this.충청 = false,
      this.전라 = false,
      this.경북 = false,
      this.부산 = false,
      this.강원 = false,
      this.제주 = false
    },
    gyeonggi() {
      this.서울 = false,
      this.경기 = true,
      this.충청 = false,
      this.전라 = false,
      this.경북 = false,
      this.부산 = false,
      this.강원 = false,
      this.제주 = false
    },
    chungcheong() {
      this.서울 = false,
      this.경기 = false,
      this.충청 = true,
      this.전라 = false,
      this.경북 = false,
      this.부산 = false,
      this.강원 = false,
      this.제주 = false
    },
    jeolla() {
      this.서울 = false,
      this.경기 = false,
      this.충청 = false,
      this.전라 = true,
      this.경북 = false,
      this.부산 = false,
      this.강원 = false,
      this.제주 = false
    },
    gyeongbuk() {
      this.서울 = false,
      this.경기 = false,
      this.충청 = false,
      this.전라 = false,
      this.경북 = true,
      this.부산 = false,
      this.강원 = false,
      this.제주 = false
    },
    busan() {
      this.서울 = false,
      this.경기 = false,
      this.충청 = false,
      this.전라 = false,
      this.경북 = false,
      this.부산 = true,
      this.강원 = false,
      this.제주 = false
    },
    gangwon() {
      this.서울 = false,
      this.경기 = false,
      this.충청 = false,
      this.전라 = false,
      this.경북 = false,
      this.부산 = false,
      this.강원 = true,
      this.제주 = false
    },
    jeju() {
      this.서울 = false,
      this.경기 = false,
      this.충청 = false,
      this.전라 = false,
      this.경북 = false,
      this.부산 = false,
      this.강원 = false,
      this.제주 = true
    },

    
  },
  mounted() {
    custom();
  },
};
</script>

<style scoped>
@import '@/assets/css/style.css';
@import "@/assets/css/test1.css";


.bx_num {
  color: white;
  margin-right: 5px;
}

</style>
