package Integrate;

import util.Cin;

public class Main2Integrate {

	public static void main(String[] args) {
		int choice;
		int subChoice;
		double a, b, result;
		int n;

		do {
			menu();
			choice = Cin.readInt();
			switch (choice) {
			
			case 1: //Function 1

				do {
					System.out.println();
					System.out.println("FUNCTION 1 (x*x)");
					subMenu();
					subChoice = Cin.readInt();
					switch (subChoice) {

					case 1: // Middle Sum Function 1

						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.middleSum(new F1(), a, b, n);
						System.out.println("Middle Sum: " + result + "\n");
						break;

					case 2: // Left Sum Function 1
						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.leftSum(new F1(), a, b, n);
						System.out.println("Left Sum: " + result + "\n");
						break;

					case 3: // Middle Sum Function 1
						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.rightSum(new F1(), a, b, n);
						System.out.println("Right Sum: " + result + "\n");
						break;
					}

				} while (subChoice > 0);
				break;

			case 2: // Function 2
				do {
					System.out.println();
					System.out.println("FUNCTION 2  (x*x*x)");
					subMenu();
					subChoice = Cin.readInt();
					switch (subChoice) {

					case 1: // Middle Sum Function 2

						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.middleSum(new F2(), a, b, n);
						System.out.println("Middle Sum: " + result + "\n");
						break;

					case 2: // Left Sum Function 2
						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.leftSum(new F2(), a, b, n);
						System.out.println("Left Sum: " + result + "\n");
						break;

					case 3: // Middle Sum Function 2
						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.rightSum(new F2(), a, b, n);
						System.out.println("Right Sum: " + result + "\n");
						break;
					}

				} while (subChoice > 0);
				break;
				
		case 3: //Function 3 
				
				do {
					System.out.println();
					System.out.println("FUNCTION 3  (x*x-2)");
					subMenu();
					subChoice = Cin.readInt();
					switch (subChoice) {

					case 1: // Middle Sum Function 3 

						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.middleSum(new F3(), a, b, n);
						System.out.println("Middle Sum: " + result + "\n");
						break;

					case 2: // Left Sum Function 3 
						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.leftSum(new F3(), a, b, n);
						System.out.println("Left Sum: " + result + "\n");
						break;

					case 3: // Middle Sum Function 3 
						System.out.println("Type A: ");
						a = Cin.readDouble();
						System.out.println();

						System.out.println("Type B: ");
						b = Cin.readDouble();
						System.out.println();

						System.out.print("Type N: ");
						n = Cin.readInt();
						System.out.println();

						result = Integrate.rightSum(new F3(), a, b, n);
						System.out.println("Right Sum: " + result + "\n");
						break;
					}

				} while (subChoice > 0);
				break;
			}
						
		} while (choice > 0);
		System.out.println("** End of test Hand-in 2 **");
	}

	private static void menu() {
		System.out.println();
		System.out.println(" TEST-MENU for Hand-in 2");
		System.out.println(" 1) Function 1 (x*x)");
		System.out.println(" 2) Function 2 (x*x*x)");
		System.out.println(" 3) Function 3 (x*x-2)");
		System.out.println(" 0) Quit");
		System.out.print(" Type your choice: ");
		System.out.println();
	}

	private static void subMenu() {
		System.out.println(" 1) Middle Sum  ");
		System.out.println(" 2) Left Sum 2 ");
		System.out.println(" 3) Right Sum 3");
		System.out.println(" 0) Back");
		System.out.print(" Type your choice: ");
	}

}
