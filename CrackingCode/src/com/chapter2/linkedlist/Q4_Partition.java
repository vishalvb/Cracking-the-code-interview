package com.chapter2.linkedlist;

public class Q4_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		int pivot = 5;
		head = createList();
		printList(head);
		head = partition(head,pivot);
		System.out.println("");
		printList(head);
	}
	private static Node partition(Node head,int pivot) {
		// TODO Auto-generated method stub
		Node small = null;
		Node large = null;
		Node large_head = null;
		Node small_head = null;
		if(head == null || head.next == null){
			return head;
		}
		while(head != null){
			//System.out.println("inside while");
			Node temp = new Node();
			temp.data = head.data;
			temp.next = null;
			
			if(head.data < pivot){
				if(small == null){
					small = temp;
					small_head = small;
				}
				else{
					small.next = temp;
					small = small.next;
				}
				//printList(small);
				
			}
			else{
				if(large == null){
					large = temp;
					large_head = large;
				}
				else{
					large.next = temp;
					large = large.next;
				}
				
			}
			head = head.next;
		}
		//System.out.println("");
		//printList(small_head);
		//System.out.println("");
		//printList(large_head);
		small.next = large_head;
		//printList(small_head);
		return small_head;
		
	}
	private static Node createList() {
		// TODO Auto-generated method stub
		Node head = null;
		Node previous = null;
		int number[] = {3,5,8,5,10,2,1};
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
