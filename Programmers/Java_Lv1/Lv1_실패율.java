/* https://school.programmers.co.kr/learn/courses/30/lessons/42889 */

import java.util.*;

class Solution {
  public static int[] solution(int N, int[] stages) {
    int[] result = new int[N];
    Map<Integer, Double> map = new HashMap<>();
    
    for (int i = 1; i <= N; i++) {
      int totNum = 0;
      int fail = 0;

      for (int j = 0; j < stages.length; j++) {
        if (stages[j] >= i) {
          totNum++;
          if (stages[j] == i) {
            fail++;
          }
        }
      }
      double failRate = totNum != 0 ? (double)fail / totNum : 0;
      
      map.put(i, failRate);
    }

    List<Integer> list = new ArrayList<>(map.keySet());
    list.sort((x, y) -> map.get(y).compareTo(map.get(x)));

    for (int i = 0; i < N; i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}