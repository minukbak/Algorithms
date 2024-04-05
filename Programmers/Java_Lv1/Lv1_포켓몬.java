/* https://school.programmers.co.kr/learn/courses/30/lessons/1845 */

import java.util.*;

class Solution {
  public int solution(int[] nums) {
    int max = nums.length / 2;
    nums = Arrays.stream(nums).distinct().toArray();

    return Integer.min(max, nums.length);
  }
}
