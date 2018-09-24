package pl.sportcode.abstractClass;

public class Home{
  public static void main(String[] args) {
	  
	  /*Tv firstTv = new Tv() ; 
	   * Nie mozemy utowrzyc obiektow klasy abstrakcyjnej
	   * Klasy abstrakcyjne istnieja po to , aby moc je swobodnie rozszerzac
	   */
	  Nosy firstTv = new Nosy() ; 
	  String textFirst = "Ala ma kota" ;
	  String textSecond = "Ala ma 2 koty" ; 
	  
	  /*Kazda klasa dziedziczy po klasie Object*/
	  System.out.println("tekst".toString());
	  System.out.println(firstTv.toString());
	  
	  if(textFirst.equals(textSecond)) {
		  System.out.println("Te teskty sa sobie rowne");
	  }else {
		  System.out.println("Te teksty nie sa sobie rowne");
	  }
	  
	  //Operator sprawdzajacy czy dany obiekt jest instancja danej klasy
	  if(textFirst instanceof Object) {
		  System.out.println("textFirst jest instancja Object");
	  }
	  
	  Tv.changeVolume();
	  
	  /*Klasy nie moga byc statyczne*/
	  int numberSecond = Nosy.number ;
  }
}
