class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] prev = new char[m][];
    int answer = 0;
    // string -> char
    for (int i = 0; i < board.length; i++) {
      prev[i] = board[i].toCharArray();
    }
    // 지워질 수 있는 블록이 없을 떄 까지
    while (true) {
      // 블록이 삭제된 버전?의 배열
      char[][] next = new char[m][];
      for (int i = 0; i < m; i++) {
        next[i] = prev[i].clone();
      }

      boolean flag = false;
      for (int i = 0; i < m - 1; i++) {
        for (int j = 0; j < n - 1; j++) {
          char target = prev[i][j];
          // 공백이 아니고 2x2 블록이 있을 때
          if (target != '-'
              && target == prev[i + 1][j]
              && target == prev[i][j + 1]
              && target == prev[i + 1][j + 1]) {
            // 공백으로
            next[i][j] = next[i + 1][j] = next[i][j + 1] = next[i + 1][j + 1] = '-';
            // 체크
            flag = true;
          }
        }
      }
      // 블록 삭제 안된 경우 끝
      if (!flag) {
        break;
      }
      // 삭제된 블록 개수 파악
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (prev[i][j] != next[i][j]) {
            answer++;
          }
        }
      }
      // 블록 내리기
      for (int i = 0; i < n; i++) {
        int blank = m - 1;
        while (true) {
          while (blank >= 0 && next[blank][i] != '-') {
            blank--;
          }
          int block = blank;
          while (block >= 0 && next[block][i] == '-') {
            block--;
          }
          if (block < 0) {
            break;
          }
          next[blank][i] = next[block][i];
          next[block][i] = '-';
        }
      }
      prev = next;
    }
    return answer;
    }
}