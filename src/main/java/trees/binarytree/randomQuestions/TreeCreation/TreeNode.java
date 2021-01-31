package trees.binarytree.randomQuestions.TreeCreation;

import lombok.ToString;

@ToString
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
