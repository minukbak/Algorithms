/* https://school.programmers.co.kr/learn/courses/30/lessons/12934 */

class Solution {
  public long solution(long n) {
      long answer = 0;
      double sqrt = Math.sqrt(n);

      if (sqrt % 1 == 0) {
        answer = (long) Math.pow(sqrt + 1, 2);
      }
      else return -1;

      return answer;
  }
}