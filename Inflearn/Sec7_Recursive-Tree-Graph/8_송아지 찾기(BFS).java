/*
8. 송아지 찾기 1(BFS : 상태트리탐색)
  - 설명
    현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
    현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
    송아지는 움직이지 않고 제자리에 있다.
    현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
    최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
  - 입력
    첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
  - 출력
    점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
  - 예시 입력 1 
    5 14
  - 예시 출력 1
    3
*/

import java.util.*;

public class Main {
  int answer = 0;
  int[] dis = {1, -1, 5};
  int[] chk;
  Queue<Integer> que = new LinkedList<>();

  public int BFS(int s, int e) {
    int lvl = 0;
    chk = new int[10001];

    chk[s] = 1;
    que.offer(s);

    while (!que.isEmpty()) {
      int len = que.size();

      for (int i = 0; i < len; i++) {
        int x = que.poll();
        if (x == e) return lvl;

        for (int j = 0; j < 3; j++) {
          int nx = x + dis[j];
          // if (nx == e) return lvl + 1;
          if (nx >= 1 && nx <= 10000 && chk[nx] == 0) {
            chk[nx] = 1;
            que.offer(nx);
          }
        }
      }
      lvl++;
    }
    return 0;
  }
  
  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int s = kb.nextInt();
    int e = kb.nextInt();
    System.out.println(T.BFS(s, e));
  }
}