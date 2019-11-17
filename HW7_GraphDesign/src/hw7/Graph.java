import java.util.LinkedList;

/**
 * CS333 Homework 7: Graph Design
 * 11/18/19
 * @author Jack Vines, Jeremy Brothers
 *
 * Graph class stores representation of graph and contains methods for performing DFS
 * @param <E>
 */
public class Graph<E> implements Graphable {

	private int time;
	private Vertex vertex;
	private LinkedList<Vertex> neighborList = null;
	private LinkedList<LinkedList<Vertex>> adjanceyList = null;
	
	public Graph(int[][] inputMatrix) {
		adjanceyList = new LinkedList<LinkedList<Vertex>>();
		
		// Create a list of lists of vertices.
		// TODO : ensure that the width of each inputMatrix[x] is equal?
		for(int i = 0; i < inputMatrix[0].length; i++) {
			adjanceyList.add(new LinkedList<Vertex>());
		}
		
		System.out.println(adjanceyList.size());
		
		for(int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix[i].length; j++) {
				if(inputMatrix[i][j] == 1) {
					LinkedList<Vertex> currentList = adjanceyList.get(i);
					currentList.add(new Vertex(j));
				}
			}
		}
		
		for(LinkedList<Vertex> list : adjanceyList) {
			for(int i = 0; i < list.size(); i++) {
				Vertex vert = list.get(i);
				System.out.print(vert.getKey() + " ");
			}
			System.out.println();
		}
		
		time = 0;
	}
	
	// 1) need array of vertex objects
	// 2) need array of linked lists for adjacency list representation of graph (think this might be easier than adj matrix but idk)
	
	public void DFS() {
		return;
	}
	
	public void DFSVisit(Vertex v) {
		return;
	}
	
}
