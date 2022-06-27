class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] count = new int[2];
        
        for(int i=0;i<6;i++){
            if(lottos[i] == 0){
                count[0]++;
                continue;
            }
            for(int j=0;j<6;j++){
                if(lottos[i] == win_nums[j]){
                    count[0]++;
                    count[1]++;
                }
            }
        }
        
        for(int i=0;i<2;i++){
            switch(count[i]){
                case 6: answer[i] = 1; break;
                case 5: answer[i] = 2; break;
                case 4: answer[i] = 3; break;
                case 3: answer[i] = 4; break;
                case 2: answer[i] = 5; break;
                default: answer[i] = 6; break;
            }
        }
        return answer;
    }
}