CREATE TABLE "HR"."hobby" 
   (	"hobbyID" NUMBER(38,0), 
	"content" VARCHAR2(100), 
	"location" VARCHAR2(100)
   )
   
   
CREATE TABLE "HR"."hobby2" 
   (	"hobbyID" number(38,0), 
	"content" VARCHAR2(100), 
	"location" VARCHAR2(100)
   )
   
INSERT INTO "hobby" VALUES (100,'run','seoul')

INSERT INTO "hobby" VALUES (200,'book','seoul')

SELECT * FROM "hobby" 

SELECT "content"  FROM "hobby" 
