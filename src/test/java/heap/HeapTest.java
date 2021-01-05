package heap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

	private static Heap heap;

	@BeforeAll
	public static void init() {
		heap = new Heap();
	}

	@Test
	public void buildHeapFromArrayTest() {
		int[] arr = {3, 7, 1, 8, 0, 4, 2, 5};
		heap.buildHeapFromArray(arr);
		int[] expectedHeap = {0, 3, 1, 5, 7, 4, 2, 8};
		assertArrayEquals(expectedHeap, arr);
	}

	@Test
	public void insertElementIntoHeapTest() {
		int[] arr = {0, 3, 1, 5, 7, 4, 2, 8};
		int newElementToAdd = 6;
		int[] actualHeap = heap.insertIntoHeap(arr, newElementToAdd);
		int[] expectedHeap = {0, 3, 1, 5, 7, 4, 2, 8, 6};
		assertArrayEquals(expectedHeap, actualHeap);
	}

	@Test
	public void deleteElementFromHeapTest() {
		int[] arr = {0, 3, 1, 5, 7, 4, 2, 8, 6};
		int indexOfElementToDelete = 2;
		int[] actualHeap = heap.deleteFromHeap(arr, indexOfElementToDelete);
		int[] expectedHeap = {0, 3, 2, 5, 7, 4, 6, 8};
		assertArrayEquals(expectedHeap, actualHeap);
	}

	@Test
	public void extractMinTest() {
		int[] arr = {0, 3, 2, 5, 7, 4, 6, 8};
		int[] actualHeap = heap.extractMin(arr);
		int[] expectedHeap = {2, 3, 4, 5, 7, 8, 6};
		assertArrayEquals(expectedHeap, actualHeap);
	}

	@Test
	public void testHeapifyWithoutSubtree() {
		int[] arr = {10, 3, 2};
		heap.heapify(arr, 0);
		int[] expectedHeap = {2, 3, 10};
		assertArrayEquals(expectedHeap, arr);
	}

	@Test
	public void testHeapifyWithSubtree() {
		int[] arr = {3, 10, 6, 7};
		heap.heapify(arr, 1);
		int[] expectedHeap = {3, 7, 6, 10};
		assertArrayEquals(expectedHeap, arr);
	}

	@Test
	public void testHeapifyWithRootNode() {
		int[] arr = {3};
		heap.heapify(arr, 0);
		int[] expectedHeap = {3};
		assertArrayEquals(expectedHeap, arr);
	}

}