/* https://school.programmers.co.kr/learn/courses/30/lessons/92334 */

import java.util.*;

class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    
    Map<String, HashSet<String>> rptMap = new HashMap<>();
    Map<String, Integer> rptCntMap = new HashMap<>();

    int[] answer = new int[id_list.length];

    for (int i = 0; i < id_list.length; i++) {
      String name = id_list[i];
      
      rptMap.put(name, new HashSet<>());
      rptCntMap.put(name, i);
    }

    for (String s : report) {
      String[] str = s.split(" ");
      String from = str[0];
      String to = str[1];

      rptMap.get(to).add(from);
    }

    for (int i = 0; i < id_list.length; i++) {
      HashSet<String> send = rptMap.get(id_list[i]);

      if (send.size() >= k) {
        for (String name : send) {
          answer[rptCntMap.get(name)]++;
        }
      }
    }
    return answer;
  }
}