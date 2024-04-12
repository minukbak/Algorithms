/* https://school.programmers.co.kr/learn/courses/30/lessons/12906 */

import java.util.*;

public class Solution {
  public int[] solution(int[] arr) {
    int[] answer = new int[arr.length];

    int before = -1;
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != before) {
          answer[cnt++] = arr[i];
        }
        before = arr[i];
    }
    answer = Arrays.copyOfRange(answer, 0, cnt);

    return answer;
  }
}

/* public class Solution {
  public int[] solution(int[] arr) {
    ArrayList<Integer> list = new ArrayList<Integer>();
     
    int before = -1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != before) {
          list.add(arr[i]);
        }
        before = arr[i];
    }
    int[] answer = new int[list.size()];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i).intValue();
    }
    return answer;
  }
} */
