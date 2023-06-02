package Hafta14;

public class Ogrenci {
    String isim;
    String soyisim;
    int numara;

    //constructor(yapıcı) tanımla
    //default constructor; disardan deger almaz
    Ogrenci(){
        this.isim = "Girilmedi";
        this.soyisim = "Girilmedi";
        this.numara = -1;
    }

    //disarıdan degisken alan constructor
    Ogrenci(String isim, String soyisim, int numara){
        //this(bu) ifadesi : nokta operatörü için gereklidir
        this.isim = isim;
        this.soyisim = soyisim;
        this.numara = numara;
    }

    Ogrenci(String isim , int numara, String soyisim){
        this.isim = isim;
        this.soyisim = soyisim;
    }
    //getter ve setter
    //getter : veriye disardan erismek icindir
    public String getIsim(){
        return this.isim;
    }
    public String getSoyisim(){
        return this.soyisim;
    }
    //setter : degisken degerini degistirmek icin kullanilir
    public void setIsim(String isim){
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }


    Ogrenci(String isim) {
        this.isim = isim;
    }

    public Ogrenci(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public Ogrenci(String isim, int numara) {
        this.isim = isim;
        this.numara = numara;
    }

}
