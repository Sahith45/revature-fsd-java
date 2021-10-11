import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		int loCount = 0;
		int upCount = 0;
		int dg = 0;
		int spc = 0;

		if (password.length() < 8) {
			System.out.println("password is less than 8 char");
		}
		if (password.length() > 8) {
			for (int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if (Character.isUpperCase(c)) {

					upCount++;
				} else if (Character.isLowerCase(c)) {

					loCount++;
				} else if (Character.isDigit(c)) {

					dg++;
				} else {
					spc++;
				}

			}
			

		}

	}
}
/*public static void main(String[] args) {
		String pwd ="AbcA@123";
		int uc=0, lc=0, dc=0, sc=0;
		for (int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			if(Character.isUpperCase(ch)) {
				uc++;
			}
			else if(Character.isLowerCase(ch)) {
				lc++;
			} 
			else if(Character.isDigit(ch)) {
				dc++;
			}
			else {
				sc++;
			}
		}
		if(pwd.length()>=8 && uc>0 && lc>0 && dc>0 && sc>0) {
			System.out.println("Password is strong enough...");
		}
		else {
			if(pwd.length()< 8) {
				System.out.println("Pwd should have at least 8 chars");
			}
			if(uc==0)
				System.out.println("Uppercase missing");
			if(lc==0)
				System.out.println("Lowercase missing");
			if(dc==0)
				System.out.println("Digit missing");
			if(sc==0)
				System.out.println("Special Character missing");
		}
	}
*/
