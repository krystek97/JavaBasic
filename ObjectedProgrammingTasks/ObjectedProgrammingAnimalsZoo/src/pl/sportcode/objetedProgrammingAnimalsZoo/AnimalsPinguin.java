package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class AnimalsPinguin {
   private int agePinguin ; 
   private String namePinguin ; 
   
   public void getPinguin(int agePinguin , String namePinguin) {
	   this.agePinguin = agePinguin ;
	   this.namePinguin = namePinguin ; 
	   
	   Scanner save = new Scanner(System.in) ; 
	   
	   this.agePinguin = agePinguin ;
	   this.namePinguin = namePinguin ; 
	   
	   System.out.println("Podaj wiek danego pingwina");
	   agePinguin = save.nextInt() ; 
	   
	   if(agePinguin < 12) {
		   Scanner saveSecond = new Scanner(System.in) ; 
		   String pinguinStatus ;
		   System.out.println("Pingwin jest mlodszy . Pingwina mozna badac raz na 3 miesiace "
		   		+ "Pod warunkiem , ze wszystkie badania ma w normie");
		  System.out.println("Czy dany pinwin jest w tym momencie chory , czy jednak ma wszystkie"
		  		+ "badania w normie");
		  pinguinStatus = saveSecond.next() ; 
		  
		  if(pinguinStatus == "chory") {
			  System.out.println("Dany pingwin jest chory . Wiec pinwin zostal zapisany"
			  		+ "do wgladu co miesiac tak jak stare pingwiny");
		  }else if(pinguinStatus == "zdrowy"){
			  System.out.println("Dany pingwin jest zdrowy i mozna go badac raz na 3 miesiace ");
		  }
		  
	   }else {
		   System.out.println("Pingwin jest starszy . Pingwin musi miec robione badania "
		   		+ "raz na 1 miesiac");
	   }
   }
} 
