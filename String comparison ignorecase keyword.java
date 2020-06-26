/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("Hello");
		if(s1.equalsIgnoreCase(s2)) {
		    System.out.println("Equals");
		}
		else{
		    System.out.println("not equals");
		}
	}
}
