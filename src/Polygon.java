import java.util.ArrayList;
import java.util.Arrays;

public class Polygon {
	ArrayList<Point> vertices = null;
	
	public Polygon () {
		vertices = new ArrayList<>();
	}
	
	public Polygon(Point[] vertices) {
		this.vertices = new ArrayList<>(Arrays.asList(vertices));
	}
	
	@Override
	public String toString() {
		String ret = "(";
		for (Point point:this.vertices) {
			ret+=point+",";
		}
		return ret.substring(0,ret.length()-1)+")";
	}
}
