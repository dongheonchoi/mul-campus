INSERT INTO MEMBER VALUES ('100', '100', 'park', '011')

INSERT INTO MEMBER VALUES ('200', '100', 'park', '011')

INSERT INTO MEMBER VALUES ('300', '100', 'park', '011')

SELECT * FROM "MEMBER"

SELECT id as 아이디, name FROM MEMBER WHERE id = '100'

SELECT tel as 전화번호 FROM MEMBER WHERE name = 'park'

UPDATE MEMBER SET name = 'kim' WHERE id = '100'

UPDATE MEMBER SET name = 'yang' WHERE id = '200'

UPDATE MEMBER SET name = 'lee' WHERE id = '300'

UPDATE MEMBER SET tel = '9999', pw = '8888' WHERE id = 'ice'

DELETE FROM MEMBER WHERE id ='100'

DELETE FROM MEMBER WHERE tel ='011'

SELECT * FROM "MEMBER" WHERE  id ='200' AND tel ='011'

SELECT * FROM "MEMBER" WHERE  id ='200' or tel ='011'

SELECT * FROM MEMBER ORDER BY id -- 오름차순

SELECT * FROM MEMBER ORDER BY id DESC -- 내림차순

