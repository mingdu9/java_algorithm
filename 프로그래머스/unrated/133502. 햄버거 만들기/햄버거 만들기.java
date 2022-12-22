import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int e : ingredient) {
			stack.push(e);
			if (stack.size() > 3) {
				if (stack.get(stack.size() - 1) == 1 &&
						stack.get(stack.size() - 2) == 3 &&
						stack.get(stack.size() - 3) == 2 &&
						stack.get(stack.size() - 4) == 1) {
					result++;
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
				}
			}
		}
		return result;
    }
}