/* https://school.programmers.co.kr/learn/courses/30/lessons/12933 */

import java.util.*;

class Solution {
  public long solution(long n) {
    String[] list = String.valueOf(n).split("");
    Arrays.sort(list);

    StringBuilder sb = new StringBuilder();
    for (String s : list) sb.append(s);

    return Long.parseLong(sb.reverse().toString());
  }
}