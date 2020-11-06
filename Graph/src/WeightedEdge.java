
public class WeightedEdge {

	private Vertex V1;
	private double weight;

	WeightedEdge(Vertex V1) {
		this.V1 = V1;
		this.weight = 0;
	}
	
	WeightedEdge(Vertex V1, double weight) {
		this.V1 = V1;
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public Vertex getAdjVertex() {
		return V1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((V1 == null) ? 0 : V1.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		WeightedEdge other = (WeightedEdge) obj;
		if (V1 == null) {
			if (other.V1 != null)
				return false;
		} else if (!V1.equals(other.V1))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
	
}
