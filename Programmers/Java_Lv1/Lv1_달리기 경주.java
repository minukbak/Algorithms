/* https://school.programmers.co.kr/learn/courses/30/lessons/178871 */

import java.util.*;

class Solution {
  public String[] solution(String[] players, String[] callings) {

    Map<String, Integer> ranks = new HashMap<>();
    
    for (int i = 0; i < players.length; i++) {
      ranks.put(players[i], i);
    }
    
    for (String player : callings) {
      int rank = ranks.get(player);
      String frontPlayer = players[rank - 1];
      
      ranks.replace(frontPlayer, rank);
      players[rank] = frontPlayer;

      ranks.replace(player, rank - 1);
      players[rank - 1] = player; 
    }
    return players;
  }
}