package com.chapter4.treesandgraph;


public class Q1_routeBetweenNodes {

	public void routeSearch(Graph g, Node start, Node end){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		Node node[] = new Node[6];
		
 		node[0] = new Node(1,2);
 		node[1] = new Node(2,1);
 		node[2] = new Node(3,1);
 		node[3] = new Node(4,1);
 		node[4] = new Node(5,1);
 		node[5] = new Node(6,1);
 		
 		node[0].addAdjacent(node[1]);
 		node[0].addAdjacent(node[2]);
 		node[2].addAdjacent(node[3]);
 		node[3].addAdjacent(node[4]);
 		node[4].addAdjacent(node[5]);
 		node[1].addAdjacent(node[5]);
 		node[5].addAdjacent(node[0]);
 		for(int i = 0 ; i < 6;i++){
 			graph.addNodes(node[i]);
 		}
	}

}
