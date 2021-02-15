package graph.randomquestions;

import graph.Graph;
import graph.Node;

public class DetectCycleInDirectedGraph {

	public boolean isGraphCyclic(Graph graph){
		boolean[] recursionStack = new boolean[graph.nodes.size()];
		for(Node n: graph.nodes) {
			if (isCyclic(n, recursionStack))
				return true;
		}
		return false;
	}

	private boolean isCyclic(Node n, boolean[] recursionStack){
		if(recursionStack[n.data] == true)
			return true;
		if(n.isVisited == true)
			return false;

		n.isVisited= true;
		recursionStack[n.data] = true;

		for(Node child: n.children){
			if(isCyclic(child, recursionStack))
				return true;
		}

		recursionStack[n.data] = false;
		return false;
	}
}
