package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class Animals {
  public static void main(String[] args) {
	  Dogs dogFirst = new Dogs() ; 
	  int dogAge ;
	  String nameDog ;
	  
	  Scanner save = new Scanner(System.in) ; 
	  
	  System.out.println("Podaj wiek swojego psa .Nie uwzgledniamy tutaj rasy "
	  		+ "pana/pani psa .");
	  dogAge = save.nextInt() ;
	  System.out.println("Podaj imie swojego psa bedzie to nam potrzebne "
	  		+ "przy zapisie pani/pana psa do naszego dzienniczka wizyt" );
	  nameDog = save.next() ; 
	  
	  dogFirst.getDog(14, "Reksio"); 
	  
  }
}
