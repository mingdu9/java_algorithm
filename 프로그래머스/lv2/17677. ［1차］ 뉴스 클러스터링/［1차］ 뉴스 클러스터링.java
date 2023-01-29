import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
    int answer = 65536;
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    ArrayList<String> a = new ArrayList<>();
    ArrayList<String> b = new ArrayList<>();

    ArrayList<String> cup = new ArrayList<>(); // 합집합
    ArrayList<String> cap = new ArrayList<>(); // 교집합

    makeSet(str1, a);
    makeSet(str2, b);

    for(String str : a) {
      if (b.contains(str)){
        cap.add(str);
        b.remove(str);
      }
      cup.add(str);
    }
    cup.addAll(b);

    if(cup.isEmpty()) return answer;
    double num = (double) cap.size() / (double) cup.size();
    return (int) (answer * num);
  }

  private void makeSet(String str, ArrayList<String> list) {
    for(int i=0;i<str.length()-1;i++){
      char c1 = str.charAt(i);
      char c2 = str.charAt(i+1);
      if(Character.isLetter(c1) && Character.isLetter(c2))
        list.add(c1 + String.valueOf(c2));
    }
  }
}