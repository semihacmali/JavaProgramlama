package Hafta7;

public class fonksiyonnlaR {
	public static void main(String[] args) {
		
		double yaricap = 5;
		AlanHesaplama(yaricap);
		
		AlanHesaplama(8);
		
		int buyuksayi = BuyukSayi(35,27);
		System.out.println("Büyük sayı = "+ buyuksayi);
		
		System.out.println("ortalama = "+ ortalama(1,2,3));
		
		System.out.println("ortalama = "+ ortalama(1,2));
		
		
		
		
		System.out.println( (int)(Math.random()*2025645646));
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void AlanHesaplama(double yaricap )
	{
		double alan= Math.PI * yaricap * yaricap;
		System.out.println("Alan = " + alan);
	}
           
		public static int BuyukSayi(int sayi1,int sayi2) {
			if(sayi1>sayi2) {
				return sayi1;
			}
			else {
				return sayi2; 
			}
			
		}
	
		public static int ortalama(int s1,int s2) {
			return (s1+s2)/2;
			
		}
		
		public static float ortalama(int s1,int s2,int s3) {
			return (s1+s2+s3)/3;
		}
		
		 
		
		
		
		
}
