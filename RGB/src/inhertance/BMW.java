package inhertance;

public class BMW extends Car{
//when same method is present in parent class as well as child class with same name and same number of arguments is called METHOD OVERRIDING
	public void start() {  //override method
		System.out.println("Bmw....start");
	}
	public void theSafety() {
		System.out.println("BmW...Stop");
	}
	
}
