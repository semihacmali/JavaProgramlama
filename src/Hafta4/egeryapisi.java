package Hafta4;

import java.util.Scanner;

public class egeryapisi {
	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.println("Vize Notunuzu Giriniz:");
		int vize = girdi.nextInt();
		System.out.println("Final Notunuzu Giriniz:");
		int finl = girdi.nextInt();
		
		if (finl<50) {
			System.out.println("KALDI");
			float but=(50.0f - vize * 0.4f) / 0.6f;
			System.out.println("Bütünleme için ihtiyaç notu:"+but);
			but=(but<50)?50:but;
			System.out.println("Bütünleme için ihtiyaç notu:"+but);
					
		}
		else {
			
		float not =((float)vize)*0.4f +((float)finl)* 0.6f ;
		
		
		if(not<44) {
			System.out.println("ff");
			float but=(50.0f - vize * 0.4f) / 0.6f;
			System.out.println("Bütünleme için ihtiyaç notu:"+but);
			but=(but<50)?50:but;
			System.out.println("Bütünleme için ihtiyaç notu:"+but);
		}
		
		else if (not<50) {
			System.out.println("fd");
			float but=(50.0f - vize * 0.4f) / 0.6f;
			System.out.println("Bütünleme için ihtiyaç notu:"+but);
			but=(but<50)?50:but;//(koşul)?dogru:yanlış
			// koşul : if'deki koşullar gibi <,>,== gibi ifadeler
			//doğru : if bloğundaki süslü parantezin içi
			//yanlış: else bloğunun içi
			
			
			System.out.println("Bütünleme için ihtiyaç notu:"+but);
			
		}
		else if (not<57) {
			System.out.println("DD");
		}
		else if (not<64) {
			System.out.println("DC");
		}
		else if(not<72) {
			System.out.println("CC");
		}
		else if (not<79) {
			System.out.println("CB");
		}
		else if (not<86) {
			System.out.println("BB");
		}
		else if (not<93) {
			System.out.println("BA");
		}
		else {
			System.out.println("AA");
		}
		}
		
		
	}
}
