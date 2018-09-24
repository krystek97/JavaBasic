package pl.sportcode.taskFor;

import java.util.Scanner;

public class Mathematics {
	static int number , numberSecond ;
	
    public static void add() {
      Scanner save = new Scanner(System.in) ;
      int add ;
      
      System.out.println("Podaj pierwsza liczbe");
      number = save.nextInt() ;
      System.out.println("Podaj druga liczbe");
      numberSecond = save.nextInt() ;
      add = number + numberSecond ;
      System.out.println("Wynik dodawania tych dwoch liczb to "+add);
    }
    
    public static void division() {
    	Scanner save = new Scanner(System.in) ;
    	int division ;
    	
    	System.out.println("Podaj pierwsza liczbe");
    	number = save.nextInt() ;
    	System.out.println("Podaj druga liczbe");
    	numberSecond = save.nextInt() ;
    	
    	division = number/numberSecond ;
    	System.out.println("Wynik dzielenia tych dwoch liczb to "+division);
    }
    
    public static void subtract() {
    	Scanner save = new Scanner(System.in) ; 
    	int subtract ; 
    	
    	System.out.println("Podaj pierwsza liczbe");
    	number = save.nextInt() ; 
    	System.out.println("Podaj druga liczbe");
    	numberSecond = save.nextInt() ; 
    	
    	subtract = number - numberSecond ;
    	System.out.println("Wynik odejmowania tych dwoch liczb to "+subtract);
    }
}
