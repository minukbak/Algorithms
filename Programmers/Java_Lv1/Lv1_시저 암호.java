/* https://school.programmers.co.kr/learn/courses/30/lessons/12926 */

class Solution {
  public String solution(String s, int n) {
    String answer = "";
    
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      
      if (Character.isLowerCase(ch)) {
        ch = (char)((ch - 97 + n) % 26 + 97); // 'a' = 97
      } else if (Character.isUpperCase(ch)) {
        ch = (char)((ch - 65 + n) % 26 + 65); // 'A' = 65
      }

      answer += ch;
    }  
    
    return answer;
  }
}