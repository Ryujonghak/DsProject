DROP SEQUENCE SQ_USER;
CREATE SEQUENCE SQ_USER
    INCREMENT BY 1 START WITH 1
    MINVALUE 1
    MAXVALUE 99999999;

DROP SEQUENCE SQ_ROLE;
CREATE SEQUENCE SQ_ROLE
    INCREMENT BY 1 START WITH 1
    MINVALUE 1
    MAXVALUE 99999999;

DROP TABLE TB_USER CASCADE CONSTRAINTS;
DROP TABLE TB_ROLE CASCADE CONSTRAINTS;
DROP TABLE TB_USER_ROLE CASCADE CONSTRAINTS;
DROP TABLE TB_QNA CASCADE CONSTRAINTS;

-- 유저 테이블
CREATE TABLE TB_USER(
                        ID NUMBER NOT NULL PRIMARY KEY,
                        EMAIL VARCHAR2(1000),
                        PASSWORD VARCHAR2(1000),
                        USERNAME VARCHAR2(1000),
                        PHONE NUMBER DEFAULT NULL,
                        YEAR NUMBER DEFAULT NULL,
                        MONTH NUMBER DEFAULT NULL,
                        DAY NUMBER DEFAULT NULL,
                        NAME VARCHAR2(1000) DEFAULT NULL,
                        ANSWER VARCHAR2(1000) DEFAULT NULL,
                        DELETE_YN   VARCHAR2(1) DEFAULT 'N',
                        INSERT_TIME VARCHAR2(255),
                        UPDATE_TIME VARCHAR2(255),
                        DELETE_TIME VARCHAR2(255)
);
-- 역할 테이블 : ROLE_USER, ROLE_ADMIN
CREATE TABLE TB_ROLE(
                        RID NUMBER NOT NULL PRIMARY KEY,
                        NAME VARCHAR2(1000) UNIQUE,
                        DELETE_YN   VARCHAR2(1) DEFAULT 'N',
                        INSERT_TIME VARCHAR2(255),
                        UPDATE_TIME VARCHAR2(255),
                        DELETE_TIME VARCHAR2(255)
);
-- 매핑테이블 : TB_USER vs TB_ROLE 연결시켜주는 테이블 ( Many To Many 관계에서 사용 )
CREATE TABLE TB_USER_ROLE (
                              USER_ID NUMBER NOT NULL,
                              ROLE_ID NUMBER NOT NULL,
                              PRIMARY KEY (USER_ID, ROLE_ID) -- 복합키 ( 속성 2이상을 조합해서 기본키로 만드는것 )
);


DROP SEQUENCE SQ_QNA;
CREATE SEQUENCE SQ_QNA
    INCREMENT BY 1 START WITH 1
    MINVALUE 1
    MAXVALUE 99999999;

-- 1230 TB_QNA 추가


CREATE TABLE TB_QNA (
                QNO     NUMBER NOT NULL PRIMARY KEY ,
                NAME    VARCHAR2(30),
                EMAIL   VARCHAR2(50),
                PHONE   VARCHAR2(50),
                TITLE   VARCHAR2(50),
                CONTENT VARCHAR2(4000),
                DELETE_YN   VARCHAR2(1) DEFAULT 'N',
                INSERT_TIME VARCHAR2(255),
                UPDATE_TIME VARCHAR2(255),
                DELETE_TIME VARCHAR2(255)
);


COMMIT;