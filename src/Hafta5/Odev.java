package Hafta5;

import java.util.Scanner;

public class Odev {
/*
 * MBP104-Ileri-Programlama-05-Dongu-Yapilari-ve-Input-Output.pdf
 * Sayfa 4, 
 */
	public static void main(String[] args) {
		System.out.println("     *   ");
		System.out.println("  **  ** ");
		System.out.println("   *  *  ");
		System.out.println("  *    * ");
		System.out.println(" *      *");
	
		Scanner girdi=new Scanner(System.in);
		System.out.println("sayi giriniz:");
		int ilerleme = girdi.nextInt();
		System.out.print(" * | \t");
		for(int i = 1;i <= ilerleme; i++) {
			System.out.print(i + " \t");
		}
		System.out.println("\n---------------------------------------------------------------------------------");
		for(int i = 1; i <= ilerleme; i++ ) {
			System.out.print(i +" | \t");
			for(int j = 1; j <= ilerleme; j++) {
				System.out.print((i*j) + " \t");
			}
			System.out.println();
		}
	}
	
}
