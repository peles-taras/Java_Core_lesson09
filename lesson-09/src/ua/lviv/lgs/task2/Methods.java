package ua.lviv.lgs.task2;

@SuppressWarnings("serial")
public class Methods extends Exception {
	private int a, b;

	public Methods(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int plus() throws MyException, IllegalAccessException {
		if (a < 0 && b < 0) {
			String message = "Exception 1 message";
			throw new IllegalArgumentException(message);

		} else if (a > 0 && b > 0) {
			String message = "Exception 2 message";
			throw new ArithmeticException(message);

		} else if ((a == 0) && (b == 0)) {
			String message = "Exception 3 message";
			throw new IllegalAccessException(message);

		} else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
			String message = "MyException message";
			throw new MyException(message);

		} else {
			System.out.println("return");
			return a + b;
		}

	}

	public int minus() throws MyException, IllegalAccessException {
		if (a < 0 && b < 0) {
			String message = "Exception 1 message";
			throw new IllegalArgumentException(message);

		} else if (a > 0 && b > 0) {
			String message = "Exception 2 message";
			throw new ArithmeticException(message);

		} else if ((a == 0) && (b == 0)) {
			String message = "Exception 3 message";
			throw new IllegalAccessException(message);

		} else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
			String message = "MyException message";
			throw new MyException(message);

		} else {
			return a - b;
		}

	}

	public int multiply() throws MyException, IllegalAccessException {
		if (a < 0 && b < 0) {
			String message = "Exception 1 message";
			throw new IllegalArgumentException(message);

		} else if (a > 0 && b > 0) {
			String message = "Exception 2 message";
			throw new ArithmeticException(message);

		} else if ((a == 0) && (b == 0)) {
			String message = "Exception 3 message";
			throw new IllegalAccessException(message);

		} else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
			String message = "MyException message";
			throw new MyException(message);

		} else {
			return a * b;
		}

	}

	public int devide() throws MyException, IllegalAccessException {
		if (a < 0 && b < 0) {
			String message = "Exception 1 message";
			throw new IllegalArgumentException(message);

		} else if (a > 0 && b > 0) {
			String message = "Exception 2 message";
			throw new ArithmeticException(message);

		} else if ((a == 0) && (b == 0)) {
			String message = "Exception 3 message";
			throw new IllegalAccessException(message);

		} else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
			String message = "MyException message";
			throw new MyException(message);

		} else {
			return a / b;
		}

	}

	@Override
	public String toString() {
		return "Methods [a=" + a + ", b=" + b + "]";
	}

}
