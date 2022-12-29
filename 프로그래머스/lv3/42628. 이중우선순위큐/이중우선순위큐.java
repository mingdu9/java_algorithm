import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = { 0, 0 };
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		for (String str : operations) {
			StringTokenizer st = new StringTokenizer(str);
			String op = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			if (op.equals("I")) {
				min.offer(num);
				max.offer(num);
			} else {
				if (min.size() == 0)
					continue;
				if (num == -1) {
					int minimum = min.poll();
					max.remove(minimum);
				} else {
					int maximum = max.poll();
					min.remove(maximum);
				}
			}
		}
		if (min.size() > 0) {
			answer[0] = max.peek();
			answer[1] = min.peek();
		}
		return answer;
    }
}