package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

	@Test
	void testIsLinkedListCyclic() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		n5.next = n3;
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		assertTrue(Util.isLinkedListCyclic(n1));
	}
}