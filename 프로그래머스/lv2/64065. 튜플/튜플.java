import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(1, s.length() - 1);
		String[] tuple = s.split("}");
		Arrays.sort(tuple, Comparator.comparingInt(String::length));
		Set<Integer> set = new LinkedHashSet<>();
		for (String str : tuple) {
			String[] elements = str.split(",");
			elements = Arrays.stream(elements).map(e -> e = e.replaceAll("[,{ ]", "")).toArray(String[]::new);
			for (String e : elements) {
				if (!e.isEmpty())
					set.add(Integer.parseInt(e));
			}
		}
		return set.stream().mapToInt(Number::intValue).toArray();
    }
}