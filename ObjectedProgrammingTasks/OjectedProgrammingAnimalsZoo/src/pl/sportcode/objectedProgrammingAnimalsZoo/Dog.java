package pl.sportcode.objectedProgrammingAnimalsZoo;

import java.util.Scanner;

public class Dog extends Animals{
  private int ageDog ;
  private String nameDog ;
  
  public void getAgeDog(int ageDog) {
	  Scanner save = new Scanner(System.in) ; 
	  
	  this.ageDog = ageDog ;
	  this.nameDog = nameDog ;
	  
	  
	  System.out.println("Podaj wiek psa");
	  ageDog = save.nextInt() ; 
	  
	  if(ageDog >= 12) {
		  System.out.println("Pies jest stary . Psa nalezy badac co 3 miesiace . ");
	  }else if(ageDog < 12 && ageDog > 0) {
		  System.out.println("Pies jest mlodszy  . Psa mozna badac co 6 miesiecy" );
	  }else {
		  System.out.println("To nie jest wiek psa . Sprobuj ponownie") ; 
	  }
	  
	  
  }
  
  public void getNameDog(String ) ;
}
