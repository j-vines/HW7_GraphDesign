
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
	private int[][] adjMatrix;
	private Vertex[] vertexArray;
	
	public Graph(int[][] inputMatrix) {
		vertexArray = new Vertex[inputMatrix.length];
	
		for(int i = 0; i < vertexArray.length; i++) { //initialize array of vertices
			vertexArray[i] = new Vertex(i);
		}
		
		adjMatrix = inputMatrix;
	}
	
	/**
	 * Performs a Depth First Search on an array of vertices
	 */
	@Override
	public void DFS() {
		time = 0;
		for(Vertex u : vertexArray) {
			if(u.getColor() == Colors.White) {
				DFSVisit(u);
			}
		}

	}
	
	/*
	 * This function visits the neighbors of the for the linked list passed it.
	 * It checks the color of the neighbor. If it is white, a recursive call is performed
	 * until the last list has no white neighbors. Once all the nodes have been visted the
	 * DFS will be completed. 
	 */
	private void DFSVisit(Vertex u) {
		Vertex neighbor;
		time++;
		u.setDiscovered(time);
		u.setColor(Colors.Grey);
		for(int i = 0; i < adjMatrix[u.getVal()].length; i++) {
			if(adjMatrix[u.getVal()][i] == 1) { //means vertex w/ val i is neighbor of u
				neighbor = vertexArray[i];
				if(neighbor.getColor() == Colors.White) {
					neighbor.setParent(u);
					DFSVisit(neighbor);
				}
			}
		}
		u.setColor(Colors.Black);
		time++;
		u.setFinished(time);
	}
	
	/**
	 * Takes the array of vertices from the DFS function and returns a string
	 * of each nodes key.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//vertices info
		for(int i = 0; i < vertexArray.length; i++) {
			sb.append("Vertex " + i + ":\n");
			sb.append("\tParent: " + vertexArray[i].getParent());
			sb.append("\n\tColor: " + vertexArray[i].getColor());
			sb.append("\n\tDiscovered: " + vertexArray[i].getDiscovered());
			sb.append("\n\tFinished: " + vertexArray[i].getFinished() + "\n");
		}
		return sb.toString();
	}

	
}
