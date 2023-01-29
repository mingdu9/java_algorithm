import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
    for(char ch : s.toCharArray()){
      if (ch == ')') {
        if (stack.isEmpty())
          return false;
        if (stack.pop() != '(')
          return false;
      } else {
        stack.push(ch);
      }
    }
    return stack.isEmpty();
    }
}