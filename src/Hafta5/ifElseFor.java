package Hafta5;

import java.util.Scanner;

public class ifElseFor {
    public static void main(String[] args) {
/*
        int not = 49;
        if(not >= 50){ // not degiskeninin degerinin 50'den buyuk olmasi gerekir
            System.out.println("Dersten Geçtiniz!");
        }else{// not degeri 50'den kucuk ise burasi calisir
            System.out.println("Dersten Kaldiniz!");
        }

        */
/*

        //Dışarıdan girilen sayi negatif ise girilen sayinin karesini alan programi yaziniz.

        //Scanner klavyeden deger almamiza yarayan bir class'dir.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int sayi1 = input.nextInt();
        int sonuc = 0;
        if(sayi1 < 0){
            sonuc = sayi1 * sayi1;
            System.out.println("Girilen Sayinin Karesi : " + sonuc);
        }else{
            System.out.println("Girdiginiz sayi pozitif olduğundan işlem yapilmamistir!");
        }
*/

/*
        int sonuc = 77;
        if (sonuc >= 80) System.out.print("A");
        if (sonuc >= 70) System.out.print("B");
        if (sonuc >= 60) System.out.print("C");
        else System.out.println("D");

        //else kendinden bir önceki if'e baglidir
        System.out.println();
        if (sonuc >= 80) System.out.print("A");
        else if (sonuc >= 70) System.out.print("B");
        else if (sonuc >= 60) System.out.print("C");
        else System.out.println("D");
        */

/*
        int sayi1 = 8, sayi2 = 10;
               // (koşulluifade) ? dogru ise yapilacak islem : yanlis ise yapilacak islem
        int max = (sayi1>sayi2) ? sayi1 : sayi2;
        System.out.println("Büyük Sayi : " + max);

*/
/*

        int toplam = 0, ustlimit = 100;
        int sayi = 0;
        while (sayi <= ustlimit){
            toplam = toplam + sayi;
            sayi++;
        }
        System.out.println("Sayi degeri : " + sayi);
        System.out.println("0-100 arasindaki sayilarin toplami : " + toplam);
*/

/*

        int n = 7;
        int faktoriyel = 1;
        int sayi = 1;
        do {
            faktoriyel = faktoriyel * sayi;
            sayi++;
        }while (sayi <= n);
        System.out.println("Sayi Degeri : " + sayi);
        System.out.println("7! : " + faktoriyel);
*/
/*

        //0 ile 100 arasındaki çift sayilarin toplami
        int toplam = 0, ustlimit = 100;
        for(int i = 0; i <= 100; i=i+2){
            toplam = toplam + i;
        }
        System.out.println("0-100 arasindaki çift sayilarin toplami : " + toplam);
        //0 ile 100 arasındaki tek sayilarin toplami
        toplam = 0;
        ustlimit = 100;
        for(int i = 1; i <= 100; i=i+2){
            toplam = toplam + i;
        }
        System.out.println("0-100 arasindaki tek sayilarin toplami : " + toplam);
*/
        int healt = 100;
        boolean yasam = true;

        while(yasam){
            System.out.println("Şu an da oyunda aktif hareket edebiliyorsunuz!");
            healt = healt - 10;
            if(healt <= 0) yasam = false;
        }



    }
}
