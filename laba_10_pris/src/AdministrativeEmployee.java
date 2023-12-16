import java.util.Scanner;

public class AdministrativeEmployee extends Employee {

//	public double doSomePaperWork() {
//		// TODO - implement AdministrativeEmployee.doSomePaperWork
//		throw new UnsupportedOperationException();
//	}

	public double doSomePaperWork(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите количество листов для работы - ");
		int list = scanner.nextInt();

		System.out.println("Введите количество листов обрабатываемых в час - ");
		int speed = scanner.nextInt();

		return (double) list / speed;
	}

}