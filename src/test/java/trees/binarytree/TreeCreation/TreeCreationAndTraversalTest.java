package trees.binarytree.TreeCreation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import trees.binarytree.Traversal;
import trees.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TreeCreationAndTraversalTest {

	private static CreateFromArray createFromArray;
	private static Traversal traversal;

	@BeforeAll
	public static void init() {
		createFromArray = new CreateFromArray();
		traversal = new Traversal();
	}

	@Test
	public void testInOrderTraversal() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		TreeNode root = createFromArray.insertNodes(arr, null, 0);
		assertNotNull(root);
		List<Integer> actualArray = new ArrayList<>(arr.length);
		traversal.inorder(root, actualArray);
		List<Integer> expectedArray = new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3));
		assertEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray.toArray(), actualArray.toArray());
	}

	@Test
	public void testPreOrderTraversal() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		TreeNode root = createFromArray.insertNodes(arr, null, 0);
		assertNotNull(root);
		List<Integer> actualArray = new ArrayList<>(arr.length);
		traversal.preorder(root, actualArray);
		List<Integer> expectedArray = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6));
		assertEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray.toArray(), actualArray.toArray());
	}

	@Test
	public void testPostOrderTraversal() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		TreeNode root = createFromArray.insertNodes(arr, null, 0);
		assertNotNull(root);
		List<Integer> actualArray = new ArrayList<>(arr.length);
		traversal.postorder(root, actualArray);
		List<Integer> expectedArray = new ArrayList<>(Arrays.asList(4, 5, 2, 6, 3, 1));
		assertEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray.toArray(), actualArray.toArray());
	}

	@Test
	public void testLevelOrderTraversal(){
		int[] arr = {1, 2, 3, 4, 5, 6};
		TreeNode root = createFromArray.insertNodes(arr, null, 0);
		assertNotNull(root);
		LinkedList<TreeNode> queue = new LinkedList<>();
		List<Integer> actualValues = traversal.levelOrderOrBreadthFirst(root,queue);
		List<Integer> expectedValues = Arrays.stream(arr).boxed().collect(Collectors.toList());
		assertEquals(expectedValues, actualValues);
	}

}