/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("I  Java");
		System.out.println(s1);
		
		
		s1.insert(2,"like");
		System.out.println(s1);
		
		
		s1.reverse();
		System.out.println(s1);
	}
}
