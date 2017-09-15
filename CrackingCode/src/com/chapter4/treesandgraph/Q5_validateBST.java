package com.chapter4.treesandgraph;

public class Q5_validateBST {
	
	public boolean validate(MinimalNode root){
			return valBST(root,null,null);
	}
	
	public boolean valBST(MinimalNode root, Integer min, Integer max){
		if(root == null){
			return true;
		}
		
		if((min != null && root.data <= min)|| (max!=null && root.data > max))
			return false;
		
		if(!valBST(root.left,min,root.data) || !valBST(root.right,root.data,max))
			return false;
		return true;
	}
	
	
	
	
	public static void main(String args[]){
		int array[] = {1,2,3,4,5,6,7,8,9};
		Q2_minimalTree n = new Q2_minimalTree();
		MinimalNode rootNode = new MinimalNode();
		rootNode = n.createMinimalTree(array,0,array.length - 1);
		
		Q5_validateBST root = new Q5_validateBST(); 
		System.out.println(root.validate(rootNode));
	}
	

}
