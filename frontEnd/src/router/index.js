import Vue from "vue";
import VueRouter from "vue-router";
import store from '../store'

Vue.use(VueRouter);

// TODO: 어드민 유저만 어드민 페이지에 들어갈 수 있도록 기능 -> 나브바만 바꿔주는 것이 아니라 주소를 쳐서 들어가는 경우도 어드민이 아니면 막도록 (최아리 추가)
function ifAdmin(to, from, next) {
  const role = store.state.auth.user.roles[0]

  console.log("Checking the user's role...")
  if (role == 'ROLE_ADMIN') {
    console.log("Admin confirmed. Accessing admin pages...")
    next()
    return
  }
  console.log("Not authorized. Returning back to the main page...")

  router.push('/')
}

const routes = [
  //TODO 강수빈 part

  //홈뷰
  {
    path: "/",
    name: "home",
    component: () => import("../views/kang/HomeView.vue"),
  },
  //네비게이션 바 + 로그인
  {
    path: "/about",
    name: "about",
    component: () => import("../components/common/NavCom.vue"),
  },
  //회원가입 폼
  {
    path: "/register",
    name: "register",
    component: () => import("../views/kang/RegisterView.vue"),
  },

  //로그인관련 router
  {
    path: "/profile",
    name: "profile",
    component: () => import("../views/kang/ProfileView.vue"),
  },
  {
    path: "/admin",
    name: "admin",
    component: () => import("../views/kang/BoardAdmin.vue"),
  },
  {
    path: "/user",
    name: "user",
    component: () => import("../views/kang/BoardUser.vue"),
  },
  {
    path: "/auth-redirect",
    name: "auth-redirect",
    component: () => import("../views/kang/Auth2View.vue"),
  },
  // faq 게시판
  {
    path: "/faq",
    name: "faq",
    component: () => import("../components/FaqList.vue"),
  },
  // qna 게시판
  {
    path: "/addqna",
    name: "addqna",
    component: () => import("../components/qna/AddQna.vue"),
  },
  // 공지사항 게시판
  {
    path: "/notice",
    name: "notice",
    component: () => import("../components/NoticeList.vue"),
  },
  // 회원가입 게시판
  {
    path: "/signup",
    name: "signup",
    component: () => import("../components/signup/SignupView.vue"),
  },
  //공지사항관리 페이지
  {
    path: "/board-admin",
    name: "board-admin",
    component: () => import("@/components/admin/BoardAdmin.vue"),
    beforeEnter: ifAdmin
  },
  // 영화관리 페이지
  {
    path: "/movie-admin",
    name: "movie-admin",
    component: () => import("@/components/admin/MovieAdmin.vue"),
    beforeEnter: ifAdmin
  },
  // 영화 추가 페이지
  {
    path: "/addMovie-admin",
    name: "addmovie-admin",
    component: () => import("@/components/admin/AddMovie.vue"),
  },
  // 리뷰관리 페이지
  {
    path: "/review-admin",
    name: "review-admin",
    component: () => import("@/components/admin/ReviewAdmin.vue"),
    beforeEnter: ifAdmin
  },
  // 1:1 문의 답변 페이지
  {
    path: "/qna-admin",
    name: "qna-admin",
    component: () => import("@/components/admin/QnaAdmin.vue"),
  },
  //결제관리 페이지
  {
    path: "/payment-admin",
    name: "payment-admin",
    component: () => import("@/components/admin/PaymentAdmin.vue"),
    beforeEnter: ifAdmin
  },

  //스케쥴관리 페이지
  {
    path: "/schedule-admin",
    name: "schedule-admin",
    component: () => import("@/components/admin/ScheduleAdmin.vue"),
    beforeEnter: ifAdmin
  },

  //TODO   정주희 Part_mypage
  {
    path: "/mypage",
    name: "mypage",
    component: () => import("../components/myPage/MypageCom.vue"),
  },
  {
    path: "/myticket",
    name: "myticket",
    component: () => import("../components/myPage/TicketCom"),
  },
  {
    path: "/myprofile",
    name: "myprofile",
    component: () => import("../components/myPage/ProfileCom.vue"),
  },
  {
    path: "/mywish",
    name: "mywish",
    component: () => import("../components/myPage/WishCom"),
  },
  {
    path: "/archive/:moviecd",
    name: "archive",
    component: () => import("../components/myPage/ArchiveCom.vue"),
  },
  {
    path: "/myqna",
    name: "myqna",
    component: () => import("../components/myPage/MyqnaCom"),
  },
  {
    path: "/theaterBusan",
    name: "theaterBusan",
    component: () => import("../views/jung/TheaterBusan.vue"),
  },

  //TODO   최아리 Part
  {
    path: "/mainDetail",
    name: "mainDetail",
    component: () => import("@/views/choi/MainDetail.vue"),
  },
  {
    path: "/allMovie/:moviecd",
    name: "movieDetail",
    component: () => import("@/views/choi/MovieDetail.vue"),
  },
  {
    path: "/allMovie",
    name: "allMovie",
    component: () => import("@/views/choi/AllMovies.vue"),
  },
  {
    path: "/userInfoAdmin",
    name: "userInfoAdmin",
    component: () => import("@/components/admin/UserInfoCom.vue"),
    beforeEnter: ifAdmin
  },
  {
    path: "/userInfoAdmin/:username",
    name: "userInfoEditAdmin",
    component: () => import("@/components/admin/UserInfoEditCom.vue"),
    beforeEnter: ifAdmin
  },
  {
    path: "/reservInfoAdmin",
    name: "reservInfoAdmin",
    component: () => import("@/views/choi/ReservInfoCom.vue"),
    beforeEnter: ifAdmin
  },

  // 김철원
  {
    path: "/SeatView",
    name: "SeatView",
    component: () => import("@/views/kim/SeatView.vue"),
  },
  {
    path: "/SeatTest/:moviecd",
    name: "SeatTest",
    component: () => import("@/views/kim/SeatTest.vue"),
  },
  {
    path: "/BusanCinema",
    name: "BusanCinema",
    component: () => import("@/views/kim/BusanCinema.vue"),
  },
  {
    path: "/CentumCinema",
    name: "CentumCinema",
    component: () => import("@/views/kim/CentumCinema.vue"),
  },
  {
    path: "/GangdongCinema",
    name: "GangdongCinema",
    component: () => import("@/views/kim/GangdongCinema.vue"),
  },
  {
    path: "/KasanCinema",
    name: "KasanCinema",
    component: () => import("@/views/kim/KasanCinema.vue"),
  },
  {
    path: "/KonkukCinema",
    name: "KonkukCinema",
    component: () => import("@/views/kim/KonkukCinema.vue"),
  },
  {
    path: "/SeomyeonCinema",
    name: "SeomyeonCinema",
    component: () => import("@/views/kim/SeomyeonCinema.vue"),
  },
];

/* eslint-disable */
const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
