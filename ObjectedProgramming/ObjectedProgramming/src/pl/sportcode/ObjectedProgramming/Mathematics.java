package pl.sportcode.ObjectedProgramming;

import java.util.Scanner;

//Metody to pogrupowane fragmenty kodu rozwi¹zuj¹ce pewien problem

public class Mathematics {
  public static void main(String[] args) {
	  Mathematics name = new Mathematics() ;
	  
	  name.className();
	  name.sqrt(6) ;
	  System.out.println(name.sqrtDouble(16.78)) ;
	  
  }
  
  public void className(){
	  System.out.println("Mathematics");
  }
  
  public int sqrt(int number) {
	  return number * number ;
  }
  
  public double sqrtDouble(double number) {
	  return number * number ;
  }
}
