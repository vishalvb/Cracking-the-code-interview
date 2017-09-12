package com.chapter4.treesandgraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q3_listOfDepths {
	
	public ArrayList<LinkedList<MinimalNode>> createList(MinimalNode root){
		ArrayList<LinkedList<MinimalNode>> mainList = new ArrayList<LinkedList<MinimalNode>>();  
		
		LinkedList<MinimalNode> current= new LinkedList<MinimalNode>();
		//current.add(root);
		
		if(root != null){
			current.add(root);
		}
		
		while(current.size() > 0){
			LinkedList<MinimalNode> parents = new LinkedList<MinimalNode>();
			mainList.add(current);
			parents = current;
			current = new LinkedList<MinimalNode>();
			for(MinimalNode n:parents){
				if(n.left != null)
					current.add(n.left);
				if(n.right != null)
					current.add(n.right);
			}
			
		}
		return mainList;
	}
	
	public void  print(ArrayList<LinkedList<MinimalNode>> root){
		
		if(root == null){
			System.out.println("Empty list");
		}
		
		LinkedList<MinimalNode> current = new LinkedList<MinimalNode>();
		int length = root.size();
		//System.out.println("length"+length);
		//current = root.get(0);
		
		for(int i = 0; i < length; i++){
			current = root.get(i);
			//System.out.println("current size"+current.size());
			for(MinimalNode n : current){
				System.out.println("data is:"+n.data);
			}
		}
	}
	
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		Q2_minimalTree n = new Q2_minimalTree();
		MinimalNode root = new MinimalNode();
		root = n.createMinimalTree(array,0,array.length - 1);
		Q3_listOfDepths list = new Q3_listOfDepths();
		ArrayList<LinkedList<MinimalNode>> arrayRoot = list.createList(root);
		list.print(arrayRoot);
		
	}

}
