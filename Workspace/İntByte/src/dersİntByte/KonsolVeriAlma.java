package ders�ntByte;

import java.util.Scanner;

public class KonsolVeriAlma {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		//scanner tara yeni adi oldu
		int a,b,sonuc;
		// �NT
		System.out.println("A Say�s�n� Giriniz : "); 
		a= tara.nextInt();
		System.out.println("B say�n�s�n� Giriniz : ");
		b=tara.nextInt();
		
		sonuc = a+b;
		System.out.println("Toplam Sonucunuz : " + sonuc);
		
		
		// STR�NG
		/*System.out.println("String deger gir : ");
		String str;
		str=tara.nextLine();
		System.out.println("Metin : "+ str); */
		//DOUBLE
		double x;
		System.out.println("L�tfen x ���n Double De�er Girin");
		x=tara.nextDouble();
		System.out.println(x);
	}

}
