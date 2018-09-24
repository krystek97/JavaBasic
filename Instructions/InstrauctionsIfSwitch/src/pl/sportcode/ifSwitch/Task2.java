package pl.sportcode.ifSwitch;

import java.util.Scanner;

public abstract class Task2 {
  public static void main(String[] args) {
	  int numberFirst , numberSecond , numberThird ; 
	  double add ;
	  
	  Scanner save = new Scanner(System.in) ;
	  
	  System.out.println("Podaj liczbe punktow za styl");
	  numberFirst = save.nextInt() ; 
	  System.out.println("Podaj liczbe punktow za efekty");
	  numberSecond = save.nextInt() ;
	  System.out.println("Podaj punkty za efekty");
	  numberThird = save.nextInt() ;
	  
	  add = 0.2 * numberFirst + 0.3 * numberSecond + 0.5 * numberThird ;
	  
	  System.out.println("Suma punktow to "+add);
  }
}
