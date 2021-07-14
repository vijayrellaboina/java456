
public class ConsDemo6 
{
int a=5;
int b=10;
ConsDemo6(int i,int j)
{
	System.out.println("cons of Consdemo6");

	a=i;
    b=j;
}

	public static void main(String[] args)
	{
		 ConsDemo6 c1=new  ConsDemo6(20,30);
		 System.out.println(c1.a);
		 System.out.println(c1.b);
	}

}
