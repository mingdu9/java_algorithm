import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
    char[][] arr = new char[n][n];
    int chkH, chkV;
    int ver=0, hor=0;

    for(int i=0;i<n;i++){
      arr[i] = br.readLine().toCharArray();
    }

    for(int i=0;i<n;i++){
      chkH = 0;
      chkV = 0;
      for(int j=0;j<n;j++){
        if(arr[i][j] == '.') chkH++;
        if(arr[i][j] == 'X' || j == n-1){
          if(chkH >= 2){
            hor++;
          }
          chkH = 0;
        }

        if(arr[j][i] == '.') chkV++;
        if(arr[j][i] == 'X' || j == n-1){
          if(chkV >= 2){
            ver++;
          }
          chkV = 0;
        }
      }
    }

    System.out.println(hor +" "+ ver);
  }
}
