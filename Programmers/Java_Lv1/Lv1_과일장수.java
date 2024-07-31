/* https://school.programmers.co.kr/learn/courses/30/lessons/135808 */

import java.util.*;

class Solution {
  public int solution(int k, int m, int[] score) {
    int answer = 0;

    Arrays.sort(score);

    for (int i = score.length; i >= m; i -= m) {
      answer += score[i - m] * m;
    }
    return answer;
  }
}