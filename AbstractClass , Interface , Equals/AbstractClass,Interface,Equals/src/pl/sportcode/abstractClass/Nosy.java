package pl.sportcode.abstractClass;

public class Nosy extends Tv{
    
	static int number = 56 ;
	
	@Override
	public void getOnOff(boolean onOff) {
		if(onOff) {
			System.out.println("Telewizor jest wlaczony");
		}else {
			System.out.println("Telewizor jest wylaczony");
		}
	}
	
	@Override
	public String toString() {
		return "Metoda toString klasy Nosy" ;
	}
	
	@Override
	public void changeChannel() {
		
	}
	
}
