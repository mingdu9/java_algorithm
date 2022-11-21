class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
    double[] rate = new double[N];
    double sum = 0;
    double fail = 0;
    double max;
    int idx = 1;
    for (int i = 1; i <= N; i++) {
      sum = 0;
      fail = 0;
      for (int stage : stages) {
        if (i <= stage)
          sum++;
        if (i == stage)
          fail++;
      }
      if(sum > 0) rate[i - 1] = fail / sum;
    }
    for (int i = 0; i < N; i++) {
      max = rate[0];
      idx = 1;
      for (int j = 0; j < rate.length; j++) {
        if (rate[j] > max) {
          max = rate[j];
          idx = j + 1;
        }
      }
      rate[idx - 1] = -1;
      answer[i] = idx;
    }
    return answer;
    }
}