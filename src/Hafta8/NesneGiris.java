package Hafta8;

public class NesneGiris {
public static void main(String[] args) {
	Ogranci talha = new Ogranci();
	talha.adsoyad="talha aydin  ";
	talha.bolum= "int ag  ";
	//talha.numara=8009;
	
	
	
	
	
	
	
	Ogranci kadir=new Ogranci();
	kadir.adsoyad="kadir turhan ";
	kadir.bolum="pc muhendis  ";
	//kadir.numara=6817; 
	//System.out.println(kadir.adsoyad+kadir.bolum+kadir.numara);
	//System.out.println(talha.adsoyad+talha.bolum+talha.numara);
	
	//kadir.info();
	//talha.info();
	//Cember apo=new Cember(5);
	//apo.cevre();
	//System.out.println(apo.cevre());
	
	Ogranci ilayda=new Ogranci   (  66   ,"  zehra Ozcelik  ","  ascilik   ");
	ilayda.info();
	Ogranci dilara =new Ogranci(66,"    dilara guler    "    );
	dilara.info();
	Ogranci zehra=new Ogranci();
	zehra.info();
	
	System.out.println(ilayda.getAdsoyad()+ilayda.getBolum()+ilayda.getNumara());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
