/* https://school.programmers.co.kr/learn/courses/30/lessons/298517 */

-- 코드를 작성해주세요
SELECT ID, LENGTH 
FROM FISH_INFO 
ORDER BY IFNULL(LENGTH, 10) DESC, ID
LIMIT 10