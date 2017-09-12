package com.chapter4.treesandgraph;

public class Q4_checkBalanced {
	
	int checkHeight(MinimalNode root){
		if(root == null){
			return -1;
		}
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		
		int height = Math.abs(rightHeight-leftHeight);
		if(height > 1 ){
			return Integer.MIN_VALUE;
		}
		else{
			return Math.max(rightHeight, leftHeight) +1;
		}
	}
	
	boolean isBalanced(MinimalNode root){
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
	
	public static void main(String args[]){
		int array[] = {1,2,3,4,5,6,7,8,9};
		Q2_minimalTree n = new Q2_minimalTree();
		MinimalNode rootNode = new MinimalNode();
		rootNode = n.createMinimalTree(array,0,array.length - 1);
		
		Q4_checkBalanced root = new Q4_checkBalanced(); 
		System.out.println("Is tree Balanced? "+root.isBalanced(rootNode));
	}

}
