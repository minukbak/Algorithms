/* https://school.programmers.co.kr/learn/courses/30/lessons/12903 */

import java.util.*;

class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            return s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        } else {
            return s.substring((s.length() / 2), (s.length() / 2) + 1);
        }
    }
}
