package trees.binarytree.randomQuestions.TreeCreation;

public class HeightOfBinaryTree {

	//Gets the height of path from root to leaf node. Assuming height of root node is 1
	public int getHeight(TreeNode root){
		if(root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}
