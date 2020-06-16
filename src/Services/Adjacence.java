package Services;

public class Adjacence {
	private String A,B;

	
	public Adjacence() {
	}

	public Adjacence(String a, String b) {
		A = a;
		B = b;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	@Override
	public String toString() {
		return "Adjacence [A=" + A + ", B=" + B + "]";
	}

	
	
}
