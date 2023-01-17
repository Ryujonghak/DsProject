<template>
<!-- Admin 메뉴 테스트용 페이지 -->
  <div class="container">
    <header class="jumbotron">
      <h3>{{ content }}</h3>
    </header>
  </div>
</template>

<script>
import UserService from '@/services/user.service';

export default {
  data() {
    return {
      content: ''
    };
  },
  // 화면뜨자마자 실행되는 이벤트
  mounted() {
    // Admin 페이지 요청 axios 함수
    UserService.getAdminBoard()
      .then(response => {
        this.content = response.data;
      })
      .catch(error => {
        this.content =
          (error.response &&
            error.response.data &&
            error.response.data.message) ||
          error.message ||
          error.toString();
      });
  }
};
</script>
