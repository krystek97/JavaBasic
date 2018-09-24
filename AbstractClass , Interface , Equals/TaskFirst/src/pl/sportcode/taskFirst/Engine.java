package pl.sportcode.taskFirst;

import java.util.Scanner;

public abstract class Engine implements PassengerCar , Transmission {

	@Override
	public void PassengerCar() {
		int countPersons ;
		Scanner save = new Scanner(System.in) ;
		
		System.out.println("Podaj ilosc ludzi jadacych autem");
		countPersons = save.nextInt() ;
		
		if(countPersons<=4) {
			System.out.println("Wystarczy tylko auto czterosobowe");
		}else {
			System.out.println("Auto powinno byc wieksze niz czteroosobowe");
		}
		
	}
	
	@Override
	public void Transmission() {
		int number ;
		
		System.out.println("Podaj liczbe biegow w aucie");
		Scanner save = new Scanner(System.in) ;
		number = save.nextInt() ;
		
		if(number == 4) {
			System.out.println("Auto ma cztery biegi");
		}else {
			System.out.println("Auto ma wiecej lub mniej niz cztery biegi");
		}
	}
}
