
public class LineFormal extends AbstractLine implements Line {
	// y = kx+m
	double k;
	double m;
	
	public LineFormal(double k, double m) {
		this.k = k;
		this.m = m;
	}
	
	public LineFormal(Point p1, Point p2) {
		this.k = Point.getSlope(p1, p2);
		this.m = p1.getY() - this.k*p1.getX();
	}

	@Override
	public double getSlope() {
		// TODO Auto-generated method stub
		return this.k;
	}

	@Override
	public double getIntersectX() {
		// TODO Auto-generated method stub
		return -m / k;
	}

	@Override
	public double getIntersectY() {
		// TODO Auto-generated method stub
		return this.m;
	}

	@Override
	public boolean IsPerpendicularTo(Line line) {
		// TODO Auto-generated method stub
		return Math.abs(this.k * line.getSlope() + 1) < 0.00000001 ;
	}

	@Override
	public boolean isOn(Point p) {
		// TODO Auto-generated method stub
		return Math.abs(p.getY() - this.k*p.getX() - this.m) < 0.0000001; 
	}

	@Override
	public boolean isParallelTo(Line line) {
		// TODO Auto-generated method stub
		return Math.abs(this.k - line.getSlope()) < 0.00000001;
	}

	@Override
	public double distanceToPoint(Point p) {
		// TODO Auto-generated method stub
		Point foot = this.getPerpendicularFoot(p);
		return Point.distance(foot, p);
	}

	@Override
	public Point getPerpendicularFoot(Point p) {
		// TODO Auto-generated method stub
		Line line = getPerpendicularLine(p);
		return getCrossPoint(line);
	}

	@Override
	public Line getPerpendicularLine(Point p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getCrossPoint(Line line) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected LineFormal getLineFormal() {
		// TODO Auto-generated method stub
		return this;
	}
	
	
}
