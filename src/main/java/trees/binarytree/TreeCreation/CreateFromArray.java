package trees.binarytree.TreeCreation;

import trees.binarytree.TreeNode;

public class CreateFromArray {

	public TreeNode insertNodes(int[] arr, TreeNode root, int index) {
		if (index < arr.length) {
			TreeNode temp = new TreeNode(arr[index]);
			//temp.val = arr[index];
			root = temp;
			root.left = insertNodes(arr, root.left, 2 * index + 1);
			root.right = insertNodes(arr, root.right, 2 * index + 2);
		}
		return root;
	}

}
