package com.chapter2.linkedlist;

public class Q3_DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Node head = null;
		head = createList(); //get the pointer to the 3rd node from the start
		printList(head);
		Node delete = head;
		for(int i = 1 ; i < n ; i++){
			delete = delete.next;
		}
		System.out.println("");
		deleteNode(delete);
		printList(head);
		
	}

	private static boolean deleteNode(Node delete) {
		// TODO Auto-generated method stub
		if(delete == null || delete.next == null){
			return false;
		}
		
		Node current = delete;
		current.data = delete.next.data;
		current.next = delete.next.next;
		delete = null;
		return true;
	}

	/*
	 * Returns the n'th node from the start
	 */
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
