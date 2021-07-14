package basics;

import java.util.Scanner;

public class C {
public static void main(String[] args) {
//	for(int i=0;i<=10;i++) {
//		System.out.println(i);  // forloop (break,cotinue)
//		if(i==4) {
//			break;
//		}
//		
//	}
//
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String name=sc.nextLine();
		
		System.out.println("Enter character");
		char abc=sc.next().charAt(0);
		
		System.out.println("Enter Integer");
		int a=sc.nextInt();
		
		System.out.println("String:"+name+ "Character:"+ abc+ "numeric:"+a);
	
	
}
}
