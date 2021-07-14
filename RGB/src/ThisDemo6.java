
public class ThisDemo6 
{

	ThisDemo6 funA()
	{
		return new ThisDemo6();
	}
	ThisDemo6 funB()
	{
		ThisDemo6 t1=new ThisDemo6();
		return t1;
	}
	ThisDemo6 funC()
	{
		return this;
	}
	
	A funE()
	{
		return null;
	}
	ThisDemo6 funD()
	{
		return this;
	}
}
