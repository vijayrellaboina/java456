package basics;
public class StaticDemo1 
{
	static StaticDemo1 s1=new StaticDemo1();
	
	public static void main(String[] args)
	{
		
		System.out.println("Start");
		StaticDemo1 s1=new StaticDemo1();
		System.out.println(s1.s1);
		System.out.println("Done");
	}

}
