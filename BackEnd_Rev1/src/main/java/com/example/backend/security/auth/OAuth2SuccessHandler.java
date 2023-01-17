package com.example.backend.security.auth;

import com.example.backend.security.jwt.JwtUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * packageName : com.example.simplelogin.security.auth
 * fileName : OAuth2SuccessHandler
 * author : kangtaegyung
 * date : 2022/12/16
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/16         kangtaegyung          최초 생성
 */
@Slf4j
@Component
public class OAuth2SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Autowired
    JwtUtils jwtUtils;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        //    인증된 객체를 홀더에 저장
        SecurityContextHolder.getContext().setAuthentication(authentication);

        //    인증된 유저 정보를 oAuth2User 에 저장
//        참고) Auth2 로그인은 인증객체가(authentication.getPrincipal()) OAuth2User 타입이고,
//             일반 로그인은 인증객체가(authentication.getPrincipal()) UserDetails 타입임
        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();

        log.info("Principal에서 꺼낸 OAuth2User = {}", oAuth2User);
        // 최초 로그인이라면 회원가입 처리를 한다.
        String targetUrl;
        log.info("토큰 발행 시작");

        String jwt = "";
        String username = "";
        String email = "";

        OAuth2AuthenticationToken authToken = (OAuth2AuthenticationToken) authentication;

        log.info("authToken.getAuthorizedClientRegistrationId() : {} ", authToken.getAuthorizedClientRegistrationId());

//        구글/네이버 등 벤더마다 전달해주는 속성 키이름이 틀림
//        구글 : { email: forbob@naver.com , name: 강태경 }
//       네이버 : { response : { email: forbob@naver.com , id : abcdef } }
        switch (authToken.getAuthorizedClientRegistrationId()) {
            case "google":
                username = ((String) oAuth2User.getAttributes().get("email")).split("@")[0];
                email = (String) oAuth2User.getAttributes().get("email");
                break;
            case "naver":
                Map<String, Object> res = (Map<String, Object>) oAuth2User.getAttributes().get("response");
                username = ((String) res.get("email")).split("@")[0];
                email = (String) res.get("email");
                break;
            case "kakao":
                Map<String, Object> kakaoAccount = (Map<String, Object>) oAuth2User.getAttributes().get("kakao_account");
                username =  ((String) kakaoAccount.get("email")).split("@")[0];
                email = (String) kakaoAccount.get("email");
                break;
        }

        jwt = jwtUtils.generateJwtToken(email);

        log.info("{}", jwt);

//        targetUrl = UriComponentsBuilder.fromUriString("http://localhost:8080/auth-redirect")
        targetUrl = UriComponentsBuilder.fromUriString("http://192.168.0.65:8080/auth-redirect")
                .queryParam("accessToken", jwt)
                .queryParam("username", username)
                .queryParam("email", email)
                .build().toUriString();

        getRedirectStrategy().sendRedirect(request, response, targetUrl);
    }
}