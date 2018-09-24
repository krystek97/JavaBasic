package pl.sportcode.taskFor;

import java.util.Scanner;

public class Main extends Mathematics{
  public static void main(String[] args) {
	  Scanner save = new Scanner(System.in) ; 
	  int number ;
	  Mathematics mathFirst = new Mathematics() ;
	  
	  
	  
	  do {
		  System.out.println("Witaj w twoim osobistym kalkulatorze");
		  System.out.println("Wybierz operacje ktora chcesz wykonac");
		  System.out.println("1.Dodawanie 2.Odejmowanie 3.Dzielenie");
		  number = save.nextInt() ;
		  
		  if(number == 1) {
			  mathFirst.add();
			}else if (number == 2) {
				mathFirst.subtract();
			}else if(number == 3) {
				mathFirst.division();
			}else {
				System.out.println("Podano nieprawidlowa opcje");
			}
	  }while(number < 5 && number > 0) ;
	  
  }
}
