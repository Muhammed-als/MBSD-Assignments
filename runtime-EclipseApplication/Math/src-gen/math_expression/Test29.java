package math_expression;

public class Test29 {
	
	private External external;
	
	public Test29(External external) {
		this.external = external;
	}

	public int x;
	public int y;

	public void compute() {
		x = external.pow(4, 2)
		;
		y = x - 2;
	}

	public interface External {
		int pow(int arg0, int arg1);
	}
}
