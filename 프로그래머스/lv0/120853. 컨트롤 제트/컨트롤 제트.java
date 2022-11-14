import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z") && stack.size() > 0) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        while (stack.size() > 0) {
            answer += stack.pop();
        }
        return answer;
    }
}