/* https://school.programmers.co.kr/learn/courses/30/lessons/131128 */

import java.util.*;
import java.util.stream.*;

class Solution {
  public String solution(String X, String Y) {
    Map<String, Integer> x = new HashMap<>();
    Map<String, Integer> y = new HashMap<>();
    
    List<String> list = new ArrayList<>();
    
    for (String s: X.split("")) {
      x.put(s, x.getOrDefault(s, 0) + 1);
    }
    
    for (String s: Y.split("")) {
      y.put(s, y.getOrDefault(s, 0) + 1);
    }
    
    for (String key: x.keySet()) {
      if (!y.containsKey(key)) continue;
      
      int length = Math.min(x.get(key), y.get(key));
      for (int i = 0; i < length; i++) {
        list.add(key);
      }
    }
    
    String result = list.stream()
      .sorted(Collections.reverseOrder())
      .collect(Collectors.joining());
    
    if (result.isEmpty())return "-1";
    if (result.replaceAll("0", "").isEmpty()) return "0";
    
    return result;
  }
}