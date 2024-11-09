/* https://school.programmers.co.kr/learn/courses/30/lessons/77484 */


class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {

    int cnt = 0;
    int hit = 0;

    for (int myNum : lottos) {
      if (myNum == 0) {
        cnt++;
      } else {
        for (int winNum : win_nums) {
          if (myNum == winNum) {
            hit++;
            break;
          }
        }
      }
    }
    int[] answer = {Math.min(7 - (hit + cnt), 6), Math.min(7 - hit, 6)};
    
    return answer;
  }
}