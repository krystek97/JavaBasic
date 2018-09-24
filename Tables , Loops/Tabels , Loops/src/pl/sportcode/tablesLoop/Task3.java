package pl.sportcode.tablesLoop;

public class Task3 {
  public static void main(String[] args) {
	  int table[][] = {{1 , 1 , 1 , 1 , 1} , {1 , 1 ,1} , {1 , 1 , 1 , 1 , 1} } ; 
	  int number ;
	  int number2 ; 
	  
	  for(number = 0 ; number<table.length ; number++) {
		  for(number2 = 0 ; number2<table[number].length ; number2++) {
			  System.out.print(table[number][number2]) ; 
		  }
		  System.out.println() ; 
	  }
  }
}
