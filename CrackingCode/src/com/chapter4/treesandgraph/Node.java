package com.chapter4.treesandgraph;

class Node{
	private Node adjacent[];
	private int data;
	private int adjacentCount;
	String status = "unvisited";
	Node(int data, int length){
		this.data = data;
		adjacentCount = 0;
		adjacent = new Node[length];
	}
	
	public void addAdjacent(Node n){
		this.adjacent[adjacentCount] = n;
		this.adjacentCount++;
		//n.adjacentCount++;
	}
	
	public Node[] getAdjacent(){
		return this.adjacent;
	}
	
	public int getData(){
		return data;
	}
	
}

