/*
3. 팩토리얼
  - 설명
    자연수 N이 입력되면 N!을 구하는 프로그램을 작성하세요.
    예를 들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
  - 입력
    첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
  - 출력
    첫 번째 줄에 N팩토리얼 값을 출력하세요.
  - 예시 입력 1 
    5
  - 예시 출력 1
    120
*/

import java.util.*;

class Main {
  public int DFS(int n) {
    if (n == 1) return 1;
    else return n * DFS(n - 1);
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    System.out.println(T.DFS(n));
  }
}