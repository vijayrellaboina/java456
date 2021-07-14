

public class TostringDemo1 
{
	int i=10;
	String s1 = "rbg technologies";
	
public String toString() {
	System.out.println("tostring");
	return s1 + i;
}
	public static void main(String[] args) 
	{
		System.out.println("abc");
		
		TostringDemo1 t1 =new TostringDemo1 ();
		System.out.println(t1);
		System.out.println("Done");
	}

}
