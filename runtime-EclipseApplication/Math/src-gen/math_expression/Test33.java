package math_expression;

public class Test33 {
	

	public int a;
	public int b;
	public int c;
	public int d;

	public void compute() {
		a = 40;
		b = new Object() {
			int result() {
				final int __shadow = 2;
				int i = __shadow;
				return a * i;
			}
		}.result()
		;
		c = b * 3;
		d = new Object() {
			int result() {
				final int __shadow = 4;
				int i = __shadow;
				return c + i;
			}
		}.result()
		;
	}

}
