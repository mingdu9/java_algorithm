import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String a[] = Integer.toBinaryString(n).split("");
    int result = 0;
    for(String s : a){
      if(s.equals("1")){
        result++;
      }
    }
    System.out.println(result);
  }
}