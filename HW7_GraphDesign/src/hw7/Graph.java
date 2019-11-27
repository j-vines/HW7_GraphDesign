import java.util.LinkedList;

/**
 * CS333 Homework 7: Graph Design
 * 11/18/19
 * @author Jack Vines, Jeremy Brothers
 *
 * Graph class stores representation of graph and contains methods for performing DFS
 * @param <E>
 */
public class Graph implements Graphable {

	private int time = 0;
	private Vertex vertex = null;
	private LinkedList<Vertex> adjanceyList[] = null;
	
	public Graph(int[][] inputMatrix) {

	}
	
	/**
	 * Performs a Depth First Search on an array of verticies
	 */
	@Override
	public void DFS() {

	}
	
	/**
	 * Takes the array of vertices from the DFS function and returns a string
	 * of each nodes key.
	 */
	@Override
	public String toString() {
		return "";
	}
	
	/*
	 * This function visits the neighbors of the for the linked list passed it.
	 * It checks the color of the neighbor. If it is white, a recursive call is performed
	 * until the last list has no white neighbors. Once all the nodes have been visted the
	 * DFS will be completed. 
	 */
	private void DFSVisit(LinkedList<Vertex> neighborList, Vertex u) {

	}
	
}
