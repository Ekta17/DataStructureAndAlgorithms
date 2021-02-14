package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {

	HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();

	public List<Integer> traverse(TreeNode root) {
		List<Integer> spiralTraversal = new ArrayList<>();

		int heightOfTree = heightOfBinaryTree.getHeight(root);
		boolean leftToRight = true;
		for (int i = 1; i <= heightOfTree; i++) {
			traverse(root, i, leftToRight, spiralTraversal);
			leftToRight = !leftToRight;
		}

		return spiralTraversal;
	}

	private void traverse(TreeNode root, int level, boolean leftToRight, List<Integer> spiralTraversal) {
		if (root == null)
			return;
		if (level == 1)
			spiralTraversal.add(root.val);
		if (level > 1) {
			if (leftToRight) {
				traverse(root.left, level - 1, leftToRight, spiralTraversal);
				traverse(root.right, level - 1, leftToRight, spiralTraversal);
			} else {
				traverse(root.right, level - 1, leftToRight, spiralTraversal);
				traverse(root.left, level - 1, leftToRight, spiralTraversal);
			}
		}
	}
}
