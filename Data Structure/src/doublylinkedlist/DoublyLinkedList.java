package doublylinkedlist;

class Node{
	int data;
	Node next;
	Node prev;
}

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public void insertAtBeg(int x) {
		Node newNode = new Node();
		newNode.data = x;
		newNode.prev = null;
		newNode.next = null;
		if(head == null) {
			head = newNode;
			tail = head;
		}
		else {
			newNode.data = head.data;
			newNode.next = head.next;
			newNode.prev = head;
			head.data = x;
			head.next = newNode;
			tail = newNode;
		}
		
	}
	public void insertAtTail(int x) {
		Node newNode = new Node();
		Node current = head;
		newNode.data = x;
		newNode.next = null;
		newNode.prev = null;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		newNode.prev = current;
		tail = newNode;
	}
	public void insertAt(int loc,int x) {
		Node newNode = new Node();
		newNode.data = x;
		Node current = head;
		Node previous = head;
		int count = 0;
		while(current.next != null && count !=loc) {
			previous = current;
			current = current.next;
			count++;
		}
		previous.next = newNode;
		newNode.prev = previous;
		newNode.next = current;
	}
	
	public void delete(int key) {
		Node current = head;
		Node previous = head;
		while(current != null && current.data != key) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
		current.next.prev = previous;
	}
	public void printList() {
		Node current = head;
		while(current.next != null) {
			System.out.print(" "+current.data);
			current = current.next;
		}
		System.out.print(" "+current.data);
		System.out.println();
	}
	
	public int getLength() {
		return length;
	}
	public boolean isEmpty() {
		return head==null;
	}
}
