/* https://school.programmers.co.kr/learn/courses/30/lessons/72410?language=java */

class Solution {
  public String solution(String new_id) {
    String answer = ""; 
    // 단계 1 - 소문자로 변환
    answer = new_id.toLowerCase();
    // 단계 2 - 영문자, (-), (_), (.)  제외 제거
    answer = answer.replaceAll("[^-_.a-z0-9]", "");
    // 단계3 - 2개 이상 (.) 하나로
    answer = answer.replaceAll("[.]{2,}", ".");
    // 단계 4 - 처음과 끝(.) 제거
    answer = answer.replaceAll("^[.]|[.]$", "");
    // 단계 5 - 빈 문자열 a 추가
    if (answer.equals("")) {
      answer += "a";
    }
    // 단계 6 - 16자 이상이면 15자까지, 끝에 마침표(.) 있으면 제거    
    if (answer.length() >= 16) {
      answer = answer.substring(0, 15);
      answer = answer.replaceAll("^[.]|[.]$", ""); 
    }
    // 단계7 - 2자 이하이면 3자까지 마지막 문자 ㅊ추가
    if (answer.length() <= 2) {
      while (answer.length() < 3) {
        answer += answer.charAt(answer.length() - 1);
      }
    }
    return answer;
  }
}