public class Driver {

	public static void main(String[] args) {
		int[][] adjacencyMatrix = {
		   //0 1 2 3 4 5 6 7	
			{0,1,0,1,1,0,0,0}, //0
			{1,0,0,0,0,0,0,1}, //1
			{0,0,1,0,0,0,0,0}, //2
			{0,0,0,0,0,0,0,0}, //3
			{0,0,1,1,1,0,0,0}, //4
			{0,0,0,0,0,1,1,0}, //5
			{1,1,0,1,1,1,1,0}, //6
			{1,1,0,1,0,0,1,0}, //7
		};
		
		Graph graph = new Graph(adjacencyMatrix);
		System.out.println(graph.toString());
		graph.DFS();
		System.out.println(graph.toString());
	}

}
