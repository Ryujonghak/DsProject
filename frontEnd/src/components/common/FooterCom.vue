<template>
  <div>
    <!-- footer section-->
    <footer class="ht-footer col-xs-12" style="background: black">
      <div class="container">
        <div class="flex-parent-ft">
          <div class="flex-child-ft item1">
            <router-link to="/">
              <img
                class="logo"
                src="../../../public/images/logo8.png"
                alt=""
            /></router-link>
            <!-- <p>
              5th Avenue st, manhattan<br />
              New York, NY 10001
            </p>
            <p>Call us: <a href="#">(+01) 202 342 6789</a></p> -->
          </div>
          <div class="flex-child-ft item2">
            <h4>영화예매</h4>
            <ul>
              <li><router-link to="/reserveTicket">예매하기</router-link></li>
              <li><router-link to="/allMovie">현재상영작</router-link></li>
              <li><router-link to="/theaterBusan">상영시간표</router-link></li>
            </ul>
          </div>
          <div class="flex-child-ft item3">
            <h4>고객센터</h4>
            <ul>
              <li><router-link to="/notice">공지사항</router-link></li>
              <li><router-link to="/addqna">QnA</router-link></li>
              <li><router-link to="/faq">FAQ</router-link></li>
            </ul>
          </div>
          <div class="flex-child-ft item4">
            <h4>MY PAGE</h4>
            <ul>
              <li><router-link to="/mypage">내정보</router-link></li>
              <li><router-link to="/myticket">나의예매내역</router-link></li>
              <li><router-link to="/archive">무비타임라인</router-link></li>
            </ul>
          </div>
          <div class="flex-child-ft item5">
            <h4>찾아오시는길</h4>
            <p>
                부산광역시 부산진구 KR 부산광역시 부산진구 동성직업전문학교 A1프라자 6층
            </p>
            <h4>대표전화</h4>
            <p>051-933-3400</p>
          </div>
        </div>
      </div>
      <div class="ft-copyright">
        <div class="ft-left">
          <p>© 2022 DONGSUNG TEAM1</p>
        </div>
        <div class="backtotop">
          <p>
            <a href="#" id="back-to-top"
              >Back to top <i class="ion-ios-arrow-thin-up"></i
            ></a>
          </p>
        </div>
      </div>
    </footer>
  </div>
</template>

<script>
export default {};
</script>

<style lang="scss" scoped>
.logo{
  width: 40%;
  margin-left: 30%;
  margin-top: 5%;
}
</style>
