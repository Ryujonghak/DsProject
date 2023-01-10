<template>
  <div class="navigation">
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1 style="text-align: left">FAQ 자주묻는질문</h1>
              <ul class="breadcumb" style="text-align: left">
                <li class="active"><router-link to="/">Home</router-link></li>
                <li><span class="ion-ios-arrow-right"></span>FAQ</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="Faq">
      <meta name="viewport" content="width=device-width, initial-scale=1" />
      <section class="section section-faq">
        <div class="container mx-auto">
          <div class="information" style="margin-top: 5%">
            <strong style="color: aliceblue"
              >- 다른 질문사항은 1:1 문의 게시판을 이용해주세요</strong
            ><br />
            <p style="color: aliceblue">
              - 아래 버튼을 누르면 문의페이지로 이동합니다.
            </p>
            <button class="qnabtn">
              <router-link to="/addqna" style="color: aliceblue !important"
                ><strong>1:1문의하기</strong></router-link
              >
            </button>
          </div>
          <div class="faq-box">
            <h1 style="color: aliceblue">FAQ</h1>
            <ul>
              <li>
                <div class="faq-box__question">
                  <span>Q. 휴면계정으로 전환되었어요. 어떻게하나요? </span>
                </div>
                <div class="faq-box__answer">
                  <div>
                    -개인정보 보호에 대한 관계 법령에 의거하여, 서비스를 1년이상
                    이용하지 않은 고객은 휴면상태로 전환됩니다.<br />
                    휴면상태인 계정은
                    <br />
                    <strong style="color: #f5b409"
                      >본인 인증 또는 [ID/PW 찾기]에서 본인 인증으로 찾기
                      시도시</strong
                    >
                    <br />
                    활동 계정으로 변경됩니다. 휴면계정 복구는 1년 동안 가능하며
                    <br />
                    경과 시 탈퇴처리 되며 개인정보는 파기됩니다.
                  </div>
                </div>
              </li>
              <li>
                <div class="faq-box__question">
                  <span>Q.외부음식반입이 가능한가요?</span>
                </div>
                <div class="faq-box__answer">
                  <div>
                    - 상영관 내 외부 음식 반입은 가능하나 영화 관람 시 다른
                    고객님에게 방해가 되지않은 품목에 한하여 반입 가능합니다.<br />
                    <strong style="color: #f5b409"
                      >강한냄새 및 지속적인 소음이 발생하는 품목은 취식 후
                      입장해주시길 부탁</strong
                    >드리며,<br />
                    쾌적한 관람 환경을 위해 많은 양해 부탁드립니다.
                  </div>
                </div>
              </li>
              <li>
                <div class="faq-box__question">
                  <span>Q.주차가 가능한가요?</span>
                </div>
                <div class="faq-box__answer">
                  <div>
                    - 모든 영화관에는 주차공간이 마련되어 있으며,<br />
                    주차 요금 및 주차장 정보 등 자세한 내용은 이용하시는 지점
                    선택 후<br />
                    약도/교통/주차 메뉴를 통해 확인 가능합니다.
                  </div>
                </div>
              </li>
              <li>
                <div class="faq-box__question">
                  <span>Q.아이디와 비밀번호를 잃어버렸습니다.</span>
                </div>
                <div class="faq-box__answer">
                  <div>
                    -
                    <strong style="color: #f5b409"
                      >로그인 화면 하단에 ID/PW찾기 버튼</strong
                    >을 통해 확인하실 수 있습니다. <br />아이디 찾기의 경우,
                    기존 회원정보에 등록된 아이디찾기 질문에대한 정답을 통해
                    확인이 가능합니다.
                  </div>
                </div>
              </li>
              <li>
                <div class="faq-box__question">
                  <span>Q.반려동물과 함께 영화관람이 가능한가요?</span>
                </div>
                <div class="faq-box__answer">
                  <div>
                    -
                    <strong style="color: #f5b409">안내견 제외,</strong>
                    반려동물의 경우 상영관 동반 입장이 불가능한 점 이용에
                    참고부탁드립니다.<br />
                    상영관 내 돌발상황 발생 및 알러지 보유 고객 등 다른
                    고객으로부터 불편이 접수 될 수 있어<br />
                    입장이 제한되는 점 양해 부탁드립니다.
                  </div>
                </div>
              </li>
              <li>
                <div class="faq-box__question">
                  <span>Q.영화 관람등급은 어떻게되나요?</span>
                </div>
                <div class="faq-box__answer">
                  <div class="age">
                    - <strong style="color: #f5b409">전체 관람가</strong> : 모든
                    연령의 고객이 관람 가능
                  </div>
                  <div class="age">
                    -<strong style="color: #f5b409">12세 이상 관람가</strong> :
                    만12세 이상(주민등록상 생일기준) 관람 가능 <br />
                    만12세 미만 고객은 보호자(성인) 동반 시 관람 가능
                  </div>
                  <div class="age">
                    -<strong style="color: #f5b409">15세 이상 관람가</strong>
                    :만15세 이상(주민등록상 생일기준) 관람 가능<br />
                    만15세 미만 고객은 보호자(성인 동반 시 관람 가능
                  </div>
                  <div class="age">
                    -<strong style="color: #f5b409">청소년 관람 불가</strong>
                    :만18세 이상(주민등록상 생일기준) 관람 가능<br />
                    - 만18세 이상이더라도 고등학교 재학중인 경우 관람 불가<br />
                    - 신분증 지참 필수 (티켓 구매, 입장 시 신분증 확인 必)<br />
                    <strong style="color: #f5b409"
                      >만18세 미만 고객은 보호자(성인) 동반 시에도 관람
                      불가</strong
                    >
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </section>
    </div>

    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png" />
    </a>
  </div>
</template>

<script>
import custom from "../../src/assets/js/custom.js";
import Faq from "@/assets/js/Faq.js";
export default {
  mounted() {
    custom(), Faq();
  },
};
</script>

<style>
.Faq {
  background: black;
}
.faq-box {
  border: 2px solid;
  color: aliceblue;
  padding: 30px;
  margin-top: 5%;
}

.faq-box__question {
  cursor: pointer;
  margin: 1%;
  border-bottom: 1px solid white;
}

.faq-box__question::after {
  content: "▼";
  float: right;
}

.faq-box > ul > li {
  padding: 10px;
}

.faq-box > ul > li.hover > .faq-box__question::after {
  content: "▲";
}

.faq-box__answer {
  display: none;
  background-color: rgba(0, 0, 0, 0.3);
  border-radius: 10px;
  padding: 10px;
}
.age {
  margin: 1%;
}
.common-hero {
  height: 385px;
  /* // background: url("../images/uploads/user-hero-bg.jpg") no-repeat; */
  background: url("../assets/images_kang/Components/common/Navcom/back-img-test8.png")
    no-repeat !important;
}

/* TODO: 탑버튼 추가_정주희*/
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}

.qnabtn {
  border-radius: 25px;
  margin-top: 1%;
  /* color: black !important; */
  background: #f5b409;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
</style>
