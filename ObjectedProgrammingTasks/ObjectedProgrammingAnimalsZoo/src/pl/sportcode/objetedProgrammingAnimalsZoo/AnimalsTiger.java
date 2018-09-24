package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class AnimalsTiger {
  private String nameTiger ;
  private int ageTiger ;
  
  Scanner save = new Scanner(System.in) ; 
  
  public void getTiger(int ageTiger , String nameTiger) {
	  System.out.println("Podaj wiek sowjego tygrysa . Wiek nie moze byc napisem . To znaczy "
	  		+ "nie przyjmujemy tygrysow ktore maja znamiona w trakcie czasu to znaczy naszywki na swoich uszach") ;
	  ageTiger = save.nextInt() ; 
	  
	  if(ageTiger >= 12) {
		  System.out.println("Tygrys jest juz starszy . Musi miec robione badania nprzynjamniej raz na 3 miesce");
	  }else {
		  System.out.println("Tygrys jest mlodszy niz sutawa przewiduje . Moze miec robione badania raz na trzy miesc");
	  }
	  
	  System.out.println("Podaj rase tygrysa . Rasa musi byc wpisana w ramy naszej spoldzielni"
	  		+ "zoologicznej . Rasa wiec nie powinna byc zmieniona . Uwaga nowe rasy sa dostepne do wpisania"
	  		+ "Zajrzyj na strone nowosci . Aby zobaczyc jakie rasy mozna wpisac do rejstru");
	  
	  nameTiger = save.next() ; 
	  
	  
  }
  
  public void setTiger() {
	  System.out.println("Rejestr tyrgysow wpisanych do naszej spoldzielni zoologicznej");
	  System.out.println("Tygrysy jakie znajduja sie w naszym rejestrze to tygrysy biale oraz tygrysy zwykle "
	  		+ "Poniewaz tylko takie rasy tyrgysow obslugujemy w naszej spoldzielni . Inne rasy nie sa oblugiwane w naszej spoldzielni "
	  		+ "zoologicznej");
  }
}
