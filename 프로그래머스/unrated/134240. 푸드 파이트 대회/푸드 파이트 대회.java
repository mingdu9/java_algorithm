class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
    for (int i = 1; i < food.length; i++) {
      food[i] = food[i] / 2;
      for (int j = 0; j < food[i]; j++) {
        sb.append(i);
      }
    }
    sb.append(0);
    for (int i = food.length - 1; i > 0; i--) {
      for (int j = 0; j < food[i]; j++) {
        sb.append(i);
      }
    }
    return sb.toString();
    }
}