package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SizeOfBinaryTreeTest {

	SizeOfBinaryTree size = new SizeOfBinaryTree();

	@Test
	public void testGetSizeWhenRootIsNull(){
		TreeNode root = null;
		assertEquals(0, size.getSize(root));
	}

	@Test
	public void testGetSizeWhenRootIsNotNull_1(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		assertEquals(2, size.getSize(root));
	}

	@Test
	public void testGetSizeWhenRootIsNotNull_2(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		assertEquals(3, size.getSize(root));
	}


	@Test
	public void testGetSizeWhenRootIsNotNull_3(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.right.right = new TreeNode(70);

		assertEquals(4, size.getSize(root));
	}
}