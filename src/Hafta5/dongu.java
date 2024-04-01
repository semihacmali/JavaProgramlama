package Hafta5;

import java.util.Random;
import java.util.Scanner;

public class dongu {

	public static void main(String[] args) {
		
		Scanner girdi=new Scanner(System.in);
		/*
		System.out.println("Satır sayısını Giriniz: ");
		
		int boyut= girdi.nextInt();
		for(int sutun=1; sutun <= boyut; sutun++) { 
			for(int satir=1; satir<=boyut;satir++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
			*/
	/*	int rastgele = (int)(Math.random()*100);
//		System.out.println("olusturulan sayi:"+rastgele);
		 System.out.print("tahmin ettigim sayi:");
		 int tahminsayi=girdi.nextInt();
		 while(rastgele!=tahminsayi) {
			 if(rastgele>tahminsayi) {
				 System.out.println("tahmin sayiyi yukselt");
			 }
			 else {
				 System.out.println("tahmini sayini dusur");
			 }
			 System.out.print("tahmin ettigim sayi:");
			 tahminsayi=girdi.nextInt();
			 if(rastgele==tahminsayi) {
				 System.out.println("dogru bildin!!!");
			 }
		 }
		
		*/
		do {

		System.out.println("cümleyi giriniz:");
		String cumle= girdi.nextLine();
		char harf = 'c';
		int sayac=0;
		for (int i=0;i<cumle.length();i++) {
	//		System.out.println(cumle.charAt(i));			
			if (cumle.charAt(i)==harf) {
				 sayac += 1;
			}
		}
		System.out.println(sayac );
	}while(true);
	}
	
}
