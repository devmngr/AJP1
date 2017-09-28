// *****************************************************************************
// File name  : Main2LinkedList.java.
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description: 
// *****************************************************************************

package recursiveLinkedList;

public class Main2LinkedList {
	public static void main(String[] args) {
		int choice;
		Element elem;
		LinkedList<Element> list = new LinkedList<Element>();

		String name;
		int number;

		do {
			menu();
			choice = Cin.readInt();
			switch (choice) {
			case 1: // addFirst
				System.out.print("Type name and number: ");
				name = Cin.readString();
				number = Cin.readInt();
				list.addFirst(new Element(name, number));
				break;
			case 2: // addLast

				System.out.print("Type name and number: ");
				name = Cin.readString();
				number = Cin.readInt();
				list.addLast(new Element(name, number));
				break;
			case 3: // removeFirst
				System.out.println("removeFirst: " + list.removeFirst());
				break;
			case 4: // removeLast
				System.out.println("removeLast: " + list.removeLast());
				break;
			case 5: // print
				System.out.println("Print list:");
				list.print();
				break;
			case 6: // printReverse
				System.out.println("Print reverse list:");
				list.printReverse();
				break;
			case 7: // size
				System.out.println("Size: " + list.size());
				break;
			default:
				break;
			}
		} while (choice > 0);
		System.out.println("** End of test **");
	}

	private static void menu() {
		System.out.println("\n TEST-MENU");
		System.out.println(" 1) addFirst");
		System.out.println(" 2) addLast");
		System.out.println(" 3) removeFirst");
		System.out.println(" 4) removeLast");
		System.out.println(" 5) print");
		System.out.println(" 6) printReverse");
		System.out.println(" 7) size");
		System.out.println(" 0) Quit");
		System.out.print(" Type your choice: ");
	}
}
