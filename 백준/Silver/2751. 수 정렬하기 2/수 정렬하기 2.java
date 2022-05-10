import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    List<Integer> arr = new ArrayList<>();
    int c = Integer.parseInt(br.readLine());
    for(int i=0;i<c;i++){
      arr.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(arr);
    for(int i=0;i<c;i++){
      bw.write(arr.get(i)+"\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}