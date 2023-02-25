SELECT * FROM product ORDER BY price DESC 

SELECT * FROM product ORDER BY COMPANY DESC 

SELECT name, price FROM product WHERE price = '5000'

SELECT name, img FROM product WHERE id = '100'and PRICE ='1000'

SELECT name, company FROM product WHERE COMPANY  = 'c100'

SELECT name, price FROM product WHERE COMPANY  = 'c100'OR company ='c200'

SELECT name, price FROM product WHERE COMPANY  = 'c100'OR company ='c200'

UPDATE PRODUCT SET content = '품절' WHERE price ='5000'

UPDATE PRODUCT SET img = 'o.img' , price = '10000'  WHERE id = '100' or id = '102'

UPDATE PRODUCT SET company = 'apple' , name = 'appleshoes'  WHERE id = '101'

DELETE from product WHERE name = 'shoes1' OR id = '107'

DELETE from product WHERE company = 'c100'

DELETE from product

DROP table product







