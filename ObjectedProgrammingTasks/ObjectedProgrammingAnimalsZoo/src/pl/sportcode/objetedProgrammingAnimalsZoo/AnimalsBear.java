package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class AnimalsBear extends Animals {
  private int ageTiger ;
  private String nameTiger ;
  
  public void getTiger(String nameTiger , int ageTiger) {
	  System.out.println("Witaj . Tutaj mozesz wpisac nazwe Tygrysa , ktory cie interesuje "
	  		+ "Rasa Tygrysa moze roznic sie w zalecznosci od jego koloru skory");
	  this.ageTiger = ageTiger ;
	  this.nameTiger = nameTiger ;
	  
	  Scanner save = new Scanner(System.in) ; 
	  
	  System.out.println("Wpisz wiek swojego tygrysa");
	  
	  ageTiger = save.nextInt() ;
	  
	  if(ageTiger >= 12) {
		  System.out.println("Tygrys jest starszy . Tygrys wiec musi miec badania robione "
		  		+ "raz na 3 miesiace");
	  }else {
		  System.out.println("Tygrys jest mlodszy . Wiec tygrys musi miec robione badania raz na "
		  		+ "6 miesiecy");
	  }
	  
	  System.out.println("Podaj rase tyrgysa");
	  
	  nameTiger = save.next() ; 
	  
	  if(nameTiger == "Bengalski") {
		  System.out.println("Tygrys Bengalski to bardzo silne zwierze . Trzeba zapisac ze "
		  		+ "musi byc wiecej niz trzech weterynarzy przy badaniu");
	  }else if(nameTiger == "Australijski") {
		  System.out.println("Tygyrs Australijski to bardzo silne zwierze . Przy taki zw"
		  		+ "ierzeciu musi byc przynajmniej 4 weterynarzy dodatkowo obslugujacych urzadzenia do podtrzymania "
		  		+ "takiego tygrysa");
	  }else if(nameTiger == "Brazylijski") {
		  System.out.println("Do podtrzymania tygrysa potzrbni sa trzej dodatkowi specjalisci");
	  }else {
		  System.out.println("Nie rozpoznano rasy tygrysa . Tyrgys nie moze zostac przebany w naszej klinice"
		  		+ "Tgrys musin miec dodatkowo czterech specjalistow przytrzymujacych dane zwierze . Zwierze "
		  		+ "moze ucierpiec przy badaniu w zaleznosci od rodzaju badania . Dane "
		  		+ "zwierze jest bardzo kosztowne . Trzeba sie z nim obchodzic ostroznie");
	  }
  }
}
