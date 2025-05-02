package math_expression;

public class Test18 {
	

	public int x;

	public void compute() {
		x = new Object() {
			int result() {
				final int __shadow = 10 * 8;
				int y = __shadow;
				return y + 7;
			}
		}.result()
		;
	}

}
