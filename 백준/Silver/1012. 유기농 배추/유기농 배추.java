import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int m, n, k;
  static int count;
  static int[][] cabbage;
  static boolean[][] visited;
  static int[] dx = {0, -1, 0, 1};
  static int[] dy = {1, 0, -1, 0};
  static void bfs(int x, int y){
    Queue<int[]> q = new LinkedList<int[]>();
    q.add(new int[]{x, y});
    while(!q.isEmpty()){
      x = q.peek()[0];
      y = q.peek()[1];
      visited[x][y] = true;
      q.poll();
      for(int i=0;i<4;i++){
        int xx = x + dx[i];
        int yy = y + dy[i];
        if(xx >= 0 && yy >= 0 && xx < m && yy <n){
          if(!visited[xx][yy] && cabbage[xx][yy] == 1){
            q.add(new int[] {xx, yy});
            visited[xx][yy] = true;
          }
        }
      }
    }
  }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int t = Integer.parseInt(br.readLine());
    while(t > 0){
      st = new StringTokenizer(br.readLine());
      m = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      cabbage = new int[m][n];
      visited = new boolean[m][n];
      count = 0;
      for(int i=0;i<k;i++){
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        cabbage[x][y] = 1;
      }
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          if(cabbage[i][j] == 1 && !visited[i][j]){
            bfs(i,j);
            count++;
          }
        }
      }
      System.out.println(count);
      t--;
    }
  }
}
