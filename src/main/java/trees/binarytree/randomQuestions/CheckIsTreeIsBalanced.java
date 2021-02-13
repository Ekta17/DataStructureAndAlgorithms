package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

//Tree is said to be balanced if the difference between
//height of left subtree and right subtree is less than equal to 1
public class CheckIsTreeIsBalanced {
	HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		int leftTreeHeight = heightOfBinaryTree.getHeight(root.left);
		int rightTreeHeight = heightOfBinaryTree.getHeight(root.right);
		return Math.abs(leftTreeHeight - rightTreeHeight) <= 1
				&& isBalanced(root.left)
				&& isBalanced(root.right);
	}
}
