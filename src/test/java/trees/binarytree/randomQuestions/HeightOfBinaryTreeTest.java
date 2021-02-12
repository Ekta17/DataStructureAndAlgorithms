package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;
import trees.binarytree.randomQuestions.HeightOfBinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class HeightOfBinaryTreeTest {

	HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();

	@Test
	public void testGetHeightOfBinaryTreeWhenManyNodes(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.right.left = new TreeNode(40);
		root.right.right = new TreeNode(50);
		root.right.right.left = new TreeNode(60);

		assertEquals(4, heightOfBinaryTree.getHeight(root));
	}

	@Test
	public void testGetHeightOfBinaryTreeWhenOnlyNodeIsRoot(){
		TreeNode root = new TreeNode(10);
		assertEquals(1, heightOfBinaryTree.getHeight(root));
	}


	@Test
	public void testGetHeightOfBinaryTreeWhenRootIsNull(){
		assertEquals(0, heightOfBinaryTree.getHeight(null));
	}


	@Test
	public void testGetHeightOfBinaryTreeWhenAllLeafNodesAtSameLevel(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);

		assertEquals(2, heightOfBinaryTree.getHeight(root));
	}

}