/*
1. 재귀함수
  - 설명
    자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
  - 입력
    첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
  - 출력
    첫째 줄에 출력한다.
  - 예시 입력 1 
    3
  - 예시 출력 1
    1 2 3
*/

import java.util.*;

class Main {
  public void DFS(int n) {
    if (n == 0) return;
    else {
      DFS(n - 1);
      System.out.print(n + " ");
    }
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    T.DFS(n);
  }
}