package linkedlist;

public class Util {

	public static boolean isLinkedListCyclic(Node head){
		Node p1 = head, p2 = head;  //p1 -> 1, p2 ->1

		while(p1 !=null && p1.next != null){
			p1 = p1.next.next; //p1 ->3, 5, null
			p2 = p2.next;   //p2 ->2,3,4
		}

		p1 = head;  //p1 -> 1
		while(p1.next !=null && p1 != p2){
			p1 = p1.next; //p1 -> 2, 3
			p2 = p2.next; //p2 -> 5, 3
		}

		if(p1 == p2)
			return true; //true is returned
		return false;

	}

}
