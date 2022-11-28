import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = lost.length - 1; i >= 0; i--) {
            for (int j = reserve.length - 1; j >= 0; j--) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i = lost.length - 1; i >= 0; i--) {
            for (int j = reserve.length - 1; j >= 0; j--) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}