package trees.binarytree.randomQuestions;

import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConvertTreeToDoublyLinkedListTest {

	ConvertTreeToDoublyLinkedList convert = new ConvertTreeToDoublyLinkedList();

	@Test
	public void testConvertTreeToDoublyLinkedList_1() {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(9);
		root.left.left = new TreeNode(8);
		root.right = new TreeNode(12);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<Integer> list = new LinkedList<>();
		DoublyLinkedListNode head = convert.convertTree(root, list);
		assertNotNull(head);
		assertEquals(Arrays.asList(8, 9, 10, 6, 12, 7), list);
	}

}