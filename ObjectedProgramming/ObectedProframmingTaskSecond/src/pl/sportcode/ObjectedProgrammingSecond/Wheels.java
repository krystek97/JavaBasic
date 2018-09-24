package pl.sportcode.ObjectedProgrammingSecond;

public class Wheels extends Bicycle{
  private String factory ;
  private int size ;	  
  
  public void frontWheel(String factory , int size) {
	  this.factory = factory ;
	  this.size = size ;
  }
  
  public void backWheel(String factory , int size) {
	  this.factory = factory ;
	  this.size = size ;
  }
 }

