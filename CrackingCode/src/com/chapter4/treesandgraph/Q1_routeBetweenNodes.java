package com.chapter4.treesandgraph;

import java.util.LinkedList;

public class Q1_routeBetweenNodes {

	public static boolean routeSearch(Graph g, Node start, Node end){
		if(start == end){
			return true;
		}
		
		start.status = "visiting";
		LinkedList<Node> q= new LinkedList<Node>(); 
		
		q.add(start);
		Node u;
		while(!q.isEmpty()){
			u = q.remove();
			if(u != null){
				for(Node n:u.getAdjacent()){
					if(n.status == "unvisited"){
						if(n == end){
							return true;
						}
						else{
							n.status = "visiting";
							q.add(n);
						}
					}
					
				}
				u.status = "visited";
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		Node node[] = new Node[6];
		
 		node[0] = new Node(0,2);
 		node[1] = new Node(1,0);
 		node[2] = new Node(2,1);
 		node[3] = new Node(3,1);
 		node[4] = new Node(4,0);
 		node[5] = new Node(5,0);
 		
 		node[0].addAdjacent(node[1]);
 		node[0].addAdjacent(node[2]);
 		node[2].addAdjacent(node[3]);
 		node[3].addAdjacent(node[4]);
 		//node[4].addAdjacent(node[5]);
 		//node[1].addAdjacent(node[5]);
 		//node[5].addAdjacent(node[0]);
 		for(int i = 0 ; i < 6;i++){
 			graph.addNodes(node[i]);
 		}
 		
 		Node nodes[] = graph.getNodes();
 		boolean adj = routeSearch(graph,nodes[0],nodes[5]);
 		System.out.println("route present"+adj);
	}

}
