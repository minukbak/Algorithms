/*
5. 동전교환
  - 설명
    다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
    각 단위의 동전은 무한정 쓸 수 있다.
  - 입력
    첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
    그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
  - 출력
    첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
  - 예시 입력 1 
    3
    1 2 5
    15
  - 예시 출력 1
    3
  - 힌트
    출력 설명 : 5 5 5 동전 3개로 거슬러 줄 수 있다.
*/

import java.util.*;

public class Main {
  static int n, m, answer = Integer.MAX_VALUE;
  
  public void DFS(int L, int sum, Integer[] arr) {
    if (sum > m) return;
    if (L >= answer) return;
    if (sum == m) {
      answer = Math.min(answer, L);
    } else {
      for (int i = 0; i < n; i++) {
        DFS(L + 1, sum + arr[i], arr);
      }
    }
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
    Arrays.sort(arr, Collections.reverseOrder());
    m = kb.nextInt();
    T.DFS(0, 0, arr);
    System.out.println(answer);
  }
}