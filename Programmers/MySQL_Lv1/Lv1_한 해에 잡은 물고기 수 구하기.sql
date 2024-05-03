/* https://school.programmers.co.kr/learn/courses/30/lessons/298516 */

-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO
WHERE DATE_FORMAT(TIME, '%Y') = '2021'