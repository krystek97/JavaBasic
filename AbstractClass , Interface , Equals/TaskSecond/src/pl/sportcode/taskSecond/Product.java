package pl.sportcode.taskSecond;

import java.util.Scanner;

public class Product extends Factory {
  static int id = 0 ;
  
  public static void main(String[] args) {
	  int number ;
	  Scanner save = new Scanner(System.in) ;
	  Product firstProduct = new Product() ;
	  int numberThird ; 
	  
	  do {
		 firstProduct.newProduct();
		 id++ ;
		 System.out.println("Czy chcesz utworzyc kolejny produkt");
		 numberThird = save.nextInt() ;
		 }while(numberThird == 1) ;
	  
	  System.out.println("Twoje proukty to");
	  firstProduct.getProduct();
	 
  }
}
