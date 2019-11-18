import java.util.LinkedList;

/**
 * CS333 Homework 7: Graph Design
 * 11/18/19
 * @author Jack Vines, Jeremy Brothers
 *
 * Interface for Graph.java
 */
public interface Graphable {

	public void DFS();
	
	public void DFSVisit(LinkedList<Vertex> neighborList, Vertex u);
}
