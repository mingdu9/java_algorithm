import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    Stack<Integer> stack = new Stack<>();
    // [1,2,3,2,3]
    for (int i = 0; i < prices.length; i++) {
      // 하락시 전 인덱스의 answer에 시간 결정
      while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
        int down = stack.pop();
        answer[down] = i - down;
      }
      // 상승장일 떄 인덱스를 스택에 저장
      stack.push(i);
    }
    // 끝까지 하락 안한 가격 존재
    while(!stack.isEmpty()){
      int down = stack.pop();
      answer[down] = prices.length - down - 1;
    }
    return answer;
  }
}