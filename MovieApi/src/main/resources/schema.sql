DROP SEQUENCE SQ_DM;
CREATE SEQUENCE SQ_DM START WITH 1 INCREMENT BY  1;

DROP SEQUENCE SQ_YS;
CREATE SEQUENCE SQ_YS START WITH 1 INCREMENT BY  1;

DROP TABLE daily_movie CASCADE CONSTRAINTS;
DROP TABLE detail_movie CASCADE CONSTRAINTS;

CREATE TABLE daily_movie (
                             ID           NUMBER NOT NULL PRIMARY KEY,
                             boxofficeType    VARCHAR2(255),
                             showRange        VARCHAR2(255),
                             rnum             VARCHAR2(255),
                             rank             VARCHAR2(255),
                             rankInten        VARCHAR2(255),
                             rankOldAndNew    VARCHAR2(255),
                             movieCd          VARCHAR2(255),
                             movieNm          VARCHAR2(255),
                             openDt           VARCHAR2(255),
                             salesAmt         VARCHAR2(255),
                             salesShare       VARCHAR2(255),
                             salesInten       VARCHAR2(255),
                             salesChange      VARCHAR2(255),
                             salesAcc         VARCHAR2(255),
                             audiCnt          VARCHAR2(255),
                             audiInten        VARCHAR2(255),
                             audiChange       VARCHAR2(255),
                             audiAcc          VARCHAR2(255),
                             scrnCnt          VARCHAR2(255),
                             showCnt          VARCHAR2(255),
                             targetDt         VARCHAR2(255)

);

CREATE TABLE detail_movie (
   ID           NUMBER NOT NULL PRIMARY KEY,
   movieCd    VARCHAR2(255),
   movieNm        VARCHAR2(255),
   movieNmEn             VARCHAR2(255),
   movieNmOg             VARCHAR2(255),
   prdtYear        VARCHAR2(255),
   showTm    VARCHAR2(255),
   openDt          VARCHAR2(255),
   prdtStatNm          VARCHAR2(255),
   nationNm         VARCHAR2(255),
   genreNm       VARCHAR2(255),
   directors       VARCHAR2(255),
   watchGradeNm         VARCHAR2(255),
   actor         VARCHAR2(4000),
   cast         VARCHAR2(4000),
   raiting      NUMBER,
   posterurln    VARCHAR2(4000),
   posterurlkm    VARCHAR2(4000),
   imgurl       VARCHAR2(4000),
   utubeurl     VARCHAR2(4000),
   plot        VARCHAR2(4000)

);



COMMIT;