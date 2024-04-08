/* https://school.programmers.co.kr/learn/courses/30/lessons/12901 */

class Solution {
  public String solution(int a, int b) {
  String answer = "";
  String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
  int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  int tot = 0;
    
  for (int i = 0; i < a - 1; i++) {
    tot += days[i];
  }
  tot += (b - 1);
  answer = week[tot % 7];

  return answer;
}
}