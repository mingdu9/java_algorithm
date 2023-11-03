import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> queue = new LinkedList<>();
        IntStream.range(0, bridge_length).forEach(i -> queue.add(0));
        int total = 0, index = 0;
        while (index < truck_weights.length) {
            int truck = truck_weights[index];
            total -= queue.poll();
            time++;
            if (total + truck <= weight) {
                queue.offer(truck);
                total += truck;
                index++;
            } else {
                queue.offer(0);
            }
        }

        return time + bridge_length;
    }
}