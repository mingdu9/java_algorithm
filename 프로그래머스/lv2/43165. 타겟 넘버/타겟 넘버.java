class Solution {
        int count = 0;
        public int solution(int[] numbers, int target) {
            target(0, numbers, target, 0);
            return this.count;
        }

        public void target(int depth, int[] numbers, int target, int num) {
            if (depth == numbers.length) {
                if (num == target)  this.count++;
                return;
            }
            
            int plus = num + numbers[depth];
            int minus = num - numbers[depth];

            target(depth + 1, numbers, target, plus);
            target(depth + 1, numbers, target, minus);
        }
}