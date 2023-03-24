package Hafta4;

public class tipDonusumleriveOperatorler {
    public static void main(String[] args) {
        /*
        double d1 = 4.8;
        int i1 = (int)d1; //tip donusumu yapılacak tur parantez icersinde yazilir
        System.out.println("Integer'a donusturulmus " + d1 + " degeri : " + i1); // sayisal donusumlerde sayinin virgülden sonrasi silinir

        //int i2 =  75.12f; //sayilarin sonuna koyulan f ifadesi float anlamına gelir
        double d2 = 12;
        System.out.println(d2);
        */
        /*
        //1'den 100'e kadar olan sayilarin ortalaması
        float ortalama;
        int toplam = 0;
        for(int sayi = 1;sayi <= 100; sayi++){
            toplam += sayi; // toplam = toplam + sayi
        }
        System.out.println("Sayilarin Toplami : " + toplam);
        ortalama = toplam / 100.0f; // iki int sayi bolunurse sonuc int olur
        System.out.println("Sayilarin Ortalamasi : " + ortalama);

        */
        /*
        //KDV Ornegi
       float fiyat = 60; // float bir değiskene int degisken atanirsa floata cevrilir
       System.out.println(fiyat);

       double kdv = 0.18f; // float bir degisken double turune donusturulurse veri fazlaligi olusur
       System.out.println(kdv);

       double kdvsizFiyat = fiyat/(1+kdv);
       System.out.println("Kdv'siz Fiyat : " + kdvsizFiyat);
        */
/*

        //Parse Ornekleri
        String str1 = "152";
        System.out.println(str1 + 1); //1521
        int i2 = Integer.parseInt(str1); // Stringi Integer'a cevirir
        System.out.println(i2 + 1);;//153
        double d2 = Double.parseDouble(str1); // Stringi Double'a cevirir.
        System.out.println(d2 + 1 );
        float f2 = Float.parseFloat(str1);// Stringi Float'a cevirir.
        System.out.println(f2 + 1);

*/
/*
        double z;
        double a = 8.0d;
        z = -(5 * Math.pow(a,(2/3)))/4;
        System.out.println(z);

        System.out.println(Math.pow(4.0d,1/2));

        */
        /*
        // (z > 10) && (z < 60) // z degiskeni 11 ila 59 arasindaysa dogrudur bu ifade

        int a =
        if((a < 20) || (a > 100)){
            System.out.println("Girilen Deger bu aralıktadır");
        }else{
            System.out.println("Girilen Deger bu aralıkta değildir");
        }
        */

        // 15/10/1582'den oncesi icin true degerini donduren boolean ifadeyi yazınız.
        // (yil < 1582) ||  (yil == 1582 && ay < 10) || (yil == 1582 && ay == 10 && gun < 15) ifadesi bize bu sonucu verir
/*
        double d1 = 3.3d + 5.5d;
        double d2 = 8.8d;
        System.out.println(d1==d2);
      */
/*
        //ASCII tablo
        for(int i = 0; i <= 255; i++){
            System.out.print((char)i + "\t");
            if(i%10 == 0) System.out.println();
        }
        */

        /*
        char c1 = 'a';
        System.out.println(c1);
        System.out.println((int)c1);

        int i3 = 'a' + 5; //'a' = 97
        System.out.println("'a' + 5 = " + i3);

        System.out.println("Merhaba" + " " + "Dunya" + "!");

        */

        // x^2 - 3x - 4 = 0 ifadesinin koklerini bulan kodu yazınız.
        // durum = b^2 - 4ac => 0 ise koklerine ayrılabilir değilse ayrılamaz
        // durum >= 0 ise kok1 = (-b + karekokdurum) / 2a
        //                kok2 = (-b - karekokdurum) / 2a
        double a = 1, b = -3, c = -4;
        double durum = 0,kok1 = 0,kok2 = 0;

        durum = b*b - 4 * a * c;
        System.out.println(durum);
        if(durum >= 0){
            kok1 = (-b + Math.sqrt(durum)) / (2*a);
            kok2 = (-b - Math.sqrt(durum)) / (2*a);
            System.out.println("Girilen İfadenin Kokleri;\n"
                    + "Birinci Kok : " + kok1 +"\n"
                    + "Ikinci Kok : " + kok2);
        }else{
            System.out.println("Verilen ifade koklerine ayrilamaz!!");
        }















    }

}
