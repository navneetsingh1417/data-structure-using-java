package doublylinkedlist;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList l = new DoublyLinkedList();
		l.insertAtBeg(10);
		l.insertAtTail(20);
		l.insertAtTail(30);
		l.printList();
		l.insertAtBeg(5);
		l.printList();
		l.insertAt(2, 15);
		l.printList();
		l.delete(20);
		l.printList();
	}

}
