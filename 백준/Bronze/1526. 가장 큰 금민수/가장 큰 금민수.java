import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean chk;
		String str = br.readLine();
    while(true){
      chk = true;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i) != '4' && str.charAt(i) != '7'){
          chk = false;
          break;
        }
      }
      if(chk == true) break;
      else str = String.valueOf(Integer.parseInt(str) - 1);
    }
    System.out.println(str);
    br.close();
  }
}
