package ders�ntByte;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int sayi;
	System.out.println("Sayi Giriniz : ");
	sayi = input.nextInt();
	
	switch(sayi) {
	
	case 1:
		System.out.println("�uan 1 Girdiniz.");
	break;
	case 2:
		System.out.println("�uan 2 Girdiniz.");
		break;
		
	case 3 :
		System.out.println("�uan 3 Girdiniz.");
	break;
	default:
		System.out.println("Girdi�iniz sayi 1-3 aral���nda olmal�d�r.");
	break;
	}
	
	

	}

}
