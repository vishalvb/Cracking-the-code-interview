package com.chapter1.arrayandstring;

public class Q4_Palindrome_Permutation {

	public static void main(String[] args) {
		String input = "tact cbda";
		System.out.println(permutation(input));

	}

	private static boolean permutation(String input) {
		int countOdd = 0;
		int table[] = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for ( char c : input.toCharArray()){
			int x = getCharNumber(c);
			if(x != -1){
				table[x]++;
				if (table[x] % 2 == 1){
					countOdd++;
				}else{
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	private static int getCharNumber(char c) {
		int val = Character.getNumericValue(c);
		int a = Character.getNumericValue('a');
		System.out.println(a+" "+val+" "+c);
		int z = Character.getNumericValue('z');
		if (a <= val && val <= z){
			return val - a;
		}
		return -1;
	}

}
