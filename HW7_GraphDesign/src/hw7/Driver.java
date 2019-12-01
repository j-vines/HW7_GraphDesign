
public class Driver {

	public static void main(String[] args) {
		// 
		int[][] adjacencyMatrix = {
			{0,1,1,0,0,0,0},
			{1,0,1,1,0,0,0},
			{1,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,0,1,1,0,1,0},
			{0,0,0,0,1,0,1},
			{0,0,0,0,0,1,0}
		};
		
		Graph graph = new Graph(adjacencyMatrix);
		System.out.println("Graph before DFS:\n" + graph.toString());
		graph.DFS();
		System.out.println("Graph after DFS:\n" + graph.toString());
		
		int[][] adjacencyMatrix2 = {
			{0,1,1,0,0,0,0,1,0,0},
			{1,0,1,1,0,0,0,0,0,1},
			{1,1,0,0,1,0,0,1,1,1},
			{0,1,0,0,1,0,0,0,0,1},
			{0,0,1,1,0,1,0,0,0,1},
			{0,0,0,0,1,0,1,0,1,0},
			{0,0,0,0,0,1,0,0,1,0},
			{1,0,1,0,0,0,0,0,0,0},
			{0,0,1,0,0,1,1,0,0,1},
			{0,1,1,1,1,0,0,0,1,0}
		};
		
		graph = new Graph(adjacencyMatrix2);
		System.out.println("Graph before DFS:\n" + graph.toString());
		graph.DFS();
		System.out.println("Graph after DFS:\n" + graph.toString());
		
		int[][] adjacencyMatrix3 = {
				{0,1,1,1,1,1,1,1,1,1},
				{1,0,1,1,1,1,1,1,1,1},
				{1,1,0,1,1,1,1,1,1,1},
				{1,1,1,0,1,1,1,1,1,1},
				{1,1,1,1,0,1,1,1,1,1},
				{1,1,1,1,1,0,1,1,1,1},
				{1,1,1,1,1,1,0,1,1,1},
				{1,1,1,1,1,1,1,0,1,1},
				{1,1,1,1,1,1,1,1,0,1},
				{1,1,1,1,1,1,1,1,1,0}
			};
			
			graph = new Graph(adjacencyMatrix3);
			System.out.println("Graph before DFS:\n" + graph.toString());
			graph.DFS();
			System.out.println("Graph after DFS:\n" + graph.toString());
	}
}
