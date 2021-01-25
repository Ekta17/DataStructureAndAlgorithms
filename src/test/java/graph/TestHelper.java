package graph;

import java.util.ArrayList;
import java.util.List;

public interface TestHelper {

	public default Graph createUndirectedCyclicGraph(){
		List<Node> nodes = new ArrayList<>();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Graph g = new Graph(5);
		g.nodes.add(n1);
		g.nodes.add(n2);
		g.nodes.add(n3);
		g.nodes.add(n4);
		g.nodes.add(n5);

		//1:2,3
		//2:1,3
		//3:1,2,4
		//4:5
		//5:4
		g.addEdge(n1, n2, false);
		g.addEdge(n1, n3, false);
		g.addEdge(n2, n3, false);
		g.addEdge(n3, n4, false);
		g.addEdge(n4, n5, false);
		return g;
	}

	public default Graph createUndirectedAcyclicGraph(){
		List<Node> nodes = new ArrayList<>();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Graph g = new Graph(5);
		g.nodes.add(n1);
		g.nodes.add(n2);
		g.nodes.add(n3);
		g.nodes.add(n4);
		g.nodes.add(n5);

		//1:2,3
		//2:1
		//3:1,4
		//4:5
		//5:4
		g.addEdge(n1, n2, false);
		g.addEdge(n1, n3, false);
		g.addEdge(n3, n4, false);
		g.addEdge(n4, n5, false);
		return g;
	}

	public default Graph createDirectedAcyclicGraph(){
		List<Node> nodes = new ArrayList<>();
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(4);

		Graph g = new Graph(5);
		g.nodes.add(n1);
		g.nodes.add(n2);
		g.nodes.add(n3);
		g.nodes.add(n4);
		g.nodes.add(n5);

		//0:1
		//1:2
		//2:3
		//3:4
		g.addEdge(n1, n2, true);
		g.addEdge(n2, n3, true);
		g.addEdge(n3, n4, true);
		g.addEdge(n4, n5, true);

		return g;
	}

	public default Graph createDirectedCyclicGraph(){
		List<Node> nodes = new ArrayList<>();
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(4);

		Graph g = new Graph(5);
		g.nodes.add(n1);
		g.nodes.add(n2);
		g.nodes.add(n3);
		g.nodes.add(n4);
		g.nodes.add(n5);

		//0:1
		//1:2
		//2:0
		//3:0
		//4:1
		g.addEdge(n1, n2, true);
		g.addEdge(n2, n3, true);
		g.addEdge(n3, n1, true);
		g.addEdge(n4, n1, true);
		g.addEdge(n5, n2, true);

		return g;
	}
}
