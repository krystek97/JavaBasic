package pl.sportcode.tablesLoop;

public class Main {
  public static void main(String[] args) {
	  int table[] = new int[5] ; 
	  int number2 = 0 ;
	  int number3 = 0 ;
	  int tableSecond[][] = new int [3][2] ;
	  
	  table[0] = 6 ;
	  table[1] = 5 ; 
	  table[2] = 4 ; 
	  table[3] = 3 ; 
	  table[4] = 2 ; 
	  table[5] = 1 ; 
	  
	  System.out.println(table[0]) ;
	  
	  for(int number = 0 ; number<5 ; number++) {
		  System.out.println("Element tablicy : "+table[number]) ;
	  }
	  
	  for(int number : table) {
		  System.out.println(number);
	  }
	  
	  while(number2<=5) {
		  number2++ ; 
		  System.out.println("Cokolwiek "+number2);
	  }
	  
	  do {
		  number3++ ;
		  System.out.println("Witaj w petli do while");
	  }while(number3<5) ;
	  }
	  
	  
  }

