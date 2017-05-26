package com.chapter1.arrayandstring;

public class Q6_StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcccccabbbb";
		System.out.println(stringCompression(input));
	}

	private static String stringCompression(String input) {
		
		int counter = 1;
		String output = "";
		int i = 0;
		int length = input.length();
		for(i = 0 ; i < length - 1; i++){
			if(input.charAt(i) == input.charAt(i+1)){
				counter++;
			}
			else{
				output = (output+input.charAt(i))+counter;
				
				counter = 1;
			}
			
		}
		//if(counter>1){
			output = output+input.charAt(length-1)+counter;
		//}
		return output;
	}

}
