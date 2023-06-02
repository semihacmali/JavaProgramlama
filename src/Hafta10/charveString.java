package Hafta10;

import java.util.Locale;
import java.util.Scanner;

public class charveString {
    public static void main(String[] args) {

  /*      char c1 = '0';
        char c2 = 't';
        System.out.println("c1'in char karsiligi : " + c1);
        System.out.println("0'in ascii tablo karşılığı(sayısal karsilik) : " + (int)c1);
        System.out.println("t'in ascii tablo karşılığı(sayısal karsilik) : " + (int)c2);

        System.out.println((char)55); // 7 ciktisi alinir
        System.out.println((char)300); // Ĭ ciktisi alinir

        int c3 = c1 + c2;
        System.out.println(c3);

        System.out.println(c3+=5);
*/
/*
        String st1 = "Devrek Meslek Yüksekokulu";
        char c4 = st1.charAt(7); //charAt : girilen indis degerindeki karakteri getirir.
        System.out.println(c4);

        String st2 = "İnternet";
        String st3 = " ve ";
        String st4 = "Ağ";

        String st5 = st2 + st3 + st4;
        System.out.println(st5);

        */

/*
        String str = "Java is coll!";
        System.out.println(str.length()); // karakter sayisini verir
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(12)); // str.length() - 1

        String str2 = "Java is Coll!";
        System.out.println('C' == 'c');
        System.out.println(str2.equals(str)); //metinlerin birebir ayni olup olmamasi
        System.out.println(str2.equalsIgnoreCase(str)); // metinlerin iceriginin ayni olup olmamasi

        System.out.println(str.indexOf('a')); // verilen indis'in bulundugu ilk konumu gosterir
        System.out.println(str.substring(8, 12)); // baslangic ve bitis indisleri verilir ve bu aradaki kelimelere erisilir
        System.out.println(str.lastIndexOf('a')); // verilen indis'in bulundugu son konumu gosterir

        String st1 = "Devrek Meslek Yüksekokulu";
        System.out.println(st1.indexOf('e'));
        System.out.println(st1.lastIndexOf('e'));
        System.out.println(st1.toUpperCase());
        System.out.println(st1.toLowerCase());
        */

        // Kelime sayisi ve 've' baglacı sayısını bulma
/*

        Scanner girdi = new Scanner(System.in);
        System.out.println("Cümle Giriniz : ");
        String cumle = girdi.nextLine();
        System.out.println(cumle);
        int kelimeSayisi = 0, veSayisi = 0;

        for(int i = 0; i < cumle.length(); i++){
            //kelime sayisini bulma
            if(cumle.charAt(i) == ' ') kelimeSayisi++;
            if(i <= (cumle.length() - 4) && cumle.charAt(i) == ' ' && cumle.charAt(i+1) == 'v' && cumle.charAt(i+2) == 'e' && cumle.charAt(i+3) == ' '){
                veSayisi++;
            }
        }

        System.out.println("Toplam Kelime Sayisi : " + kelimeSayisi +
                           "\nToplam ve Sayisi : " + veSayisi);

*/
        String inStr = "65431";
        String inStr2 = "546464646a";
        int number = Integer.parseInt(inStr);
        System.out.println(number);
        // int number2 = Integer.parseInt(inStr2);




    }
}
