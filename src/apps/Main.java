package apps;

public class Main {

	public static void main(String[] args) {
		
		
		
		for( char c = 'a'; c <= 'z'; c ++) {
			
			 
			String symbol = ", ";
			if(c< 'z') {
				symbol = ",";
			}else {
				symbol = ".";
			}
		
		System.out.print(c + symbol);
		
		}

	}

		

}
