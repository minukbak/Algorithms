/*
4. 중복 순열 구하기
  - 설명
    1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력하시오.
  - 입력
    첫 번째 줄에 자연수 N(3<=N<=10) 과 M(2<=M<=N)이 주어집니다.
  - 출력
    첫 번째 줄에 결과를 출력합니다.
    출력 순서는 사전순으로 오름차순으로 출력합니다.
  - 입력 예제 1
    3 2 
  - 출력 예제 1
    1 1 
    1 2 
    1 3 
    2 1 
    2 2 
    2 3 
    3 1 
    3 2 
    3 3 
*/

import java.util.*;

public class Main {
  static int[] pm;
  static int n, m;
  
  public void DFS(int L) {
    if (L == m) {
      for (int x : pm) System.out.print(x + " ");
      System.out.println();
    } else {
      for (int i = 1; i <= n; i++) {
        pm[L] = i;
        DFS(L + 1);
      }
    }
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();
    m = kb.nextInt();
    pm = new int[m];
    T.DFS(0);
  }
}