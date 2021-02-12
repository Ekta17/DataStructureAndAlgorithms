package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

public class SizeOfBinaryTree {

	public int getSize(TreeNode root){
		if(root == null)
			return 0;
		return getSize(root.left) + getSize(root.right) + 1;
	}
}
