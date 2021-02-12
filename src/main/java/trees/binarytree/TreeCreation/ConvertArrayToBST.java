package trees.binarytree.TreeCreation;

import trees.binarytree.TreeNode;

import java.util.List;

/**
 * Given an array where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as
 * a binary tree in which the depth of the two subtrees of every node
 * never differ by more than 1.
 */
public class ConvertArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;

		return constructBST(nums, 0, nums.length - 1);
	}

	public TreeNode constructBST(int[] nums, int low, int high) {
		if (low > high)
			return null;

		int mid = low + (high - low) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructBST(nums, low, mid - 1);
		root.right = constructBST(nums, mid + 1, high);
		return root;
	}

	public List<Integer> getNodesInPreOrderTraversal(TreeNode root, List<Integer> preOrder){
		if(root==null)
			return preOrder;

		preOrder.add(root.val);
		getNodesInPreOrderTraversal(root.left, preOrder);
		getNodesInPreOrderTraversal(root.right, preOrder);

		return preOrder;
	}
}
