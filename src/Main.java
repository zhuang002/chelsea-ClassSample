import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,1);
		LineSeg  l1= new LineSeg(p1,p2);
		LineSeg l2 = new LineSeg(new Point(-1,-1), new Point(3,4));
		LineSeg l3 = new LineSeg(-3,-4, 6, 7);
		
		System.out.printf("((%.2f, %.2f), (%.2f, %.2f))\n", l1.getP1().getX(), l1.getP1().getY(), l1.getP2().getX(), l1.getP2().getY());
		
		System.out.println(l1);
		
		Point[] vertices = {p1,p2, new Point(5,6)};
		Polygon polygon = new Polygon(vertices);
		System.out.println(polygon);
		
		System.out.println(l1.getLength());
		
		Triangle triangle = new Triangle(p1, p2, new Point(5,6));
		System.out.println(triangle);
		
		Point p3 = new Point(1,1);
		Point p4 = p2;
		
		System.out.println(p2==p3);
		System.out.println(p2.equals(p3));
		System.out.println(p2 == p4);
		System.out.println(p2.equals(p4));
		
		System.out.println(p1.distance(p2));
		System.out.println(Point.distance(p1,p2));
		
		Line l4 = new LineRay(new Point(2,3), 1.4*Math.PI);
		Line l5 = new LineFormal(1.5, 3);
		
		System.out.println(l1.isParallelTo(l4));
		System.out.println(l5.IsPerpendicularTo(l4));
		
		List<Integer> lst1 = new MyArrayList<>();
		List<Integer> lst2 = new MyLinkedList<>();
		lst1.add(1);
		lst2.add(2);
	}

}
