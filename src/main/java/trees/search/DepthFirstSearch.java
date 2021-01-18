package trees.search;

public class DepthFirstSearch {
	public boolean search(Graph graph, int key) {
		for (Node n : graph.nodes) {
			if (!n.visited)
				return search(n, key);
		}
		return false;
	}

	private boolean search(Node n, int key) {
		if (n == null)
			return false;
		if (Util.compareWithKey(n, key))
			return true;
		n.visited = true;
		for (Node child : n.children)
			if(!child.visited)
				return search(child, key);

		return false;
	}
}
