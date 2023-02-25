CREATE TABLE "HR"."notice" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEW_COUNT" NUMBER(38,0)
   )
   
 -- 추천게시판 (recommend)
 -- re_no 숫자
 -- title, content, writer 문자

CREATE TABLE "HR"."recommend"(
	"RE_NO" NUMBER(38,0),
	"TITLE" VARCHAR2(100),
	"CONTENT" VARCHAR2(100),
	"WRITER" VARCHAR2(100)
)
