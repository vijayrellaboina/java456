
public class WrapperDemo1 
{

	public static void main(String[] args) 
	{
		int a=10;
		Integer i1 = new Integer(a);  // Boxing
		System.out.println(i1);
		
		int b=i1.intValue();//  un boxing
		System.out.println(b);
		
		
		Integer i2=30; //auto boxing
		//new Integer(20);
		
		int c=20;  // auto un boxing
		
		int d= 23+i2.intValue();
		System.out.println(d);
		
	}

}
