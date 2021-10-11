import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = Integer.parseInt(sc.nextLine());
		for(int i= 1; i<=12 ;i++) {
			System.out.println(String.format(" %3d * %3d = %3d",a,i,a*i));
		}

	}

}
