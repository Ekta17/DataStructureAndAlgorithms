package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

	@Test
	public void testAddNode() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeToEnd(30);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(Arrays.asList(10, 20, 30), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testDeleteNode() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeToEnd(30);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(Arrays.asList(10, 20, 30), singlyLinkedList.getAllDataIntoList());

		singlyLinkedList.deleteNodeAtIndex(1);
		assertEquals(2, singlyLinkedList.size);
		assertEquals(Arrays.asList(10, 30), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testDeleteNodeatHead() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeToEnd(30);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(Arrays.asList(10, 20, 30), singlyLinkedList.getAllDataIntoList());

		singlyLinkedList.deleteNodeAtIndex(0);
		assertEquals(2, singlyLinkedList.size);
		assertEquals(Arrays.asList(20, 30), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testDeleteNodeatTail() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeToEnd(30);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(Arrays.asList(10, 20, 30), singlyLinkedList.getAllDataIntoList());

		singlyLinkedList.deleteNodeAtIndex(2);
		assertEquals(2, singlyLinkedList.size);
		assertEquals(Arrays.asList(10, 20), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testGetNode() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeToEnd(30);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(10, singlyLinkedList.getNodeAtIndex(0).get().data);
		assertEquals(20, singlyLinkedList.getNodeAtIndex(1).get().data);
		assertEquals(30, singlyLinkedList.getNodeAtIndex(2).get().data);
	}

	@Test
	public void testIsEmpty() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		assertTrue(singlyLinkedList.isEmpty());

		singlyLinkedList.addANodeToEnd(10);
		assertFalse(singlyLinkedList.isEmpty());
	}

	@Test
	public void testAddNodeAtHeadWhenListIsEmpty() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToHead(10);

		assertEquals(1, singlyLinkedList.size);
		assertEquals(Arrays.asList(10), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testAddNodeAtHeadWhenListIsNotEmpty() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeToHead(5);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(5, singlyLinkedList.getNodeAtIndex(0).get().data);
		assertEquals(Arrays.asList(5, 10, 20), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testAddNodeAtKThLocationWhenListIsEmpty() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeAtKthLocation(15, 0);

		assertEquals(1, singlyLinkedList.size);
		assertEquals(15, singlyLinkedList.getNodeAtIndex(0).get().data);
		assertEquals(Arrays.asList(15), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testAddNodeAtLastLocationWhenListIsEmpty() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeAtKthLocation(25, 2);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(25, singlyLinkedList.getNodeAtIndex(2).get().data);
		assertEquals(Arrays.asList(10, 20, 25), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testAddNodeAtKThLocationWhenListIsNotEmpty() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addANodeToEnd(10);
		singlyLinkedList.addANodeToEnd(20);
		singlyLinkedList.addANodeAtKthLocation(15, 1);

		assertEquals(3, singlyLinkedList.size);
		assertEquals(15, singlyLinkedList.getNodeAtIndex(1).get().data);
		assertEquals(Arrays.asList(10, 15, 20), singlyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testAddNodeAtKThLocationWhenKIsOutOfBound() {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();
		assertThrows(IndexOutOfBoundsException.class, () -> singlyLinkedList.addANodeAtKthLocation(15, 5));
	}

}