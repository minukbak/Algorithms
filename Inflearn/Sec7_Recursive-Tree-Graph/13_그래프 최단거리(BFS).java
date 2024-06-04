/*
13. 그래프 최단거리(BFS)
  - 설명
    다음 그래프의 1번 정점에서 각 정점으로 가는 최소 이동 간선 수를 출력하세요.
      1  ←  2  →  5
      ↓  ↘   ↖ ↗ ↑
      3  →  4  →  6
  - 입력 설명
    첫 째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M 줄에 걸쳐 연결 정보가 주어진다. 
  - 출력 설명
    1번 정점에서 각 정점으로 가는 최소 간선 수를 2번 정점부터 차례대로 출력하세요.
  - 입력
      6 9 
      1 3 
      1 4 
      2 1 
      2 5 
      3 4 
      4 5 
      4 6 
      6 2 
      6 5 
  - 출력
      2 : 3 
      3 : 1 
      4 : 1 
      5 : 2 
      6 : 2 
*/import java.util.*;

public class Main {
  static int n, m;
  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch, dis;
  
  public void BFS(int v) {
    Queue<Integer> queue = new LinkedList<>();
    ch[v] = 1;
    dis[v] = 0;
    queue.offer(v);
    while (!queue.isEmpty()) {
      int cv = queue.poll();
      for (int nv : graph.get(cv)) {
        if (ch[nv] == 0) {
          ch[nv] = 1;
          queue.offer(nv);
          dis[nv] = dis[cv] + 1;
        }
      }
    }
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();
    m = kb.nextInt();
    graph = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Integer>());
    }
    ch = new int[n + 1];
    dis = new int[n + 1];
    for (int i = 0; i < m; i++) {
      int a = kb.nextInt();
      int b = kb.nextInt();
      graph.get(a).add(b);
    }
    T.BFS(1);
    for (int i = 2; i <= n; i++) {
      System.out.println(i + " : " + dis[i]);
    }
  }
}