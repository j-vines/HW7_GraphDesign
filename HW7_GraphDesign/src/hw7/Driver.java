
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numNeighbors = 0;
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
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			for(int j = 0; j < adjacencyMatrix[i].length; j++) {
				if(adjacencyMatrix[i][j] == 1) {
					numNeighbors++;
				}
			}
		}
		
		System.out.println(numNeighbors);
		
		Graph graph = new Graph(adjacencyMatrix);
	}

}
