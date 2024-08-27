/* https://school.programmers.co.kr/learn/courses/30/lessons/176963 */

import java.util.*;

class Solution{
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] answer = new int[photo.length];
    
    Map<String, Integer> map = new HashMap<>();
    
    for (int i=0; i< name.length; i++) {
      map.put(name[i], yearning[i]);
    }

    for (int i = 0; i < photo.length; i++) {
      int sum = 0;
      for (String str : photo[i]) {
          sum += map.getOrDefault(str, 0);   
      }
      answer[i] = sum;
    }

    /* 3중포 버전
    for (int i = 0; i < photo.length; i++) {
      for (int j = 0; j < photo[i].length; j++) {
        for (int k = 0; k < name.length; k++) {
          if (photo[i][j].equals(name[k])) answer[i] += yearning[k];
        }
      }
    } */
    return answer;
  }
}