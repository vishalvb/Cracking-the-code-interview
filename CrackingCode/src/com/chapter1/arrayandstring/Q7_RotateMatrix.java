package com.chapter1.arrayandstring;

public class Q7_RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][] = { {1,2,3,4}, {8,7,6,5}, {12,11,10,9}, {16,15,14,13}};
		
		for(int i = 0; i < 4; i++){
			for(int j = 0 ; j < 4 ; j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println("");
		}
		rotatematrix(input,4);
		System.out.println("");
		for(int i = 0; i < 4; i++){
			for(int j = 0 ; j < 4 ; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	private static void rotatematrix(int[][] input, int n) {
		
		int limit = n/2;//number of times to perform the operation
		for(int k = 0; k < limit;k++){
			int first = k;
			int last  = n - 1 - k;
			for(int i = first; i < last; i++){
				int offset = i - first;
				int top = input[first][i];
				input[first][i] = input[last - offset][first];
				input[last - offset][first] = input[last][last - offset];
				input[last][last - offset] = input[i][last];
				input[i][last] = top;
			}
		}
		//return output;
	}

}
