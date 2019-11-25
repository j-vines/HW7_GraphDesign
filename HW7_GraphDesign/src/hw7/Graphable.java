import java.util.LinkedList;

/**
 * CS333 Homework 7: Graph Design
 * 11/18/19
 * @author Jack Vines, Jeremy Brothers
 *
 * Interface for Graph.java
 */
public interface Graphable {

	/**
	 * Performs a depth first search on a graph
	 */
	public void DFS();
	
	/**
	 * Recursive helper method for DFS()
	 * "Visits" every vertex in the graph and then immediately visits all of that vertex's neighbors
	 * When a vertex is visited, its discovery time and parent pointer are set
	 * After all of that vertex's neighbors have been visited, its finished time is set
	 * @param neighborList - list of a given vertex's neighbors
	 * @param u - the current vertex being visited
	 */
	//private void DFSVisit(LinkedList<Vertex> neighborList, Vertex u);
	
	public String toString();
}
