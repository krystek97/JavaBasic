package pl.sportcode.ObjectedProgramming;

public class Tv {
  private String nameTv ; 
  private int sizeTv ; 
  private boolean onOff ; 
  
  //Konstruktor domysly automatycznie wywolany przez nasz klase 
  public Tv() {
	  
  }
  
  public Tv(int sizeTv , String nameTv) {
	  this.sizeTv = sizeTv ; 
	  this.nameTv = nameTv ; 
  }
  
  public int getSize() {
	  return sizeTv ; 
  }
  
  public String getName() {
	  return nameTv ; 
  }
  
  public void setOnOff(boolean number) {
	  onOff = number ;
  }
  
  public void getOnOff() {
	  if(onOff == true) {
		  System.out.println("Telewizor jest wlaczony");
	  }else {
		  System.out.println("Telewizor jest wylaczony");
	  }
  }
}
