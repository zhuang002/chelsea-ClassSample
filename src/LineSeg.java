
public class LineSeg extends AbstractLine implements Line {
	Point p1,p2;
	
	public LineSeg(Point x, Point y) {
		this.p1 = x;
		this.p2 = y;
	}
	
	public LineSeg(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public double getLength() {
		return this.p1.distance(this.p2);
	}

	@Override
	public String toString() {
		return "("+this.p1+","+this.p2+")";
	}

	@Override
	public double getSlope() {
		// TODO Auto-generated method stub
		return (this.p1.getY() - this.p2.getY()) / (this.p1.getX() - this.p2.getX());
	}

	

	protected LineFormal getLineFormal() {
		// TODO Auto-generated method stub
		double m = this.p1.getY() - this.getSlope()*this.p1.getX();
		return new LineFormal(this.getSlope(), m);
	}
		
}
