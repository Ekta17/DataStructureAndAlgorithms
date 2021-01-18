package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public int data;
	public List<Node> children;
	public boolean isVisited;

	Node(int data) {
		this.data = data;
		children = new ArrayList<>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Node data =").append(this.data);
		sb.append("Node visited ?").append(this.isVisited);
		for (int i = 0; children != null && i < children.size(); i++)
			sb.append(" child (").append(i).append(") =").append(children.get(i).data);

		return sb.toString();
	}
}
