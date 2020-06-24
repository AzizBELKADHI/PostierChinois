package Services;

public class Edge {

	private int fromNodeIndex ;
	private int toNodeIndex ;
	private int length ; 
	
	
	public Edge(int fromNodeIndex , int toNodeIndex , int length) {
		this.fromNodeIndex = fromNodeIndex ;
		this.toNodeIndex = toNodeIndex ;
		this.length = length ;
	}
	
	
	public int getFromNodeIndex() {
		return fromNodeIndex;
	}
	
	public int getToNodeIndex() {
		return toNodeIndex;
	}

	public int getlength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setFromNodeIndex(int fromNodeIndex) {
		this.fromNodeIndex = fromNodeIndex;
	}

	public void setToNodeIndex(int toNodeIndex) {
		this.toNodeIndex = toNodeIndex;
	}

	// determines the neighbouring node of supplied node , based on the two nodes connected by this edge
	public int getNeighbourIndex(int nodeIndex) {
		if (this.fromNodeIndex == nodeIndex) {
			return this.toNodeIndex; 
		} else {
			return this.fromNodeIndex; 
		}
	}
}
