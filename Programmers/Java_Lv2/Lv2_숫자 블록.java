/* https://school.programmers.co.kr/learn/courses/30/lessons/12923 */

class Solution {
  public int[] solution(long begin, long end) {
    int first = (int)begin;
    int last = (int)end;

    int[] answer = new int[last - first + 1];
    int idx = 0;

    if (first == 1) {
      answer[idx++] = 0;
      first++;
    }

    for (int n = first; n <= last; n++) {
      int value = 1;
      
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          value = i;
          if (n / i <= 10000000) {
            value = n / i;
            break;
          }
        }
      }
      answer[idx++] = value;
    }
    
    return answer;
  }
}