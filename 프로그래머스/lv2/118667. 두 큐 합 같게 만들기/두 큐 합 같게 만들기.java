import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
		long sum = 0, sum1 = 0, sum2 = 0;
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
        // 큐에 저장
		for (int i = 0; i < queue1.length; i++) {
			q1.offer(queue1[i]);
			q2.offer(queue2[i]);
            // sum 저장
			sum1 += queue1[i];
			sum2 += queue2[i];
		}
        // 총 합 계산
		sum = sum1 + sum2;
        // 총 합이 2로 나누어 떨어지지 않으면 어짜피 실패
		if (sum % 2 != 0)
			return -1;
		sum /= 2;
		while (sum1 != sum2) {
            // 실행 횟수 제한을 큐1 * 3으로 둠
            // 왠진 모르겟음... 큐1 * 큐2 하면 틀림
			if(answer > q1.size() + q2.size() + 1) return -1;
            // 큐1이 큐2보다 크면
			if (sum1 > sum2) {
				sum1 -= q1.peek();
				q2.offer(q1.peek());
				sum2 += q1.poll();
            // 큐2가 큐1보다 크면
			} else if (sum1 < sum2) {
				sum2 -= q2.peek();
				q1.offer(q2.peek());
				sum1 += q2.poll();
			}
            // 횟수 +1
			answer++;
		}
		return answer;
    }
}