-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE, 2) AS PRODUCTS, COUNT(PRODUCT_ID) ASCATEGORY
FROM PRODUCT
GROUP BY LEFT(PRODUCT_CODE, 2)
ORDER BY PRODUCT_CODE
