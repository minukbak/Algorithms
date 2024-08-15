/* https://school.programmers.co.kr/learn/courses/30/lessons/150370 */

import java.util.*;

class Solution {
  public List<Integer> solution(String today, String[] terms, String[] privacies) {
    List<Integer> answer = new ArrayList<>();

    Map<String, String> termsMap = new HashMap<>();
    for (String term : terms) {
        String[] termSplit = term.split(" ");
        termsMap.put(termSplit[0], termSplit[1]);
    }

    int year = Integer.parseInt(today.split("\\.")[0]);
    int month = Integer.parseInt(today.split("\\.")[1]);
    int day = Integer.parseInt(today.split("\\.")[2]);

    for (int i = 0; i < privacies.length; i++) {
      String date = privacies[i].split(" ")[0];
      int type = Integer.parseInt(termsMap.get(privacies[i].split(" ")[1])) * 28;

      int num = (year - Integer.parseInt(date.split("\\.")[0])) * 28 * 12
                + (month - Integer.parseInt(date.split("\\.")[1])) * 28
                + (day - Integer.parseInt(date.split("\\.")[2]));

      if (num >= type) {
        answer.add(i + 1);
      }
    }
    return answer;
  }
}