<template>
  <div>
    <div class="seat">
      <div class="seat-p">
        <span class="font">A</span>
        <div style="position: absolute; left: 14.5%; top: 0px">
          <button
            @click="addseat('A1')"
            v-show="seattest60[0] == 1"
            class="seat-bg"
          >
            1
          </button>
          <button
            @click="deleteseat('A1')"
            v-show="seattest60[0] == 2"
            class="seat-bg2"
          >
            1
          </button>
          <button v-show="seattest60[0] == 0" class="seat-bg3" disabled>
            1
          </button>
        </div>
        <div style="position: absolute; left: 20.5%; top: 0px">
          <button
            @click="addseat('A2')"
            v-show="seattest60[1] == 1"
            class="seat-bg"
          >
            2
          </button>
          <button
            @click="deleteseat('A2')"
            v-show="seattest60[1] == 2"
            class="seat-bg2"
          >
            2
          </button>
          <button v-show="seattest60[1] == 0" class="seat-bg3" disabled>
            2
          </button>
        </div>
        <div style="position: absolute; left: 26.5%; top: 0px">
          <button
            @click="addseat('A3')"
            v-show="seattest60[2] == 1"
            class="seat-bg"
          >
            3
          </button>
          <button
            @click="deleteseat('A3')"
            v-show="seattest60[2] == 2"
            class="seat-bg2"
          >
            3
          </button>
          <button v-show="seattest60[2] == 0" class="seat-bg3" disabled>
            3
          </button>
        </div>
        <div style="position: absolute; left: 39.5%; top: 0px">
          <button
            @click="addseat('A4')"
            v-show="seattest60[3] == 1"
            class="seat-bg"
          >
            4
          </button>
          <button
            @click="deleteseat('A4')"
            v-show="seattest60[3] == 2"
            class="seat-bg2"
          >
            4
          </button>
          <button v-show="seattest60[3] == 0" class="seat-bg3" disabled>
            4
          </button>
        </div>
        <div style="position: absolute; left: 45.5%; top: 0px">
          <button
            @click="addseat('A5')"
            v-show="seattest60[4] == 1"
            class="seat-bg"
          >
            5
          </button>
          <button
            @click="deleteseat('A5')"
            v-show="seattest60[4] == 2"
            class="seat-bg2"
          >
            5
          </button>
          <button v-show="seattest60[4] == 0" class="seat-bg3" disabled>
            5
          </button>
        </div>
        <div style="position: absolute; left: 51.5%; top: 0px">
          <button
            @click="addseat('A6')"
            v-show="seattest60[5] == 1"
            class="seat-bg"
          >
            6
          </button>
          <button
            @click="deleteseat('A6')"
            v-show="seattest60[5] == 2"
            class="seat-bg2"
          >
            6
          </button>
          <button v-show="seattest60[5] == 0" class="seat-bg3" disabled>
            6
          </button>
        </div>
        <div style="position: absolute; left: 57.5%; top: 0px">
          <button
            @click="addseat('A7')"
            v-show="seattest60[6] == 1"
            class="seat-bg"
          >
            7
          </button>
          <button
            @click="deleteseat('A7')"
            v-show="seattest60[6] == 2"
            class="seat-bg2"
          >
            7
          </button>
          <button v-show="seattest60[6] == 0" class="seat-bg3" disabled>
            7
          </button>
        </div>
        <div style="position: absolute; left: 73.5%; top: 0px">
          <button
            @click="addseat('A8')"
            v-show="seattest60[7] == 1"
            class="seat-bg"
          >
            8
          </button>
          <button
            @click="deleteseat('A8')"
            v-show="seattest60[7] == 2"
            class="seat-bg2"
          >
            8
          </button>
          <button v-show="seattest60[7] == 0" class="seat-bg3" disabled>
            8
          </button>
        </div>
        <div style="position: absolute; left: 79.5%; top: 0px">
          <button
            @click="addseat('A9')"
            v-show="seattest60[8] == 1"
            class="seat-bg"
          >
            9
          </button>
          <button
            @click="deleteseat('A9')"
            v-show="seattest60[8] == 2"
            class="seat-bg2"
          >
            9
          </button>
          <button v-show="seattest60[8] == 0" class="seat-bg3" disabled>
            9
          </button>
        </div>
        <div style="position: absolute; left: 85.5%; top: 0px">
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
          <button v-show="seattest60[9] == 0" class="seat-bg3" disabled>
            10
          </button>
        </div>
        <span class="font2">A</span>
      </div>
      <div class="seat-p">
        <span class="font">B</span>
        <div style="position: absolute; left: 14.5%; top: 42.5px">
          <button
            @click="addseat('B1')"
            v-show="seattest60[10] == 1"
            class="seat-bg"
          >
            1
          </button>
          <button
            @click="deleteseat('B1')"
            v-show="seattest60[10] == 2"
            class="seat-bg2"
          >
            1
          </button>
          <button v-show="seattest60[10] == 0" class="seat-bg3" disabled>
            1
          </button>
        </div>
        <div style="position: absolute; left: 20.5%; top: 42.5px">
          <button
            @click="addseat('B2')"
            v-show="seattest60[11] == 1"
            class="seat-bg"
          >
            2
          </button>
          <button
            @click="deleteseat('B2')"
            v-show="seattest60[11] == 2"
            class="seat-bg2"
          >
            2
          </button>
          <button v-show="seattest60[11] == 0" class="seat-bg3" disabled>
            2
          </button>
        </div>
        <div style="position: absolute; left: 26.5%; top: 42.5px">
          <button
            @click="addseat('B3')"
            v-show="seattest60[12] == 1"
            class="seat-bg"
          >
            3
          </button>
          <button
            @click="deleteseat('B3')"
            v-show="seattest60[12] == 2"
            class="seat-bg2"
          >
            3
          </button>
          <button v-show="seattest60[12] == 0" class="seat-bg3" disabled>
            3
          </button>
        </div>
        <div style="position: absolute; left: 39.5%; top: 42.5px">
          <button
            @click="addseat('B4')"
            v-show="seattest60[13] == 1"
            class="seat-bg"
          >
            4
          </button>
          <button
            @click="deleteseat('B4')"
            v-show="seattest60[13] == 2"
            class="seat-bg2"
          >
            4
          </button>
          <button v-show="seattest60[13] == 0" class="seat-bg3" disabled>
            4
          </button>
        </div>
        <div style="position: absolute; left: 45.5%; top: 42.5px">
          <button
            @click="addseat('B5')"
            v-show="seattest60[14] == 1"
            class="seat-bg"
          >
            5
          </button>
          <button
            @click="deleteseat('B5')"
            v-show="seattest60[14] == 2"
            class="seat-bg2"
          >
            5
          </button>
          <button v-show="seattest60[14] == 0" class="seat-bg3" disabled>
            5
          </button>
        </div>
        <div style="position: absolute; left: 51.5%; top: 42.5px">
          <button
            @click="addseat('B6')"
            v-show="seattest60[15] == 1"
            class="seat-bg"
          >
            6
          </button>
          <button
            @click="deleteseat('B6')"
            v-show="seattest60[15] == 2"
            class="seat-bg2"
          >
            6
          </button>
          <button v-show="seattest60[15] == 0" class="seat-bg3" disabled>
            6
          </button>
        </div>
        <div style="position: absolute; left: 57.5%; top: 42.5px">
          <button
            @click="addseat('B7')"
            v-show="seattest60[16] == 1"
            class="seat-bg"
          >
            7
          </button>
          <button
            @click="deleteseat('B7')"
            v-show="seattest60[16] == 2"
            class="seat-bg2"
          >
            7
          </button>
          <button v-show="seattest60[16] == 0" class="seat-bg3" disabled>
            7
          </button>
        </div>
        <div style="position: absolute; left: 73.5%; top: 42.5px">
          <button
            @click="addseat('B8')"
            v-show="seattest60[17] == 1"
            class="seat-bg"
          >
            8
          </button>
          <button
            @click="deleteseat('B8')"
            v-show="seattest60[17] == 2"
            class="seat-bg2"
          >
            8
          </button>
          <button v-show="seattest60[17] == 0" class="seat-bg3" disabled>
            8
          </button>
        </div>
        <div style="position: absolute; left: 79.5%; top: 42.5px">
          <button
            @click="addseat('B9')"
            v-show="seattest60[18] == 1"
            class="seat-bg"
          >
            9
          </button>
          <button
            @click="deleteseat('B9')"
            v-show="seattest60[18] == 2"
            class="seat-bg2"
          >
            9
          </button>
          <button v-show="seattest60[18] == 0" class="seat-bg3" disabled>
            9
          </button>
        </div>
        <div style="position: absolute; left: 85.5%; top: 42.5px">
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
          <button v-show="seattest60[19] == 0" class="seat-bg3" disabled>
            10
          </button>
        </div>
        <span class="font2">B</span>
      </div>
      <div class="seat-p">
        <span class="font">C</span>
        <div style="position: absolute; left: 14.5%; top: 85px">
          <button
            @click="addseat('C1')"
            v-show="seattest60[20] == 1"
            class="seat-bg"
          >
            1
          </button>
          <button
            @click="deleteseat('C1')"
            v-show="seattest60[20] == 2"
            class="seat-bg2"
          >
            1
          </button>
          <button v-show="seattest60[20] == 0" class="seat-bg3" disabled>
            1
          </button>
        </div>
        <div style="position: absolute; left: 20.5%; top: 85px">
          <button
            @click="addseat('C2')"
            v-show="seattest60[21] == 1"
            class="seat-bg"
          >
            2
          </button>
          <button
            @click="deleteseat('C2')"
            v-show="seattest60[21] == 2"
            class="seat-bg2"
          >
            2
          </button>
          <button v-show="seattest60[21] == 0" class="seat-bg3" disabled>
            2
          </button>
        </div>
        <div style="position: absolute; left: 26.5%; top: 85px">
          <button
            @click="addseat('C3')"
            v-show="seattest60[22] == 1"
            class="seat-bg"
          >
            3
          </button>
          <button
            @click="deleteseat('C3')"
            v-show="seattest60[22] == 2"
            class="seat-bg2"
          >
            3
          </button>
          <button v-show="seattest60[22] == 0" class="seat-bg3" disabled>
            3
          </button>
        </div>
        <div style="position: absolute; left: 39.5%; top: 85px">
          <button
            @click="addseat('C4')"
            v-show="seattest60[23] == 1"
            class="seat-bg"
          >
            4
          </button>
          <button
            @click="deleteseat('C4')"
            v-show="seattest60[23] == 2"
            class="seat-bg2"
          >
            4
          </button>
          <button v-show="seattest60[23] == 0" class="seat-bg3" disabled>
            4
          </button>
        </div>
        <div style="position: absolute; left: 45.5%; top: 85px">
          <button
            @click="addseat('C5')"
            v-show="seattest60[24] == 1"
            class="seat-bg"
          >
            5
          </button>
          <button
            @click="deleteseat('C5')"
            v-show="seattest60[24] == 2"
            class="seat-bg2"
          >
            5
          </button>
          <button v-show="seattest60[24] == 0" class="seat-bg3" disabled>
            5
          </button>
        </div>
        <div style="position: absolute; left: 51.5%; top: 85px">
          <button
            @click="addseat('C6')"
            v-show="seattest60[25] == 1"
            class="seat-bg"
          >
            6
          </button>
          <button
            @click="deleteseat('C6')"
            v-show="seattest60[25] == 2"
            class="seat-bg2"
          >
            6
          </button>
          <button v-show="seattest60[25] == 0" class="seat-bg3" disabled>
            6
          </button>
        </div>
        <div style="position: absolute; left: 57.5%; top: 85px">
          <button
            @click="addseat('C7')"
            v-show="seattest60[26] == 1"
            class="seat-bg"
          >
            7
          </button>
          <button
            @click="deleteseat('C7')"
            v-show="seattest60[26] == 2"
            class="seat-bg2"
          >
            7
          </button>
          <button v-show="seattest60[26] == 0" class="seat-bg3" disabled>
            7
          </button>
        </div>
        <div style="position: absolute; left: 73.5%; top: 85px">
          <button
            @click="addseat('C8')"
            v-show="seattest60[27] == 1"
            class="seat-bg"
          >
            8
          </button>
          <button
            @click="deleteseat('C8')"
            v-show="seattest60[27] == 2"
            class="seat-bg2"
          >
            8
          </button>
          <button v-show="seattest60[27] == 0" class="seat-bg3" disabled>
            8
          </button>
        </div>
        <div style="position: absolute; left: 79.5%; top: 85px">
          <button
            @click="addseat('C9')"
            v-show="seattest60[28] == 1"
            class="seat-bg"
          >
            9
          </button>
          <button
            @click="deleteseat('C9')"
            v-show="seattest60[28] == 2"
            class="seat-bg2"
          >
            9
          </button>
          <button v-show="seattest60[28] == 0" class="seat-bg3" disabled>
            9
          </button>
        </div>
        <div style="position: absolute; left: 85.5%; top: 85px">
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
          <button v-show="seattest60[29] == 0" class="seat-bg3" disabled>
            10
          </button>
        </div>
        <span class="font2">C</span>
      </div>
      <div class="seat-p">
        <span class="font">D</span>
        <div style="position: absolute; left: 14.5%; top: 127px">
          <button
            @click="addseat('D1')"
            v-show="seattest60[30] == 1"
            class="seat-bg"
          >
            1
          </button>
          <button
            @click="deleteseat('D1')"
            v-show="seattest60[30] == 2"
            class="seat-bg2"
          >
            1
          </button>
          <button v-show="seattest60[30] == 0" class="seat-bg3" disabled>
            1
          </button>
        </div>
        <div style="position: absolute; left: 20.5%; top: 127px">
          <button
            @click="addseat('D2')"
            v-show="seattest60[31] == 1"
            class="seat-bg"
          >
            2
          </button>
          <button
            @click="deleteseat('D2')"
            v-show="seattest60[31] == 2"
            class="seat-bg2"
          >
            2
          </button>
          <button v-show="seattest60[31] == 0" class="seat-bg3" disabled>
            2
          </button>
        </div>
        <div style="position: absolute; left: 26.5%; top: 127px">
          <button
            @click="addseat('D3')"
            v-show="seattest60[32] == 1"
            class="seat-bg"
          >
            3
          </button>
          <button
            @click="deleteseat('D3')"
            v-show="seattest60[32] == 2"
            class="seat-bg2"
          >
            3
          </button>
          <button v-show="seattest60[32] == 0" class="seat-bg3" disabled>
            3
          </button>
        </div>
        <div style="position: absolute; left: 39.5%; top: 127px">
          <button
            @click="addseat('D4')"
            v-show="seattest60[33] == 1"
            class="seat-bg"
          >
            4
          </button>
          <button
            @click="deleteseat('D4')"
            v-show="seattest60[33] == 2"
            class="seat-bg2"
          >
            4
          </button>
          <button v-show="seattest60[33] == 0" class="seat-bg3" disabled>
            4
          </button>
        </div>
        <div style="position: absolute; left: 45.5%; top: 127px">
          <button
            @click="addseat('D5')"
            v-show="seattest60[34] == 1"
            class="seat-bg"
          >
            5
          </button>
          <button
            @click="deleteseat('D5')"
            v-show="seattest60[34] == 2"
            class="seat-bg2"
          >
            5
          </button>
          <button v-show="seattest60[34] == 0" class="seat-bg3" disabled>
            5
          </button>
        </div>
        <div style="position: absolute; left: 51.5%; top: 127px">
          <button
            @click="addseat('D6')"
            v-show="seattest60[35] == 1"
            class="seat-bg"
          >
            6
          </button>
          <button
            @click="deleteseat('D6')"
            v-show="seattest60[35] == 2"
            class="seat-bg2"
          >
            6
          </button>
          <button v-show="seattest60[35] == 0" class="seat-bg3" disabled>
            6
          </button>
        </div>
        <div style="position: absolute; left: 57.5%; top: 127px">
          <button
            @click="addseat('D7')"
            v-show="seattest60[36] == 1"
            class="seat-bg"
          >
            7
          </button>
          <button
            @click="deleteseat('D7')"
            v-show="seattest60[36] == 2"
            class="seat-bg2"
          >
            7
          </button>
          <button v-show="seattest60[36] == 0" class="seat-bg3" disabled>
            7
          </button>
        </div>
        <div style="position: absolute; left: 73.5%; top: 127px">
          <button
            @click="addseat('D8')"
            v-show="seattest60[37] == 1"
            class="seat-bg"
          >
            8
          </button>
          <button
            @click="deleteseat('D8')"
            v-show="seattest60[37] == 2"
            class="seat-bg2"
          >
            8
          </button>
          <button v-show="seattest60[37] == 0" class="seat-bg3" disabled>
            8
          </button>
        </div>
        <div style="position: absolute; left: 79.5%; top: 127px">
          <button
            @click="addseat('D9')"
            v-show="seattest60[38] == 1"
            class="seat-bg"
          >
            9
          </button>
          <button
            @click="deleteseat('D9')"
            v-show="seattest60[38] == 2"
            class="seat-bg2"
          >
            9
          </button>
          <button v-show="seattest60[38] == 0" class="seat-bg3" disabled>
            9
          </button>
        </div>
        <div style="position: absolute; left: 85.5%; top: 127px">
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
          <button v-show="seattest60[39] == 0" class="seat-bg3" disabled>
            10
          </button>
        </div>
        <span class="font2">D</span>
      </div>
      <div class="seat-p">
        <span class="font">E</span>
        <div style="position: absolute; left: 14.5%; top: 169px">
          <button
            @click="addseat('E1')"
            v-show="seattest60[40] == 1"
            class="seat-bg"
          >
            1
          </button>
          <button
            @click="deleteseat('E1')"
            v-show="seattest60[40] == 2"
            class="seat-bg2"
          >
            1
          </button>
          <button v-show="seattest60[40] == 0" class="seat-bg3" disabled>
            1
          </button>
        </div>
        <div style="position: absolute; left: 20.5%; top: 169px">
          <button
            @click="addseat('E2')"
            v-show="seattest60[41] == 1"
            class="seat-bg"
          >
            2
          </button>
          <button
            @click="deleteseat('E2')"
            v-show="seattest60[41] == 2"
            class="seat-bg2"
          >
            2
          </button>
          <button v-show="seattest60[41] == 0" class="seat-bg3" disabled>
            2
          </button>
        </div>
        <div style="position: absolute; left: 26.5%; top: 169px">
          <button
            @click="addseat('E3')"
            v-show="seattest60[42] == 1"
            class="seat-bg"
          >
            3
          </button>
          <button
            @click="deleteseat('E3')"
            v-show="seattest60[42] == 2"
            class="seat-bg2"
          >
            3
          </button>
          <button v-show="seattest60[42] == 0" class="seat-bg3" disabled>
            3
          </button>
        </div>
        <div style="position: absolute; left: 39.5%; top: 169px">
          <button
            @click="addseat('E4')"
            v-show="seattest60[43] == 1"
            class="seat-bg"
          >
            4
          </button>
          <button
            @click="deleteseat('E4')"
            v-show="seattest60[43] == 2"
            class="seat-bg2"
          >
            4
          </button>
          <button v-show="seattest60[43] == 0" class="seat-bg3" disabled>
            4
          </button>
        </div>
        <div style="position: absolute; left: 45.5%; top: 169px">
          <button
            @click="addseat('E5')"
            v-show="seattest60[44] == 1"
            class="seat-bg"
          >
            5
          </button>
          <button
            @click="deleteseat('E5')"
            v-show="seattest60[44] == 2"
            class="seat-bg2"
          >
            5
          </button>
          <button v-show="seattest60[44] == 0" class="seat-bg3" disabled>
            5
          </button>
        </div>
        <div style="position: absolute; left: 51.5%; top: 169px">
          <button
            @click="addseat('E6')"
            v-show="seattest60[45] == 1"
            class="seat-bg"
          >
            6
          </button>
          <button
            @click="deleteseat('E6')"
            v-show="seattest60[45] == 2"
            class="seat-bg2"
          >
            6
          </button>
          <button v-show="seattest60[45] == 0" class="seat-bg3" disabled>
            6
          </button>
        </div>
        <div style="position: absolute; left: 57.5%; top: 169px">
          <button
            @click="addseat('E7')"
            v-show="seattest60[46] == 1"
            class="seat-bg"
          >
            7
          </button>
          <button
            @click="deleteseat('E7')"
            v-show="seattest60[46] == 2"
            class="seat-bg2"
          >
            7
          </button>
          <button v-show="seattest60[46] == 0" class="seat-bg3" disabled>
            7
          </button>
        </div>
        <div style="position: absolute; left: 73.5%; top: 169px">
          <button
            @click="addseat('E8')"
            v-show="seattest60[47] == 1"
            class="seat-bg"
          >
            8
          </button>
          <button
            @click="deleteseat('E8')"
            v-show="seattest60[47] == 2"
            class="seat-bg2"
          >
            8
          </button>
          <button v-show="seattest60[47] == 0" class="seat-bg3" disabled>
            8
          </button>
        </div>
        <div style="position: absolute; left: 79.5%; top: 169px">
          <button
            @click="addseat('E9')"
            v-show="seattest60[48] == 1"
            class="seat-bg"
          >
            9
          </button>
          <button
            @click="deleteseat('E9')"
            v-show="seattest60[48] == 2"
            class="seat-bg2"
          >
            9
          </button>
          <button v-show="seattest60[48] == 0" class="seat-bg3" disabled>
            9
          </button>
        </div>
        <div style="position: absolute; left: 85.5%; top: 169px">
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
          <button v-show="seattest60[49] == 0" class="seat-bg3" disabled>
            10
          </button>
        </div>
        <span class="font2"> E</span>
      </div>
      <div class="seat-p">
        <span class="font">F</span>
        <div style="position: absolute; left: 14.5%; top: 211px">
          <button
            @click="addseat('F1')"
            v-show="seattest60[50] == 1"
            class="seat-bg"
          >
            1
          </button>
          <button
            @click="deleteseat('F1')"
            v-show="seattest60[50] == 2"
            class="seat-bg2"
          >
            1
          </button>
          <button v-show="seattest60[50] == 0" class="seat-bg3" disabled>
            1
          </button>
        </div>
        <div style="position: absolute; left: 20.5%; top: 211px">
          <button
            @click="addseat('F2')"
            v-show="seattest60[51] == 1"
            class="seat-bg"
          >
            2
          </button>
          <button
            @click="deleteseat('F2')"
            v-show="seattest60[51] == 2"
            class="seat-bg2"
          >
            2
          </button>
          <button v-show="seattest60[51] == 0" class="seat-bg3" disabled>
            2
          </button>
        </div>
        <div style="position: absolute; left: 26.5%; top: 211px">
          <button
            @click="addseat('F3')"
            v-show="seattest60[52] == 1"
            class="seat-bg"
          >
            3
          </button>
          <button
            @click="deleteseat('F3')"
            v-show="seattest60[52] == 2"
            class="seat-bg2"
          >
            3
          </button>
          <button v-show="seattest60[52] == 0" class="seat-bg3" disabled>
            3
          </button>
        </div>
        <div style="position: absolute; left: 39.5%; top: 211px">
          <button
            @click="addseat('F4')"
            v-show="seattest60[53] == 1"
            class="seat-bg"
          >
            4
          </button>
          <button
            @click="deleteseat('F4')"
            v-show="seattest60[53] == 2"
            class="seat-bg2"
          >
            4
          </button>
          <button v-show="seattest60[53] == 0" class="seat-bg3" disabled>
            4
          </button>
        </div>
        <div style="position: absolute; left: 45.5%; top: 211px">
          <button
            @click="addseat('F5')"
            v-show="seattest60[54] == 1"
            class="seat-bg"
          >
            5
          </button>
          <button
            @click="deleteseat('F5')"
            v-show="seattest60[54] == 2"
            class="seat-bg2"
          >
            5
          </button>
          <button v-show="seattest60[54] == 0" class="seat-bg3" disabled>
            5
          </button>
        </div>
        <div style="position: absolute; left: 51.5%; top: 211px">
          <button
            @click="addseat('F6')"
            v-show="seattest60[55] == 1"
            class="seat-bg"
          >
            6
          </button>
          <button
            @click="deleteseat('F6')"
            v-show="seattest60[55] == 2"
            class="seat-bg2"
          >
            6
          </button>
          <button v-show="seattest60[55] == 0" class="seat-bg3" disabled>
            6
          </button>
        </div>
        <div style="position: absolute; left: 57.5%; top: 211px">
          <button
            @click="addseat('F7')"
            v-show="seattest60[56] == 1"
            class="seat-bg"
          >
            7
          </button>
          <button
            @click="deleteseat('F7')"
            v-show="seattest60[56] == 2"
            class="seat-bg2"
          >
            7
          </button>
          <button v-show="seattest60[56] == 0" class="seat-bg3" disabled>
            7
          </button>
        </div>
        <div style="position: absolute; left: 73.5%; top: 211px">
          <button
            @click="addseat('F8')"
            v-show="seattest60[57] == 1"
            class="seat-bg"
          >
            8
          </button>
          <button
            @click="deleteseat('F8')"
            v-show="seattest60[57] == 2"
            class="seat-bg2"
          >
            8
          </button>
          <button v-show="seattest60[57] == 0" class="seat-bg3" disabled>
            8
          </button>
        </div>
        <div style="position: absolute; left: 79.5%; top: 211px">
          <button
            @click="addseat('F9')"
            v-show="seattest60[58] == 1"
            class="seat-bg"
          >
            9
          </button>
          <button
            @click="deleteseat('F9')"
            v-show="seattest60[58] == 2"
            class="seat-bg2"
          >
            9
          </button>
          <button v-show="seattest60[58] == 0" class="seat-bg3" disabled>
            9
          </button>
        </div>
        <div style="position: absolute; left: 85.5%; top: 211px">
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
          <button v-show="seattest60[59] == 0" class="seat-bg3" disabled>
            10
          </button>
        </div>
        <span class="font2"> F</span>
      </div>
    </div>
  </div>
</template>

<script>
import Seat from "@/model/Seat.js";
export default {
  props: ["getSeatpositions"], // A3 이런거 받아옴.
  data() {
    return {
      seatAll: [
        // 고정 좌석
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
      seatdataAll: [], // N,N,N 이렇게 들어옴.
    };
  },
  methods: {
    // FIXME: 이제 상영시간을 클릭하면 밑에 있는 함수가 실행이 되도록 해야함.
    Seat() {
      this.seatdataAll = new Array(60).fill("N");

      for (let i = 0; i < this.getSeatpositions.length; i++) {
        const seatPos = this.getSeatpositions[i];
        const index = this.seatAll.findIndex(
          seat => seat.seatposition === seatPos
        );
        // A3 랑 A3랑 같으면 그 인덱스 번호에 Y 문자를 넣음. 아니면 N을 넣고.
        // false는 -1을 반환함
        if (index !== -1) {
          this.seatdataAll[index] = "Y";
        }
      }
    },
  },
};
</script>

<style scoped></style>
