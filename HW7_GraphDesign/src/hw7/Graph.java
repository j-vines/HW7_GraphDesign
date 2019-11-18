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
	}
	
	@Override
	public void DFS() {
		time = 0;
		for(LinkedList<Vertex> vertList: adjacencyList) {
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
		u.setDiscovered(time);
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//vertices info
		for(int i = 0; i < vertArray.length; i++) {
			sb.append("Vertex " + i + ":\n");
			sb.append("\tParent: " + vertArray[i].getParent());
			sb.append("\n\tColor: " + vertArray[i].getColor());
			sb.append("\n\tDiscovered: " + vertArray[i].getDiscovered());
			sb.append("\n\tFinished: " + vertArray[i].getFinished() + "\n");
		}
		sb.append("\nAdjacency List: \n");
		//edges info
		int vertNum = 0;
		for(LinkedList<Vertex> list : adjacencyList) {
			sb.append(vertNum + ": ");
			for(int i = 0; i < list.size(); i++) {
				Vertex vert = list.get(i);
				sb.append(vert.getKey() + " ");
			}
			sb.append("\n");
			vertNum++;
		}
		return sb.toString();
	}
	
}
