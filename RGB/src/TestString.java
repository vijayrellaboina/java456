import java.util.Hashtable;
import java.util.Set;

public class TestString {

	public static void main(String[] args) {
		String name="Siva Kurangi";


		Hashtable<Character, Integer> baseMap = new Hashtable<Character, Integer>();  
		    char[] charArray = name.toCharArray();  
		    for (Character ch : charArray) {  
		        if (baseMap.containsKey(ch)) {  
		            baseMap.put(ch, baseMap.get(ch) + 1);  
		        } else {  
		            baseMap.put(ch, 1);  
		        }  
		    }  
		   
		    Set<Character> keys = baseMap.keySet();  
		    for (Character ch2 : keys) {  
		        if (baseMap.get(ch2) > 1) {  
		            System.out.println(ch2 + "  is " + baseMap.get(ch2) + " times");  
		        }  
		    }  
		}

	}


