class Solution {
    public int[] solution(int brown, int yellow) {
int width = 0, height = 0;
    int area = brown + yellow;
    for (width = 3; width < area; width++) {
      if (area % width == 0) {
        height = Math.min(area / width, width);
      }
      if (height >= 3) {
        int tmp = (width - 2) * (height - 2);
        if (tmp == yellow) {
          return new int[]{width, height};
        }
      }
    }
    return new int[]{width, height};
    }
}