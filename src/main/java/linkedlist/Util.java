package linkedlist;

import java.util.HashSet;
import java.util.Optional;
import java.util.Stack;

public class Util {

	public static boolean isLinkedListCyclic(Node head) {
		Node p1 = head, p2 = head;  //p1 -> 1, p2 ->1

		while (p1 != null && p1.next != null) {
			p1 = p1.next.next; //p1 ->3, 5, null
			p2 = p2.next;   //p2 ->2,3,4
			if (p1 == p2) //loop detected
				break;
		}

		if (p1 == p2)
			return true;
		return false;
	}

	public static Optional<Node> getTheNodeWhereCycleStarts(Node head) {
		Node p1 = head, p2 = head;  //p1 -> 1, p2 ->1

		while (p1 != null && p1.next != null) {
			p1 = p1.next.next; //p1 ->3, 5, null
			p2 = p2.next;   //p2 ->2,3,4
			if (p1 == p2) //loop detected
				break;
		}

		if (p1 == null || p1.next == null) //loop not detected
			return Optional.empty();

		p1 = head;
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return Optional.of(p1);
	}

	public static Optional<Node> getIntersectingNodeIfExist(Node head1, Node head2) {

		int size1 = 0, size2 = 0;
		Node p1 = head1, p2 = head2;

		//Navigate till end of the lists to get size
		while (p1.next != null) {
			p1 = p1.next;
			size1++;
		}
		while (p2.next != null) {
			p2 = p2.next;
			size2++;
		}

		//if the last node is not same, the list do not intersect
		if (p1 != p2)
			return Optional.empty();

		//ignore the (size difference) number of nodes from longer list
		p1 = head1;
		size1++;
		p2 = head2;
		size2++;
		if (size1 > size2) {
			for (int i = 0; i < (size1 - size2); i++)
				p1 = p1.next;
		} else {
			for (int i = 0; i < (size2 - size1); i++)
				p2 = p2.next;
		}

		//traverse through both the list till they collide
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return Optional.of(p1);
	}

	public static boolean isPalindrome(Node head) {
		Stack<Integer> stack = new Stack<>();

		Node n = head;
		while (n != null) {
			stack.push((Integer) n.data);
			n = n.next;
		}

		n = head;
		while (n != null) {
			if (n.data != stack.pop())
				return false;
			n = n.next;
		}
		return true;
	}

	public static Optional<Node> getKthNodeFromLast(Node head, int k) {
		Node p1 = head, p2 = head;

		int i = 0;
		while (i < k) {
			if (p1 == null)
				return Optional.empty();
			p1 = p1.next;
			i++;
		}

		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return Optional.of(p2);
	}

	public static Node removeDuplicates(Node head){
		HashSet<Integer> hashSet = new HashSet<>();

		Node curr = head, prev = null;
		while(curr!=null) {
			if (hashSet.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				hashSet.add((Integer) curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
		return head;
	}

	public static Node reverseTheLinkedList(Node head) {
		if (head == null)
			return null;

		Node prev = null, curr = head, next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	//1->2->3->4
	public static Node reverseTheLinkedListRecursively(Node head) {
		if (head == null || head.next == null)
			return head;

		Node newNode = reverseTheLinkedListRecursively(head.next);
		head.next.next = head;
		head.next = null;

		return newNode;
	}

}
