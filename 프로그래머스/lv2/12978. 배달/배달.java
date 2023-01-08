import java.util.*;
class Solution {
    static class Node implements Comparable<Node> {
		int index;
		int dist;

		Node(int index, int dist) {
			this.index = index;
			this.dist = dist;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.dist, o.dist);
		}
	}

	public static int solution(int N, int[][] road, int K) {
		int count = 0;
		ArrayList<Node>[] list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			list[i] = new ArrayList<>();
		for (int i = 0; i < road.length; i++) {
			list[road[i][0]].add(new Node(road[i][1], road[i][2]));
			list[road[i][1]].add(new Node(road[i][0], road[i][2]));
		}
		boolean[] check = new boolean[N + 1];
		int[] dists = new int[N + 1];
		int INF = 1000000;
		Arrays.fill(dists, INF);
		dists[1] = 0;
		PriorityQueue<Node> queue = new PriorityQueue<>();
		queue.offer(new Node(1, dists[1]));
		while (!queue.isEmpty()) {
			int current = queue.poll().index;
			if (check[current])
				continue;
			check[current] = true;
			for (Node next : list[current]) {
				if (dists[next.index] > dists[current] + next.dist) {
					dists[next.index] = dists[current] + next.dist;
					queue.offer(new Node(next.index, dists[next.index]));
				}
			}
		}
		for (int dist : dists) {
			if (dist <= K)
				count++;
		}
		return count;
	}
}