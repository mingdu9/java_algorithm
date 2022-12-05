class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10, right = 12;
        int leftDist, rightDist;
        for (int num : numbers) {
            switch (num) {
                case 1:case 4:case 7: sb.append("L"); left = num; break;
                case 3:case 6:case 9: sb.append("R"); right = num; break;
                case 0: num = 11;
                default:
                    leftDist = Math.abs(left - num) / 3 + Math.abs(left - num) % 3;
                    rightDist = Math.abs(right - num) / 3 + Math.abs(right - num) % 3;
                    if (leftDist > rightDist) {
                        sb.append("R"); right = num; break;
                    } else if (leftDist < rightDist) {
                        sb.append("L"); left = num; break;
                    } else if (hand.equals("right")) {
                        sb.append("R"); right = num; break;
                    } else {
                        sb.append("L"); left = num; break;
                    }
            }
        }
        return sb.toString();
    }
}