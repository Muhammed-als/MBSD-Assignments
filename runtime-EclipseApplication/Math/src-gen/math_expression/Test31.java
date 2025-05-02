package math_expression;

public class Test31 {
	
	private External external;
	
	public Test31(External external) {
		this.external = external;
	}

	public int x;
	public int y;

	public void compute() {
		x = 5;
		y = 2 + external.pow(new Object() {
			int result() {
				final int __shadow = x;
				int i = __shadow;
				return i - 3;
			}
		}.result(), 
		3 * 2)
		;
	}

	public interface External {
		int pow(int arg0, int arg1);
	}
}
