package Hafta8;

public class Ogranci {

private	int numara ;
   String adsoyad;
String bolum;

Ogranci(int numara,String adsoyad,String bolum){
	this.numara=numara;
	this.adsoyad=adsoyad;
	this.bolum=bolum;
	
}
Ogranci(int numara,String adsoyad){
	this.adsoyad=adsoyad;
	this.numara=numara;
}
Ogranci(){
	this.numara=-1;
	this.adsoyad="   girilmedi    ";
	this.bolum="   girilmedi    ";
	
}



public int getNumara() {
	return this.numara;
}

public String getBolum() {
	return this.bolum;
}
public String getAdsoyad() {
	return this.adsoyad;
}



public void info() {
	System.out.println(this.adsoyad+"\t"+this.bolum+"\t"+this.numara);

}
 
}
