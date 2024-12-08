/* https://school.programmers.co.kr/learn/courses/30/lessons/250121 */

import java.util.*;

class Solution {
  public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {

    ArrayList<int[]> answer = new ArrayList<>();
    String[] extArr = {"code", "date", "maximum", "remain"};
    int extIdx = 0, sortIdx = 0;

    for (int i = 0; i < extArr.length; i++) {
      if (ext.equals(extArr[i])) extIdx = i;
      if (sort_by.equals(extArr[i])) sortIdx = i;
    }

    for (int i = 0; i < data.length; i++) {
      if (data[i][extIdx] < val_ext) answer.add(data[i]);
    }

    final int sortKey = sortIdx;
    Collections.sort(answer, (o1, o2) -> (o1[sortKey] - o2[sortKey]));

    return answer;
  }
}