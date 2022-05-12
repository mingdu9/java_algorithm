import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    String y = br.readLine();
    String[] arr = y.split("");
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(Integer.parseInt(arr[i]) * x);
    }
    System.out.println(x * Integer.parseInt(y));
  }
}