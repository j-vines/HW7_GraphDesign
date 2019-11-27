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
	 * A method that returns the result of a depth first search
	 * @return (string) - an array of values returned from a depth first search.
	 */
	public String toString();
}
