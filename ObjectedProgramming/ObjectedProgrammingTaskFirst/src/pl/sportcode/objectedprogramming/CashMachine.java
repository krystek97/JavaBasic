package pl.sportcode.objectedprogramming;

import java.util.Scanner;

public class CashMachine {
  private boolean onOff ;
  private int pin ;
  
  public void getPin(int pin) {
	  this.pin = pin ; 
	  if(pin == 1234) {
		  System.out.println("Pin jest poprawny");
	  }else {
		  System.out.println("Pin nie jest poprawny");
	  }
  }
  
  public void setOnOff(boolean onOff) {
	  this.onOff = onOff ;
  }
  
  public void getMoney() {
	  int number ;
	  System.out.println("Jaka sume piniedzy chcesz wyplacic");
	  Scanner saveSecond = new Scanner(System.in);
	  number = saveSecond.nextInt() ;
	  if(number <= 0) {
		  System.out.println("Podales nieprawidlowa sume pieniedzy");
	  }else {
		  System.out.println("Wyplaciles "+number+" zl");
	  }
  }
  
  public void basicMoney() {
	 System.out.println("Twoj stan konta to 1000 zl"); 
  }
  
  public void getOnOff() {
	  if(onOff == true) {
		  System.out.println("Bankomat jest wlaczony");
	  }else {
		  System.out.println("Bankomat jest wylaczony");
	  }
  }
  
}
