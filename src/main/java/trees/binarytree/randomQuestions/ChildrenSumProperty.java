package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

//Children Sum property is valid when the node's value is sum of its children's value
public class ChildrenSumProperty {

	public boolean isChildrenSumPropertyValid(TreeNode root) {
		if (root == null)
			return true;

		if (root.left == null && root.right == null)
			return true;
		else if (root.left != null && root.right != null) {
			if (root.val == (root.left.val) + root.right.val)
				return isChildrenSumPropertyValid(root.left) && isChildrenSumPropertyValid(root.right);
		} else if (root.left != null && root.right == null) {
			if (root.val == root.left.val)
				return isChildrenSumPropertyValid(root.left);
		} else {
			if (root.val == root.right.val)
				return isChildrenSumPropertyValid(root.right);
		}

		return false;
	}
}
