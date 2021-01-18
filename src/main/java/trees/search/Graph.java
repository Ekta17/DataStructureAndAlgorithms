package trees.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
public class Graph {
	public List<Node> nodes;

	Graph(){
		nodes = new ArrayList<>();
	}

	Graph(int n){
		nodes = new ArrayList<>(n);
	}

	public void addEdge(Node n1, Node n2){
		n1.children.add(n2);
		n2.children.add(n1);
	}
}
