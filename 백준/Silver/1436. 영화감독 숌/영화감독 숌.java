import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int six = 666;
    int c = 1;
    int N = Integer.parseInt(br.readLine());
    while(c != N){
      six++;
      if(String.valueOf(six).contains("666")) c++;
    }
    System.out.println(six);
    br.close();
  }
}