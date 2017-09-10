package com.chapter4.treesandgraph;

class MinimalNode{
	int data;
	MinimalNode left;
	MinimalNode right;
}


public class Q2_minimalTree {
	
	
	public MinimalNode createMinimalTree(int [] array, int start, int end){
		if(end < start){
			return null;
		}
		int middle = (start + end) / 2;
		MinimalNode node = new MinimalNode();
		node.data = array[middle];
		node.left = createMinimalTree(array, start, middle - 1);
		node.right = createMinimalTree(array, middle + 1, end);
		return node;
	}
	
	public void printMinimalTree(MinimalNode root){
		if(root == null){
			return;
		}
			printMinimalTree(root.left);
			System.out.println(root.data+" ");
			printMinimalTree(root.right);
		
	}
	
	public static void main(String args[]){
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		Q2_minimalTree n = new Q2_minimalTree();
		MinimalNode root = new MinimalNode();
		root = n.createMinimalTree(array,0,array.length - 1);
		
		System.out.println("Printing the data in in-order\n");
		n.printMinimalTree(root);
		
		
	}

}
