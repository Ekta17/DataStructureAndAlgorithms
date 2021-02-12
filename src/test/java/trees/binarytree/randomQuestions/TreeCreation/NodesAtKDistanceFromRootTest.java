package trees.binarytree.randomQuestions.TreeCreation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NodesAtKDistanceFromRootTest {

	NodesAtKDistanceFromRoot nodesAtKDistanceFromRoot = new NodesAtKDistanceFromRoot();

	@Test
	public void testNodesAtKDistanctWhenManyNodes(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.right = new TreeNode(60);

		List<Integer> nodesAtKDistance = new ArrayList<>();
		int k = 2;
		nodesAtKDistanceFromRoot.getNodesAtKDistanceFromRoot(root, k, nodesAtKDistance);
		assertEquals(Arrays.asList(40, 50, 60), nodesAtKDistance);
	}

	@Test
	public void testNodesAtKDistanctWhenRootIsNull(){
		List<Integer> nodesAtKDistance = new ArrayList<>();
		int k = 2;
		nodesAtKDistanceFromRoot.getNodesAtKDistanceFromRoot(null, k, nodesAtKDistance);
		assertTrue(nodesAtKDistance.isEmpty());
	}

	@Test
	public void testNodesAtKDistanctWhenKIsZero(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.right = new TreeNode(60);

		List<Integer> nodesAtKDistance = new ArrayList<>();
		int k = 0;
		nodesAtKDistanceFromRoot.getNodesAtKDistanceFromRoot(root, k, nodesAtKDistance);
		assertEquals(Arrays.asList(10), nodesAtKDistance);
	}

	@Test
	public void testNodesAtKDistanctWhenKIsOneButNodeLeafNodes(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.right = new TreeNode(60);

		List<Integer> nodesAtKDistance = new ArrayList<>();
		int k = 1;
		nodesAtKDistanceFromRoot.getNodesAtKDistanceFromRoot(root, k, nodesAtKDistance);
		assertEquals(Arrays.asList(20, 30), nodesAtKDistance);
	}

}