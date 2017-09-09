package com.chapter4.treesandgraph;

public class Graph {
	private Node nodes[];
	private int nodeCount;
	
	public Graph(){
		nodeCount = 0;
		nodes = new Node[6];
	}
	
	public void addNodes(Node n){
		nodes[nodeCount] = n;
		nodeCount++;
	}
	
	public Node[] getNodes(){
		return nodes;
	}
}
