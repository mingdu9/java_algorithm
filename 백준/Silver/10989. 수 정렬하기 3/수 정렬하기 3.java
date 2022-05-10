import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int c = Integer.parseInt(br.readLine());
    int[] arr = new int[10001];
    for(int i=0;i<c;i++){
      arr[Integer.parseInt(br.readLine())]++;
    }
    for(int i=0;i<arr.length;i++){
      while(arr[i] > 0){
        bw.write(i+"\n");
        arr[i]--;
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}