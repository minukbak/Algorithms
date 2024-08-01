/* https://school.programmers.co.kr/learn/courses/30/lessons/136798 */

class Solution {
  public int solution(int number, int limit, int power) {
    int answer = 0;
    int divisors = 0;

    for (int i = 1; i <= number; i++) {
      divisors = countDivisors(i);
      if (divisors > limit) {
        answer += power;
      } else {
        answer += divisors;
      }
    }
    return answer;
  }

  private int countDivisors(int num) {
    int count = 0;
    
    for (int i = 1; i * i <= num; i++) {
      if (i * i == num)
        count++;
      else if (num % i == 0) 
        count += 2;
    }
    return count;
  }
}

