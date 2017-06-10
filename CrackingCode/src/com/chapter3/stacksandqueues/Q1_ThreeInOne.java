package com.chapter3.stacksandqueues;

import java.util.EmptyStackException;

public class Q1_ThreeInOne {

	private int number = 3;
	private int stackSize;
	private int[] array;
	private int[] sizes;
	
	public Q1_ThreeInOne(int stackSize){
		this.stackSize = stackSize;
		array = new int[stackSize * number];
		sizes = new int[number];
	}
	
	public void push(int number, int value) throws Exception{
		if(isFull(number)){
			throw new Exception();
		}
		sizes[number]++;
		array[indexOfTop(number)] = value;
	}
	
	public int pop(int stackNum){
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		int topIndex = indexOfTop(stackNum);
		int value = array[topIndex];
		array[topIndex] = 0;
		sizes[stackNum] --;
		return value;
	}
	
	
	public int peek(int number){
		if(isEmpty(number)){
			throw new EmptyStackException();
		}
		return array[indexOfTop(number)];
	}
	
	public boolean isEmpty(int number){
		return sizes[number] == 0;
	}
	
	public boolean isFull(int number){
		return sizes[number] == stackSize;
	}
	
	public int indexOfTop(int number){
		int offset = number * stackSize;
		int size = sizes[number];
		return offset + size - 1;
	}
	
	
	
	public static void main(String[] args) {
	
		Q1_ThreeInOne stack = new Q1_ThreeInOne(5);
		try {
			stack.push(2, 1);
			stack.push(2, 3);
			stack.push(2, 3);
			stack.push(2, 4);
			stack.push(1, 7);
			stack.push(0, 8);
			stack.push(1, 9);
			stack.push(0, 10);
			stack.push(2, 11);
			
			//stack.pop(1);
			System.out.println(stack.pop(2));
			System.out.println(stack.pop(2));
			System.out.println(stack.pop(2));
			System.out.println(stack.peek(2));
			System.out.println(stack.peek(1));
			System.out.println(stack.peek(0));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	

}
