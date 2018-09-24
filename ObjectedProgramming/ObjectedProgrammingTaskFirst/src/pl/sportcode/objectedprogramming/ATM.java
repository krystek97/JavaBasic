package pl.sportcode.objectedprogramming;

import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {
	  int number , pin , numberSecond;
	  
	  Scanner save = new Scanner(System.in) ; 
	  
	  System.out.println("1.Wlacz bankomat 2.Wylacz bankomat");
	  number = save.nextInt() ;
	  
	  CashMachine ole = new CashMachine() ; 
	  
	  if(number == 1) {
		  ole.setOnOff(true);
		  ole.getOnOff();
		  System.out.println("Wloz karte");
		  System.out.println("Podaj pin");
		  pin = save.nextInt() ;
		  ole.getPin(pin);
		  if(pin == 1234) {
			  System.out.println("1.Wyplac pieniadze \n2.Stan Konta");
			  numberSecond = save.nextInt() ;
			  if(numberSecond == 1) {
				  ole.getMoney();
			  }else if(numberSecond == 2) {
				 ole.basicMoney();
			  }
		  }else {
			  System.out.println("Niepoprawny pin . Wpisz go jeszcze raz");
		  }
	  }else if(number == 2) {
		  ole.setOnOff(false);
		  ole.getOnOff();
	  }else {
		  System.out.println("Podales nieprawidlowa wartosc . Sprobuj ponownie");
	  }
  }
}
