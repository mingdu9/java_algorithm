import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mush = new int[10];
    int sum = 0;
    for(int i=0;i<mush.length;i++){
      mush[i] = Integer.parseInt(br.readLine());
    }
    for(int i=0;i<mush.length;i++){
      if(sum+mush[i]==100){
        sum += mush[i];
        break;
      }else if(sum+mush[i]>100){
        if((100-sum) >= Math.abs(100-(sum+mush[i]))){
          sum+=mush[i];
          break;
        }else{
          break;
        }
      }else{
        sum+=mush[i];
      }
    }
    System.out.println(sum);
    br.close();
  }
}
