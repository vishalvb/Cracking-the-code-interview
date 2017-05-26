package com.chapter1.arrayandstring;

import java.util.Hashtable;

public class Q1_IsUnique_bit {

	public static void main(String []args){
	
		String str = "abd";
		if(isUnique_bit(str)){
			System.out.println("Unique characters");
		}
		else{
			System.out.println("Not unique");
		}
	}

	private static boolean isUnique_bit(String str) {
		int check = 0;
		for( int i = 0; i < str.length(); i++){
			int value = str.charAt(i) - 'a';
			System.out.println(value+" "+Integer.toBinaryString(value)+" "+(1 << value));
			if((check & (1 << value))> 0){
				return false;
			}
			check |= (1 << value);
			System.out.println("check"+check);
		}
		return true;
	}
}
