package com.chapter1.arrayandstring;

public class Q3_URLify {

	public static void main(String[] args) {
		String temp = "Mr John Smith     ";
		char input[] = temp.toCharArray();
		int number = 13;
		URLify(temp,number,input);
		
	}

	private static void URLify(String temp, int number, char[] input) {
		// TODO Auto-generated method stub
		char output[] = new char[temp.length()];
		int size = temp.length() - 1;
		for(int i = 0,j=0; i < size; i++,j++){
			if(input[i] != ' '){
				output[j] = input[i];
			}
			else{
				output[j] = '%';
				output[j+1] = '2';
				output[j+2] = '0';
				size-=2;
				j+=2;
				//i+=2;
			}
		}
		System.out.println(output);
		
	}

}
