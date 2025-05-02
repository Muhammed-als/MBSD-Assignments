package math_expression;

public class Test28 {
	
	private External external;
	
	public Test28(External external) {
		this.external = external;
	}

	public int x;
	public int y;

	public void compute() {
		x = external.sqrt(4)
		;
		y = x * 2;
	}

	public interface External {
		int sqrt(int arg0);
	}
}
