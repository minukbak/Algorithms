/*
5. 이진트리 순회(깊이 우선 탐색)
  - 설명
    아래 그래프와 같은 이진트리를 전위순회와 후위순회 하시오.
  - 입력
       1
      | |
     2   3
    | | | |
    4 5 6 7
  - 출력
    전위순회 출력: 1 2 4 5 3 6 7
    중위순회 출력: 4 2 5 1 6 3 7
    후위순회 출력: 4 5 2 6 7 3 1
*/

import java.util.*;

class Node {
  int data;
  Node lt, rt;
  public Node(int val) {
    data = val;
    lt = rt = null;
  }
}

public class Main {
  Node root;
  public void DFS(Node root) {
    if (root == null) return;
    else {
      // 전위순회 출력
      System.out.print(root.data + " ");
      DFS(root.lt);
      // 중위순회 출력
      // System.out.print(root.data + " ");
      DFS(root.rt);
      // 후위순회 출력
      // System.out.print(root.data + " ");
    }
  }

  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.DFS(tree.root);
  }
}