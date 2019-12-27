package graph.bfs;
import java.util.*;
import node.*;

/**
 * The Class BFSByLinkedList.
 */
public class BFSByLinkedList {

	/** The node list. */
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	
	/**
	 * Instantiates a new BFS by linked list.
	 *
	 * @param nodeList the node list
	 */
	//Constructor
	public BFSByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}//end of method
	
	
	/**
	 * Bfs.
	 */
	//BFS Algorithm
	void bfs() {
		//if a node is unvisited then run bfs on it
		for(GraphNode node: nodeList) {
			if(!node.isVisited())
				bfsVisit(node);
		}
	}//end of method
	
	
	
	/**
	 * Bfs visit.
	 *
	 * @param node the node
	 */
	//BFS internal method
	void bfsVisit(GraphNode node) {
		LinkedList<GraphNode>queue = new LinkedList<>();
		queue.add(node); //add source node to queue
		while(!queue.isEmpty()) {
			GraphNode presentNode = queue.remove(0);
			presentNode.setVisited(true);
			System.out.print(presentNode.getName()+" ");
			for(GraphNode neighbor: presentNode.getNeighbors()) { //for each neighbor of present node
				if(!neighbor.isVisited()) { //if neighbor is not visited then add it to queue
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}//end of for loop
		}//end of while loop
	}//end of method
	
	
	
	
	/**
	 * Adds the undirected edge.
	 *
	 * @param i the i
	 * @param j the j
	 */
	// Add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(j-1);
		first.getNeighbors().add(second);//Neighbour of first is second. Store it.
		second.getNeighbors().add(first);//Neighbour of second is first. Store it.
	}//end of method
	
}//end of class
