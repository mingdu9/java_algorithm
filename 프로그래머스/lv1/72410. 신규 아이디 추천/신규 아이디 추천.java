class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.\\w]|", "");
        answer = answer.replaceAll("\\.+", ".");
        answer = answer.replaceAll("^\\.|\\.$", "");
        if (answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("^\\.|\\.$", "");
        }
        if (answer.length() == 0)
            answer = "a";
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                String tmp = answer.substring(answer.length() - 1, answer.length());
                answer = answer + tmp;
            }
        }
        return answer;
    }
}