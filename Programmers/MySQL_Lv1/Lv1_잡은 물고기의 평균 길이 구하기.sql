/* https://school.programmers.co.kr/learn/courses/30/lessons/293259 */

-- 코드를 작성해주세요
SELECT ROUND(AVG(IFNULL(LENGTH, 10)), 2) AS AVERAGE_LENGTH
FROM FISH_INFO
