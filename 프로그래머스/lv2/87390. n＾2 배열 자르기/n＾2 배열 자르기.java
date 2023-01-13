import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int) (right - left + 1)];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) Math.max((i + left) / n, (i + left) % n) + 1;
		}
		return result;
    }
}