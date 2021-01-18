package trees.search;

import java.util.ArrayList;
import java.util.List;

public interface TestHelper {

	public default Graph createGraph(){
		List<Node> nodes = new ArrayList<>();
		Node n1 = new Node(5);
		Node n2 = new Node(3);
		Node n3 = new Node(0);
		Node n4 = new Node(9);
		Node n5 = new Node(7);
		Node n6 = new Node(1);
		Node n7 = new Node(2);
		Graph g = new Graph(7);
		g.nodes.add(n1);
		g.nodes.add(n2);
		g.nodes.add(n3);
		g.nodes.add(n4);
		g.nodes.add(n5);
		g.nodes.add(n6);
		g.nodes.add(n7);

		//0:2,3
		//1:2
		//2:0,1,3
		//3:0,2,5,7
		//5:3,7
		//7:3,5,9
		//9:7
		g.addEdge(n3, n7);
		g.addEdge(n3, n2);
		g.addEdge(n6, n7);
		g.addEdge(n7, n2);
		g.addEdge(n2, n1);
		g.addEdge(n2, n5);
		g.addEdge(n1, n5);
		g.addEdge(n5, n4);

		return g;
	}
}
