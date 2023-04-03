class Solution {
    int solution(int[][] land) {
         int answer = 0;
    int[][] arr = new int[land.length + 1][land[0].length + 1];

    for (int i = 0; i < land[0].length; i++) {
      arr[0][i] = land[0][i];
    }

    for (int i = 1; i < land.length; i++) {
      for (int j = 0; j < land[i].length; j++) {
        for (int k = 0; k < land[i].length; k++) {
          if (j != k) {
            arr[i][j] = Math.max(arr[i][j], arr[i - 1][k] + land[i][j]);
          }
        }
      }
    }

    for (int i = 0; i < land[0].length; i++) {
      answer = Math.max(answer, arr[land.length - 1][i]);
    }

    return answer;
    }
}