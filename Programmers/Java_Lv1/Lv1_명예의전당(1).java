/* https://school.programmers.co.kr/learn/courses/30/lessons/138477 */

import java.util.*;

class Solution {
  public int[] solution(int k, int[] score) {
    int sLen = score.length;
    int[] answer = new int[sLen];
    PriorityQueue<Integer> pQ = new PriorityQueue<>();

    for (int i = 0; i < sLen; i++) {
      pQ.offer(score[i]);

      if (pQ.size() > k) {
        pQ.poll();
      }
      answer[i] = pQ.peek();
    }
    return answer;
  }
}