import java.util.Scanner;
public class MobileMenu {

	public static void main(String[] args) {
		System.out.println("menu");
		System.out.println("===");
		System.out.println("1. Balance enquiry");
		System.out.println("2. Recharge");
		System.out.println("3. Change Caller Tune");
        
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("choose an option");
		int option = scanner.nextInt();
	   /*	if(option == 1) {
			System.out.println(" Balance enquiry");
		}
		else if(option ==  2) {
			System.out.println("2. Recharge");
		}
		else if(option ==  3) {
			System.out.println("3. Change Caller Tune");
		}*/
		switch (option) {
		 
		case 1:
			System.out.println("1. Balance enquiry");
			break;
		case 2:
			System.out.println("2. Recharge");
			break;
		case 3:
			System.out.println("3. Change Caller Tune");
			break;
			
		}
	}

}
