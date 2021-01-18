package trees.search;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int data;
	List<Node> children;
	boolean visited;

	Node(int data) {
		this.data = data;
		children = new ArrayList<>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Node data =").append(this.data);
		sb.append("Node visited ?").append(this.visited);
		for (int i = 0; children != null && i < children.size(); i++)
			sb.append(" child (").append(i).append(") =").append(children.get(i).data);

		return sb.toString();
	}
}
