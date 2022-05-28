import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = n;
    for(int k=0;k<n;k++){
      char[] ch = br.readLine().toCharArray();
      ArrayList<Character> list = new ArrayList<>();
      list.add(ch[0]);
      for(int i=1;i<ch.length;i++){
        if(list.get(list.size()-1)!=ch[i]){
          if(list.contains(ch[i])) {count--; break;}
          else {list.add(ch[i]);continue;}
        }
      }
    }
    System.out.println(count);
    br.close();
  }
}