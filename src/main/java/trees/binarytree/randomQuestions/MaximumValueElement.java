package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

public class MaximumValueElement {

	public int getMaximumValueElementInBinaryTree(TreeNode root){
		if(root==null)
			return Integer.MIN_VALUE;
		int leftMax = getMaximumValueElementInBinaryTree(root.left);
		int rightMax = getMaximumValueElementInBinaryTree(root.right);
		return Math.max(root.val, Math.max(leftMax,rightMax));
	}
}
