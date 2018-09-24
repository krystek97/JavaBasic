package pl.sportcode.ObjectedProgramming;

public class Animal {
	
	private int size ;
	
	public void speak() {
		System.out.println(" ") ;
	}
	
	public void setSize(int size) {
		this.size = size ; 
		System.out.println(size);
	}
	
	public int getSize() {
		return size ; 
	}
}

