package trees.binarytree;

import java.util.*;

public class Traversal {

	public void inorder(TreeNode root, List<Integer> arr) {
		if (root != null) {
			inorder(root.left, arr);
			arr.add(root.val);
			inorder(root.right, arr);
		}
	}

	public void preorder(TreeNode root, List<Integer> arr) {
		if (root != null) {
			arr.add(root.val);
			preorder(root.left, arr);
			preorder(root.right, arr);
		}
	}

	public void postorder(TreeNode root, List<Integer> arr) {
		if (root != null) {
			postorder(root.left, arr);
			postorder(root.right, arr);
			arr.add(root.val);
		}
	}

	public List<Integer> levelOrderOrBreadthFirst(TreeNode root, LinkedList<TreeNode> queue) {
		List<Integer> listOfNodes = new ArrayList<>();
		if (root == null)
			return listOfNodes;
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			listOfNodes.add(temp.val);
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
		return listOfNodes;
	}

	Optional<List<List<Integer>>> getLevelOrderBreadthFirstTraversal(TreeNode root) {
		if (root == null)
			return Optional.empty();

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		List<List<Integer>> allLevelList = new ArrayList<>();
		while (!queue.isEmpty()) {
			int currentLevelSize = queue.size();
			List<Integer> currentLevelNodes = new ArrayList<>();
			for(int i=0; i< currentLevelSize; i++){
				TreeNode n = queue.poll();
				if(n!=null){
					currentLevelNodes.add(n.val);
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
