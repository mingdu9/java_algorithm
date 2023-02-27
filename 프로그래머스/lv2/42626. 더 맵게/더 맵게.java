import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
     int answer = 0;
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int food : scoville) {
      heap.offer(food);
    }
    while (heap.peek() < K) {
      if (heap.size() == 1) {
        return -1;
      }
      int first = heap.poll();
      int second = heap.poll();
      int result = first + (second * 2);
      heap.offer(result);
      answer++;
    }
    return answer;
  }
}