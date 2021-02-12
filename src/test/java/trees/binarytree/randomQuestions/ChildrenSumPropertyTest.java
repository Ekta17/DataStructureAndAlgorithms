package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ChildrenSumPropertyTest {

	ChildrenSumProperty childrenSumProperty = new ChildrenSumProperty();

	@Test
	public void testChildrenSumPropertyWhenRootIsNull(){
		TreeNode root = null;
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenLeftChildIsNull_1(){
		TreeNode root = new TreeNode(10);
		root.right = new TreeNode(30);
		assertFalse(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenLeftChildIsNull_2(){
		TreeNode root = new TreeNode(10);
		root.right = new TreeNode(10);
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenLeftChildIsNull_3(){
		TreeNode root = new TreeNode(10);
		root.right = new TreeNode(10);
		root.right.right = new TreeNode(10);
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenRightChildIsNull_1(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		assertFalse(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenRightChildIsNull_2(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(10);
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenRightChildIsNull_3(){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(10);
		root.left.left = new TreeNode(10);
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenTreeIsComplete_1(){
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(12);
		root.right = new TreeNode(8);
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenTreeIsComplete_2(){
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(12);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(4);
		root.right.right= new TreeNode(4);
		assertTrue(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

	@Test
	public void testChildrenSumPropertyWhenTreeIsComplete_3(){
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(12);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(4);
		root.right.right= new TreeNode(5);
		assertFalse(childrenSumProperty.isChildrenSumPropertyValid(root));
	}

}