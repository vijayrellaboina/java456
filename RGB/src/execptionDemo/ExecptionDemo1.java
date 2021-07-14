package execptionDemo;

public class ExecptionDemo1 
{
static A a1;
	public static void main(String[] args) 
	{
System.out.println(10);

try {
System.out.println(10/2);
System.out.println(a1.i);
//}
//catch(Exception  a1 ) 
//{
//	//System.out.println(a1);
//	System.out.println( "Exception block");
//	System.out.println(a1);
}
//catch(ArithmeticException a1 ) {
//	//System.out.println(a1);
//	System.out.println("ArithmeticException block");
//	System.out.println(a1);
//}
catch(NullPointerException  a1 ) 
{
	//System.out.println(a1);
	System.out.println("NullpointerException block");
	System.out.println(a1);
	
}
catch(Exception  a1 ) 
{
	//System.out.println(a1);
	System.out.println( "Exception block");
	System.out.println(a1);
}
System.out.println("Done");
	}

}
