import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] list = input.split("");
    int count = list.length;
    for(int i=0;i<list.length;i++){
      if(i <= list.length - 2){
        if(list[i].equals("c"))
          if(list[i+1].equals("=") || list[i+1].equals("-")){ 
            count--;
            i++;
          }
        if(list[i].equals("l") && list[i+1].equals("j")){ 
            count--;
            i++;
          }
        if(list[i].equals("n") && list[i+1].equals("j")){ 
            count--;
            i++;
          }
        if(list[i].equals("s") && list[i+1].equals("=")){ 
            count--;
            i++;
          }
        if(list[i].equals("z") && list[i+1].equals("=")){ 
            count--;
            i++;
          }
        if(list[i].equals("d")){
          if(i <= list.length - 3)
            if(list[i+1].equals("z") && list[i+2].equals("=")){ 
            count-=2;
            i+=2;
          }
          if(i <= list.length - 2 && list[i+1].equals("-")){ 
            count--;
            i++;
          }
        }
      }
    }
    System.out.println(count);
    br.close();
  }
}