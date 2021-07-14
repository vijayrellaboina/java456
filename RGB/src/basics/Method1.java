package basics;
public class Method1
{
static int	 a=10;
static int b=20;  
static int  c=a+b;
static char character;  
static boolean b2 ;
	public static void main(String[] args)
	{
		funA();
        funB();
        funC ();
        funD (); 
        funE(); 
        funF();
	}
 static void funA ()
{
	int c=a+b;
	System.out.println(c);
  }
 static void funB ()
 {
 long c=a+b;
	System.out.println(c);
 }
  static void funC ()
  {
  float c=a+b;
	System.out.println(c);
  }
  static void funD ()
  {
	double c=a+b;
	System.out.println(c); 
  }
  static void funE () 
  {
      char character;
      character = 'r';
	 System.out.println(character); 
  }
  static void funF ()
  {
     boolean b2 ;
     b2=false;
     System.out.println(b2);
  }
}



