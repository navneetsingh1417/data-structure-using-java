package linkedlist;

import java.util.Scanner;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList li = new SinglyLinkedList();
		li.insertAtLast(10);
		li.insertAtLast(20);
		li.insertAtLast(30);
		li.insertAtLast(40);
		li.printList();
		li.insertAtHead(50);
		li.printList();
		li.insertAt(2, 60);
		li.printList();
		li.delete(60);
		li.printList();
	}

}
