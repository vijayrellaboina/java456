package basics;
public class ConsDemo2 
{
int a=10;
ConsDemo2 ()
{
	System.out.println("Cons of ConsDemo2");
	a=20;
}
	public static void main(String[] args) 
	{
		ConsDemo2 c1=new ConsDemo2();
		System.out.println(c1.a);
	}

}
