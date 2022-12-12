import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (rank.size() < k) {
                rank.add(score[i]);
                Collections.sort(rank);
                answer[i] = rank.get(0);
            } else if (rank.size() == k) {
                if (score[i] > rank.get(0)) {
                    rank.remove(0);
                    rank.add(score[i]);
                    Collections.sort(rank);
                }
                answer[i] = rank.get(0);
            }
        }
        return answer;
    }
}