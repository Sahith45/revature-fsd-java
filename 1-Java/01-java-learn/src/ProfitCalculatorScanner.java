import java.util.Scanner;
public class ProfitCalculatorScanner {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the buying price");
		int buyingPrice=scanner.nextInt();
		System.out.println("enter the selling  price");
		int sellingPrice=scanner.nextInt();
		scanner.close();
		int profit= sellingPrice - buyingPrice;
		System.out.println("Profit " +  profit);
			

	}

}
