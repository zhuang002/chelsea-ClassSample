
public class Point {
	private double x,y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(Point p) {
		double deltaX = p.x-this.x;
		double deltaY = p.y - this.y;
		return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
	}


	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	
}
