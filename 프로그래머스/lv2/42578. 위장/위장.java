import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		// 부위 별 의상 수
		for (String[] cloth : clothes)
			map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
		// 부위 별 의상 수를 다 곱하면 모든 조합의 갯수
		// 해당 부위의 옷을 안 입는 경우 +1
		Iterator<Integer> iterator = map.values().iterator();
		while(iterator.hasNext()){
			answer *= iterator.next() + 1;
		}
		return answer - 1; // 아무것도 안입는 경우 -1
    }
}