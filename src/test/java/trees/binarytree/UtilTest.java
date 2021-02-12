package trees.binarytree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UtilTest {

	private static CreateFromArray createFromArray;
	private static Util util;

	@BeforeAll
	public static void init(){
		createFromArray = new CreateFromArray();
		util = new Util();
	}

	@Test
	public void testHeightOfTree() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		Node root = createFromArray.insertNodes(arr, null, 0);
		assertNotNull(root);
		int actualHeight = util.getHeightOfTree(root);
		assertEquals(3, actualHeight);
	}

	@Test
	public void testHeightOfTreeWhenNoNodes() {
		Node root = null;
		int actualHeight = util.getHeightOfTree(root);
		assertEquals(0, actualHeight);
	}

	@Test
	public void testHeightOfTreeWhenOnlyRootNode() {
		int[] arr = {1};
		Node root = createFromArray.insertNodes(arr, null, 0);
		assertNotNull(root);
		int actualHeight = util.getHeightOfTree(root);
		assertEquals(1, actualHeight);
	}

	@Test
	public void testGetNodesAtHeightK(){
		int[] arr = {1,2,3,4,5,6};
		Node root = createFromArray.insertNodes(arr, null, 0);
		List<Integer> actualValues = new ArrayList<>();
		util.collectNodesAtHeightK(root, 2, actualValues);
		List<Integer> expectedValues = new ArrayList<>(Arrays.asList(4,5,6));
		assertNotNull(actualValues);
		assertEquals(expectedValues, actualValues);
	}

	@Test
	public void testGetSizeOfBinaryTree1(){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		assertEquals(3, util.getSizeOfBinaryTree(root,0));
	}

	@Test
	public void testGetSizeOfBinaryTree2(){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(70);

		assertEquals(6, util.getSizeOfBinaryTree(root,0));
	}

	@Test
	public void testGetMaximumValueElementInBinaryTree1(){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(70);
		assertEquals(70, util.getMaximumValueElementInBinaryTree(root));
	}

	public void testGetMaximumValueElementInBinaryTree2(){
		Node root = new Node(30);
		root.left = new Node(20);
		root.right = new Node(10);
		assertEquals(30, util.getMaximumValueElementInBinaryTree(root));
	}

}