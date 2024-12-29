/* https://school.programmers.co.kr/learn/courses/30/lessons/340213 */

class Solution {
  public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
    int v = toSecond(video_len);
    int p = toSecond(pos);
    int opStart = toSecond(op_start);
    int opEnd = toSecond(op_end);

    if (p >= opStart && p <= opEnd) {
      p = opEnd;
    }
  
    for (String command : commands) {
      if (command.equals("prev")) {
        if (p < 10) { p = 0; }
        else { p -= 10; }
      } else {
        if (v - p < 10)  { p = v; }
        else  { p += 10;}
      }
      if (p >= opStart && p <= opEnd) {
        p = opEnd;
      }
    }

    String m = String.format("%02d", (int) Math.floor((double) p / 60));
    String s = String.format("%02d", p % 60);
    return m+":"+s;
  }
  
  private static int toSecond(String time) {
    String[] ms = time.split(":");
    return (Integer.parseInt(ms[0]) * 60) +  Integer.parseInt(ms[1]);
  }
}