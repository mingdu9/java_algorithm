import java.util.*;
class Solution {
    public int solution(String dirs) {
        float[] location = { 0, 0 };
		Set<String> set = new HashSet<>();
		for (char ch : dirs.toCharArray()) {
			if (ch == 'U' && location[1] < 5) {
				location[1]++;
				set.add(String.format("%.1f, %.1f", location[0], location[1] - 0.5));
			} else if (ch == 'D' && location[1] > -5) {
				location[1]--;
				set.add(String.format("%.1f, %.1f", location[0], location[1] + 0.5));
			} else if (ch == 'L' && location[0] > -5) {
				location[0]--;
				set.add(String.format("%.1f, %.1f", location[0] + 0.5, location[1]));
			} else if (ch == 'R' && location[0] < 5) {
				location[0]++;
				set.add(String.format("%.1f, %.1f", location[0] - 0.5, location[1]));
			}
		}
		return set.size();
    }
}