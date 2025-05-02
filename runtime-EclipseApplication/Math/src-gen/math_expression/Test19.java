package math_expression;

public class Test19 {
	

	public int x;

	public void compute() {
		x = new Object() {
			int result() {
				final int __shadow = 2;
				int y = __shadow;
				return new Object() {
					int result() {
						final int __shadow = 3;
						int z = __shadow;
						return y * z;
					}
				}.result()
				 + y;
			}
		}.result()
		 + 79;
	}

}
