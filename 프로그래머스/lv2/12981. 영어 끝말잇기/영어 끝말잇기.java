import java.util.Arrays;
class Solution {
    public int[] solution(int n, String[] words) {
    int order = 0;
    String[][] arr = new String[n][words.length / n + 1];
    for (String[] strings : arr) {
      Arrays.fill(strings, "");
    }
    int[] idx = new int[n];
    arr[0][0] = words[0];
    idx[0]++;
    for (int i = 1; i < words.length; i++) {
      if (i % n == 0) {
        order = 0;
      } else {
        order++;
      }
      if (words[i].charAt(0) == words[i - 1].charAt(words[i - 1].length() - 1) && isUsed(words[i],
          arr)) {
        arr[order][idx[order]++] = words[i];
      } else {
        return new int[]{order + 1, idx[order] + 1};
      }
    }
    return new int[]{0, 0};
  }

  public static boolean isUsed(String word, String[][] words) {
    for (String[] strings : words) {
      for (String str : strings) {
        if (str.equals(word)) {
          return false;
        }
      }
    }
    return true;
  }
}