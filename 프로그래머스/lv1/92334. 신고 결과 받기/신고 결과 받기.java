import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 신고된사람 / 신고한사람들
		Map<String, HashSet<String>> reported = new HashMap<>();
		List<String> users = Arrays.asList(id_list);
        // map에 신고된 사람 이름 넣기
		for (String reporter : id_list) {
			HashSet<String> reportedUsers = new HashSet<>();
			reported.put(reporter, reportedUsers);
		}
        // 신고한 사람 추가
		for (String info : report) {
			String reporter = info.split(" ")[0];
			String reportedUser = info.split(" ")[1];
			reported.get(reportedUser).add(reporter);
		}
        // 메일 수 더하기
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