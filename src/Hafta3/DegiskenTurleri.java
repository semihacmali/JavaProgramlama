package Hafta3;

public class DegiskenTurleri {
    public static void main(String[] args) {

        final int ogrenciSayisi = 13; // final tanimlanan degiskenin degeri daha sonradan degistirilemez

       // ogrenciSayisi++; // hata

        float deger = 1.7f; //tanimlama yapilirken en sona f eklenmelidir

        int OgrSayisi =  ogrenciSayisi + (int)deger; //(int) her zaman asagi yuvarlar

        System.out.println(OgrSayisi);

        System.out.println("Int Minimum Degeri : " + Integer.MIN_VALUE
                           +"\nInt Maximum Degeri : " + Integer.MAX_VALUE
                           +"\nDouble Maximum Degeri : " + Double.MAX_VALUE
                           +"\nDouble Minumum Degeri :" + Double.MIN_VALUE);



        int a = 5;
        int b = 4;
        float c = a/(float)b; // 5/4 = 1
        System.out.println("a/b : " + a/b); // iki int degiskenle bolme islemi yapilirsa sonuctaki virgülden sonraki ifadeler silinir.
        System.out.println("a/(float)b : " + a/(float)b);



    }
}
