/* https://school.programmers.co.kr/learn/courses/30/lessons/12916 */

class Solution {
  boolean solution(String s) {
      int flag = 0;

      s = s.toLowerCase();
      for (char c : s.toCharArray()) {
          if (c == 'p') ++flag;
          else if (c == 'y') --flag;
      }
      
      return flag == 0;
  }
}