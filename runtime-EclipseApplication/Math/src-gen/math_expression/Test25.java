package math_expression;

public class Test25 {
	

	public int x;
	public int y;

	public void compute() {
		x = 20;
		y = new Object() {
			int result() {
				final int __shadow = 21;
				int x = __shadow;
				return x * 2;
			}
		}.result()
		;
	}

}
