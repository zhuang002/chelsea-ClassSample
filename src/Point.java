
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}


	public static double distance(Point p1, Point p2) {
		// TODO Auto-generated method stub
		return p1.distance(p2);
	}
	
	public static double getSlope(Point p1, Point p2) {
		return 0;
	}
	
	
}
