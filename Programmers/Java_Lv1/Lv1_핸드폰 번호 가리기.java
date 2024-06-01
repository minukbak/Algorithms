/* https://school.programmers.co.kr/learn/courses/30/lessons/12948 */

class Solution {
  public String solution(String phone_number) {
    char[] ch = phone_number.toCharArray();

    for (int i = 0; i < ch.length - 4; i++) {
      ch[i] = '*';
    }
    return String.valueOf(ch);
  }
}