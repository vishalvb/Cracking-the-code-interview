package com.chapter2.linkedlist;

/*
 * This will correctly add if the list (numbers) are of same size only
 */
public class Q5_SumList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {5,9,4};
		Node List1  = createList(number);
		printList(List1);
		System.out.println("");
		int number2[] = {7,1,6,1};
		Node List2 = createList(number2);
		printList(List2);
		System.out.println("");
		Node FinalList = sumList(List1,List2);
		printList(FinalList);
		
	}
	
	private static Node sumList(Node list1, Node list2) {
		// TODO Auto-generated method stub
		int counter1 = 0;
		int counter2 = 0;
		Node temp_list1 = list1;
		Node temp_list2 = list2;
		while(temp_list1 != null){
			counter1++;
			temp_list1 = temp_list1.next;
		}
		while(temp_list2 != null){
			counter2++;
			temp_list2 = temp_list2.next;
		}
		if(counter1 != counter2){
			//System.out.println("inside counter check");
			Node newNode = null;
			if(counter1 > counter2){ // list2 is smaller, so make it equal to list1
				temp_list2 = list2;
				while(temp_list2.next != null){
					temp_list2 = temp_list2.next;
				}
				while(counter1 != counter2){
					newNode = new Node();
					newNode.data = 0;
					newNode.next = null;
					temp_list2.next = newNode;
					
					counter1--;
				}
				
			}
			else{// list1 is smaller, so make it equal to list2
				temp_list1 = list1;
				while(temp_list1.next != null){
					temp_list1 = temp_list1.next;
				}
				while(counter1 != counter2){
					newNode = new Node();
					newNode.data = 0;
					newNode.next = list1;
					temp_list1.next = newNode;
					counter2--;
				}
			}	
			
		}
		//System.out.println(list1.data+"  "+"\n");
		//System.out.println(list2.data+"  "+"\n");
		//printList(list2);
		System.out.println("");
		
		int carry = 0;
		Node newNode = null;
		Node currentHead = null;
		while(list1 != null && list2 != null){
			//System.out.println("inside while");
			
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
