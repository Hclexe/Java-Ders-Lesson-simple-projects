package ders�ntByte;

import java.util.Scanner;

public class DaireAlanHacim {

	public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);
	
	int r;
	double alan,hacim,pi=3.14;
	
	System.out.println("Daire Yar� �ap�n� giriniz :");
	
	r = input.nextInt();
	alan=2*pi*r;
	System.out.println("Dairenin Alani : "+alan); 
	hacim = pi* (r*r);
	System.out.println("Dairenin Hacmi : " + hacim);
	System.out.println("--------------------------------------");
	
	
	
	
	}

}
