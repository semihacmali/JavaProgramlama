package Hafta6;

import javax.swing.JOptionPane;

public class diziIslemleri {
	public static void main(String[] args) {
		int [] sayilar=new int[5];
		int sayilar2 []= new int[5];
		int sayilar3[] = {10,21,15,13,78};
		sayilar[0] = 5;
		
		System.out.println(sayilar3[3]);
		sayilar3[3]=sayilar3[3]+sayilar3[2];
		System.out.println(sayilar3[4]);
		/*
		int [] Sayi = new int [5];
		 for (int i=0;i< Sayi.length;i++)
		 {Sayi[i] = Integer.parseInt(JOptionPane.showInputDialog(i+".Sayi")); 
		 }
		 for (int i=0; i< Sayi.length; i++)
			{
				System.out.println("Sayi ["+ i +"]= " + Sayi [i] );
		}
		*/
		// int sayilar3[] = {10,21,15,13,78};
		int toplam = 0;
		for(int sayi : sayilar3) {
			toplam += sayi;
		}
		System.out.print(toplam);
		
	}

}
