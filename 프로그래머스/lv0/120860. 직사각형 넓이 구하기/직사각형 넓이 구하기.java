import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int[] x = Arrays.stream(dots).mapToInt(e -> e[0]).toArray();
        int[] y = Arrays.stream(dots).mapToInt(e -> e[1]).toArray();
        Arrays.sort(x);
        Arrays.sort(y);
        int width = x[0] - x[3];
        int height = y[0] - y[3];
        return width * height;
    }
}