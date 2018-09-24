package pl.sportcode.ifSwitch;

import java.util.Scanner;


public class Task4 {
	
  public static void main(String[] args) {
	  String text ;
	  int number   ;
	  
	  Scanner save = new Scanner(System.in); 
	  
	  System.out.println("Podaj dowolny teskt");
	  text = save.next() ;
	  System.out.println("Czy wydrukowac dany tekst 1 oznacza tak , 2 oznacza nie");
	  number = save.nextInt() ;
	  
	  if(number == 1) {
		  System.out.println("Ile razy chcesz wydrukowac tekst");
		  int numberSecond = save.nextInt() ; 
		  
		  for(int a = 0 ; a < numberSecond ; a++) {
			  System.out.println(text);
		  }
	  }else if(number == 2){
		  System.out.println("Koniec dzialania programu");
	  }else {
		  System.out.println("Podales nieprawidlowa wartosc");
		  System.out.println("Koniec programu");
	  }
  }
}
