package graph.traversal;

import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstTraversal {

	public List<Integer> traverse(Graph g){
		List<Integer> dfs = new ArrayList<>(g.nodes.size());
		for(Node n: g.nodes){
			if(n.isVisited==false)
				traverse(n,dfs);
		}
		return dfs;
	}

	public void traverse(Node n, List<Integer> dfs){
		if(n==null)
			return;
		n.isVisited = true;
		dfs.add(n.data);
		for(Node child: n.children){
			if(child.isVisited==false) {
				traverse(child, dfs);
			}
		}
	}
}
