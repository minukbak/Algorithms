/* https://school.programmers.co.kr/learn/courses/30/lessons/131535 */

SELECT COUNT(1) AS USERS
FROM USER_INFO
WHERE YEAR(JOINED) = '2021'
AND AGE BETWEEN 20 AND 29