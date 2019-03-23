package binarysearchtree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(75);
		tree.addNode(15);
		tree.addNode(30);
		tree.addNode(85);
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
	}
}
