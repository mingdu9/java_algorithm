import java.util.*;
class Solution {
    public int solution(int n) {
        String str1 = Integer.toBinaryString(n);
        int one1 = str1.length() - str1.replace("1", "").length();
        while(true) {
            n++;
            String str2 = Integer.toBinaryString(n);
            int one2 = str2.length() - str2.replace("1", "").length();
            if(one1 == one2) break;
        }
        return n;
    }
}