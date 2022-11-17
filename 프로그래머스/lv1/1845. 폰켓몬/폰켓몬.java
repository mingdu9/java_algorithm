import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(nums).mapToObj(e -> Integer.valueOf(e)).collect(Collectors.toList()));
        if(set.size() > nums.length / 2) return nums.length / 2;
        return set.size();
    }
}