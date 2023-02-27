class Solution {
    static int answer = 0;
  static boolean[] visited;
  
  public int solution(int k, int[][] dungeons) {
    visited = new boolean[dungeons.length];
    a(dungeons, k, 0);
    return answer;
  }

  // 해당 던전 방문 했는지
  // 현재 피로도
  // 방문 던전 갯수
  public static void a(int[][] dungeons, int current, int count) {
    for (int i = 0; i < dungeons.length; i++) {
      // 던전 방문 가능한지(최소피로도충족+방문여부)
      if (current >= dungeons[i][0] && !visited[i]) {
        // 방문여부체크
        visited[i] = true;
        // 다음 던전 방문
        a(dungeons, current - dungeons[i][1], count+1);
        // 방문여부초기화(재귀)
        visited[i] = false;
      }
    }
    // 최대방문개수 저장
    answer = Math.max(answer, count);
  }
}