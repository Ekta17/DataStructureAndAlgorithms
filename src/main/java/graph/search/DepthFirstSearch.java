package graph.search;

import graph.Graph;
import graph.Node;

public class DepthFirstSearch {
	public boolean search(Graph graph, int key) {
		for (Node n : graph.nodes) {
			if (!n.isVisited)
				return search(n, key);
		}
		return false;
	}

	private boolean search(Node n, int key) {
		if (n == null)
			return false;
		if (Util.compareWithKey(n, key))
			return true;
		n.isVisited = true;
		for (Node child : n.children)
			if(!child.isVisited)
				return search(child, key);

		return false;
	}
}
