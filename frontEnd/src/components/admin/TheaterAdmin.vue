<template>
    <div>
      <div class="hero user-hero">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="hero-ct">
                <h1>ADMIN PAGE</h1>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="page-single">
        <div class="container">
          <div class="row ipad-width2">
            <!-- <!— 왼쪽 메뉴바 시작 —> -->
            <div class="col-md-3 col-sm-12 col-xs-12">
              <div class="user-information">
                <div class="user-fav">
                  <p>관리자 목록</p>
                  <ul>
                    <li><a href="#">회원관리</a></li>
                    <li class="active"><a href="#"></a>
                      <a
                      class="btn btn-default dropdown-toggle"
                      data-toggle="dropdown"
                      @click="boardclick"
                    >
                      게시판관리 <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li><a>공지사항 관리</a></li>
                      <li><router-link to="/movie-admin">영화 관리</router-link></li>
                      <li><router-link to="/theater-admin">영화관 관리</router-link></li>
                    </ul>
                    </li>
                    <li><a href="#">결제관리</a></li>
                  </ul>
                </div>
                <div class="user-fav">
                  <p>기타</p>
                  <ul>
                    <li><a href="#">관리자관리</a></li>
                    <li><a href="#">Log out</a></li>
                  </ul>
                </div>
              </div>
            </div>
            <!-- <!— 왼쪽 메뉴바 끝 —> -->
            <div class="col-md-9 col-sm-12 col-xs-12">
              <div class="topbar-filter">
                <h3 style="color:aliceblue">영화관 관리</h3>
                <label>Sort by:</label>
                <select>
                  <option value="range">-- Choose option --</option>
                  <option value="saab">-- Choose option 2--</option>
                </select>
              </div>
  
            <!-- 전체정렬 -->
  
            <!--공지사항 테이블 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 20%" />
                    <col style="width: 25%" />
                    <col style="width: 25%" />
                    <col style="width: auto" />
                    <col style="width: auto" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col" style="text-align:center;">번호</th>
                      <th scope="col" style="text-align:center;">지역</th>
                      <th scope="col" style="text-align:center;">이름</th>
                      <th scope="col" style="text-align:center;">등록일</th>
                      <th scope="col" style="text-align:center;">EDIT</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td> data.id </td>
                      <td>data.loc </td>
                      <td>data.title </td>
                      <td>data.regdate </td>
                    </tr>
                  </tbody>
                </table>
                <div class="search">
                  <button type="button" class="btn_col2" @click="writeTheater">
                    글쓰기
                  </button>
                </div>
              </div>
            </div>
            <!--공지사항 테이블 끝  -->
           
            <!--공지사항 작성 폼 시작 (add)-->
            <div v-show="registerTheater">
              <table class="noticeboxnoticebox">
                <colgroup>
                  <col style="width: 20%" />
                  <col style="width: 25%" />
                  <col style="width: 25%" />
                  <col style="width: auto" />
                  <col style="width: auto" />
                </colgroup>
                <tbody>
                  <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="name">지역</label>
                    </th>
                    <td>
                      <input
                        type="text"
                        id="name"
                        class="input-text boxing"
                        value
                 
                      />
                    </td>
                    </tr>
                    <tr>
                    <th scope="row" class="noticelabel">
                      |
                      <label for="noticeTitle">이름</label>
                    </th>
                    <td colspan="3">
                      <input
                        type="text"
                        name="title"
                        id="qnaTitle"
                        class="boxing input-text"
                        maxlength="100"
                        placeholder="제목을 입력해주세요."
      
                      />
                    </td>
                  </tr>
                </tbody>
              </table>
              <div class="search">
                <button type="button" class="btn_col">
                  등록하기
                </button>
              </div>
            </div>
            <!--공지사항 작성 폼 끝 -->
            <div class="topbar-filter">
              <label>Movies per page:</label>
              <select>
                <option value="range">20 Movies</option>
                <option value="saab">10 Movies</option>
              </select>
              <div class="pagination2">
                <span>Page 1 of 1:</span>
                <a class="active" href="#">1</a>
                <a href="#"><i class="ion-arrow-right-b"></i></a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    </div>
  </template>
  
  <script>
  import NoticeDataService from "@/services/NoticeDataService.js";
  export default {
    data() {
      return {
      data:[],
      addnotice:{
          id:null,
          type:"",
          title:"",
          content:""
      },
      registerTheater: false,
  
        // 게시판관리 v-show
        board : false,
        //페이징을 위한 변수 정의
        page : 1,
        count: 0, //전체 데이터 건수 
        pageSize: 3, 
        
        pageSizes:[3,6,9] //select box에 넣을 기본 데이터 
      };
    },
    methods: {
      retrieveNotice() {
        NoticeDataService.getAll(this.title,this.page-1,this.pageSize) //데이터쪽에서 가져오려면 앞에 this를 붙여야함 
          // 성공하면 .then() 결과가 전송됨
          .then((response) => {
            const {data, totalItems} = response.data; //springboot의 전송된 맵 정보 
            this.data = data;  //스프링부트에서 전송한 데이터
            this.count = totalItems; //스프링부트에서 전송한 페이지정보(총 건수)
            // 디버깅 콘솔에 정보 출력
            console.log(response.data);
          })
          // 실패하면 .catch() 에 에러가 전송됨
          .catch((e) => {
            console.log(e);
          });
      },
          // 목록을 클릭했을때 현재 객체, 인덱스번호를 저장하는 함수
          setActiveNotice(data, index) {
        this.currentNotice = data;
        this.currentIndex = index;
      },
  
  
      // 글쓰기 버튼 클릭시 글쓰기 테이블나옴 
      writeTheater() {
        this.registerTheater = !this.registerTheater;
      },
  
      // 등록하기 버튼 클릭시 생성
      createNotice() {
        let data = {
          type: this.type,
          title: this.title,
          content: this.content,
        };
        NoticeDataService.create(data)
          // 성공하면 then() 결과가 전송됨
          .then((response) => {
            this.notice.id = response.data.id;
            // 콘솔 로그 출력(response.data)
            console.log(response.data);
            // 변수 submitted
            this.submitted = true;
          })
          // 실패하면 .catch() 결과가 전송됨
          .catch((e) => {
            console.log(e);
          });
      },
      boardclick(){
        this.board = !this.board;
      }
    },
  };
  </script>
  
  <style lang="scss" scoped>
  .notice_table {
    margin-top: 3%;
    text-align: center;
    color: inherit;
    background: white;
    border: 1 solid white;
  }
  .btn_col2 {
    box-sizing: border-box;
    border-radius: 4px;
    border: 1px solid #414141;
    color: #ffffff !important;
    text-align: center;
    vertical-align: middle;
    background-color: #414141;
    display: inline !important;
  }
  .noticebox {
    color: inherit;
    background: whitesmoke;
  }
  .btn_col {
    box-sizing: border-box;
    border-radius: 4px;
    border: 1px solid #414141;
    color: #ffffff !important;
    text-align: center;
    vertical-align: middle;
    background-color: #414141;
    display: inline !important;
    margin-bottom: 2%;
  }
  
  .noticelabel {
    color: #ffffff !important;
  }
  </style>
  