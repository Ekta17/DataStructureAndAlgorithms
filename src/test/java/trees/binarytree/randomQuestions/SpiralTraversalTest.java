package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralTraversalTest {

	SpiralTraversal spiralTraversal = new SpiralTraversal();

	@Test
	public void testSpiralTraversal() {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(70);

		List<Integer> traversalOrder = spiralTraversal.traverse(root);
		assertEquals(Arrays.asList(10, 30, 20, 40, 50, 60, 70), traversalOrder);
	}

}