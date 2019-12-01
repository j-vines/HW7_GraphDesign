
/**
 * CS333 Homework 7: Graph Design
 * 11/18/19
 * @author Jack Vines, Jeremy Brothers
 *
 * Vertex container class to be used by Graph.java
 */
public class Vertex {
	private Colors color;
	private int val;
	private int discovered; //discovery time stamp
	private int finished; //finished time stamp
	private Vertex parent;

	public Vertex(int key) {
		this.val = key;
		color = Colors.White;
		discovered = 0;
		finished = 0;
		parent = null;
	}
	
	public void setColor(Colors color) {
		this.color = color;
	}
	
	public Colors getColor() {
		return color;
	}
	
	public void setDiscovered(int d) {
		discovered = d;
	}
	
	public int getDiscovered() {
		return discovered;
	}
	
	public void setFinished(int f) {
		finished = f;
	}
	
	public int getFinished() {
		return finished;
	}
	
	public void setParent(Vertex p) {
		parent = p;
	}
	
	public Vertex getParent() {
		return parent;
	}
	
	public int getVal() { return val; }
	
	@Override
	public String toString() {
		return "Vertex: " + val;
	}
}
