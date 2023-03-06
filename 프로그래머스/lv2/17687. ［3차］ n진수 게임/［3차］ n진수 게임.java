class Solution {
    public String solution(int n, int t, int m, int p) {
        // n : 진법 / t : 미리 구할 개수 / m : 사람 / p : 순서
    StringBuilder answer = new StringBuilder();
    StringBuilder sb = new StringBuilder("0");
    String[] alpha = {"A", "B", "C", "D", "E", "F"};
    int num = 1;

        
    while (sb.length() - 1 < t * m) {
      int q = num;
      int r;
      StringBuilder tmp = new StringBuilder();
      while (q > 0) {
        r = q % n;
        q = q / n;
        if (r >= 10 && r <= 15){
          tmp.append(alpha[r-10]);
        }else {
          tmp.append(r);
        }
      }
      sb.append(tmp.reverse());
      num++;
    }
    for(int i=0;i<t;i++){
      answer.append(sb.charAt(p-1));
      p+=m;
    }
    return answer.toString();
    }
}