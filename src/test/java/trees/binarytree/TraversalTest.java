package trees.binarytree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TraversalTest {
	private static Traversal traversal;

	@BeforeAll
	public static void init(){
		traversal = new Traversal();
	}

	@Test
	public void testGetLevelOrderBreadthFirstTraversal1(){
		Node root = new Node(10);
		root.right = new Node(20);
		root.right.right = new Node(30);

		Optional<List<List<Integer>>> actualLevelOrder = traversal.getLevelOrderBreadthFirstTraversal(root);
		List<List<Integer>> expectedOrder = Arrays.asList(
				Arrays.asList(10),Arrays.asList(20),Arrays.asList(30)
		);
		assertEquals(expectedOrder, actualLevelOrder.get());
	}

	@Test
	public void testGetLevelOrderBreadthFirstTraversal2(){
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.right = new Node(70);

		Optional<List<List<Integer>>> actualLevelOrder = traversal.getLevelOrderBreadthFirstTraversal(root);
		List<List<Integer>> expectedOrder = Arrays.asList(
				Arrays.asList(10),Arrays.asList(20,30),Arrays.asList(40, 50, 70)
		);
		assertEquals(expectedOrder, actualLevelOrder.get());
	}

}