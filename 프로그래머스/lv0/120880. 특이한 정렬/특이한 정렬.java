import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public Integer[] solution(int[] numlist, int n) {
    List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());
    list.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        if (Math.abs(o1 - n) == Math.abs(o2 - n)) {
          if (o1 > o2)
            return -1;
          else if (o1 < o2)
            return 1;
        } else {
          return Math.abs(o1 - n) - Math.abs(o2 - n);
        }
        return 0;
      }
    });
    return list.toArray(new Integer[0]);
  }
}