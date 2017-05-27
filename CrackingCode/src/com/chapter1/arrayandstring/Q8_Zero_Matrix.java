package com.chapter1.arrayandstring;

import java.util.ArrayList;

public class Q8_Zero_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][] = { {1,2,3}, {4,0,6}, {5,8,9}};
		int i = 0 ;
		int j = 0;
		for(i = 0; i < input.length;i++){
			for(j = 0; j < input.length;j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		zeroMatrix(input);
		for(i = 0; i < input.length;i++){
			for(j = 0; j < input.length;j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void zeroMatrix(int[][] input) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayi = new ArrayList<>();
		ArrayList<Integer> arrayj = new ArrayList<>();
		int i = 0; 
		int j = 0;
		for(i = 0; i < input.length;i++){
			for(j = 0; j < input.length;j++){
				if(input[i][j] == 0){
					arrayi.add(i);
					arrayj.add(j);
					break;
				}
			}
		}
		System.out.println(arrayi);
		System.out.println(arrayj);
		for(i = 0; i < input.length;i++){
			for(j = 0; j < input.length;j++){
				if(arrayi.contains(i) || arrayj.contains(j)){
					input[i][j]=0;
				}
			}
		}
		
		
	}

}
