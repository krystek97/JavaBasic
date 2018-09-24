package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class Dogs {
  private int ageDog ;
  private String nameDog ;
  
  public void getDog(int ageDog , String nameDog) {
	  this.ageDog = ageDog ; 
	  this.nameDog = nameDog ;
	  
	  Scanner save = new Scanner(System.in) ; 
	   
	  ageDog = save.nextInt() ; 
	  nameDog = save.next() ; 
	  
	  if(ageDog > 12) {
		  System.out.println("Pies jest stary.Trzeba go szczepic przynajmniej raz na pol roku");
	  }else {
		  System.out.println("Pies nalezy do mlodszych. Psa nalezy szczepic raz na 3 miesiace");
		  System.out.println("Nazwa psa to "+nameDog+" Nalezy go zapisac w dzienniczku weterynaryjnym");
	  }
  }
}
