/* https://school.programmers.co.kr/learn/courses/30/lessons/12917 */

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String [] str = s.split("");
        Arrays.sort(str);
        
        for (String a : str) {
            answer = a + answer;
        }
        
        return answer;
    }
}