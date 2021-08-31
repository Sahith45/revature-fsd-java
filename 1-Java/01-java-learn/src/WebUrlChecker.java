import java.util.Scanner;
public class WebUrlChecker {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the website address");
		String url= s.nextLine();
		if((url.startsWith("http://")) || (url.startsWith("https://"))){
			System.out.println("valid url");
		}
		else {
			System.out.println(" invalid url");
		}
	}

}
