<template>
  <!-- TODO 3): 간편로그인 추가 , 리다이렉트 페이지 -->
  <div className="col-md-12">
    <p>리다이렉트 페이지 입니다.</p>
    {{ userData }}
  </div>
</template>

<script>
export default {
  data() {
    return {
      userData: {},
    };
  },
  mounted() {
    // SpringBoot 에서 토큰과 함께 userName, email 보냄 -> GET 방식
    // 이 페이지에서 받아서 localStorage에 user 이름으로 저장
    let url = new URL(window.location.href); // 현재 url 가져오기
    console.log(url);

    const urlParams = url.searchParams;
    const accessToken = urlParams.get("accessToken"); // url 에서 변수 값 받기
    const username = urlParams.get("username"); // url 에서 변수 값 받기
    const email = urlParams.get("email"); // url 에서 변수 값 받기
    console.log(accessToken); // 확인
    console.log(username); // 확인

    // 임시 객체 생성
    this.userData = {
      accessToken: accessToken,
      username: username,
      email: email,
      password: "",
      tokenType: "Bearer",
      roles: ["ROLE_USER"],
    };

    // localStorage에 키값 생성
    localStorage.setItem("user", JSON.stringify(this.userData));
    // 공유 저장소 loggedIn 변수 값 변경
    this.$store.commit('auth/loginSuccess', this.userData);
    // 로그인 성공으로 간주 리다이렉트
    this.$router.push("/profile");
  },
};
</script>
