package com.chapter4.treesandgraph;

import java.util.Stack;

public class Q1_routeBetweenNodes_DFS {

	public static boolean routeSearch(Graph g, Node start, Node end){
		if(start == end){
			return true;
		}
		
		start.status = "visiting";
		Stack<Node> q= new Stack<Node>(); 
		
		q.push(start);
		Node u;
		while(!q.isEmpty()){
			u = q.pop();
			System.out.println("data is:"+u.getData());
			if(u != null){
				if(u == end){
					return true;
				}
				else{
					for(Node n:u.getAdjacent()){
						q.push(n);
					}
				}
				
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		Node node[] = new Node[6];
		
 		node[0] = new Node(0,2);
 		node[1] = new Node(1,1);
 		node[2] = new Node(2,1);
 		node[3] = new Node(3,0);
 		node[4] = new Node(4,0);
 		node[5] = new Node(5,0);
 		
 		node[0].addAdjacent(node[1]);
 		node[0].addAdjacent(node[2]);
 		node[2].addAdjacent(node[3]);
 		node[1].addAdjacent(node[4]);
 		//node[4].addAdjacent(node[5]);
 		//node[1].addAdjacent(node[5]);
 		//node[5].addAdjacent(node[0]);
 		for(int i = 0 ; i < 6;i++){
 			graph.addNodes(node[i]);
 		}
 		
 		Node nodes[] = graph.getNodes();
 		boolean adj = routeSearch(graph,nodes[0],nodes[3]);
 		System.out.println("route present"+adj);
	}

}
