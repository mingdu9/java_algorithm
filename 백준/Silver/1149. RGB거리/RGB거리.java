import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int color;
    int[][] arr = new int[n][3];
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
      arr[i][2] = Integer.parseInt(st.nextToken());
    }
    for(int i=1;i<n;i++){
      arr[i][0] += Integer.min(arr[i-1][1], arr[i-1][2]);
      arr[i][1] += Integer.min(arr[i-1][0], arr[i-1][2]);
      arr[i][2] += Integer.min(arr[i-1][0], arr[i-1][1]);
    }
    System.out.println(Integer.min(Integer.min(arr[n-1][0], arr[n-1][1]), arr[n-1][2]));
    br.close();
  }
}