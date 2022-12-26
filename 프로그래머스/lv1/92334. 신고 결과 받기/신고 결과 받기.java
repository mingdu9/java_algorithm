import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
		Map<String, HashSet<String>> reported = new HashMap<>();
		List<String> users = Arrays.asList(id_list);
		for (String reporter : id_list) {
			HashSet<String> reportedUsers = new HashSet<>();
			reported.put(reporter, reportedUsers);
		}
		for (String info : report) {
			String reporter = info.split(" ")[0];
			String reportedUser = info.split(" ")[1];
			reported.get(reportedUser).add(reporter);
		}
		for (String reportedUser : users) {
			if (reported.get(reportedUser).size() >= k) {
				for (String reporter : reported.get(reportedUser)) {
					answer[users.indexOf(reporter)]++;
				}
			}
		}
		return answer;
    }
}