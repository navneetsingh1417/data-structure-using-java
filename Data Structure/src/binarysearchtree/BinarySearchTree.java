package binarysearchtree;


public class BinarySearchTree {

	
	class Node{
		
		int data;
		Node left;
		Node right;
	}

		 Node root;
		
		public void addNode(int x) {
			Node newNode = new Node();
			newNode.data = x;
			if(root == null) {
				root = newNode;
			}
			else {
				Node current = root;
				while(true) {
					
					if(x < current.data) {
						if(current.left == null) {
							current.left = newNode;
							return;
						}
						current = current.left;
						
//						current = current.left;
//						if(current == null) {
//							current.left = newNode;
//							return;
//						}
					}
					else {
						if(current.right == null) {
							current.right = newNode;
							return;
						}
						current = current.right;
						
						
						
//						current = current.right;
//						if(current == null) {
//							current.right = newNode;
//							return;
//						}
					}
				}
			}
		}
		
		
		public void preOrder(Node root) {
			if(root == null)
				return;
			System.out.print(" "+root.data);
			preOrder(root.left);
			preOrder(root.right);
			
		}
		public void inOrder(Node root) {
			if(root == null)
				return;

			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
			
		}
		public void postOrder(Node root) {
			if(root == null)
				return;
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" "+root.data);
			
		}
		

}
	