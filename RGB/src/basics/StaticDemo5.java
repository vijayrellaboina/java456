package basics;
public class StaticDemo5
{
int a=funA();
//int d=funC();
 static int b=funB();
// static int c=funC();
int funA()
{
	System.out.println("funA of StaticDemo5");
	return 10;
	
}
static int funB ()
{
	System.out.println("funB of StaticDemo5");
	return 20;
}
 //static int funC ()
{
	//System.out.println("funC of StaticDemo5");
	//return 30;
}
	public static void main(String[] args) 
	{
		
		System.out.println("main method start");	 
	   StaticDemo5 s1=new StaticDemo5();
        System.out.println(s1);	
		//System.out.println(s1.d);	
	System.out.println("Done");
        //     new StaticDemo5();
        //     new StaticDemo5();
	}

}
