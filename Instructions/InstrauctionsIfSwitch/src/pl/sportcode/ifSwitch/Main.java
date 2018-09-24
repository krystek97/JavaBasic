package pl.sportcode.ifSwitch;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  int number , numberSecond , numberThird ;
	  
      Scanner save = new Scanner(System.in) ;
      
      System.out.println("Podaj dowolna liczbe");
      number = save.nextInt() ;
      
      if(number >10) {
    	  System.out.println("Liczba jest wieksza od 10");
    	  if(number==8) {
    		  System.out.println("Liczba jest rowna 8");
    	  }else {
    		  System.out.println("Liczba nie jest rowna 8");
    	  }
      }else {
    	  System.out.println("Liczba jest rowna lub mniejsza od 10");
      }
      
      System.out.println("Podaj dowolna liczbe");
      numberSecond = save.nextInt() ;
      
      switch(numberSecond) {
      case 1 :
    	  System.out.println("Liczba jest rowna 1");
    	  break ;
      case 2 :
    	  System.out.println("Liczba jest rowna 2");
          break ; 
      default :
    	  System.out.println("Liczba nie jest rowna , ani 1 , ani 2 ");
    	  break ; 
      }
      
      numberThird = 5 ;
      
      numberSecond = numberThird > 3 ? -1 : 1;
      
      for(int i = 0 ; i<10 ; i++) {
    	  System.out.print(i+" ");
    	  
    	  if(i==5) {
    		  break ; 
    	  }
      }
      
      for(int i = 0 ; i<10 ; i++) {
    	if(i % 2 == 0) {
    		continue ; 
    	}
    	System.out.println(i);
    	  
    	 
      }
      
      
  }
}
