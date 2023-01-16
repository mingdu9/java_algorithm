import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];  // 걸리는 일 수
		ArrayList<Integer> list = new ArrayList<>();
        
		for (int i = 0; i < progresses.length; i++) {
            // progress + (speed * day) == 100
			if ((100 - progresses[i]) % speeds[i] == 0)
				days[i] = (100 - progresses[i]) / speeds[i];
			else  // 나누어 떨어지지 않을 때 하루 후 배포
				days[i] = (100 - progresses[i]) / speeds[i] + 1;
		}
        
		int maxDay = days[0];
		int count = 1;
		for (int i = 1; i < days.length; i++) {
			if (maxDay < days[i]) {
                // 다음 작업이 더 오래걸릴 때 현재 밀린 작업 완료
				list.add(count);
				maxDay = days[i];
				count = 1;
			} else {
                // 밀린 작업 개수 +1
				count++;
			}
		}
        // 마지막 작업 완료
		list.add(count);
        
		return list.stream().mapToInt(e -> e).toArray();
    }
}