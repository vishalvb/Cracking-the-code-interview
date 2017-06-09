package com.chapter2.linkedlist;

class Result{
	public Result(Node palindrome, boolean b) {
		// TODO Auto-generated constructor stub
		node = palindrome;
		result = b;
	}
	public Node node;
	public boolean result;
}

public class Q6_Palindrome_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {5,9,4,9,5};
		Node Palindrome  = createList(number);
		System.out.println(plaindrome(Palindrome));
	}
	
	private static boolean plaindrome(Node palindrome) {
		// TODO Auto-generated method stub
		int length = LengthOfList(palindrome);
		
		Result p = isPlaindromrRecurse(palindrome,length);
		
		return p.result;
		//return true;
	}
	
	
	private static Result isPlaindromrRecurse(Node palindrome, int length) {
		// TODO Auto-generated method stub
		if(palindrome == null || length<= 0){
			return new Result(palindrome,true);
		}
		else if(length == 1){
			return new Result(palindrome.next,true);
		}
		
		
		Result res = isPlaindromrRecurse(palindrome.next, length - 2);
		
		if(!res.result || res.node == null){
			return res;
		}
		
		res.result = (palindrome.data == res.node.data);
		res.node = res.node.next;
		
		
		return res;
	}

	private static int LengthOfList(Node palindrome) {
		// TODO Auto-generated method stub
		int count = 0;
		while(palindrome != null){
			palindrome = palindrome.next;
			count++;
		}
		return count;
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
