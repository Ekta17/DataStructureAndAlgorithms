package graph.randomquestions;

import graph.Graph;
import graph.Node;
import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class ShortestPathInUnweightedGraph {

	public Optional<Pair<Integer, List<Integer>>> getShortestPathFromSource(Graph graph, Node source, Node destination) {
		int[] predecessor = new int [graph.nodes.size()]; //Predecessor of i
		int[] distance = new int [graph.nodes.size()]; //distance of i from source

		if (bfs(graph, source, destination, predecessor, distance) == false)
			return Optional.empty();

		List<Integer> path = new LinkedList<>();
		int crawl = destination.data;
		while (predecessor[crawl] != -1) {
			path.add(crawl);
			crawl = predecessor[crawl];
		}

		Pair<Integer, List<Integer>> shortestPathDetails = new Pair<>(distance[destination.data], path);
		return Optional.of(shortestPathDetails);
	}

	private boolean bfs(Graph graph, Node source, Node destination, int[] predecessor, int[] distance) {
		Queue<Node> queue = new LinkedList<>();

		for(int i =0; i< graph.nodes.size(); i++){
			distance[i] = Integer.MAX_VALUE; //initialize current distance as infinity
			predecessor[i] = -1;
		}

		source.isVisited = true;
		distance[source.data]=0;
		queue.add(source);

		while(!queue.isEmpty()){
			Node n = queue.poll();
			for(Node child: n.children){
				if(child.isVisited == false){
					child.isVisited = true;
					distance[child.data] = distance[n.data] + 1;
					predecessor[child.data] = n.data;
					queue.add(child);

					if(child == destination)
						return true;
				}
			}
		}
		return false;
	}

}
