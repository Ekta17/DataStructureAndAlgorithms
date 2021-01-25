package graph.randomquestions;

import graph.Graph;
import graph.Node;

public class DetectCycleInGraph {

	public boolean isGraphCyclic(Graph graph){
		for(Node n: graph.nodes) {
			if (n.isVisited == false) {
				return dfs(n, -1);
			}
		}
		return false;
	}

	private boolean dfs(Node n, int parent){
		n.isVisited= true;
		for(Node child: n.children){
			if(child.isVisited == false){
				return dfs(child, n.data);
			}else if(child.isVisited && child.data != parent)
				return true;
		}
		return false;
	}

}
