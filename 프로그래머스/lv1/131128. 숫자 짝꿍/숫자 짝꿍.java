import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
    char[] x = X.toCharArray();
    char[] y = Y.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    int xidx = 0, yidx = 0;
    while (xidx < x.length && yidx < y.length) {
      if (x[xidx] == y[yidx]) {
        sb.append(x[xidx]);
        xidx++;
        yidx++;
      } else if (x[xidx] > y[yidx])
        yidx++;
      else if (x[xidx] < y[yidx])
        xidx++;
    }
        sb.reverse();
    if ("".equals(sb.toString()))
      return "-1";
    if (sb.toString().startsWith("0"))
      return "0";
    return sb.toString();
    }
}