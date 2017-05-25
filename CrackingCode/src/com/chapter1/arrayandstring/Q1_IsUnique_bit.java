package com.chapter1.arrayandstring;

import java.util.Hashtable;

public class Q1_IsUnique_bit {

	public static void main(String []args){
	
		String str = "abbc";
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
			if((check & (1 << value))> 0){
				return false;
			}
			check |= (1 << value);
		}
		return true;
	}
}
