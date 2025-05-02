package math_expression;

public class Test24 {
	

	public int x;
	public int y;

	public void compute() {
		x = 21;
		y = new Object() {
			int result() {
				final int __shadow = x;
				int i = __shadow;
				return i * 2;
			}
		}.result()
		;
	}

}
