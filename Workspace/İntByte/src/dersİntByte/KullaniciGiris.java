package ders�ntByte;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	String k_adi,parola;
	System.out.println("Kullan�c� Ad�n� Giriniz : ");
	k_adi = input.nextLine();
	System.out.println("Parola Giriniz : ");
	parola = input.nextLine();
	
	if(k_adi.equals("devifka")&&parola.equals("ifkadev"))	{
		System.out.println("Ba�ar�l� Giri�");
	}
	else {
		System.out.println("Sem Kimsin Orspu Cocu !!!");
	}
	}

}
