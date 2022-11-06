
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,1);
		Line  l1= new Line(p1,p2);
		Line l2 = new Line(new Point(-1,-1), new Point(3,4));
		Line l3 = new Line(-3,-4, 6, 7);
		
		System.out.printf("((%.2f, %.2f), (%.2f, %.2f))\n", l1.getP1().getX(), l1.getP1().getY(), l1.getP2().getX(), l1.getP2().getY());
		
		System.out.println(l1);
		
		Point[] vertices = {p1,p2, new Point(5,6)};
		Polygon polygon = new Polygon(vertices);
		System.out.println(polygon);
		
		System.out.println(l1.getLength());
		
		Triangle triangle = new Triangle(p1, p2, new Point(5,6));
		System.out.println(triangle);
		
	}

}
