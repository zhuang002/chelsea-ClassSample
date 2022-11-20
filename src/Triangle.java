
public class Triangle extends Polygon {
	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.vertices.add(p1);
		this.vertices.add(p2);
		this.vertices.add(p3);
	}
	
	public Triangle(Point[] vertices) {
		super();
		this.vertices.add(vertices[0]);
		this.vertices.add(vertices[1]);
		this.vertices.add(vertices[2]);
	}
	
	public double getArea() {
		double[] lengths = this.getEdgeLengths();
		double p = (lengths[0]+lengths[1]+lengths[2])/2;
		return Math.sqrt(p*(p-lengths[0])*(p-lengths[1])*(p-lengths[2]));
	}
	
	public LineSeg[] getEdges() {
		LineSeg[] edges = new LineSeg[3];
		edges[0] = new LineSeg(this.vertices.get(0), this.vertices.get(1));
		edges[1] = new LineSeg(this.vertices.get(1), this.vertices.get(2));
		edges[2] = new LineSeg(this.vertices.get(2), this.vertices.get(0));
		return edges;
	}
	
	public double[] getEdgeLengths() {
		double[] lengths = new double[3];
		lengths[0] = this.vertices.get(0).distance(this.vertices.get(1));
		lengths[1] = this.vertices.get(1).distance(this.vertices.get(2));
		lengths[2] = this.vertices.get(2).distance(this.vertices.get(0));
		return lengths;
	}

	@Override
	public String toString() {
		String s = "Triangle: ["+ this.vertices.get(0) +"," + this.vertices.get(1) +"," + this.vertices.get(2) + "]\n";
		s+= "Area : " + this.getArea() +"\n";
		double[] lengths = this.getEdgeLengths();
		s+= "Edges: (" + lengths[0] +"," +lengths[1] +"," +lengths[2] +")\n";
		return s;
	}
	
	
	
}
