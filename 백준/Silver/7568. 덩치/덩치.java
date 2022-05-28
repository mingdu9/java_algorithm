import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int[][] s = new int[n][2];
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      s[i][0] = Integer.parseInt(st.nextToken());
      s[i][1] = Integer.parseInt(st.nextToken());
    }
    for(int i=0;i<n;i++){
      int rank = 1;
      for(int j=0;j<n;j++){
        if(i == j) continue;
        if(s[i][0] < s[j][0] && s[i][1] < s[j][1]){
          rank++;
        }
      }
      System.out.printf("%d ", rank);
    }
  }
}