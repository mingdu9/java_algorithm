import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a, b, c;
    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());
    c = Long.parseLong(st.nextToken());
    if(b >= c){
      System.out.println("-1");
      System.exit(0);
    }else{
      long result = (long) Math.ceil(a / (c - b));
      System.out.println(result+1);
    }
  }
}
