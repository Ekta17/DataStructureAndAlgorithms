package trees.binarytree;

import java.util.*;

public class Traversal {

	void inorder(Node root, List<Integer> arr) {
		if (root != null) {
			inorder(root.left, arr);
			arr.add(root.data);
			inorder(root.right, arr);
		}
	}

	void preorder(Node root, List<Integer> arr) {
		if (root != null) {
			arr.add(root.data);
			preorder(root.left, arr);
			preorder(root.right, arr);
		}
	}

	void postorder(Node root, List<Integer> arr) {
		if (root != null) {
			postorder(root.left, arr);
			postorder(root.right, arr);
			arr.add(root.data);
		}
	}

	List<Integer> levelOrderOrBreadthFirst(Node root, LinkedList<Node> queue) {
		List<Integer> listOfNodes = new ArrayList<>();
		if (root == null)
			return listOfNodes;
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			listOfNodes.add(temp.data);
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
		return listOfNodes;
	}

	Optional<List<List<Integer>>> getLevelOrderBreadthFirstTraversal(Node root) {
		if (root == null)
			return Optional.empty();

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		List<List<Integer>> allLevelList = new ArrayList<>();
		while (!queue.isEmpty()) {
			int currentLevelSize = queue.size();
			List<Integer> currentLevelNodes = new ArrayList<>();
			for(int i=0; i< currentLevelSize; i++){
				Node n = queue.poll();
				if(n!=null){
					currentLevelNodes.add(n.data);
					queue.add(n.left);
					queue.add(n.right);
				}
			}
			if(!currentLevelNodes.isEmpty())
				allLevelList.add(currentLevelNodes);
		}
		return Optional.of(allLevelList);
	}
}
