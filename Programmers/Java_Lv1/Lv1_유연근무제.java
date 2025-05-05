/* https://school.programmers.co.kr/learn/courses/30/lessons/388351?language=java */
import java.util.*;

class Solution {
  public int solution(int[] schedules, int[][] timelogs, int startday) {
    
    int len = schedules.length;
    
    int answer = len;
    int[] limits = new int[len];

    for (int i = 0; i < len; i++) {

      limits[i] = schedules[i] + 10;

      if (limits[i] % 100 >= 60) {
        limits[i] += 40;
      }

      for (int j = 0; j < 7; j++) {
        if ((startday + j) % 7 > 0 && (startday + j) % 7 < 6) {
          if (timelogs[i][j] > limits[i]) {
            answer--;
            break;
          }
        }
      }
    }
    return answer;
  }
}