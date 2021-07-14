package inhertance;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism -- compile polymorphism
		BMW b=new BMW();
		b.start();

b.stop();
b.refuel();
b.theSafety();

System.out.println("****");

Car c= new Car();
 c.start();
c.stop();
c.refuel();
System.out.println("****");

Car c1= new BMW();
//child class object can be referred by parent class reference variable --- dynamic polymorphism
	c1.start();
	}

}