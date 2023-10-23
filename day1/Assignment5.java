
// 5)	Using if…….else if….  Else,  display whether result is  fail, pass, 
//		second class , first class, Distinction etc.
 
import java.util.Scanner;

public class assignment5 {

	public static void main(String[] args) {

 
			Scanner sc=new Scanner(System.in); 
			float result=sc.nextFloat();
			if(result>=101)
				System.out.println(" Invaild result "+result);
			
			else if(result<=35)
				System.out.println(result+"% fail");
			
			else if(result>=35 && result<=49)
				System.out.println(result+"% pass");
			
			else if(result>=50 && result<=69)
				System.out.println(result+"% secondclass");
			
			else if(result>=70 && result<=79)
			System.out.println(result+"% firstclass");
			
			else if(result>=80 && result<=100)
				System.out.println(result+"% distinction");
			
	}

}
