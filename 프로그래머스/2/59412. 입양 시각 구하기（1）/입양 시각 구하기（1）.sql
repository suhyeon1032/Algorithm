-- 코드를 입력하세요
SELECT HOUR, COUNT(*) COUNT
FROM (SELECT EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) HOUR
     FROM ANIMAL_OUTS)
WHERE HOUR BETWEEN 9 AND 19
GROUP BY HOUR
ORDER BY HOUR