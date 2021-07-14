import java.util.HashSet;

public class DuplicateHashSet {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","C++","python","java",};
		HashSet  <String> langs= new HashSet();
	boolean flag=false;	
for(String l:arr) {
	//System.out.println(langs.add(l));
	
	if(langs.add(l)==false) {
		System.out.println("Found Dupliat Element:"+ l);
		flag=true;
	}
}
	
if(flag==false) {
	System.out.println("Not found Duplicate");
}
	}
}
