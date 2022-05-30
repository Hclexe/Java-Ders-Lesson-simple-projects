package dersÝntByte;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		Scanner tara=new Scanner(System.in);
		int vize,sinav2,but;
		double ortalama;
		
		System.out.println("Vize Notunuzu Girin : ");
		vize= tara.nextInt();
		System.out.println("Final Notunuzu Girin : ");
		sinav2= tara.nextInt();
		System.out.println("Büt Notunuzu Girin : ");
		but= tara.nextInt();
		
		ortalama= (vize*0.4) + (sinav2*0.6) + (but*0.6) / 3.0 ;
		
		
		System.out.println(ortalama);
	
	}
	

}
