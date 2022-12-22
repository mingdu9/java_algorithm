class Solution {
    public int solution(String s) {
        int result = 0;
		char letter = s.charAt(0);
		int sameCount = 1;
		int diffCount = 0;
		for (int i = 1; i < s.length(); i++) {
			if(letter == ' '){
				letter = s.charAt(i);
			}
			if (letter == s.charAt(i))
				sameCount++;
			else
				diffCount++;
			if (sameCount == diffCount) {
				result++;
				sameCount = 0;
				diffCount = 0;
				letter = ' ';
			}
		}
		if (letter != ' ') result++;
		return result;
    }
}