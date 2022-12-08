import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // N 개의 물건
    int K = Integer.parseInt(st.nextToken()); // 무게 K
    int[][] dp = new int[N + 1][K + 1]; // 기저조건 패딩 추가 +1
    int[][] items = new int[N + 1][2]; // 물건 없는 경우 +1
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      items[i][0] = Integer.parseInt(st.nextToken()); // 물건 당 무게 W
      items[i][1] = Integer.parseInt(st.nextToken()); // 물건 당 가치 V
    }
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= K; j++) {
        if (items[i][0] > j) {
          dp[i][j] = dp[i - 1][j];
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items[i][0]] + items[i][1]);
        }
      }
    }
    System.out.println(dp[N][K]);
    br.close();
  }
}
