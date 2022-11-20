
public abstract class AbstractLine implements Line {

	protected abstract LineFormal getLineFormal();
	
	@Override
	public abstract double getSlope(); 

	@Override
	public double getIntersectX() {
		// TODO Auto-generated method stub
		return this.getLineFormal().getIntersectX();
	}

	@Override
	public double getIntersectY() {
		// TODO Auto-generated method stub
		return this.getLineFormal().getIntersectY();
	}

	@Override
	public boolean IsPerpendicularTo(Line line) {
		// TODO Auto-generated method stub
		return this.getLineFormal().IsPerpendicularTo(line);
	}

	@Override
	public boolean isOn(Point p) {
		// TODO Auto-generated method stub
		return this.getLineFormal().isOn(p);
	}

	@Override
	public boolean isParallelTo(Line line) {
		// TODO Auto-generated method stub
		return this.getLineFormal().isParallelTo(line);
	}

	@Override
	public double distanceToPoint(Point p) {
		// TODO Auto-generated method stub
		return this.getLineFormal().distanceToPoint(p);
	}

	@Override
	public Point getPerpendicularFoot(Point p) {
		// TODO Auto-generated method stub
		return this.getLineFormal().getPerpendicularFoot(p);
	}

	@Override
	public Line getPerpendicularLine(Point p) {
		// TODO Auto-generated method stub
		return this.getLineFormal().getPerpendicularLine(p);
	}

	@Override
	public Point getCrossPoint(Line line) {
		// TODO Auto-generated method stub
		return this.getLineFormal().getCrossPoint(line);
	}

}
