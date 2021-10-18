import java.util.*;
public class PrimeNumber {
	 
	
	 public int checkPrime( int pn) {
//	 Scanner sc = new Scanner(System.in);
//		 System.out.println("enter the number");
//			int pn = sc.nextInt();
			boolean b = false;
			boolean b1 = true;
			
			int t = 0;
			  
			for(int i = 2  ; i <= pn/2 ; i++) {
				
				t = pn%i;
				
				if(t==0) 
				{
					
				System.out.println(b);
				break;
				}
					
					
					
				else {
					
					System.out.println(b1);
					break;
					
					
				}
				
				
			}
			return t;
		 
	 }
	
	
	

	public static void main(String[] args) {
		
		PrimeNumber pr = new PrimeNumber();
		pr.checkPrime(5);
		
     
		
		
	}

}
