package com.chapter3.stacksandqueues;

import java.util.Stack;

public class Q4_QueueViaStack<T> {

	Stack<T> stackNewest, stackOldest;
	public Q4_QueueViaStack(){
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(T value){
		stackNewest.push(value);
	}
	
	private void shiftStacks(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	
	public T pop(){
		shiftStacks();
		return stackOldest.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4_QueueViaStack<Integer> stack = new Q4_QueueViaStack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		System.out.println(stack.pop());
		stack.add(5);
		stack.add(6);
		stack.add(7);
		System.out.println(stack.pop());
		
	}

}
