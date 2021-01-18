package trees.search;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

	public boolean search(Graph graph, int key) {
		for (Node n : graph.nodes) {
			if (!n.visited)
				return search(n, key);
		}
		return false;
	}

	public boolean search(Node n, int key) {
		Queue<Node> queue = new LinkedList<>();
		n.visited = true;
		queue.add(n);

		while (!queue.isEmpty()) {
			Node i = queue.poll();
			if (Util.compareWithKey(i, key))
				return true;
			for (Node child : i.children) {
				if (!child.visited) {
					child.visited = true;
					queue.add(child);
				}
			}
		}
		return false;
	}
}
