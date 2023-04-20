import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float result = 0.0F;
    int sum = 0;
    for (int i = 0; i < 20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      Float score = Float.valueOf(st.nextToken());
      String grade = st.nextToken();
      if(grade.equals("P")){
        continue;
      }
      sum += score;
      switch (grade) {
        case "A+": score *= 4.5F; break;
        case "A0": score *= 4.0F; break;
        case "B+": score *= 3.5F; break;
        case "B0": score *= 3.0F; break;
        case "C+": score *= 2.5F; break;
        case "C0": score *= 2.0F; break;
        case "D+": score *= 1.5F; break;
        case "D0": score *= 1.0F; break;
        case "F": score *= 0.0F; break;
      }
      result += score;
    }
    br.close();
    result /= sum;
    System.out.printf("%.6f", result);

  }
}
