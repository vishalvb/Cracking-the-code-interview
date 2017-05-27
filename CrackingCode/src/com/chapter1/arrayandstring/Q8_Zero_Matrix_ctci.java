package com.chapter1.arrayandstring;

import java.util.ArrayList;

public class Q8_Zero_Matrix_ctci {

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
		boolean rowHasZero = false;
		boolean colHasZero = false;
		int i = 0;
		int j = 0;
		
		for(j = 0; j < input[0].length;j++){
			if(input[0][j] == 0){
				rowHasZero = true;
				break;
			}
		}
		for(i = 0; i < input.length;i++){
			if(input[i][0] == 0){
				colHasZero = true;
				break;
			}
		}
		
		for(i = 1; i < input.length; i++){
			for(j = 1; j < input[0].length; j++){
				if(input[i][j] == 0){
					input[i][0] = 0;
					input[0][j] = 0;
				}
			}
		}
		
		for(i = 1; i < input.length;i++){
			if(input[i][0] == 0){
				nullifyRow(input,i);
			}
		}
		
		for(j = 1; j < input[0].length;j++){
			if(input[0][j] == 0){
				nullifyCol(input,j);
			}
		}
		
		if(rowHasZero) nullifyRow(input,0);
		if(colHasZero) nullifyCol(input,0);
		
	}

	private static void nullifyCol(int[][] input, int j) {
		// TODO Auto-generated method stub
		for(int i = 0; i < input.length;i++){
			input[i][j] = 0;
		}
	}

	private static void nullifyRow(int[][] input, int i) {
		// TODO Auto-generated method stub
		for(int j = 0; j < input[0].length;j++){
			input[i][j] = 0;
		}
	}
	
}
