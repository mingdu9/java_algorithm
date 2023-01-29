import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority: priorities)
            queue.add(priority);
        
        while(!queue.isEmpty()){
            for(int i=0;i<priorities.length;i++) {
                if(priorities[i] == queue.peek()){
                    if(i == location){
                        answer++;
                        return answer;
                    }
                    answer++;
                    queue.poll();
                }
            }
        }
        return answer;
    }
}