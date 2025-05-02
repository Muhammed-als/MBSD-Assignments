package math_expression;

public class Test30 {
	
	private External external;
	
	public Test30(External external) {
		this.external = external;
	}

	public int x;

	public void compute() {
		x = external.sqrt(external.pow(external.pi(), 
		2)
		)
		;
	}

	public interface External {
		int pow(int arg0, int arg1);
		int sqrt(int arg0);
		int pi();
	}
}
