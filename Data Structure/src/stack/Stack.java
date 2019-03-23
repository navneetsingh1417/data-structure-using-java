package stack;

import java.util.Arrays;

public class Stack {
	 int MAX=3;
	int arr[]=new int[MAX];
	int top=-1;
	
	public void push(int data) {
		if(top == MAX-1) {
//			System.out.println("Stack Overflow");
//			return;
			arr = Arrays.copyOf(arr, MAX*2);
		}
		arr[++top]=data;
	}
	
	public void size() {
		System.out.println(arr.length);
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		top--;
	}
	public void show() {
		for(int i=0;i<=top;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	public int top() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
}
