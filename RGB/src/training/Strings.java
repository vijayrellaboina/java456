package training;

import java.util.Arrays;
import java.util.stream.Stream;

public class Strings {

	public static void main(String[] args) {
		String [] batsmen= {
				"vijay",
				"sankar",
				"panth",
				"dhawan"
				};
		String[] bowlers= {
				"bhuvi",
				"nattu",
				"hardik",
				"bumi",
				};
//		String[] allrounder= {
//				"jaddu",
//				"thakur",
//				"pandya"
		//};
		
		Stream<String> sbat=Arrays.stream(batsmen);
		Stream<String> sbow=Arrays.stream(bowlers);
		//Stream<String> sall=Arrays.stream( allrounder);
		String fullteam[]=Stream.concat(sbat, sbow).toArray(size-> new String[size]);
		for(String s:fullteam) {
			System.out.println(s);
		}
}
}