/*
6. 부분집합 구하기(DFS)
  - 설명
    자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
  - 입력 설명
    첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
  - 출력 설명
    첫 번재 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
    단 공집합은 출력하지 않습니다.
  - 입력
    3
  - 출력
    1 2 3 
    1 2 
    1 3
    1 
    2 3 
    2 
    3 
*/

import java.util.*;

public class Main {
    static int n;
    static int[] ch;

    public void DFS(int L) {
      if (L == n + 1) {
        String tmp = "";
        for (int i = 1; i <= n; i++) {
          if (ch[i] == 1) tmp += (i + " ");
        }
        if (tmp.length() > 0) System.out.println(tmp);
      } else {
        ch[L] = 1;
        DFS(L + 1);
        ch[L] = 0;
        DFS(L + 1);
      }
    }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();
    ch = new int[n + 1];
    T.DFS(1);
  }
}