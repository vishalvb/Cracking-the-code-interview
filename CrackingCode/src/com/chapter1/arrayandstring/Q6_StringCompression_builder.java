package com.chapter1.arrayandstring;

public class Q6_StringCompression_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcccccab";
		System.out.println(stringCompression(input));
	}

	private static StringBuilder stringCompression(String input) {
		
		int counter = 1;
		StringBuilder output = new StringBuilder();
		int i = 0;
		int length = input.length();
		for(i = 0 ; i < length - 1; i++){
			if(input.charAt(i) == input.charAt(i+1)){
				counter++;
			}
			else{
				output.append(input.charAt(i));
				output.append(counter);
				
				counter = 1;
			}
			
		}
		//if(counter>1){
		output.append(input.charAt(length-1));
		output.append(counter);
		//output = output+input.charAt(length-1)+counter;
		//}
		return output;
	}

}
