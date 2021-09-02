
public class LinePrinter {

	public static void main(String[] args) {
	  printLine();
	  printLine(15);
	  printLine(20);
		
	}
	public static void printLine() {
		System.out.println("------------------------------------");
	}
	// method overloading--polymorphism
	public static void printLine(int numberOfCharacters) {
		for( int i = 0; i < numberOfCharacters; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		
	}

}
