/* https://school.programmers.co.kr/learn/courses/30/lessons/59040 */

SELECT ANIMAL_TYPE, COUNT(*) AS count
FROM ANINMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE
;