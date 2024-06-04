/* https://school.programmers.co.kr/learn/courses/30/lessons/17681 */

class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n]; 
    
    for (int i = 0; i < n; i++) {
      String str = "";

      String bin1 = Integer.toBinaryString(arr1[i]);
      while (bin1.length() != n) {
        bin1 = "0" + bin1;
      }
      String bin2 = Integer.toBinaryString(arr2[i]);
      while (bin2.length() != n) {
        bin2 = "0" + bin2;
      }

      for (int j = 0; j < n; j++) {
        if (bin1.charAt(j) == '1' || bin2.charAt(j) == '1') str += "#";
        else str += " ";
      }
      answer[i] = str;
    }
    return answer;
  }
}

/* import java.util.*;
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];
    
    for (int i = 0; i < n; i++) {
      answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
      answer[i] = String.format("%" + n + "s", answer[i]);
      answer[i] = answer[i].replace("1", "#");
      answer[i] = answer[i].replace("0", " ");
    }
    return answer;
  }
}
 */