package ders›ntByte;
import java.util.Scanner;
public class OtobusBiletiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//km birim fiyati 0.10 dolar
		//14 yasindan kucukse fiyata %50 indirim.
		//14 - 24 e ya˛a kadar %10 indirim.
		//65 ten b¸y¸kse %30 indirim
		// Gidi˛ Dˆn¸˛ al˝rsa %20 indirim.
		int km,yas,yTipi;
		System.out.println("Mesafeyi Girin : ");
		km = input.nextInt();
		System.out.println("Yasinizi Girin : ");
		yas= input.nextInt();
	System.out.println("Yolculuk Tipini Seciniz (1 - Tek gidis,"
			+ " 2 - Gidis Donus");
	yTipi= input.nextInt();
	double normalFiyat,yas›ndirimi,tip›ndirimi;
	
	
	if(km>0 && yas>0 && (yTipi==1 || yTipi==2)) {
		System.out.println("Bilgiler Alindi Diger Adimlara Gecebilirsiniz .");
	        normalFiyat = km * 0.10;
		if(yas<14) {
			
			yas›ndirimi= normalFiyat * 0.5;
			normalFiyat= normalFiyat - yas›ndirimi;
			
		}
		else if(yas >12 && yas<=24) {
			yas›ndirimi = normalFiyat * 0.10;
			normalFiyat -= yas›ndirimi;
			
		}
		else if(yas >=65) {
			yas›ndirimi = normalFiyat * 0.30;
			normalFiyat -= yas›ndirimi;
			
		}
		
		else {
			yas›ndirimi=0;
		}
		normalFiyat -= yas›ndirimi;
		if(yTipi==2) {
			tip›ndirimi = normalFiyat * 0.20;
			normalFiyat -= tip›ndirimi;
			normalFiyat= (normalFiyat - tip›ndirimi)*2;
			
		}
		System.out.println("Bilet Tutari : " + normalFiyat + "TL");
		
	
	}
	
	else {
		System.out.println("Bilgiler Alinamadi Lutfen Dogru "
				+ "Bir Sekilde Secim Yapiniz.");
	}
	
	
	
		
		
		
		
		
		
		
	}

}
