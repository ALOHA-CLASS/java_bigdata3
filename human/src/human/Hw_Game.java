package human;

public class Hw_Game {
	public static void main(String[] args) {
	
		for (int k = 1; k < 10; k++) {
			
			if(k % 3 ==0)
				System.out.println("*");
			else
				System.out.println(k);
		}
		
		for (int n = 1; n <= 9; n++) {
			for (int m = 0 ; m <= 9 ; m++) {
				
				if(n % 3 ==0 && m == 0)
					System.out.println("*");
					
				else if(n % 3 != 0 && m % 3 ==0 && m != 0)
					System.out.println("*");

				else if(n % 3 == 0 && m % 3 !=0 && m != 0)
					System.out.println("*");

				else if(n % 3 == 0 && m % 3 == 0 && m != 0) 
					System.out.println("**");

				else
					System.out.println(10*n + m);
			}
		}
		System.out.println("100");
	}
}
