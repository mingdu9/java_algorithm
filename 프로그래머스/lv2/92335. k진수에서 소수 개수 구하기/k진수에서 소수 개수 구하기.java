class Solution {
    public int solution(int n, int k) {
    int answer = 0;
    String str = change(n, k);
    String[] numbers = str.split("0");
    for(String num : numbers){
      if(!num.isEmpty() && isPrime(Long.parseLong(num))){
        answer++;
      }
    }
    return answer;
  }

  public static String change(int n, int k) {
    StringBuilder sb = new StringBuilder();
    while (n > 0) {
      sb.append(n % k);
      n /= k;
    }
    return sb.reverse().toString();
  }

  public static boolean isPrime(long n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}