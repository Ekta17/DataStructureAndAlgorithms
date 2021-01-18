package graph.search;

import graph.Node;

public class Util {
	public static boolean compareWithKey(Node n, int key){
		System.out.println("Node data ="+n.data);
		if(n.data == key)
			return true;
		return false;
	}
}
