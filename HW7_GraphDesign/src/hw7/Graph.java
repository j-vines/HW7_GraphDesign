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

	private int time;
	private Vertex vertex;
	private Vertex[] vertArray = null; //an array of the vertices in the graph
	private LinkedList<Vertex> neighborList = null;
	private LinkedList<LinkedList<Vertex>> adjacencyList = null;
	
	public Graph(int[][] inputMatrix) {
		adjacencyList = new LinkedList<LinkedList<Vertex>>();
		vertArray = new Vertex[inputMatrix.length];
		//init array of vertices
		for(int i = 0; i < vertArray.length; i++) {
			vertArray[i] = new Vertex(i);
		}
		
		// Create a list of lists of vertices.
		// TODO : ensure that the width of each inputMatrix[x] is equal?
		for(int i = 0; i < inputMatrix[0].length; i++) {
			adjacencyList.add(new LinkedList<Vertex>());
		}
		
		System.out.println(adjacencyList.size());
		
		// Loop through the matrix. If an index in the matrix is 1, then a neighbor 
		// exists. If true, add a vertex to the current list.
		for(int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix[i].length; j++) {
				if(inputMatrix[i][j] == 1) {
					LinkedList<Vertex> currentList = adjacencyList.get(i);
					currentList.add(vertArray[j]); //add corresponding vertex from vertArray
				}
			}
		}
		
		// Print the adjacency list. each line should be a list of vertices.
		// a blank line indicates that a node has no neighbors.
		int vertNum = 0;
		for(LinkedList<Vertex> list : adjacencyList) {
			System.out.print(vertNum + ": ");
			for(int i = 0; i < list.size(); i++) {
				Vertex vert = list.get(i);
				System.out.print(vert.getKey() + " ");
			}
			System.out.println();
			vertNum++;
		}
	}
	
	// 1) need array of vertex objects
	// 2) need array of linked lists for adjacency list representation of graph (think this might be easier than adj matrix but idk)
	
	@Override
	public void DFS() {
		for(LinkedList<Vertex> vertList: adjacencyList) {
			time = 0;
			for(Vertex u : vertList) {
				if(u.getColor() == Colors.White) {
					DFSVisit(vertList, u);
				}
			}
		}
		return;
	}
	
	@Override
	public void DFSVisit(LinkedList<Vertex> neighborList, Vertex u) {
		time += 1;
		u.setColor(Colors.Grey);
		for(Vertex v : neighborList) {
			if(v.getColor() == Colors.White) {
				v.setParent(u);
				DFSVisit(neighborList, v);
			}
		}
		u.setColor(Colors.Black);
		time += 1;
		u.setFinished(time);
	}
	
}
