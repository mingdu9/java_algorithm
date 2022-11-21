class Solution {
    public static boolean check(int num){
        boolean check = true;
        if(num == 2) return true;
        for(int i=2;i<num;i++)
            if(num % i == 0) 
                return !check;
        return check;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        boolean check = false;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(check(sum)) answer++;
                }
            }
        }
        
        return answer;
    }
    
    
}