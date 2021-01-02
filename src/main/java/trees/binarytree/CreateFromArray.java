package trees.binarytree;

public class CreateFromArray {

	Node insertNodes(int[] arr, Node root, int index) {
		if (index < arr.length) {
			Node temp = new Node();
			temp.data = arr[index];
			root = temp;
			root.left = insertNodes(arr, root.left, 2 * index + 1);
			root.right = insertNodes(arr, root.right, 2 * index + 2);
		}
		return root;
	}

}
