import java.util.*;
class Solution {
    public String solution(String s) {
StringTokenizer st = new StringTokenizer(s, " ", true);
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			String str = st.nextToken().toLowerCase();
			if (str.startsWith(" ") || Character.isDigit(str.charAt(0)))
				sb.append(str);
			else
				sb.append((char) (str.charAt(0) - 32)).append(str.substring(1));
		}
		return sb.toString();
    }
}