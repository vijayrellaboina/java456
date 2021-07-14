package execptionDemo;

public class FinallyDemo1 
{

	public static void main(String[] args) 
	{
		System.out.println("start");
		try 
		{
			System.out.println(10/2);
		}
		catch (Exception e) {
			System.out.println("Execption1 is invoking");
		}
		finally {
			System.out.println("Fina1 is invoking");
		}
		try 
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
						System.out.println("Execption2 is invoking");
	}
		try 
		{
			System.out.println(10/0);
		}
		finally {
			System.out.println("Fina2 is invoking");
		}
		System.out.println("Done");
	}
}
