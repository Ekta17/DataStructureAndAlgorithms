package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

	@Test
	public void testIsLinkedListCyclicWhenCyclic() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		n5.next = n3;
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		assertTrue(Util.isLinkedListCyclic(n1));
	}
	@Test
	public void testIsLinkedListCyclicWhenNotCyclic() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		assertFalse(Util.isLinkedListCyclic(n1));
	}

	@Test
	public void testGetCycleStartingNodeWhenCyclic() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		n5.next = n3;
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		assertEquals(n3, Util.getTheNodeWhereCycleStarts(n1).get());
	}
	@Test
	public void testGetCycleStartingNodeWhenNotCyclic() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		Optional<Node> actualValue = Util.getTheNodeWhereCycleStarts(n1);
		assertFalse(actualValue.isPresent());
	}

	@Test
	public void testGetIntersectingNodeWhenListsIntersect(){
		//1->2->3->4->5
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		//15->20->25
		Node n8 = new Node(25, null);
		Node n7 = new Node(20, n8);
		Node n6 = new Node(15, n7);

		//1->2->3->4->5->6->7->8->9->10
		//15->20->25->6->7->8->9->10
		Node n13 = new Node(10, null);
		Node n12 = new Node(9, n13);
		Node n11 = new Node(8, n12);
		Node n10 = new Node(7, n11);
		Node n9 = new Node(6, n10);
		n8.next = n9;
		n5.next = n9;

		Optional<Node> actualValue = Util.getIntersectingNodeIfExist(n1, n6);
		assertEquals(n9, actualValue.get());
	}

	@Test
	public void testGetIntersectingNodeWhenListsNotIntersect(){
		//1->2->3->4->5
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		//5->6->7->10->15->20->25
		Node n17 = new Node(25, null);
		Node n16 = new Node(20, n17);
		Node n15 = new Node(15, n16);
		Node n14 = new Node(10, n15);
		Node n13 = new Node(7, n14);
		Node n12 = new Node(6, n13);
		Node n11 = new Node(5, n12);

		Optional<Node> actualValue = Util.getIntersectingNodeIfExist(n1, n11);
		assertFalse(actualValue.isPresent());
	}

	@Test
	public void testIsPalindrome(){
		Node n5 = new Node(0, null);
		Node n4 = new Node(1, n5);
		Node n3 = new Node(2, n4);
		Node n2 = new Node(1, n3);
		Node n1 = new Node(0, n2);

		assertTrue(Util.isPalindrome(n1));
	}

	@Test
	public void testIsPalindromeWhenItsNot(){
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		assertFalse(Util.isPalindrome(n1));
	}

	@Test
	public void testGetKthNodeFromLast(){
		Node n6 = new Node(6, null);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		int k = 2;
		assertEquals(n5, Util.getKthNodeFromLast(n1, k).get());
	}

	@Test
	public void testGetKthNodeFromLastWhenKIsOutOfBounds(){
		Node n6 = new Node(6, null);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		int k = 8;
		assertFalse(Util.getKthNodeFromLast(n1, k).isPresent());
	}

	@Test
	public void testRemoveDuplicates() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(4, n3);
		Node n1 = new Node(3, n2);

		Node actualList = Util.removeDuplicates(n1);
		List<Integer> dataValues = new ArrayList<>();
		while (actualList != null){
			dataValues.add((Integer) actualList.data);
			actualList = actualList.next;
		}
		assertEquals(Arrays.asList(3,4,5), dataValues);
	}

	@Test
	public void testReverseTheLinkedList(){
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		Node head = Util.reverseTheLinkedList(n1);

		assertEquals(head.data, 5);

		List<Integer> dataValues = new ArrayList<>();
		for(Node curr = head; curr!= null; curr = curr.next)
			dataValues.add((Integer) curr.data);
		assertEquals(Arrays.asList(5,4,3,2,1), dataValues);
	}

	@Test
	public void testReverseTheLinkedListRecursively(){
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		Node head = Util.reverseTheLinkedListRecursively(n1);

		assertEquals(head.data, 5);

		List<Integer> dataValues = new ArrayList<>();
		for(Node curr = head; curr!= null; curr = curr.next)
			dataValues.add((Integer) curr.data);
		assertEquals(Arrays.asList(5,4,3,2,1), dataValues);
	}
}