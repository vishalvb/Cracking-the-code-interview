package com.chapter2.linkedlist;

public class Q8_Loop_Detection {
	public static void main(String[] args) {
		int number[] = {5,9,4,3,2,1};
		Node List1  = createCircularList(number);
		//printList(List1);
		Node result = checkCircularList(List1);
		System.out.println(result + " "+result.data );
	}
	
	private static Node checkCircularList(Node list1) {
		// TODO Auto-generated method stub
		Node slow = list1;
		Node fast = list1.next;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
			
		}
		//System.out.println(slow.data);
	
		if(fast == null || fast.next == null){
			return null;
		}
	
		while (slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	
	}
	
	private static Node createCircularList(int number[]) {
		// TODO Auto-generated method stub
		Node head = null;
		Node previous = null;
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
		previous.next = head;
		System.out.println(previous.data +" "+ previous);
		System.out.println(head.data +" "+ head);
		return head;
	}
	private static void printList(Node head) {
		// TODO Auto-generated method stub
		Node loop = head;
		while(head.next != loop ){
			System.out.print(head+" "+"\n");
			head = head.next;
		}
	}
}

