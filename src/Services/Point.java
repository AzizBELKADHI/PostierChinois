package Services;

public class Point {
	private int x, y;
	private String id;
	

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(String id, int x, int y) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Point [id=" + id +", x=" + x + ", y=" + y + "]";
	}

	
}
