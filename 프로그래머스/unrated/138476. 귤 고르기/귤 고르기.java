import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
    int answer = 0;
    Map<Integer, Integer> gyul = new HashMap<>();
    for(int t : tangerine)
      gyul.put(t, gyul.getOrDefault(t, 0) + 1);
    List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(gyul.entrySet());
    entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    for(Map.Entry<Integer, Integer> entry : entries) {
      if(k <= 0) break;
      k -= entry.getValue();
      answer++;
    }

    return answer;
    }
}