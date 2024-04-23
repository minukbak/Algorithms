/* https://school.programmers.co.kr/learn/courses/30/lessons/164673 */

SELECT BOARD.TITLE, BOARD.BOARD_ID, REPLY.REPLY_ID, REPLY.WRITER_ID, REPLY.CONTENTS
    , DATE_FORMAT(REPLY.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD BOARD
    JOIN USED_GOODS_REPLY REPLY
    ON BOARD.BOARD_ID = REPLY.BOARD_ID
WHERE BOARD.CREATED_DATE LIKE '2022-10%'
ORDER BY REPLY.CREATED_DATE, BOARD.TITLE