package linkedlist;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class DoublyNode<T> {
	T data;
	DoublyNode prev, next;

	public DoublyNode(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public DoublyNode(T data, DoublyNode prev, DoublyNode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}

@ToString
public class DoublyLinkedList<T> {
	DoublyNode<T> head;
	int size;

	public DoublyLinkedList() {
		this.head = null;
	}

	public void addADoublyNode(T data) {
		DoublyNode n = new DoublyNode(data);

		if (isEmpty()) {
			head = n;
		} else {
			DoublyNode curr = head;

			while (curr.next != null)
				curr = curr.next;

			curr.next = n;
			n.prev = curr;
		}
		size++;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public Optional<DoublyNode> getDoublyNodeAtIndex(int index) {
		if (!isEmpty()) {
			int i = 0;
			for (DoublyNode curr = head; curr != null; i++, curr = curr.next) {
				if (i == index)
					return Optional.of(curr);
			}

		}
		return Optional.empty();
	}

	public void deleteDoublyNodeAtIndex(int index) {
		if (!isEmpty()) {
			if(index == 0) {
				head = head.next;
				head.prev = null;
				size --;
			}else {
				int i = 0;
				DoublyNode curr = head, prev = null;
				while (curr != null) {
					if (i == index) {
						prev.next = curr.next;
						if (curr.next != null)
							curr.next.prev = prev;
						size--;
						break;
					} else {
						prev = curr;
						curr = curr.next;
						i++;
					}
				}
			}
		} else
			System.out.println("List is empty");
	}

	public List<T> getAllDataIntoList() {
		List<T> allData = new ArrayList<>();
		if (!isEmpty()) {
			for (DoublyNode curr = head; curr != null; curr = curr.next)
				allData.add((T) curr.data);
		}
		return allData;
	}
}
