package pl.sportcode.ObjectedProgramming;

//Jezli jest private to mozna sie odwolac tylko w obrebie danej klasy , 
//Jezeli jest slowo public to mozna odwolac sie wszedzie
//Jezeli modyfikator dostepu to protected , mozliwy jest dostep do klasy pochodnej 
//Lub klasy z tego samego pakietu
//Jezeli nie podamy modyfikatora , to otrzymamy modyfikator domyslny , 
//ktory odwoluje sie do klas tylko z tego samego pakietu

public class Home {
  public static void main(String[] args) {
	  Tv philipsTv = new Tv(32 , "Philips") ;
	  Tv sama = new Tv(16 , "Sama") ;
	  
	  System.out.println("Nazwa "+sama.getName()+" Cale "+sama.getSize());
	  System.out.println("Nazwa "+philipsTv.getName()+" Cale "+philipsTv.getSize());
      
	  sama.getOnOff() ; 
	  sama.setOnOff(true);
	  sama.getOnOff();
	  
	  Dog rex = new Dog() ; 
	  rex.speak();
	  rex.setSize(16);
	  rex.getSize() ;
  }
}
