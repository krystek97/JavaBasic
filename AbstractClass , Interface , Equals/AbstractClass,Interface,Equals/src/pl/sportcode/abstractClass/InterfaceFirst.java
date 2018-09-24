package pl.sportcode.abstractClass;

//Interfejsow klasy moga implementowac nieskonczona ilosc
public interface InterfaceFirst {
    //Pola sa publiczne , finalne (danemu polu przypisywana jest wartosc i nie mozna
	//jej zmienic
	/*Slowo kluczowe static oznacza , ze dana metoda wystapi nawet jezeli nie bedzie 
	 * istnial zaden obiekt danej klasy
	 */
	public final static int size = 7 ;
	
	public void changeChannel() ;
}
