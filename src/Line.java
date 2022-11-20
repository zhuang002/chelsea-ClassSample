
public interface Line {
	double getSlope();
	double getIntersectX();
	double getIntersectY();
	boolean IsPerpendicularTo(Line line);
	boolean isOn(Point p);
	boolean isParallelTo(Line line);
	double distanceToPoint(Point p);
	Point getPerpendicularFoot(Point p);
	Line getPerpendicularLine(Point p);
	Point getCrossPoint(Line line);
}
