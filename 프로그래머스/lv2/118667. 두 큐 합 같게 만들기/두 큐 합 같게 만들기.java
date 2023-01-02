import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
		long sum = 0, sum1 = 0, sum2 = 0;
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
        // 
		for (int i = 0; i < queue1.length; i++) {
			q1.offer(queue1[i]);
			q2.offer(queue2[i]);
			sum1 += queue1[i];
			sum2 += queue2[i];
		}
		sum = sum1 + sum2;
		if (sum % 2 != 0)
			return -1;
		sum /= 2;
		while (sum1 != sum2) {
			if(answer >= queue1.length * 3) return -1;
			if (sum1 > sum2) {
				sum1 -= q1.peek();
				q2.offer(q1.peek());
				sum2 += q1.poll();
			} else if (sum1 < sum2) {
				sum2 -= q2.peek();
				q1.offer(q2.peek());
				sum1 += q2.poll();
			}
			answer++;
		}
		return answer;
    }
}