package graph.sorting;

import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

	public List<Node> sort(Graph g) {

		Stack<Node> sortedNodes = new Stack<>();

		for (int i = 0; i < g.nodes.size(); i++) {
			visitNode(sortedNodes, g.nodes.get(i));
		}

		List<Node> topologicalOrder = new ArrayList<>(sortedNodes.size());
		while (!sortedNodes.isEmpty())
			topologicalOrder.add(sortedNodes.pop());
		return topologicalOrder;
	}

	public void visitNode(Stack<Node> sortedNodes, Node n) {
		if (n.isVisited == false) {
			for(Node child: n.children){
				visitNode(sortedNodes, child);
			}
			n.isVisited = true;
			sortedNodes.push(n);
		}
	}
}
