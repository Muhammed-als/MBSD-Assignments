package math_expression;

public class Test20 {
	

	public int x;

	public void compute() {
		x = new Object() {
			int result() {
				final int __shadow = 2;
				int y = __shadow;
				return new Object() {
					int result() {
						final int __shadow = 3;
						int y = __shadow;
						return y * y;
					}
				}.result()
				 + y;
			}
		}.result()
		 + 76;
	}

}
