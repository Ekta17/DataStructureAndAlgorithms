package linkedlist;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ToString
class Node<T> {
	T data;
	Node next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}
}

@ToString
public class SinglyLinkedList<T> {
	Node<T> head;
	int size;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void addANodeToHead(T data){
		Node n = new Node(data);
		addANodeToHead(n);
	}

	public void addANodeToHead(Node n){
		if(!isEmpty())
			n.next = head;
		head = n;
		size++;
	}

	public void addANodeToEnd(T data) {
		Node n = new Node(data);

		if (isEmpty()) {
			head = n;
		} else {
			Node curr = head;

			while (curr.next != null)
				curr = curr.next;

			curr.next = n;
		}
		size++;
	}

	public void addANodeToEnd(Node n) {

		if (isEmpty()) {
			head = n;
		} else {
			Node curr = head;

			while (curr.next != null)
				curr = curr.next;

			curr.next = n;
		}
		size++;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public Optional<Node> getNodeAtIndex(int index) {
		if (!isEmpty()) {
			int i = 0;
			for (Node curr = head; curr != null; i++, curr = curr.next) {
				if (i == index)
					return Optional.of(curr);
			}
		}
		return Optional.empty();
	}

	public void deleteNodeAtIndex(int index) {
		if (!isEmpty()) {
			if(index == 0){
				head = head.next;
				size--;
			}else {
				int i = 0;
				Node curr = head, prev = null;
				while (curr != null) {
					if (i == index) {
						prev.next = curr.next;
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

	public List<T> getAllDataIntoList(){
		List<T> allNodeData = new ArrayList<>();
		if (!isEmpty()) {
			for (Node curr = head; curr != null; curr = curr.next)
				allNodeData.add((T) curr.data);
		}

		return allNodeData;
	}

}

