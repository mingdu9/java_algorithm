import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    if(n==3||n==1) System.out.println("SK");
    else if(n%2==0) System.out.println("CY");
    else System.out.println("SK");
    br.close();
  }
}