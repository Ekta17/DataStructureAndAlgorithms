package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

	@Test
	public void testAddNode(){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addADoublyNode(10);
		doublyLinkedList.addADoublyNode(20);
		doublyLinkedList.addADoublyNode(30);

		assertEquals(3, doublyLinkedList.size);
		assertEquals(Arrays.asList(10,20,30), doublyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testDeleteNode(){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addADoublyNode(10);
		doublyLinkedList.addADoublyNode(20);
		doublyLinkedList.addADoublyNode(30);

		assertEquals(3, doublyLinkedList.size);
		assertEquals(Arrays.asList(10,20,30), doublyLinkedList.getAllDataIntoList());

		doublyLinkedList.deleteDoublyNodeAtIndex(1);
		assertEquals(2, doublyLinkedList.size);
		assertEquals(Arrays.asList(10,30), doublyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testDeleteNodeAtHead(){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addADoublyNode(10);
		doublyLinkedList.addADoublyNode(20);
		doublyLinkedList.addADoublyNode(30);

		assertEquals(3, doublyLinkedList.size);
		assertEquals(Arrays.asList(10,20,30), doublyLinkedList.getAllDataIntoList());

		doublyLinkedList.deleteDoublyNodeAtIndex(0);
		System.out.println(doublyLinkedList);
		assertEquals(2, doublyLinkedList.size);
		assertEquals(Arrays.asList(20,30), doublyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testDeleteNodeAtTail(){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addADoublyNode(10);
		doublyLinkedList.addADoublyNode(20);
		doublyLinkedList.addADoublyNode(30);

		assertEquals(3, doublyLinkedList.size);
		assertEquals(Arrays.asList(10,20,30), doublyLinkedList.getAllDataIntoList());

		doublyLinkedList.deleteDoublyNodeAtIndex(2);
		assertEquals(2, doublyLinkedList.size);
		assertEquals(Arrays.asList(10,20), doublyLinkedList.getAllDataIntoList());
	}

	@Test
	public void testGetNode(){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addADoublyNode(10);
		doublyLinkedList.addADoublyNode(20);
		doublyLinkedList.addADoublyNode(30);

		assertEquals(3, doublyLinkedList.size);
		assertEquals(10, doublyLinkedList.getDoublyNodeAtIndex(0).get().data);
		assertEquals(20, doublyLinkedList.getDoublyNodeAtIndex(1).get().data);
		assertEquals(30, doublyLinkedList.getDoublyNodeAtIndex(2).get().data);
	}

	@Test
	public void testIsEmpty(){
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		assertTrue(doublyLinkedList.isEmpty());

		doublyLinkedList.addADoublyNode(10);
		assertFalse(doublyLinkedList.isEmpty());
	}
}