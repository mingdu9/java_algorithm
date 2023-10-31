import java.util.*;
class Solution {
        public static final int SHEEP = 0;
    public static final int WOLF = 1;
    public static int[] INFO;
    public static ArrayList<Integer>[] children;
    public static int max = 0;
    public int solution(int[] info, int[][] edges) {
        INFO = info;
        children = new ArrayList[info.length];
        // 자식 노드
        for(int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            if(children[parent] == null){
                children[parent] = new ArrayList<>();
            }
            children[parent].add(child);
        }
        List<Integer> next = new ArrayList<>();
        next.add(0);

        dfs(0, next, 0, 0);
        return max;
    }

    public static void dfs(int current, List<Integer> next, int sheep, int wolf) {
        // 동물 카운트 세기
        if (INFO[current] == SHEEP) {
            sheep++;
        }
        if (INFO[current] == WOLF) {
            wolf++;
        }
        if (sheep <= wolf) {
            return;
        }
        // 최대 양 개수 구하기
        max = Math.max(max, sheep);
        // 다음 위치
        List<Integer> list = new ArrayList<>(next);
        list.remove(Integer.valueOf(current));
        if(children[current] != null){
            list.addAll(children[current]);
        }
        // 다음 위치의 모든 노드 dfs
        for(int position : list) {
            dfs(position, list, sheep, wolf);
        }
    }
}