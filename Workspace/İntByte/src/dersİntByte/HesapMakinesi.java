package dersÝntByte;
import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int sayi1,sayi2,secim;

	
	System.out.println("Lütfen Bir Ýþlem Seçin ! ");
	System.out.println("1 -Toplama\n2-Çýkarma\n 3-Çarpma\n 4-Bölme");
	System.out.println("Seçiminizi girin : ");
	secim = input.nextInt();
	
	
	if(secim==1) {
		System.out.println("Ýlk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("Ýkinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("Toplama Sonuç : " + (sayi1+sayi2));
	}
	else if(secim==2) {
		System.out.println("Ýlk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("Ýkinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("Çýkarma Sonuç : " + (sayi1-sayi2));
		
	}
	else if(secim==3) {
		System.out.println("Ýlk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("Ýkinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("Çarpma Sonuç : " + (sayi1*sayi2));
	}
	else if(secim==4) {
		System.out.println("Ýlk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("Ýkinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("Bölme Sonuç : " + (sayi1/sayi2));
	}
	else {
		System.out.println("1 - 4 Arasýnda Deðer Giriniz !");
	}
	
	}

}
