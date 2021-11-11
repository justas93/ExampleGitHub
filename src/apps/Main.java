package apps;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ivesk raide");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputText = scanner.next().toLowerCase();
		
		scanner.close();
		
		 char input = inputText.charAt(0);
		 
		 if(!Character.isAlphabetic(input)) {
			 System.out.println("soriukas");
		 }
		 
		 
		for( char c = input; c <= 'z'; c ++) {
			
			 
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
