class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i=1;i<=s.length()/2;i++){
            StringBuilder result = new StringBuilder();
            int count = 1;
            String target = s.substring(0, i);
            for(int j=i;j<=s.length();j+=i){
                String next = s.substring(j, (j+i > s.length()) ? s.length() : j+i);
                if(next.equals(target)) count++;
                else{
                    result.append((count!=1 ? count : "") + target);
                    target = next;
                    count = 1;
                }
            }
            result.append(target);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}