package trees.binarytree.randomQuestions.TreeCreation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import trees.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertArrayToBSTTest {

	private static ConvertArrayToBST convertArrayToBST;

	@BeforeAll
	public static void init() {
		convertArrayToBST = new ConvertArrayToBST();
	}

	@Test
	public void testConvertBSTFromSortedArray_EvenLength() {
		int[] nums = {0, 1, 2, 3, 4, 5};
		TreeNode root = convertArrayToBST.sortedArrayToBST(nums);
		List<Integer> treeData = new ArrayList<>(nums.length);
		treeData = convertArrayToBST.getNodesInPreOrderTraversal(root, treeData);
		assertEquals(Arrays.asList(2, 0, 1, 4, 3, 5), treeData);
	}

	@Test
	public void testConvertBSTFromSortedArray_OddLength() {
		int[] nums = {1, 2, 3, 4, 5};
		TreeNode root = convertArrayToBST.sortedArrayToBST(nums);
		List<Integer> treeData = new ArrayList<>(nums.length);
		treeData = convertArrayToBST.getNodesInPreOrderTraversal(root, treeData);
		assertEquals(Arrays.asList(3, 1, 2, 4, 5), treeData);
	}

}