import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0)
				days[i] = (100 - progresses[i]) / speeds[i];
			else
				days[i] = (100 - progresses[i]) / speeds[i] + 1;
		}
		int maxDay = days[0];
		int count = 1;
		for (int i = 1; i < days.length; i++) {
			if (maxDay < days[i]) {
				list.add(count);
				maxDay = days[i];
				count = 1;
			} else {
				count++;
			}
		}
		list.add(count);
		return list.stream().mapToInt(e -> e).toArray();
    }
}