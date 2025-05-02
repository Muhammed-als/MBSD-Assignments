package math_expression;

public class Test23 {
	

	public int x;
	public int y;

	public void compute() {
		x = 21;
		y = new Object() {
			int result() {
				final int __shadow = 2;
				int i = __shadow;
				return i * x;
			}
		}.result()
		;
	}

}
