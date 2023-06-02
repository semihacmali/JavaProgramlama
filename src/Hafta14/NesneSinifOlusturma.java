package Hafta14;

public class NesneSinifOlusturma {
    public static void main(String[] args) {
        Ogrenci berkan = new Ogrenci();
        //nokta öperatörüyle deger atama
        berkan.isim = "Berkan";
        berkan.soyisim = "Kılıç";
        System.out.println(berkan.isim + " " + berkan.soyisim);

        Ogrenci furkan = new Ogrenci();
        furkan.isim = "Furkan";
        furkan.soyisim = "Topkaya";
        System.out.println(furkan.getIsim() + " " + furkan.getSoyisim());

        Ogrenci yasemin = new Ogrenci("Betül Yasemin", "Çifçi", 15685);
        System.out.println(yasemin.getIsim() + " " + yasemin.getSoyisim() + " " + yasemin.numara);

        furkan.setIsim("Mehmet");
        System.out.println(furkan.getIsim() + " " + furkan.getSoyisim());

    }

}
