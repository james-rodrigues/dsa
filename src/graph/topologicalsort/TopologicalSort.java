package graph.topologicalsort;
import java.util.ArrayList;
import java.util.Stack;
import node.GraphNode;

/**
 * The Class TopologicalSort.
 */
public class TopologicalSort {
	
	/** The node list. */
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	
	/**
	 * Instantiates a new topological sort.
	 *
	 * @param nodeList the node list
	 */
	//Constructor
	public TopologicalSort(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	
	/**
	 * Topological sort.
	 */
	void topologicalSort() {
		Stack<GraphNode>stack = new Stack<>();
		for (GraphNode node : nodeList) { // if a node is unvisited then run topologicalSort on it
			if (!node.isVisited())
				topologicalVisit(node,stack);
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop().getName()+" ");
		}
	}

	
	/**
	 * Topological visit.
	 *
	 * @param node the node
	 * @param stack the stack
	 */
	// Topological visit by a source node
	void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
		for (GraphNode neighbor : node.getNeighbors()){	//if neighbor is not visited then recursive call to it
			if(!neighbor.isVisited()){
				topologicalVisit(neighbor,stack);
			}
		}
		node.setVisited(true);
		stack.push(node);
	} // end of method

	
	/**
	 * Adds the directed edge.
	 *
	 * @param i the i
	 * @param j the j
	 */
	// add a directed edge between two nodes
	public void addDirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i - 1);
		GraphNode second = nodeList.get(j - 1);
		first.getNeighbors().add(second);
	} // end of method

}//end of class