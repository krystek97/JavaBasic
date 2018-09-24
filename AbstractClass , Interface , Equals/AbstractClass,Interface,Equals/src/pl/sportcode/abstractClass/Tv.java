package pl.sportcode.abstractClass;

//Nie mozemy utworzyc instancji klasy abstrakcyjnej . 
//Moze posiadac takze zwykle metody
public abstract class Tv implements InterfaceFirst , InterfaceSecond{
  
	public abstract void getOnOff(boolean onOff) ;
	
	@Override
	public String toString() {
		return "Metoda toString klasy Tv" ;
	}
	
	public static void changeVolume() {
		System.out.println("Zmiana glosnosci");
	}
}
