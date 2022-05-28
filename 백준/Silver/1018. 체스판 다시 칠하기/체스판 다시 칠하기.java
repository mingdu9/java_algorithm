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
    char[][] board = new char[n][m];
    int count = 64;
    for(int i=0;i<n;i++){
      char[] input = br.readLine().toCharArray();
      for(int j=0;j<m;j++){
        board[i][j] = input[j];
      }
    }
    for(int i=0;i<n-7;i++){
      for(int j=0;j<m-7;j++){
        count = Math.min(count, find(i,j, board));
      }
    }
    System.out.println(count);
  }
  public static int find(int x, int y, char[][] board){
    int countB = 0;
    int countW = 0;
    for(int i=x;i<x+8;i++){
      for(int j=y;j<y+8;j++){
        if((i+j) % 2 == 0){
          if(board[i][j] == 'B') countW++;
          else countB++;
        }else{
          if(board[i][j] == 'W') countW++;
          else countB++;
        }
      }
    }
    return Math.min(countB, countW);
  }
}
