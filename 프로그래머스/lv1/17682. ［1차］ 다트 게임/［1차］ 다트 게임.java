import java.util.Arrays;
class Solution {
    public int solution(String dartResult) {
        char[] dart = dartResult.toCharArray();
    int result = 0;
    int[] score = new int[3];
    int index = -1;
    for (int i = 0; i < dart.length; i++) {
      if (dart[i] >= '0' && dart[i] <= '9') {
        index++;
        score[index] = Character.getNumericValue(dart[i]);
        if (dart[i + 1] >= '0' && dart[i + 1] <= '9') {
          score[index] *= 10;
          i++;
        }
      }
      switch (dart[i]) {
        case 'D':
          score[index] = ((int) Math.pow(score[index], 2));
          break;
        case 'T':
          score[index] = ((int) Math.pow(score[index], 3));
          break;
        case '*':
          score[index] *= 2;
          if (index >= 1)
            score[index - 1] *= 2;
          break;
        case '#':
          score[index] *= -1;
          break;
      }
    }
    return Arrays.stream(score).sum();
    }
}