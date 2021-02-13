package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWidthOfTreeTest {
	MaximumWidthOfTree maximumWidthOfTree = new MaximumWidthOfTree();

	@Test
	public void testGetMaximumWidthOfTree_1(){
		TreeNode root = null;
		assertEquals(0, maximumWidthOfTree.getMaxWidth(root));
	}

	@Test
	public void testGetMaximumWidthOfTree_2(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.left.left = new TreeNode(80);
		root.right.left = new TreeNode(50);
		root.right.right = new TreeNode(60);

		assertEquals(3, maximumWidthOfTree.getMaxWidth(root));
	}

	@Test
	public void testGetMaximumWidthOfTree_3(){
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(80);
		root.right.left = new TreeNode(50);
		root.right.right = new TreeNode(60);

		assertEquals(4, maximumWidthOfTree.getMaxWidth(root));
	}


	@Test
	public void testGetMaximumWidthOfTree_4(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(80);
		root.left.right = new TreeNode(70);

		assertEquals(1, maximumWidthOfTree.getMaxWidth(root));
	}
}