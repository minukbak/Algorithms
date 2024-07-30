/*
  5. 다익스트라 알고리즘
  - 설명
    가중치 방향그래프의 1번 정점에서 모든 정점으로의 최소 거리 비용을 출력하는 프로그램을 작성하세요.
    (경로가 없으면 Impossible을 출력한다.)
  - 입력 설명
    첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결 정보와 거리 비용이 주어진다.
  - 출력 설명
    1번 정점에서 각 정점으로 가는 최소 비용을 2번 정점부터 차례대로 출력하세요.
  - 입력 예제1
    6 9 
    1 2 12 // 1번 정점에서 2번 정점으로 가는데 비용이 12이다.
    1 3 4 
    2 1 2 
    2 3 5 
    2 5 5 
    3 4 5 
    4 2 2 
    4 5 5 
    6 4 5 
  - 출력 예제1
    2 : 11 
    3 : 4 
    4 : 9 
    5 : 14 
    6 : impossible
*/

import java.util.*;

class Edge implements Comparable<Edge> {
  public int vtx;
  public int cost;
  Edge(int vtx, int cost) {
    this.vtx = vtx;
    this.cost = cost;
  }
  @Override
  public int compareTo(Edge obj) {
    return this.cost - obj.cost;
  }
}
public class Main {
  static int n, m;
  static ArrayList<ArrayList<Edge>> graph;
  static int[] dis;

  public void solution(int v) {
    PriorityQueue<Edge> pQ = new PriorityQueue<>();
    pQ.offer(new Edge(v, 0));
    dis[v] = 0;
    while (!pQ.isEmpty()) {
      Edge tmp = pQ.poll();
      int now = tmp.vtx;
      int nowCost = tmp.cost;
      if (nowCost > dis[now]) continue;
      for (Edge obj : graph.get(now)) {
        if (dis[obj.vtx] > nowCost + obj.cost) {
          dis [obj.vtx] = nowCost + obj.cost;
          pQ.offer(new Edge(obj.vtx, nowCost + obj.cost));
        }
      }
    }
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();
    m = kb.nextInt();
    graph = new ArrayList<ArrayList<Edge>>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Edge>());
    }
    dis = new int[n + 1];
    Arrays.fill(dis, Integer.MAX_VALUE);
    for (int i = 0; i < m; i++) {
      int a = kb.nextInt();
      int b = kb.nextInt();
      int c = kb.nextInt();
      graph.get(a).add(new Edge(b, c));
    }
    T.solution(1);
    for (int i = 2; i <= n; i++) {
      if (dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
      else System.out.println(i + " : impossible");
    }
  }
}