/* https://school.programmers.co.kr/learn/courses/30/lessons/12910 */

import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {};
      ArrayList<Integer> list = new ArrayList<>();

      for (int n : arr) {
        if (n % divisor == 0) list.add(n);
      }
      if (list.isEmpty()) list.add(-1);

      answer = new int[list.size()];

      for (int i = 0; i < list.size(); i ++) {
        answer[i] = list.get(i);
      }

      Arrays.sort(answer);
      /* int[] answer = Arrays.stream(arr).filter(element -> element % divisor == 0).toArray();
      if(answer.length == 0) answer = new int[] {-1};
      Arrays.sort(answer); */
      return answer;
  }
}