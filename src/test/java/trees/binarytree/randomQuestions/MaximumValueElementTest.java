package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumValueElementTest {

	MaximumValueElement maximumValueElement = new MaximumValueElement();

	@Test
	public void testGetMaximumValueElementInBinaryTree1(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.right = new TreeNode(70);
		assertEquals(70, maximumValueElement.getMaximumValueElementInBinaryTree(root));
	}

	public void testGetMaximumValueElementInBinaryTree2(){
		TreeNode root = new TreeNode(30);
		root.left = new TreeNode(20);
		root.right = new TreeNode(10);
		assertEquals(30, maximumValueElement.getMaximumValueElementInBinaryTree(root));
	}


}