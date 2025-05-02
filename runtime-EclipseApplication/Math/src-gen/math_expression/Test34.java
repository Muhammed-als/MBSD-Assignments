package math_expression;

public class Test34 {
	
	private External external;
	
	public Test34(External external) {
		this.external = external;
	}

	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;

	public void compute() {
		sideA = 3;
		sideB = 4;
		sideC = new Object() {
			int result() {
				final int __shadow = external.pow(sideA, 2)
				;
				int powA = __shadow;
				return new Object() {
					int result() {
						final int __shadow = external.pow(sideB, 2)
						;
						int powB = __shadow;
						return external.sqrt(powA + powB)
						;
					}
				}.result()
				;
			}
		}.result()
		;
		perimeterTriangle = sideA + sideB + sideC;
		radius = 5;
		perimeterCircle = new Object() {
			int result() {
				final int __shadow = 2 * radius;
				int diameter = __shadow;
				return diameter * external.pi()
				;
			}
		}.result()
		;
	}

	public interface External {
		int pow(int arg0, int arg1);
		int sqrt(int arg0);
		int pi();
	}
}
