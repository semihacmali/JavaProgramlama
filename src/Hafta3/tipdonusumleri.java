package Hafta3;

public class tipdonusumleri {
	
       public static void main(String[] args) {
		
    	   double a1 = 3.5 ;
    	   int b1 = (int) a1;
    	   System.out.println(b1);
    	   int b2 = 55214;
    	   double a2 = b2;
    	   System.out.println(b2);
    	   
    	   int sum =0;
    	   double average;
    	   for(int number =1; number<=100;++number) {
    		   sum += number;
    	   }
    	  average=sum/100.0;
    	  System.out.println("Average is="+ average);
    	  
    	  String c1="7845";
    	  System.out.println(Integer.parseInt(c1)+5);
    	  System.out.println((c1)+5);
    	  String c2 = "25.542";
    	  float h1 = Float.parseFloat(c2);
    	  int b3 = 5;
    	  System.out.println(Math.pow(b3, 10));
    	  int b4 = 8;
    	  System.out.println(b4++);
    	  System.out.println(b4);
    	  int b5=12;
    	  System.out.println(--b5);
    	  
    	  int b6=8;
    	  System.out.println(b6%2==0);
    	  
    	  int yil= 2004;
    	  int ay = 11;
    	  int gun= 03;
    	               //15 10 1582
    	  //(yil<1582)||(yil == 1582 && ay<10)||(yil == 1582 && ay==10 && gun<15)
    	  System.out.println((yil<1582)||(yil == 1582 && ay<10)||(yil == 1582 && ay==10 && gun<15));
    	  
    	  System.out.println("The average is=" + average );
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
