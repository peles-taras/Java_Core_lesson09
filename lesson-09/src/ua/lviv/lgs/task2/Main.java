package ua.lviv.lgs.task2;

public class Main {
	public static void main(String[] args) throws IllegalAccessException, MyException {
		Methods m = new Methods(0, 3);

		m.plus();
		m.minus();
		m.devide();
		m.multiply();
	}
}
