package pl.sportcode.operatorsVariablesComment;

//Klasa Main//

/*
 * Wyswietla napis Hello World
 */
public class Main {
  public static void main(String[] args) {
	byte byteNumber = 127 ;  
	short shortNumber = 32767 ; 
	int intNumber = 2147483647 ;
	long longNumber = 456546456l ;
	float floatNumber = 3.44f ; 
	double doubleNumber = 3.444444444444444 ; 
	char sign = 'a' ; 
	String text = "Ala ma kota" ; 
	int numberSecond ;
	int numberThird = 56 ;
	int numberFor = 16 ;
	int numberFive , numberSix , numberSeven , numberEight , numberNine ;
	
	numberSecond = numberThird + numberFor ; 
	numberFive = numberThird - numberFor ;
	numberSix = numberThird * numberFor ; 
	numberSeven = numberThird / numberFor ;
	numberEight = numberThird % numberFor ;
	
	System.out.println("Hello World") ;
	System.out.println("numberSecond = "+numberSecond);
	System.out.println("numberFive = "+numberFive);
	System.out.println("NumberSix = "+numberSix);
	System.out.println("numberSeven = "+numberSeven);
	System.out.println("numberEigth = "+numberEight);
    numberEight++ ; 
    System.out.println("numberEight = "+numberEight);
    numberEight-- ; 
    System.out.println("numberEight = "+numberEight);
  }
}
