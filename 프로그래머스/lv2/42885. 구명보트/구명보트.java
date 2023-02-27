import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
    Arrays.sort(people);
    int answer = 0;
    int left = 0;
    for (int right = people.length - 1; left <= right; right--) {
      if (people[right] + people[left] <= limit) {
        left++;
      }
      answer++;
    }

    return answer;
    }
}