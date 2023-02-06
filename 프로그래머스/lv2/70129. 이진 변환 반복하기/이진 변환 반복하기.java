class Solution {
    public int[] solution(String s) {
            int zero = 0;
    int count = 0;
    while(!s.equals("1")){
      int len = s.length();
      s = s.replace("0", "");
      zero += len - s.length();
      s = Integer.toBinaryString(s.length());
      count++;
    }
    return new int[]{count, zero};
    }
}