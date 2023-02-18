import java.util.*;
class Solution {
    public int[] solution(String msg) {
    ArrayList<Integer> answer = new ArrayList<>();
    HashMap<String, Integer> dict = new HashMap<>();
    int len = 0;
    for (int i = 1; i <= 26; i++) {
      dict.put(Character.toString(i + 64), i);
    }
    while(len < msg.length()){
      int idx = msg.length() - len;
      while (!dict.containsKey(msg.substring(len, len+idx))) {
        idx--;
        if (idx <= 0) {
          break;
        }
      }
      if (len + idx == msg.length()) {
        answer.add(dict.get(msg.substring(len, len+idx)));
      }else{
        String next = msg.substring(len, len + idx + 1);
        answer.add(dict.get(next.substring(0, next.length()-1)));
        dict.put(next, dict.size()+1);
      }
      len += idx;
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }
}