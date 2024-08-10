/*
7. 원더랜드(최소 스패닝 트리 - 크루스칼: Union&Find 이용)
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
  public int v1;
  public int v2;
  public int cost;
  Edge(int v1, int v2, int cost) {
    this.v1 = v1;
    this.v2 = v2;
    this.cost = cost;
  }
  @Override
  public int compareTo(Edge obj) {
    return this.cost - obj.cost;
  }
}
public class Main {
  static int[] unf;

  public static int Find(int v) {
    if (v == unf[v]) return v;
    else return unf[v] = Find(unf[v]);
  }

  public static void Union(int a, int b) {
    int fa = Find(a);
    int fb = Find(b);
    if (fa != fb) unf[fa] = fb;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int m = kb.nextInt();
    
    unf = new int[n + 1];
    ArrayList<Edge> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      unf[i] = i;
    }
    for (int i = 0; i < m; i++) {
      int v1 = kb.nextInt();
      int v2 = kb.nextInt();
      int cost = kb.nextInt();
      arr.add(new Edge(v1, v2, cost));
    }

    int answer = 0;
    Collections.sort(arr);
    for (Edge ob : arr) {
      int fv1 = Find(ob.v1);
      int fv2 = Find(ob.v2);
      if (fv1 != fv2) {
        answer += ob.cost;
        Union(ob.v1, ob.v2);
      }
    }
    System.out.println(answer);
  }
}
