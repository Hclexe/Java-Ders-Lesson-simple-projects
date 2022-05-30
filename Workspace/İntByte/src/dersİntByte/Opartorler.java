package dersÝntByte;

public class Opartorler {

	public static void main(String[] args) {
	
		int a=20;
		int b=10;
		int toplam=a+b;
		int cikarma=a-b;
		int bolme=a/b;
		int carpma=a*b;
		int mod =a%b;
	System.out.println("Toplamanin Sonucu : " +toplam);
	System.out.println("Çikarmanin Sonucu : " +cikarma);
	System.out.println("Bolmenin Sonucu : " +bolme);
	System.out.println("Çarpmanin  Sonucu : " +carpma);
	System.out.println("Sonuc Mod : "+mod);
	
//arttýrýp eksikltme
	toplam+=1;
	System.out.println(toplam);
	cikarma-=1;
	System.out.println(cikarma);
	//ornek ;
	//int sonuc=a+=2 + b--;
	//System.out.println(sonuc);
	
	
	
	boolean kosul=(a/b) == 2;
	
	System.out.println(kosul);
	
	
	
	
	
		
	
	}

}
