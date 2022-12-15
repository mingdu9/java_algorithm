class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		char[] arr = s.toCharArray();
		boolean check;
		for (int i = 0; i < arr.length; i++) {
			check = true;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] == arr[i]) {
					answer[i] = i - j;
					check = false;
					break;
				}
			}
			if (check) {
				answer[i] = -1;
			}
		}
		return answer;
    }
}