package com.example.backend.controller;

import com.example.backend.dto.MessageResponse;
import com.example.backend.dto.request.LoginRequest;
import com.example.backend.dto.request.SignupRequest;
import com.example.backend.dto.response.JwtResponse;
import com.example.backend.model.ERole;
import com.example.backend.model.Role;
import com.example.backend.model.User;
import com.example.backend.repository.RoleRepository;
import com.example.backend.repository.UserRepository;
import com.example.backend.security.jwt.JwtUtils;
import com.example.backend.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 로그인 / 회원가입 컨트롤러
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager; // 인증 / 권한 체크 처리를 위한 객체(SpringSecurity 에서 제공)

    @Autowired
    PasswordEncoder passwordEncoder; // 암호화 시키는 객체(SpringSecurity 에서 제공)

    @Autowired
    JwtUtils jwtUtils; // 웹토큰 유틸리티 객체 (생성, 유효성 체크 등)

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository repository;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) { // @Valid(: 서버 유효성 체크, 발동조건: 모델 또는 DTO @NotBlank, @Size 등)
        // 인증시작
        Authentication authentication = authenticationManager.authenticate( // authenticate() 함수 사용 시 인증이 된 Authentication 객체가 생성됨.
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
        );

        // SpringSecurity: 인증된 객체 -> 홀더에 넣음(SecurityContextHolder)
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // JwtToken 발행
        String jwt = jwtUtils.generateJwtToken(authentication);

        // 인증된 객체에서 유저만 뽑아서 UserDetails 저장
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        // 권한정보 추출
        List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority()).collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(), userDetails.getEmail(), roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest) {
//        사용자가 DB 에 있는지 확인해서
//        있으면 예외처리 하고 Vue 메세지 전송(끝)
        if (userRepository.existsByUsername(signupRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        //  email 이 DB 에 있는지 확인해서
//        있으면 예외처리 하고 Vue 메세지 전송(끝)
        if (userRepository.existsByEmail(signupRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: email is already in use!"));
        }

//        신규 사용자 생성
        User user = new User(signupRequest.getUsername(),
                signupRequest.getEmail(),
                passwordEncoder.encode(signupRequest.getPassword()) // 암호화 적용
        );

        Set<String> strRoles = signupRequest.getRole(); // Vue 전송한 권한(role) 적용
        Set<Role> roles = new HashSet<>(); // return 시 사용할 role 정보(Vue 전송됨)

//        Vue에서 요청한 데이터에 role 정보가 없으면
//        기본(default)으로 ROLE_USER 로 생성함 ( User 권한을 가진 회원이 생성됨 )
//        strRoles(Vue 전송한 roles) 이 없으면
        if (strRoles == null) {
            Role userRole = repository.findByName(ERole.ROLE_USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
//            Vue 에서 전송한 데이터에 role = "admin" 이면 ROLE_ADMIN 저장해서 전송
//                                       = ... 이면 ... 저장해서 전송
//                                       = 모두아니면 ROLE_USER 저장해서 전송
            strRoles.forEach(role -> {
                switch (role) {
                    case "ROLE_ADMIN":
                        Role adminRole = repository.findByName(ERole.ROLE_ADMIN)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(adminRole);

                        break;
                    default:
                        Role userRole = repository.findByName(ERole.ROLE_USER)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(userRole);
                }
            });
        }

        user.setRole(roles);      // USER 객체에 role 넣어주기(ROLE_USER)
        userRepository.save(user); // DB 에 신규 회원 생성됨( role = ROLE_USER )

//        Vue 에 성공메세지 전송
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
