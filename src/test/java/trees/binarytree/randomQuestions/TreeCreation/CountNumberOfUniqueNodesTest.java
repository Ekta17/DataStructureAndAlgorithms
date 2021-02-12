package trees.binarytree.randomQuestions.TreeCreation;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNumberOfUniqueNodesTest {

	CountNumberOfUniqueNodes countNumberOfUniqueNodes = new CountNumberOfUniqueNodes();

	@Test
	public void testCountNumberOfUniqueNodes1(){
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(1);
		root.right.right.right = new TreeNode(4);

		int numberOfUniqueNodes = countNumberOfUniqueNodes.getNumberOfDistinctNodes(root, new HashMap<>());
		assertEquals(3, numberOfUniqueNodes);
	}

	@Test
	public void testCountNumberOfUniqueNodes2(){
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.left.left = new TreeNode(4);

		int numberOfUniqueNodes = countNumberOfUniqueNodes.getNumberOfDistinctNodes(root, new HashMap<>());
		assertEquals(4, numberOfUniqueNodes);
	}

}