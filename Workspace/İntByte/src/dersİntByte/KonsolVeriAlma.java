package dersÝntByte;

import java.util.Scanner;

public class KonsolVeriAlma {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		//scanner tara yeni adi oldu
		int a,b,sonuc;
		// ÝNT
		System.out.println("A Sayýsýný Giriniz : "); 
		a= tara.nextInt();
		System.out.println("B sayýnýsýný Giriniz : ");
		b=tara.nextInt();
		
		sonuc = a+b;
		System.out.println("Toplam Sonucunuz : " + sonuc);
		
		
		// STRÝNG
		/*System.out.println("String deger gir : ");
		String str;
		str=tara.nextLine();
		System.out.println("Metin : "+ str); */
		//DOUBLE
		double x;
		System.out.println("Lütfen x ÝÇÝn Double Deðer Girin");
		x=tara.nextDouble();
		System.out.println(x);
	}

}
