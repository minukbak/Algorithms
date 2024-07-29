/* https://school.programmers.co.kr/learn/courses/30/lessons/134240 */

/* class Solution {
  public String solution(int[] food) {
    String first = "";
    for (int i = 0; i < food.length; i++) {
      for (int j = 0; j < food[i] / 2; j++) {
        first += Integer.toString(i);
      }
    }

    String second = "";
    for (int i = first.length()-1; i >= 0; i--) {
      second += first.charAt(i);
    }

    return first + "0" + second;
  }
} */

class Solution {
  public String solution(int[] food) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < food.length; i++) {
      for (int j = 0; j < food[i] / 2; j++) {
        sb.append(i);
      }
    }
    return sb.toString() + "0" + sb.reverse().toString();
  }
}
