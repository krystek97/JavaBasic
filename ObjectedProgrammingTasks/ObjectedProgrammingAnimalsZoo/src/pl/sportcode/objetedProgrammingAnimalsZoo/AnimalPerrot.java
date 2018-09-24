package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class AnimalPerrot {
  private String namePerrot ;
  private int agePerrot ;
  
  public void getPerrot(String namePerrot , int agePerrot) {
	  this.agePerrot = agePerrot ;
	  this.namePerrot = namePerrot ;
	  
	  Scanner save = new Scanner(System.in) ; 
	  
	  System.out.println("Podaj rase papugi . Rasa musi miec sowje oznanaczenie w postaci nadzrednego numeru wpisanego do danych naszej spoldzielni "
	  		+ "zoologicznej") ; 
	  namePerrot = save.next() ; 
	  System.out.println("Podaj wiek papugi jezeli pauga ma wiecej niz 12 lat to znaczy ze papuga jest starsza i trzeba dbac o nai bardziej niz o te mlodsze") ; 
	  agePerrot = save.nextInt() ;
	  if(agePerrot >= 12) {
		  System.out.println("Papuga jest juz starsza . Papuga musi miec podawane zastrzyki droga oralna "
		  		+ "Papuga musi miec robione zastrzyki przynajmniej raz na trzy miesiace");
	  }else {
		  System.out.println("Papuga jest mlodsz . Pauga moze miec robione szczepienie tylko raz na 6 miesiecy");
	  }
  }
}
