package com.chapter1.arrayandstring;

public class Q7_RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][] = { {1,2,3,4}, {8,7,6,5}, {12,11,10,9}, {16,15,14,13}};
		int output[][] = rotatematrix(input,4);
		for(int i = 0; i < 4; i++){
			for(int j = 0 ; j < 4 ; j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i = 0; i < 4; i++){
			for(int j = 0 ; j < 4 ; j++){
				System.out.print(output[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	private static int[][] rotatematrix(int[][] input, int n) {
		int i = 0;
		int j = 0;
		int newi = 0;
		int newj = 0;
		int output[][] = new int[n][n];
		int limit = n/2;
		for(int k = 0; k < limit;k++){
			for(i = k, j = k, newi = k, newj = n-1-k; j < n-1-k; j++, newi++){
				output[newi][newj] = input[i][j];
			}
			for(i = k, j = n-1-k, newi = n-1-k, newj = n-1-k; i < n-1-k; i++, newj--){
				output[newi][newj] = input[i][j];
			}
			for(i = n-1-k,j = n-1-k, newi = n-1-k, newj = k  ; j >= k; j--, newi--){
				output[newi][newj] = input[i][j];
			}
			for(i = n-1-k, j = k, newi = k, newj = k; i > k; i--, newj++){
				output[newi][newj] = input[i][j];
			}
		
		}
		return output;
	}

}
/*for(i = 0, j = 0, newi = 0, newj = n-1; j < n-1; j++, newi++){
	output[newi][newj] = input[i][j];
}
for(i = 0, j = n-1, newi = n-1, newj = n-1; i < n-1; i++, newj--){
	output[newi][newj] = input[i][j];
}
for(i = n-1,j = n-1, newi = n-1, newj = 0  ; j >= 0; j--, newi--){
	output[newi][newj] = input[i][j];
}
for(i = n-1, j = 0, newi = 0, newj = 0; i > 0; i--, newj++){
	output[newi][newj] = input[i][j];
}*/
