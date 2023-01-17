package com.example.backend.dto.response;

/**
 * packageName : com.example.simpledms.dto.response
 * fileName : UserRoleDto
 * author : ds
 * date : 2022-11-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-30         ds          최초 생성
 */
public interface UserRoleDto {
//    User 클래스 getter
    Long getId();
    String getUsername();
    String getEmail();
//    Role 클래스 getter
    Long getRid();
    String getName();

}
