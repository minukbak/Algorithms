/* https://school.programmers.co.kr/learn/courses/30/lessons/155652 */

class Solution {
  public String solution(String s, String skip, int index) {
    String answer = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      for (int j = 0; j < index; j++) {
        c += 1;
        if (c > 'z') {
          c -= 26;
        }
        if (skip.contains(String.valueOf(c))) {
          j--;
        }
      }
      answer += c;
    }
    return answer;
  }
}