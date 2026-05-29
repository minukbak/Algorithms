/* https://school.programmers.co.kr/learn/courses/30/lessons/12914?language=java */

class Solution {
  public long solution(int n) {
    long answer = 0;
    long[] dp = new long[n + 2];
    dp[1] = 1;
    dp[2] = 2;
    
    for (int i = 3; i <= n ; i++) {
      dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
    }
    return dp[n];
  }
}