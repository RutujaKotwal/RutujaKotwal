
/*2)	declare two numbers and one operator as a character. e.g. '+'
using switch... case check which operator is declared and accordingly perform the action.
*/
package GrpA_Set2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int a = 87;
		int b = 48;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation you want to do on 2 no.s + for addition,- for sub,* for multi,"
				+ "/for divide & % for remainder");
		char ch=sc.next().charAt(0);
		switch  (ch)
		{
		case '+':System.out.println(a+b);break;
		case '-': System.out.println(a-b);break;
		case '*':System.out.println(a*b);break;
		case '/':System.out.println(a/b);break;
		case '%':System.out.println(a%b);break;
		default:System.out.println("Invalid Entry");break;
			
		}
		
		
	}

}
