/*
7. 원더랜드(최소 스패닝 트리 - 프림: PriorityQueue 이용)
  - 설명
    원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
    원더랜드는 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
  - 입력
    첫째 줄에 도시의 개수 V(1≤V≤100)와 도로의 개수 E(1≤E≤1,000)가 주어진다.
    다음 E개의 줄에는 각 도로에 대한 정보를 나타내는 세 정수 A, B, C가 주어진다.
    이는 A번 도시와 B번 도시가 유지비용이 C인 도로로 연결되어 있다는 의미이다.
  - 출력
    모든 도시를 연결하면서 드는 최소비용을 출려한다.
  - 예시 입력 1 
    9 12
    1 2 12
    1 9 25
    2 3 10
    2 8 17
    2 9 8
    3 4 18
    3 7 55
    4 5 44
    5 6 60
    5 7 38
    7 8 35
    8 9 15
  - 예시 출력 1
    196
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
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int m = kb.nextInt();
    ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();

    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Edge>());
    }
    int[] chk = new int[n + 1];

    for (int i = 0; i < m; i++) {
      int v1 = kb.nextInt();
      int v2 = kb.nextInt();
      int cost = kb.nextInt();
      graph.get(v1).add(new Edge(v2, cost));
      graph.get(v2).add(new Edge(v1, cost));
    }

    int answer = 0;
    PriorityQueue<Edge> pQ = new PriorityQueue<>();
    pQ.offer(new Edge(1, 0));
    while (!pQ.isEmpty()) {
      Edge tmp = pQ.poll();
      int endVtx = tmp.vtx;
      if (chk[endVtx] == 0) {
        chk[endVtx] = 1;
        answer += tmp.cost;
        for (Edge ob : graph.get(endVtx)) {
          if (chk[ob.vtx] == 0) pQ.offer(new Edge(ob.vtx, ob.cost));
        }
      }
    }
    System.out.println(answer);
  }
}
