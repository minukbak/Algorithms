/* https://school.programmers.co.kr/learn/courses/30/lessons/12944 */

class Solution {
  public double solution(int[] arr) {
    double answer = 0;
    double sum = 0;

    for (int x : arr) {
      sum += x;
    }
    answer = sum / arr.length; 

    return answer;
  }
}