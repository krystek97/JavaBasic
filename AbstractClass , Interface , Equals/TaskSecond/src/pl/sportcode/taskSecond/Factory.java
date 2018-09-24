package pl.sportcode.taskSecond;

import java.util.Scanner;

public class Factory{
  String tableProduct[] = new String[100] ;
  int number = 0 ;
  public void newProduct() {
	  Scanner save = new Scanner(System.in) ; 
	  
	  System.out.println("Podaj nazwe nowego produktu");
	  tableProduct[number] = save.next() ; 
	  number ++ ;	  
  }
  
  public void getProduct() {
	  for(int numberSecond = 0 , id = 0; numberSecond < number ; numberSecond++ , id++) {
		  System.out.println(tableProduct[numberSecond]);
		  System.out.println("Id produktu to "+id);
	  }
  }
}
