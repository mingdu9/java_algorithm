class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
		int x, y, z;
		String op;
		for (int i = 0; i < quiz.length; i++) {
			String[] arr = quiz[i].split(" ");
			x = Integer.parseInt(arr[0]);
			op = arr[1];
			y = Integer.parseInt(arr[2]);
			z = Integer.parseInt(arr[4]);
			if (op.equals("+") && x + y == z)
				answer[i] = "O";
			else if (op.equals("-") && x - y == z)
				answer[i] = "O";
			else
				answer[i] = "X";
		}
		return answer;
    }
}