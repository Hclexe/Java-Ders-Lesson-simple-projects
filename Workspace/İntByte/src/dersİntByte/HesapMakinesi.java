package ders�ntByte;
import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int sayi1,sayi2,secim;

	
	System.out.println("L�tfen Bir ��lem Se�in ! ");
	System.out.println("1 -Toplama\n2-��karma\n 3-�arpma\n 4-B�lme");
	System.out.println("Se�iminizi girin : ");
	secim = input.nextInt();
	
	
	if(secim==1) {
		System.out.println("�lk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("�kinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("Toplama Sonu� : " + (sayi1+sayi2));
	}
	else if(secim==2) {
		System.out.println("�lk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("�kinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("��karma Sonu� : " + (sayi1-sayi2));
		
	}
	else if(secim==3) {
		System.out.println("�lk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("�kinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("�arpma Sonu� : " + (sayi1*sayi2));
	}
	else if(secim==4) {
		System.out.println("�lk Sayiyi Giriniz : ");
		sayi1= input.nextInt();
		System.out.println("�kinci Sayiyi Giriniz : ");
		sayi2= input.nextInt();
		System.out.println("B�lme Sonu� : " + (sayi1/sayi2));
	}
	else {
		System.out.println("1 - 4 Aras�nda De�er Giriniz !");
	}
	
	}

}
