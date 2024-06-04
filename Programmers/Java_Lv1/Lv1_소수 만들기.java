/* https://school.programmers.co.kr/learn/courses/30/lessons/12977 */

class Solution {
  public int solution(int[] nums) {
    int answer = 0;
    int length = nums.length;

    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        for (int k = j + 1; k < length; k++) {
          int sum = nums[i] + nums[j] + nums[k];
          answer += isPrime(sum) ? 1 : 0;
        }
      }
    }
		return answer;
  }

  private boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}