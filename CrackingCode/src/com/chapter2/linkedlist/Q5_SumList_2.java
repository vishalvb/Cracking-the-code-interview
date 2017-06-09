package com.chapter2.linkedlist;

/*
 * This will add even if the lists (numbers) are of different size
 */
public class Q5_SumList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {7,1,6};
		Node List1  = createList(number);
		printList(List1);
		System.out.println("");
		int number2[] = {5,9,4};
		Node List2 = createList(number2);
		printList(List2);
		System.out.println("");
		Node FinalList = sumList(List1,List2);
		printList(FinalList);
		
	}
	
	private static Node sumList(Node list1, Node list2) {
		// TODO Auto-generated method stub
		int carry = 0;
		Node newNode = null;
		Node currentHead = null;
		while(list1 != null && list2 != null){
			
			int temp_sum = list1.data + list2.data + carry;
			int add_to_list = temp_sum % 10;
			carry = temp_sum / 10;
			newNode = new Node();
			newNode.data = add_to_list;
			
			if(currentHead == null){
				//currentHead = newNode;
				newNode.next = null;
			}
			else{
			newNode.next = currentHead;
			//currentHead = newNode;
			}
			currentHead = newNode;
			
			
			list1 = list1.next;
			list2 = list2.next;
		}
		if(carry > 0){
			newNode = new Node();
			newNode.data = carry;
			newNode.next = currentHead;
			currentHead = newNode;
		}
		//System.out.println(carry);
		
		return currentHead;
	}

	private static Node createList(int number[]) {
		// TODO Auto-generated method stub
		Node head = null;
		Node previous = null;
		//int number[] = {3,5,8,5,10,2,1};
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
