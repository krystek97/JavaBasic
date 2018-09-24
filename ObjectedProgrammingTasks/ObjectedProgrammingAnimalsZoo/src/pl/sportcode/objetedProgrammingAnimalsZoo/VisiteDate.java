package pl.sportcode.objetedProgrammingAnimalsZoo;

import java.util.Scanner;

public class VisiteDate {
  private String date ;
  private String namePerson ;
  private String descriptionVisit ;
  private int agePerson ;
  
  public void getVisitDate(String date , String namePerson , String descriptionVisit , int agePerson) {
	  this.date = date ;
	  this.namePerson = namePerson ;
	  this.descriptionVisit = descriptionVisit ; 
	  
	  Scanner save = new Scanner(System.in) ; 
	  System.out.println("Podaj nazwe osoby zapisujacej pieska na badanie");
	  namePerson = save.next() ; 
	  System.out.println("Podaj opis wizyty . Z czym sie ona wiaze itd.");
	  descriptionVisit = save.next() ; 
	  System.out.println("Podaj date wizyty u weterynaza . Nie moze to byc data ktora "
	  		+ "juz byla . Na jeden dzien mamy miec zaplacnowane tylko 5 wizyt."
	  		+ "Natmiast w piatek dla kazdego psiaka mamy miec zakupionan obroze z tego wzgledu"
	  		+ "iz psiak musi miec swoja obroze , obroza moze miec tylko nasza naszywke"
	  		+ "inne naszywki nie beda przyjmowane");
	  date = save.next() ; 
	  System.out.println("Podaj wiek osoby zglaszajacej wizyte u wterynarza . Osoba"
	  		+ "musi miec minimum 16 lat zeby zglosci tak wizyte") ; 
	  agePerson = save.nextInt() ; 
	  
	  if(agePerson >= 16) {
		  System.out.println("Zapisz dana osobe na badanie. Osoba ta jest juz w "
		  		+ "pelni samodzielna i moze zapisac swoje ziwerzatko na badanie");
	  }else if(agePerson <= 8) {
		  System.out.println("Zapytaj sie czy rodzice nie chcieli by przyjsc z danym zwierzeciem );na badanie"
		  		+ "Moze to poskutkuje tym ze dostaniemy kolejnego zwierzaka do wyleczenia "
		  		+ "i dana rodzina bedzie szczesliwa") ; 
		  
	  }
	  else {
		  System.out.println("Dana osoba ma ponizej wymaganego wieku .Osoba nie jest"
		  		+ "w pelni samodzielna i nie moze zapisac swojego zwierzecia na badanie "
		  		+ "Dana osba musi jeszcze troche podrsonac zeby zapisac sowje zwierzatko na badanie");
	  }
	  
  }
}
