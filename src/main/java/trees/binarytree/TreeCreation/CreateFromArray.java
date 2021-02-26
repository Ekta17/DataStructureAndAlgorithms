package trees.binarytree.TreeCreation;

import trees.binarytree.TreeNode;

public class CreateFromArray {

	public TreeNode insertNodes(int[] arr, int index) {
		TreeNode root = null;
		if (index < arr.length) {
			root = new TreeNode(arr[index]);
			root.left = insertNodes(arr, 2 * index + 1);
			root.right = insertNodes(arr, 2 * index + 2);
		}
		return root;
	}

}
