package math_expression;

public class Test26 {
	

	public int x;
	public int y;

	public void compute() {
		x = 21;
		y = new Object() {
			int result() {
				final int __shadow = x + 1;
				int x = __shadow;
				return x * 2;
			}
		}.result()
		;
	}

}
