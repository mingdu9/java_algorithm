import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    boolean chk;
    int resV = 0, resH = 0;
    char[][] arr = new char[n][m];
    for(int i=0;i<n;i++){
      arr[i] = br.readLine().toCharArray();
    }
    for(int i=0;i<n;i++){
      chk = false;
      for(int j=0;j<m;j++){
        if(arr[i][j] == 'X'){
          chk = true;
          break;
        }
      }
      if(!chk){
        resH++;
      }
    }
    for(int i=0;i<m;i++){
      chk = false;
      for(int j=0;j<n;j++){
        if(arr[j][i] == 'X'){
          chk = true;
          break;
        }
      }
      if(!chk){
        resV++;
      }
    }
    System.out.println((resH >= resV)? resH : resV);
    br.close();
  }
}
