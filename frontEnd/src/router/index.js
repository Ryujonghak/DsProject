import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import('../views/kang/HomeView.vue')
  },
  {
    path: '/about',
    name: 'about',
    component: () => import('../components/common/NavCom.vue')
  },
  {
    path: '/register',
    name: 'register',
    component: () => import('../views/kang/RegisterView.vue')
  },
  {
    path: '/profile',
    name: 'profile',
    component: () => import('../views/kang/ProfileView.vue')
  },
  {
    path: '/admin',
    name: 'admin',
    component: () => import('../views/kang/BoardAdmin.vue')
  },
  {
    path: '/user',
    name: 'user',
    component: () => import('../views/kang/BoardUser.vue')
  },
  {
    path: '/auth-redirect',
    name: 'auth-redirect',
    component: () => import('../views/kang/Auth2View.vue')
  },  
  // faq 게시판
  {
    path: '/faq',
    name: 'faq',
    component: () => import('../components/FaqList.vue')
  },
  // qna 게시판
  {
    path: '/addqna',
    name: 'addqna',
    component: () => import('../components/qna/AddQna.vue')
  },
  // 공지사항 게시판
  {
    path: '/notice',
    name: 'notice',
    component: () => import('../components/NoticeList.vue')
  },
  // 회원가입 게시판
  {
    path: '/signup',
    name: 'signup',
    component: () => import('../components/signup/SignupView.vue')
  },
  //   정주희 Part_mypage
  {
    path: '/mypage',
    name: 'mypage',
    component: () => import('../components/myPage/MypageCom.vue')
  },
  {
    path: '/myticket',
    name: 'myticket',
    component: () => import('../components/myPage/TicketCom')
  },
  {
    path: '/myprofile',
    name: 'myprofile',
    component: () => import('../components/myPage/ProfileCom.vue')
  },
  {
    path: '/mywish',
    name: 'mywish',
    component: () => import('../components/myPage/WishCom')
  },
  {
    path: '/myqna',
    name: 'myqna',
    component: () => import('../components/myPage/MyqnaCom')
  },
  //   김철원 Part
  {
    path: '/ModalView',
    name: 'ModalView',
    component: () => import('@/views/kim/ModalView.vue')
  },
  //   최아리 Part
  {
    path: '/mainDetail',
    name: 'mainDetail',
    component: () => import('@/views/choi/MainDetail.vue')
  },
  {
    path: '/movieDetail',
    name: 'movieDetail',
    component: () => import('@/views/choi/MovieDetail.vue')
  },
  {
    path: '/allMovie',
    name: 'allMovie',
    component: () => import('@/views/choi/AllMovies.vue')
  },
  {
    path: '/userInfoAdmin',
    name: 'userInfoAdmin',
    component: () => import('@/views/choi/UserInfoCom.vue')
  },
  {
    path: '/adminInfoAdmin',
    name: 'adminInfoAdmin',
    component: () => import('@/views/choi/AdminInfoCom.vue')
  },
  {
    path: '/reservInfoAdmin',
    name: 'reservInfoAdmin',
    component: () => import('@/views/choi/ReservInfoCom.vue')
  },
  // {
  //   path: '/mainDetail',
  //   name: 'mainDetail',
  //   component: () => import('../views/kim/MainDetail.vue')
  // },



]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

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

export default router
