package linkedlist;

class Node{
	
	int data;
	Node next;
}

public class SinglyLinkedList  {
	
	private Node head;
	
	public void insertAtLast(int x) {
		
		Node newNode = new Node();
		newNode.data=x;
		newNode.next=null;
		if(head==null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	public void insertAtHead(int x) {
		Node newNode = new Node();
		Node current = head;
		newNode.data = head.data;
		head.data = x;
		newNode.next = head.next;
		head.next = newNode;
	}
	public void insertAt(int loc, int x) {
		Node newNode = new Node();
		Node current = head;
		Node previous = null;
		int count = 0;
		newNode.data = x;
		newNode.next = null;
		while(current.next != null && count != loc) {
			previous = current;
			current=current.next;
			count++;
		}
		previous.next = newNode;
		newNode.next=current;
		
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
	public void delete(int x) {
		Node current=head;
		Node previous=null;
		while(current != null && current.data!=x) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
	}
}
