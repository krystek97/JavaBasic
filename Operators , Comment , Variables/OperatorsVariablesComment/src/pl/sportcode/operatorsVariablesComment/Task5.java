package pl.sportcode.operatorsVariablesComment;

public class Task5 {
  public static void main(String[] args) {
	  double field , circuit ;
	  int radius = 47 ;
	  
	  field = Math.PI * Math.pow(radius , 2) ;
	  circuit = 2 * Math.PI * radius ;
	  
	  System.out.println("Obwod kola wynosi "+circuit);
	  System.out.println("Pole kola wynosi "+field);
  }
}
