package basics;
public class Newdemo 
{

	public static void main(String[] args)
	{
         funB();
	    }
        void funA()
        { 
	System.out.println("fun of A NewDemo");
        }
          static void funB()
           {
        	   System.out.println("fun of B NewDemo"); 
        	   Newdemo n1=new Newdemo();
        	   n1.funA();
           }
}	   