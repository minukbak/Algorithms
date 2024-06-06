/* https://school.programmers.co.kr/learn/courses/30/lessons/42840 */

import java.util.*;

class Solution {
  public int[] solution(int[] answers) {
    int[] first = {1,2,3,4,5};
    int[] second = {2,1,2,3,2,4,2,5};
    int[] third = {3,3,1,1,2,2,4,4,5,5};
    int[] score = new int[3];
    
    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == first[i % first.length]) score[0]++;
      if (answers[i] == second[i % second.length]) score[1]++;
      if (answers[i] == third[i % third.length]) score[2]++;
    }
    
    int max = Math.max(score[0], Math.max(score[1], score[2]));
    List<Integer> result = new ArrayList<Integer>();

    for (int i = 0; i < score.length; i++) {
      if (max == score[i]) result.add(i + 1);
    }

    int[] answer = new int[result.size()];

    for (int i = 0; i < result.size(); i++){
      answer[i] = result.get(i);
    }

    return answer;
  }
}