package dersÝntByte;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	String k_adi,parola;
	System.out.println("Kullanýcý Adýný Giriniz : ");
	k_adi = input.nextLine();
	System.out.println("Parola Giriniz : ");
	parola = input.nextLine();
	
	if(k_adi.equals("devifka")&&parola.equals("ifkadev"))	{
		System.out.println("Baþarýlý Giriþ");
	}
	else {
		System.out.println("Sem Kimsin Orspu Cocu !!!");
	}
	}

}
