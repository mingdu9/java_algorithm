class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String tmp = A;
        for (int i = 0; i < A.length(); i++) {
            if (tmp.equals(B)) return answer;
            String a = tmp.substring(A.length() - 1);
            tmp = a + tmp.substring(0, tmp.length() - 1);
            answer++;
        }
        return -1;
    }
}