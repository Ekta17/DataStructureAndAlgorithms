package graph.traversal;

import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreathFirstTraversal {

	public List<Integer> traverse(Graph g){
		List<Integer> bfs = new ArrayList<>(g.nodes.size());

		for(Node n: g.nodes) {
			if(n.isVisited == false)
				traverse(n, bfs);
		}

		return bfs;
	}

	public void traverse(Node n, List<Integer> bfs){
		Queue<Node> queue = new LinkedList<>();
		n.isVisited = true;
		queue.add(n);

		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			bfs.add(temp.data);
			for(Node child: temp.children){
				if(child.isVisited==false) {
					child.isVisited = true;
					queue.add(child);
				}
			}
		}
	}
}
