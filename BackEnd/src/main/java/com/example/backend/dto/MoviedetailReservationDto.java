package com.example.backend.dto;

public interface MoviedetailReservationDto {
//    Reservation Part
    Long getReservno(); // 예매번호
    String getLocation(); // 상영관
    String getStartday(); // 상영 시작시간
    String getStarttime(); // 상영 시작시간
    String getEndday(); // 상영 종료시간
    String getEndtime(); // 상영 종료시간
    String getSeat(); // 좌석
    String getPrice(); // 금액
    String getRcount(); // 관람인원
    String getRno();

//    MovieDetail Part
    String getMoviecd(); // 무비 코드
    String getMovienm(); // 무비 제목
    String getRaiting(); // 무비 평점
    String getPosterurln(); // 무비 포스터
    String getOpendt(); // 개봉일
    String getDirectors(); // 무비 감독
    String getShowtm(); // 무비 상영시간
    String getWatchgradenm(); // 연령제한





}
