<template>
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
  // 화면이 뜨자마자 실행되는 이벤트
  mounted() {
    // User 페이지 요청 --> springboot 권한체크 "User Content" 메세지 전송
    UserService.getUserBoard()
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
