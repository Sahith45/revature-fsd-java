import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		
			String str = "hello all in the world";
			String[] words = str.split(" ");
			
			for (int i = 0; i < words.length; i++) {
				//System.out.println(words[i]);
				for (int j = words[i].length()-1; j >=0; j--) {
					System.out.print(words[i].charAt(j));
				}
				System.out.println();
			}
		}

			


	}

