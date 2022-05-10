public class Main {
  static int d(int n){
    int sum = n;
    while(n > 0){
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
	public static void main(String[] args) {
    int[] arr = new int[10001];
    for(int i=1;i<=10000;i++){
      int tmp = d(i) < 10000 ? d(i) : 0;
      arr[tmp]++;
    }
    for(int i=1;i<=9999;i++){
      System.out.print(arr[i]>0 ? "" : i+"\n");
    }
  }
}