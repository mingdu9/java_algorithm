import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        	Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int head1 = getHead(o1);
				int head2 = getHead(o2);
				int headCompare = o1.substring(0, head1).compareToIgnoreCase(o2.substring(0, head2));
				if (headCompare == 0) {
					if (head1 >= o1.length() || head2 >= o2.length()) {
						return headCompare;
					} else {
						String tail1 = o1.substring(head1, o1.length());
						String tail2 = o2.substring(head2, o2.length());
						Integer num1 = Integer.parseInt(
								getNumber(tail1).replaceAll("[\\D|\\s]", ""));
						int num2 = Integer.parseInt(
								getNumber(tail2).replaceAll("[\\D|\\s]", ""));
						return num1.compareTo(num2);
					}
				} else {
					return headCompare;
				}
			}
		});
		return files;
	}

	public static int getHead(String file) {
		int i;
		for (i = 0; i < file.length(); i++) {
			if (file.charAt(i) >= '0' && file.charAt(i) <= '9')
				break;
		}
		return i;
	}

	public static String getNumber(String file) {
		int i;
		for (i = 0; i < file.length(); i++) {
			if (Character.isLetter(file.charAt(i)))
				break;
		}
		if (i >= 5)
			return file.substring(0, 5);
		if (i == 0)
			return file;
		return file.substring(0, i);
	}
}