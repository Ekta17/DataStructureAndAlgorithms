package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeftViewOfTreeTest {

	LeftViewOfTree leftViewOfTree = new LeftViewOfTree();

	@Test
	public void testGetLeftViewOfTreeWhenRootIsNull(){
		TreeNode root = null;
		List<Integer> leftLevelNodes = leftViewOfTree.getLeftMostElementAtEachLevel(root);
		assertTrue(leftLevelNodes.isEmpty());
	}

	@Test
	public void testGetLeftViewOfTreeWhenLeftLevelsAreComplete(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.right = new TreeNode(70);
		root.right.right.left = new TreeNode(120);

		List<Integer> leftLevelNodes = leftViewOfTree.getLeftMostElementAtEachLevel(root);
		assertEquals(Arrays.asList(10,20,40,120), leftLevelNodes);
	}

	@Test
	public void testGetLeftViewOfTreeWhenLeftLevelsAreTakenFromRight(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.right.right = new TreeNode(50);
		root.right.right.right = new TreeNode(70);
		root.right.right.right.left = new TreeNode(120);

		List<Integer> leftLevelNodes = leftViewOfTree.getLeftMostElementAtEachLevel(root);
		assertEquals(Arrays.asList(10,20,50,70,120), leftLevelNodes);
	}

}