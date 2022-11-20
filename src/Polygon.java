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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vertices == null) ? 0 : vertices.hashCode());
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
		Polygon other = (Polygon) obj;
		if (vertices == null) {
			if (other.vertices != null)
				return false;
		}
		
		if (vertices.size() != other.vertices.size())
			return false;
		
		Point myFirstPoint = vertices.get(0);
		int index = vertices.indexOf(myFirstPoint);
		for (int i=0;i<vertices.size();i++) {
			if (! vertices.get(i).equals(other.vertices.get((index+i) % vertices.size()))) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
