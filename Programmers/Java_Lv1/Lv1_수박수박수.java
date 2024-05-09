/* https://school.programmers.co.kr/learn/courses/30/lessons/12922 */

class Solution {
  public String solution(int n) {
      String answer = "";
      
      for (int i = 1; i <= n / 2; i++) {
          answer += "수박";
      }
      if (n % 2 == 1) answer += "수";
      
      return answer;
  }
}