package math_expression;

public class Test17 {
	

	public int x;

	public void compute() {
		x = new Object() {
			int result() {
				final int __shadow = 42;
				int y = __shadow;
				return y;
			}
		}.result()
		;
	}

}
