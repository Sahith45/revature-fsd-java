
public class TvSchedule {

	public static void main(String[] args) {
		int date =2;
		System.out.println("using while");
		while(date <= 31) {
			System.out.println(date);
			date += 3;
		}
		System.out.println("using do while");
		date = 2;
		do {
			System.out.println(date);
			date += 3;
		} while(date <= 31);
		
		System.out.println("using for loop");
		for(date = 2;date <= 31;date = date + 3) {
			System.out.println(date);
		}
	}
	
	

}
