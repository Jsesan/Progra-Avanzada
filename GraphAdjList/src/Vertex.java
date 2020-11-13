
public class Vertex {

	private String label;
	private int id;

	public Vertex(int id) {
		this.id = id;
		this.label = "";
	}
	
	public Vertex(int id, String label) {
		this.id = id;
		this.label = label;
	}

	public String getLabel() {
		return this.label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
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
		Vertex other = (Vertex) obj;
		if (id != other.id)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}
	
	public int getId() {
		return id;
	}
}
