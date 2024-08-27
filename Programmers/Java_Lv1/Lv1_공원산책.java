/* https://school.programmers.co.kr/learn/courses/30/lessons/172928 */

class Solution {
  public int[] solution(String[] park, String[] routes) {
    int[] answer = new int[2];
    int sX = 0;
    int sY = 0;
    
    char[][] arr = new char[park.length][park[0].length()];
    
    for (int i = 0; i < park.length; i++) {
      arr[i] = park[i].toCharArray();

      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 'S') {
          sY = i;
          sX = j;
        }
      }
    }

    for (String route : routes) {
      String dir = route.split(" ")[0];
      int dis = Integer.parseInt(route.split(" ")[1]);
      
      int nX = sX;
      int nY = sY;
      
      for (int i = 0; i < dis; i++) {
        if (dir.equals("E")) nX++;
        if (dir.equals("W")) nX--;
        if (dir.equals("S")) nY++;
        if (dir.equals("N")) nY--;

        if (nX >= 0 && nY >= 0 && nY < arr.length && nX < arr[0].length) {
          if (arr[nY][nX] == 'X') break;

          if (i == dis - 1) {
            sX = nX;
            sY = nY;
          }
        }
      }
    }       
    answer[0] = sY;
    answer[1] = sX;
    return answer;
  }
}