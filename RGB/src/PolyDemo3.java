
public class PolyDemo3 
{

	public static void main(String[] args) 
	{
		PolyDemo3 p1=new PolyDemo3();
//		A k=new A();
//		p1.funA(k);
	
		A a=null;
		p1.funA(a);
		
		B l=new B();
		p1.funA(l);		
		p1.funA(new A());
		
//		B b= null;
//		System.out.println(b);
		
		C m=new C();
		p1.funA(m);
		p1.funA(new A());
		
//		C c= null;
//		System.out.println(c);
		
		
		
		
		
		
	}
	void funA(A a1)
	{
		System.out.println("Class A data type");
		System.out.println(a1);
}

	void funA (B a1)
	{
		System.out.println("Class B data type");
		System.out.println(a1);
	}
	void funA (C a1)
	{
		System.out.println("Class C data type");
		System.out.println(a1);
	}
}
