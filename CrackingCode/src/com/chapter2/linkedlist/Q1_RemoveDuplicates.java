package com.chapter2.linkedlist;

import java.util.HashSet;

class Node{
	Node next;
	int data;
}

public class Q1_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = createList();
		printList(head);
		removeDuplicates(head);
		printList(head);

	}

	private static void removeDuplicates(Node head) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		Node previous = head;
		Node n = head;
		while(n != null){
			if(set.contains(n.data)){
				previous.next = n.next;
			}
			else{
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static Node createList() {
		// TODO Auto-generated method stub
		Node head = null;
		Node previous = null;
		int number[] = {1,2,3,4,2,6,6,6,6,6};
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

}
