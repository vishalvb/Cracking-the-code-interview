package com.chapter2.linkedlist;

class Stack {
	int top = -1;
	int array[] = new int[100];
	
	public void push(int data){
		array[++top] = data;
		//top++;
	}
	public int pop(){
		//System.out.println(top + ""+array[top-1]);
		return array[top--];
	}
}

public class Q6_Palindrome_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {5,9,7,9,5};
		Node Palindrome  = createList(number);
		System.out.println(plaindrome(Palindrome));
	}
	
	private static boolean plaindrome(Node palindrome) {
		// TODO Auto-generated method stub
		Node head = palindrome;
		if(head == null){
			return false;
		}
		Stack st = new Stack();
		int count = 0;
		while(palindrome.next != null){
			count++;
			st.push(palindrome.data);
			palindrome = palindrome.next;
		}
		st.push(palindrome.data);
		for(int i = 0;i<(count+1)/2;i++){
			int pop = st.pop();
			//System.out.println(head.data+" "+pop);
			if(head.data == pop){
				head = head.next;
				continue;
			}else{
				return false;
			}
		}
	
		return true;
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
}
