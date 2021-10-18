
public class MagicSquare {
	
	public static void main(String[] args) {
		int n = 5;
		int [][] sqr = new int[n][n];
		
		int sr = 3,sc = 1,tr=0,tc=0;
		
		for(int num = 1; num <= n*n; n++) {
			if(sqr [sr][sc] == 0) {
			    sqr[sr][sc] = num;
			    tr = sr;
			    tc = sc;
			}
			else {
				sr= tr;
				sc=tc;
				sr = ++sr > n-1 ? 0 : sr;
				sqr[sr][sc] = num;
				
			}
			sr = --sr < 0 ? n-1 : sr;
			sc = ++sc > n-1 ? 0 : sc;
			
	      	
			
		}
		for(int r= 0; r < n ; r++) {
			for(int c= 0 ; c<n ; c++) {
				System.out.println(String.format("%3d", sqr[sr][sc]));
			}
			System.out.println();
		}
		
	}
	
	
	

}
