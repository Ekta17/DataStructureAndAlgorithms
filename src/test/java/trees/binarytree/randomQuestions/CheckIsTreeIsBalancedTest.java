package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CheckIsTreeIsBalancedTest {

	CheckIsTreeIsBalanced checkIsTreeIsBalanced = new CheckIsTreeIsBalanced();

	@Test
	public void testIfTreeIsBalanced_1(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(13);
		root.left.right = new TreeNode(70);

		assertTrue(checkIsTreeIsBalanced.isBalanced(root));
	}

	@Test
	public void testIfTreeIsBalanced_2(){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(5);

		assertFalse(checkIsTreeIsBalanced.isBalanced(root));
	}

	@Test
	public void testIfTreeIsBalanced_3(){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(9);
		root.right.right = new TreeNode(7);
		root.right.right.left = new TreeNode(6);

		assertFalse(checkIsTreeIsBalanced.isBalanced(root));
	}

	@Test
	public void testIfTreeIsBalanced_4(){
		TreeNode root = new TreeNode(30);
		root.left = new TreeNode(40);
		root.right = new TreeNode(80);
		root.left.left = new TreeNode(50);
		root.left.right = new TreeNode(70);
		root.left.right.left = new TreeNode(20);
		root.left.right.right = new TreeNode(10);
		root.right.left = new TreeNode(5);

		assertTrue(checkIsTreeIsBalanced.isBalanced(root));
	}
}