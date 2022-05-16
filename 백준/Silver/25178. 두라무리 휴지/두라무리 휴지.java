import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String a = br.readLine();
    String b = br.readLine();
    char[] arr = a.toCharArray();
    char[] arr2 = b.toCharArray();
    if(arr[0] != arr2[0] || arr[n-1] != arr2[n-1]){
      System.out.println("NO");
      System.exit(0);
    }
    a = a.replaceAll("[aeiou]", "");
    b = b.replaceAll("[aeiou]", "");
    if(!a.equals(b)){
      System.out.println("NO");
      System.exit(0);
    }
    Arrays.sort(arr);
    Arrays.sort(arr2);
    for(int i=0;i<n;i++){
      if(arr[i]!=arr2[i]){
        System.out.println("NO");
        System.exit(0);
      }
    }
    System.out.println("YES");
  }
}