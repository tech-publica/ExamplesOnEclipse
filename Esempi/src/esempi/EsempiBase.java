package esempi;

import esempi.introToOO.ContoCorrente;

public class EsempiBase {

	public static void main(String[] args) {
		String header = "ciao sono l' header";
		int cl = 20;
		
       printWithHeaderAndFooter(header, "body dell articolo", "bellissimo footer", cl);  
		
       ContoCorrente c = new ContoCorrente();
       int x = 8;
		
	}
	
	public static int maxInArray(int[] arr) {
		int maxNum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] >= maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
	
	
	public static void scambia(int x1, int x2) {
		int x3 = x1;
		x1 = x2;
		x2 = x3;
	}
	
	public static void PrintEvenOrOdd(int num) {
		int z = 9; // variabili locali, variabili automatiche
		if(num % 2 == 0 ) {
			
			System.out.println("il numero e' pari");
		} else {
			
			System.out.println("il numero e' dispari");
		}
		 
		z = 10;
	}
	
	public static boolean isEven(int num) {
		int z = 89;
//		if(num % 2 == 0 ) {
//			return true;
//		} else {
//			return false;
//		}
		return ( (num % 2) == 0);
	}
	
	public static void printWithHeaderAndFooter(String head, String body, String footer, int criticalLenght ) {
		System.out.println("********************");
		System.out.println(head);
		System.out.println("####################");
		System.out.println(body);
		if(body.length() > criticalLenght) {
			return;
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%");
		System.out.println(footer);
		return;
	}

}
