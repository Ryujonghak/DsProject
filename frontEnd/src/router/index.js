import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

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
  },
  // 영화관리 페이지
  {
    path: "/movie-admin",
    name: "movie-admin",
    component: () => import("@/components/admin/MovieAdmin.vue"),
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
  // 빠른예매
  {
    path: "/reserveTicket",
    name: "reserveTicket",
    component: () => import("../views/jung/ReserveSeatView.vue"),
  },
  {
    path: "/archive",
    name: "archive",
    component: () => import("../components/myPage/ArchiveCom.vue"),
  },
  {
    path: "/myqna",
    name: "myqna",
    component: () => import("../components/myPage/MyqnaCom"),
  },
  {
    path: "/mytest",
    name: "mytest",
    component: () => import("../components/myPage/testCom.vue"),
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
  },
  {
    path: "/userInfoAdmin/:username",
    name: "userInfoEditAdmin",
    component: () => import("@/components/admin/UserInfoEditCom.vue"),
  },
  {
    path: "/reservInfoAdmin",
    name: "reservInfoAdmin",
    component: () => import("@/views/choi/ReservInfoCom.vue"),
  },
  {
    path: "/test01",
    name: "test01",
    component: () => import("@/views/choi/TestView.vue"),
  },
  {
    path: "/boxoffice",
    name: "boxoffice",
    component: () => import("@/views/choi/BoxofficeView.vue"),
  },
  // {
  //   path: '/mainDetail',
  //   name: 'mainDetail',
  //   component: () => import('../views/kim/MainDetail.vue')
  // },
  // 김철원
  {
    path: "/SeatView",
    name: "SeatView",
    component: () => import("@/views/kim/SeatView.vue"),
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
  {
    path: "/testkim",
    name: "testkim",
    component: () => import("@/views/kim/TestVue.vue"),
  },

];

/* eslint-disable */
const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

// 인터셉터
// TODO: 아래 소스로 불법적인 접근을 하면 강제 로그인페이지로 이동
// 않하면 서버쪽 권한체크로 에러코드를 화면에 보이게 만듬
// router.beforeEach((to, from, next) => {
//   const publicPages = ['/login', '/register', '/home'];
//   const authRequired = !publicPages.includes(to.path);
//   const loggedIn = localStorage.getItem('user');

//   // trying to access a restricted page + not logged in
//   // redirect to login page
//   if (authRequired && !loggedIn) {
//     next('/login');
//   } else {
//     next();
//   }
// });

export default router;
