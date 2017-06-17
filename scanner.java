import java.ulit.scanner;

public class InteractRunner {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "n";
			while(!exit.equals("y")) {
				System.out.println("Enter first arg:" );
				String first = reader.next();
				System.out.println("Enter second arg:" );
				String secont = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : y/n ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}