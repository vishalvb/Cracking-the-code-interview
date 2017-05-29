package com.chapter2.linkedlist;

public class ReturnKLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		int n = 4;
		head = createList();
		printList(head);
		System.out.println("");
		System.out.println(returnKthLast(head,n));

	}
	private static int returnKthLast(Node head, int n) {
		// TODO Auto-generated method stub
		int counter = 0;
		Node current = head;
		while(head != null){
			if(counter != n){
				head = head.next;
				counter++;
			}
			else{
				head = head.next;
				current = current.next;
			}
		}
		return current.data;
	}
	private static Node createList() {
		// TODO Auto-generated method stub
		Node head = null;
		Node previous = null;
		int number[] = {1,2,3,4,5,6,7,8};
		for(int data: number){
			Node temp = new Node();
			temp.data = data;
			temp.next = null;
			if(head == null){
				head = temp;
				previous = temp;
			}
			else{
			previous.next = temp;
			previous = temp;
			}
		}
		
		return head;
	}
	
	private static void printList(Node head) {
		// TODO Auto-generated method stub
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
