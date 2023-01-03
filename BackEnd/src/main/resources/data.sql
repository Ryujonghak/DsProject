-- DROP SEQUENCE SQ_DEPT;
-- CREATE SEQUENCE SQ_DEPT START WITH 50 INCREMENT BY 10;
--
-- DROP SEQUENCE SQ_EMP;
-- CREATE SEQUENCE SQ_EMP START WITH 8000 INCREMENT BY 1;
--
-- DROP SEQUENCE SQ_FAQ;
-- CREATE SEQUENCE SQ_FAQ START WITH 5 INCREMENT BY 1;
--
-- DROP TABLE TB_EMP CASCADE CONSTRAINT;
-- DROP TABLE TB_DEPT CASCADE CONSTRAINT;
-- DROP TABLE TB_FAQ CASCADE CONSTRAINT;
--
-- CREATE TABLE TB_DEPT
-- (
--     DNO         NUMBER NOT NULL PRIMARY KEY,
--     DNAME       VARCHAR2(255),
--     LOC         VARCHAR2(255),
--     DELETE_YN   VARCHAR2(1) DEFAULT 'N',
--     INSERT_TIME VARCHAR2(255),
--     UPDATE_TIME VARCHAR2(255),
--     DELETE_TIME VARCHAR2(255)
-- );
--
-- CREATE TABLE TB_EMP
-- (
--     ENO         NUMBER NOT NULL PRIMARY KEY,
--     ENAME       VARCHAR2(255),
--     JOB         VARCHAR2(255),
--     MANAGER     NUMBER,
--     HIREDATE    VARCHAR2(255),
--     SALARY      NUMBER,
--     COMMISSION  NUMBER,
--     DNO         NUMBER,
--     DELETE_YN   VARCHAR2(1) DEFAULT 'N',
--     INSERT_TIME VARCHAR2(255),
--     UPDATE_TIME VARCHAR2(255),
--     DELETE_TIME VARCHAR2(255)
-- );
--
-- CREATE TABLE TB_FAQ
-- (
-- --   카멜/언더바 단축키 : alt + shift + u ( CamelCase 플러그인 설치 )
-- --   대/소문자 단축키 : ctrl + shift + u
--     NO          NUMBER NOT NULL PRIMARY KEY,
--     TITLE       VARCHAR2(255),
--     CONTENT     VARCHAR2(255),
--     DELETE_YN   VARCHAR2(1) DEFAULT 'N',
--     INSERT_TIME VARCHAR2(255),
--     UPDATE_TIME VARCHAR2(255),
--     DELETE_TIME VARCHAR2(255)
-- );
--
-- INSERT INTO TB_DEPT
-- VALUES (SQ_DEPT.nextval, 'ACCOUNTING', 'NEW YORK', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_DEPT
-- VALUES (SQ_DEPT.nextval, 'RESEARCH', 'DALLAS', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_DEPT
-- VALUES (SQ_DEPT.nextval, 'SALES', 'CHICAGO', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_DEPT
-- VALUES (SQ_DEPT.nextval, 'OPERATIONS', 'BOSTON', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
--
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'SMITH', 'CLERK', 7902, TO_CHAR(to_date('17-12-1980', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         800, NULL,
--         20, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'ALLEN', 'SALESMAN', 7698, TO_CHAR(to_date('20-2-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         1600,
--         300, 30, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'WARD', 'SALESMAN', 7698, TO_CHAR(to_date('22-2-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         1250, 500,
--         30, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'JONES', 'MANAGER', 7839, TO_CHAR(to_date('2-4-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         2975, NULL,
--         20, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'MARTIN', 'SALESMAN', 7698,
--         TO_CHAR(to_date('28-9-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1250,
--         1400, 30, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'BLAKE', 'MANAGER', 7839, TO_CHAR(to_date('1-5-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         2850, NULL,
--         30, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'CLARK', 'MANAGER', 7839, TO_CHAR(to_date('9-6-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         2450, NULL,
--         10, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'SCOTT', 'ANALYST', 7566, TO_CHAR(to_date('13-07-1987', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         3000,
--         NULL, 20, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'KING', 'PRESIDENT', NULL,
--         TO_CHAR(to_date('17-11-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 5000,
--         NULL, 10, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'TURNER', 'SALESMAN', 7698, TO_CHAR(to_date('8-9-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         1500, 0,
--         30, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'ADAMS', 'CLERK', 7788, TO_CHAR(to_date('13-07-1987', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         1100, NULL,
--         20, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'JAMES', 'CLERK', 7698, TO_CHAR(to_date('3-12-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         950, NULL,
--         30, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'FORD', 'ANALYST', 7566, TO_CHAR(to_date('3-12-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         3000, NULL,
--         20, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_EMP
-- VALUES (SQ_EMP.nextval, 'MILLER', 'CLERK', 7782, TO_CHAR(to_date('23-1-1982', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'),
--         1300, NULL,
--         10, 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
--
--
-- INSERT INTO TB_FAQ
-- VALUES (SQ_FAQ.nextval, '제목', '해결방법', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_FAQ
-- VALUES (SQ_FAQ.nextval, '제목2', '해결방법2', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_FAQ
-- VALUES (SQ_FAQ.nextval, '제목3', '해결방법3', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_FAQ
-- VALUES (SQ_FAQ.nextval, '제목4', '해결방법4', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);


-- TODO: login 샘플 데이터
INSERT INTO TB_ROLE
VALUES (SQ_ROLE.NEXTVAL, 'ROLE_USER', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);
-- INSERT INTO TB_ROLE(id, name) VALUES(SQ_ROLE.NEXTVAL, 'ROLE_MODERATOR');
INSERT INTO TB_ROLE
VALUES (SQ_ROLE.NEXTVAL, 'ROLE_ADMIN', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), NULL, NULL);

-- admin user 1명 최초 생성
-- id : forbob
-- password : 123456
-- email : forbob@naver.com
-- roles : ROLE_ADMIN

--     ID NUMBER NOT NULL PRIMARY KEY,
--     EMAIL VARCHAR2(1000),
--     PASSWORD VARCHAR2(1000),
-- USERNAME VARCHAR2(1000),
--     PHONE NUMBER,
--     YEAR NUMBER,
--     MONTH NUMBER,
--     DAY NUMBER,
--     NAME VARCHAR2(1000),
--     ANSWER VARCHAR2(1000),
--     DELETE_YN   VARCHAR2(1) DEFAULT 'N',
--     INSERT_TIME VARCHAR2(255),
--     UPDATE_TIME VARCHAR2(255),
--     DELETE_TIME VARCHAR2(255)
INSERT INTO TB_USER
VALUES (SQ_USER.NEXTVAL,
        'forbob@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        'forbob',
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
        'ryu@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        'ryu',
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
        'kang@naver.com',
        '$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti',
        'kang',
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

-- 가라데이터 추가
    VALUES (SQ_QNA.NEXTVAL,
            '김동성',
            'DS@gmail.com',
            '01012341234',
            '문의제목',
            '문의내용입니다.',
            null,
            'N',
            TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
            NULL,
            NULL);

INSERT INTO TB_QNA
    VALUES (SQ_QNA.NEXTVAL,
            'kim',
            'DS@gmail.com',
            '01012341234',
            '문의제목2',
            '문의내용입니다.2',
            null,
            'N',
            TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
            NULL,
            NULL);

INSERT INTO TB_QNA
    VALUES (SQ_QNA.NEXTVAL,
            '김전문',
            'DS@gmail.com',
            '01012341234',
            '문의제목3',
            '문의내용입니다.3',
            null,
            'N',
            TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
            NULL,
            NULL);

INSERT INTO TB_QNA
    VALUES (SQ_QNA.NEXTVAL,
            '김학교',
            'DS@gmail.com',
            '01012341234',
            '문의제목4',
            '문의내용입니다.4',
            null,
            'N',
            TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),
            NULL,
            NULL);


COMMIT;