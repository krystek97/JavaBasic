package pl.sportcode.ifSwitch;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
	  String name , surname ;
	  long numberTelephone ;
	  
	  Scanner save = new Scanner(System.in) ;
	  
	  System.out.println("Podaj imie");
	  name = save.next() ;
	  System.out.println("Podaj nazwisko");
	  surname = save.next() ;
	  System.out.println("Podaj muer telefonu");
	  numberTelephone = save.nextLong() ;
	  
	  System.out.println("Imie\t\t\t"+name) ; 
	  System.out.println("Nazwisko\t\t\t"+surname);
	  System.out.println("Numer telefonu\t\t\t\t"+numberTelephone);
  }
}
