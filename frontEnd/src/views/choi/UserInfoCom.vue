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
          <!-- 왼쪽 메뉴바 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-fav">
                <p>관리자 목록</p>
                <ul>
                  <li class="active"><a href="#">회원관리</a></li>
                  <li>
                    <a href="#">게시판관리</a>
                  </li>
                  <li><a href="/reservInfoAdmin">결제관리</a></li>
                </ul>
              </div>
              <div class="user-fav">
                <p>기타</p>
                <ul>
                  <li><a href="/adminInfoAdmin">관리자관리</a></li>
                  <li><a href="#">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 왼쪽 메뉴바 끝 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- TODO: 바로 밑 div 데이터 받아서 v-for 예정입니다. -->
            <div class="col-md-9 col-sm-12 col-xs-12">
              <div class="movie-item-style-2 userrate">
                <div class="mv-item-infor">
                  <div>
                    <div>
                      <h6>
                        <a href="#">user.name<span>(user.id)</span></a>
                      </h6>
                    </div>
                    <div class="col-xs-6">
                      <p>아이디 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.username</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.password</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.question</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 확인 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.answer</p>
                    </div>
                    <div class="col-xs-6">
                      <p>생년월일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>
                        user.year &nbsp;/&nbsp; user.month &nbsp;/&nbsp;
                        user.date
                      </p>
                    </div>
                    <div class="col-xs-6">
                      <p>이메일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.email</p>
                    </div>
                    <div class="col-xs-6">
                      <p>휴대전화 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.phonenumber</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-9 col-sm-12 col-xs-12">
              <div class="movie-item-style-2 userrate">
                <div class="mv-item-infor">
                  <div>
                    <div>
                      <h6>
                        <a href="#">user.name<span>(user.id)</span></a>
                      </h6>
                    </div>
                    <div class="col-xs-6">
                      <p>아이디 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.username</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.password</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.question</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 확인 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.answer</p>
                    </div>
                    <div class="col-xs-6">
                      <p>생년월일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>
                        user.year &nbsp;/&nbsp; user.month &nbsp;/&nbsp;
                        user.date
                      </p>
                    </div>
                    <div class="col-xs-6">
                      <p>이메일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.email</p>
                    </div>
                    <div class="col-xs-6">
                      <p>휴대전화 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.phonenumber</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-9 col-sm-12 col-xs-12">
              <div class="movie-item-style-2 userrate">
                <div class="mv-item-infor">
                  <div>
                    <div>
                      <h6>
                        <a href="#">user.name<span>(user.id)</span></a>
                      </h6>
                    </div>
                    <div class="col-xs-6">
                      <p>아이디 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.username</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.password</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.question</p>
                    </div>
                    <div class="col-xs-6">
                      <p>비밀번호 질문 확인 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.answer</p>
                    </div>
                    <div class="col-xs-6">
                      <p>생년월일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>
                        user.year &nbsp;/&nbsp; user.month &nbsp;/&nbsp;
                        user.date
                      </p>
                    </div>
                    <div class="col-xs-6">
                      <p>이메일 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.email</p>
                    </div>
                    <div class="col-xs-6">
                      <p>휴대전화 :</p>
                    </div>
                    <div class="col-xs-6">
                      <p>user.phonenumber</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- 아래 페이징 시작 -->
            <div class="col-md-9 col-sm-12 col-xs-12">
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
            <!-- 아래 페이징 끝 -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style></style>
