package Hafta2;

public class IlkDers {
    public static void main(String[] args){
/*      // Print Println farki
        System.out.print("Merhaba Dunya!"); // Imlec cümlenin bitiminde kalir
          // açıklama satırı haline getirir
        System.out.println("Devrek Meslek Yüksekokulu"); // imlec bir alt satira gecer
        System.out.print("İnternet ve Ağ Teknolojileri");
*/

/*      // Ucgen Cizimi
        System.out.println("* * * * *");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("   * *");
        System.out.println("    *");
*/
/*      //4 sayinin toplami
        int sayi1 = 12;
        int sayi2 = 43;
        int sayi3 = 51;
        int sayi4 = 22;

        int toplam = sayi1 + sayi2 + sayi3 + sayi4;
        System.out.println("Girilen 4 sayinin toplami : " + toplam);
*/
  /*    // Dairenin Cevresi ve Alani
        double pi = Math.PI;
        double yaricap = 3;

        //Dairenin Cevresinin hesaplanmasi
        double cemberCevre = 2 * pi * yaricap;
        //Dairenin Alaninin hesaplanmasi
        double cemberAlan = pi * yaricap * yaricap;

        System.out.println("Yarıcapi " + yaricap + " olan Dairenin; " +
                           "\nCevresi : " + cemberCevre +
                           "\nAlani : " + cemberAlan);
*/

        int x = 5;
     /*
        System.out.println("X degiskenin degeri : " + x++);
        System.out.println("X degiskenin degeri : " + x);

        System.out.println("X degiskenin degeri : " + ++x);
        System.out.println("X degiskenin degeri : " + x);
      */

/*      // Dongu Ornek -- Araliktaki sayilarin toplami
        int altsinir = 1, ustsinir = 500;
        int toplam = 0;

        int sayi = altsinir;
        do{
            toplam = toplam + sayi;
            sayi++;
        }while (sayi <= ustsinir);

        System.out.println(altsinir + " ile " + ustsinir + "arasindaki sayilarin toplami : " + toplam);
        System.out.println("sayi degiskeninin degeri : " + sayi);
       */


        // sadece cift sayilarin toplamini bulmak
        int altSinir = 1, ustSinir = 300;

        int toplam = 0;
        int tekToplam = 0;
        int sayi = altSinir;

        while(sayi <= ustSinir){

            if(sayi % 2 == 0){ // cift oldugunu anlamak icin mod aliyoruz
                toplam = toplam + sayi;
            }

            if(sayi % 2 == 1){
                tekToplam = tekToplam + sayi;
            }
            sayi++; // dongulerde en onemli konu kosul ifadesindeki degiskenin degerini degistirmektir
        }
        System.out.println(altSinir + " ile " + ustSinir + " arasindaki çift sayilarin toplami : " + toplam);
        System.out.println(altSinir + " ile " + ustSinir + " arasindaki tek sayilarin toplami : " + tekToplam);

    }

}
