/* https://school.programmers.co.kr/learn/courses/30/lessons/87389 */

class Solution {
  public int solution(int n) {
    int answer = 2;
    
    while (n % answer != 1) answer++;
    
    return answer;
  }
}