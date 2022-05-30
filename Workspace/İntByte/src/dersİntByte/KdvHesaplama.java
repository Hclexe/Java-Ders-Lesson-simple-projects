package dersÝntByte;

import java.util.Scanner;

public class KdvHesaplama {
	
	public static void main(String[] args) {
		
	double tutar,kdvFiyat;
	double kdvorani=0.18;
		
	Scanner input= new Scanner(System.in);
	System.out.println("Ürünün Tutarýný Giriniz : ");
	tutar= input.nextDouble();
	kdvFiyat= (tutar*kdvorani);
	System.out.println(kdvFiyat);
		
		
		
		
	}
}
