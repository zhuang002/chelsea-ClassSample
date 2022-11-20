
public class LineRay extends AbstractLine implements Line {

	Point start = null;
	double angle = 0; // 0<= angle <2pi
	
	public LineRay(Point start, double angle) {
		this.start = start;
		this.angle = angle;
	}
	
	public LineRay(Point start, Point direction) {
		this.start = start;
		double slope = Point.getSlope(start, direction);
		angle = Math.atan(slope);
		
		if (slope > 0 && direction.getX() < start.getX()) { // in third quadrant
			angle += Math.PI;
		} else if (slope < 0 && direction.getX() > start.getX()) { // in 4th quadrant
			angle += Math.PI;
		}
	}

	@Override
	public double getSlope() {
		// TODO Auto-generated method stub
		return Math.tan(this.angle);
	}

	protected LineFormal getLineFormal() {
		// TODO Auto-generated method stub
		double m = this.start.getY() - this.getSlope()*this.start.getX();
		return new LineFormal(this.getSlope(), m);
	}

	
}
