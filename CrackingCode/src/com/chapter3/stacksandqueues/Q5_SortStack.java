package com.chapter3.stacksandqueues;

import java.util.Stack;

public class Q5_SortStack {

	public Q5_SortStack() {
		// TODO Auto-generated constructor stub
	}
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public void push(int item){
		s1.push(item);
	}
	
	public void sortStack() throws Exception{
		if(s1.isEmpty()){
			System.out.println("Empty stack");
			throw new Exception();
		}
		else{
			int count = 0;
			while(!s1.isEmpty()){
				
				int temp = (int)s1.pop();
				if(s2.isEmpty()){
					s2.push(temp);
				}
				else{
					count = 0;
					while(!s2.isEmpty() && (int)s2.peek() < temp){
						s1.push(s2.pop());
						count++;
					}
					s2.push(temp);
					for(int i = 0; i< count;i++){
						s2.push(s1.pop());
					}
					
				}
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		Q5_SortStack stack = new Q5_SortStack();
		stack.push(7);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.sortStack();
		System.out.println(stack.s2.pop());
		System.out.println(stack.s2.pop());
		System.out.println(stack.s2.pop());
		System.out.println(stack.s2.pop());
		System.out.println(stack.s2.pop());
		

	}

}
