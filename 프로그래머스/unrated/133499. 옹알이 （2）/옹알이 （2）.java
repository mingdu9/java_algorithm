class Solution {
    public int solution(String[] babbling) {
        String[] ong = { "aya", "ye", "woo", "ma" };
		boolean flag;
		int count = 0;
		for (int i = 0; i < babbling.length; i++) {
			flag = true;
			for (int j = 0; j < ong.length; j++) {
				babbling[i] = babbling[i].replace(ong[j] + ong[j], "Z");
				babbling[i] = babbling[i].replace(ong[j], "X");
			}
			for (int k = 0; k < babbling[i].length(); k++) {
				if (babbling[i].charAt(k) != 'X')
					flag = false;
			}
			if (flag)
				count++;
		}
		return count;
    }
}