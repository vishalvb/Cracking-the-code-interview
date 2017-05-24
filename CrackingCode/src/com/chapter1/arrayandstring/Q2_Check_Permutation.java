package com.chapter1.arrayandstring;

public class Q2_Check_Permutation {
	
	public static void main(String args[]){
		String s1 = "abc";
		String s2 = "cba";
		if(permutation(s1,s2)){
			System.out.println("Both Strings are permutation of each other");
		}
		else{
			System.out.println("String are not permutation of each other");
		}
	}

	private static boolean permutation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() != s2.length()){
			return false;
		}
		
		int length[] = new int[128];
		for(char c: s1.toCharArray()){
			length[c]++;
		}
		for(char c: s2.toCharArray()){
			length[c]--;
			if(length[c] < 0){
				return false;
			}
		}
		return true;
	}
}
