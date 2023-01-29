import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority: priorities)
            queue.add(priority);
        
        while(!queue.isEmpty()){
            // 모든 문서가 프린트될 떄까지
            for(int i=0;i<priorities.length;i++) {
                if(priorities[i] == queue.peek()){
                    // 원래 순서대로 poll, 카운터 증가
                    answer++;
                    if(i == location)
                        return answer;
                    queue.poll();
                }
            }
        }
        return answer;
    }
}