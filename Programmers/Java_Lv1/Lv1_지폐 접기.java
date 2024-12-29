/* https://school.programmers.co.kr/learn/courses/30/lessons/340199 */

import java.util.Arrays;

class Solution {
  public static int solution(int[] wallet, int[] bill) {
    int answer = 0;

    Arrays.sort(wallet);
    Arrays.sort(bill);

    while (!checkSize(wallet, bill)) {
      if (bill[0] > bill[1]) {
        bill[0] /= 2;
      } else {
        bill[1] /= 2;
      } 
      answer++;
    }
    return answer;
  }
  
  private static boolean checkSize(int[] wallet, int[] bill) {
    Arrays.sort(wallet);
    Arrays.sort(bill);

    return bill[0] <= wallet[0] && bill[1] <= wallet[1];
  }
}
/* 

import java.util.*;

class Solution {
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);

        while (!fit(wallet, bill)) {
            bill[1] /= 2;
            Arrays.sort(bill);
            answer++;
        }
        return answer;
    }

    public static boolean fit(int[] wallet, int[] bill) {
        return (bill[0] <= wallet[0] && bill[1] <= wallet[1]) ||
               (bill[0] <= wallet[1] && bill[1] <= wallet[0]);
    }
}

 */