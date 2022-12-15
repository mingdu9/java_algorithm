import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		Map<Integer, Long> map = list.stream().collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Map.Entry<Integer, Long>> entries = new LinkedList<>(map.entrySet());
		entries.sort(Map.Entry.comparingByValue());
		if (entries.size() < 2)
			return entries.get(entries.size() - 1).getKey();
		if (entries.get(entries.size() - 1).getValue() == entries.get(entries.size() - 2).getValue())
			return -1;
		return entries.get(entries.size() - 1).getKey();
    }
}