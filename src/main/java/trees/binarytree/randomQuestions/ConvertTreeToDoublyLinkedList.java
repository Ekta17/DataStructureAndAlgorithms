package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

import java.util.List;

public class ConvertTreeToDoublyLinkedList {

	DoublyLinkedListNode head = null;
	DoublyLinkedListNode prev = null;

	public DoublyLinkedListNode convertTree(TreeNode root, List<Integer> doublyList) {
		if (root != null) {
			convertTree(root.left, doublyList);
			DoublyLinkedListNode n = new DoublyLinkedListNode(root.val);
			if(prev == null)
				head = n;
			else {
				n.prev = prev;
				prev.next = n;
			}
			prev = n;
			doublyList.add(n.data);
			convertTree(root.right, doublyList);
		}
		return head;
	}
}

class DoublyLinkedListNode {
	int data;
	DoublyLinkedListNode prev, next;

	DoublyLinkedListNode(int data) {
		this.data = data;
		prev = next = null;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		if(prev!=null)
			sb.append("prev="+ prev.data);
		else
			sb.append("prev is null");
		sb.append("-->");
		sb.append("curr="+ data);
		sb.append("-->");
		if(next!=null)
			sb.append("next="+ next.data);
		else
			sb.append("next is null");

		return sb.toString();
	}
}
