package hw7;
/**
 * CS333 Homework 7: Graph Design
 * 11/18/19
 * @author Jack Vines, Jeremy Brothers
 *
 */
public class Vertex {
	
	static final int WHITE = 0;
	static final int GREY = 1;
	static final int BLACK = 2;
	
	private int color;
	private int discovered;
	private int finished;
	private int key;

	public Vertex(int key) {
		color = WHITE;
		discovered = 0;
		finished = 0;
		this.key = key;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getColor() {
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
	
	public int getKey() {
		return key;
	}
}
