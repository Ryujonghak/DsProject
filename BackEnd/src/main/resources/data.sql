-- -- TODO: login 샘플 데이터
INSERT INTO TB_ROLE
VALUES (SQ_ROLE.NEXTVAL, 'ROLE_USER', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_ROLE(id, name) VALUES(SQ_ROLE.NEXTVAL, 'ROLE_MODERATOR');
INSERT INTO TB_ROLE
VALUES (SQ_ROLE.NEXTVAL, 'ROLE_ADMIN', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);

-- User FakeData 추가
INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'forbob',
        'forbob@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        01012345678,
        1995,
        11,
        11,
        '강태경',
        '동성직업전문학교',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);
INSERT INTO TB_USER_ROLE
VALUES (1, 2);

INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'ryu',
        'ryu@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        01012345678,
        1995,
        11,
        11,
        '류종학',
        '동성직업전문학교',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);
INSERT INTO TB_USER_ROLE
VALUES (2, 2);

INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'kang',
        'kang@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        01012345678,
        1995,
        11,
        11,
        '강수빈',
        '동성직업전문학교',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);
INSERT INTO TB_USER_ROLE
VALUES (3, 1);

INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'jung',
        'jung@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        01012345678,
        1995,
        11,
        11,
        '정주희',
        '동성직업전문학교',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);
INSERT INTO TB_USER_ROLE
VALUES (4, 1);

INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'kim',
        'kim@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        01012345678,
        1995,
        11,
        11,
        '김철원',
        '동성직업전문학교',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);
INSERT INTO TB_USER_ROLE
VALUES (5, 1);

INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'moon',
        'moon@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        01012345678,
        1995,
        11,
        11,
        '문영석',
        '동성직업전문학교',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);
INSERT INTO TB_USER_ROLE
VALUES (6, 1);

-- QnA FakeData 추가
INSERT INTO TB_QNA
VALUES (SQ_QNA.NEXTVAL,
        '김동성',
        '문의제목1',
        '문의내용1입니다.',
        '문의답변1입니다.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_QNA
VALUES (SQ_QNA.NEXTVAL,
        '류종학',
        '문의제목2',
        '문의내용2입니다.',
        '문의답변2입니다.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_QNA
VALUES (SQ_QNA.NEXTVAL,
        '강수빈',
        '문의제목3',
        '문의내용3입니다.',
        null,
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_QNA
VALUES (SQ_QNA.NEXTVAL,
        '정주희',
        '문의제목4',
        '문의내용4입니다.',
        null,
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);


-- Review FakeData 추가
INSERT INTO TB_REVIEW
VALUES (SQ_REVIEW.NEXTVAL,
        'forbob',
        230104,
        '20225061',
        '아바타: 물의 길',
        null,
        '아직 안봐서 모름.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_REVIEW
VALUES (SQ_REVIEW.NEXTVAL,
        '류종학',
        230104,
        '20225061',
        '아바타: 물의 길',
        null,
        '아직 안봐서 모름.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_REVIEW
VALUES (SQ_REVIEW.NEXTVAL,
        '정주희',
        230104,
        '20225062',
        '정주희의 모험',
        null,
        '아직 안봐서 모름.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

-- Notice FakeData 추가
INSERT INTO TB_NOTICE
VALUES (SQ_NOTICE.NEXTVAL,
        '전체',
--         nType: 전체, 영화예매, 결제관련
        '이용권장사항1',
        '이용권장사항1입니다.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_NOTICE
VALUES (SQ_NOTICE.NEXTVAL,
        '전체',
--         nType: 전체, 영화예매, 결제관련
        '이용권장사항2',
        '이용권장사항2입니다.',
        'N',
        TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
        NULL,
        NULL);

INSERT INTO TB_RESERVATION
VALUES (SQ_RESERVATION.NEXTVAL,
        'forbob',
        1,
        '20225061',
        '아바타: 물의 길',
        1,
        100,
        '20230104',
        'N');

INSERT INTO TB_WISHLIST
VALUES (SQ_WISHLIST.NEXTVAL,
        'kang',
        '20225061');

COMMIT;