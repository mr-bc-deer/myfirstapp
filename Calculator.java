/*
calculator
*/
public class Calculator {
	/* result of calculating */
	private int result;

	public void add (int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/* get the results */
	public int getResult() {
		return this.result;
	}

	/* clean results */
	public void cleanResult() {
		this.result = 0;
	}
}
