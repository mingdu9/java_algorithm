import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        int i = score.length - m;
        while (i >= 0) {
          answer += score[i] * m;
        i -= m;
        }
        return answer;
    }
}