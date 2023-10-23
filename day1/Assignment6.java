/*
6) display all prime numbers between 3 to 30

*/
package GrpA_Set2;

//import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
		for (int i =3;i<=30;i++)
		{
			int flag = 0;
			if(i%2!=0) 
			{
				for (int j =2;j<=i/2;j++)
				{
					if(i%j==0)
						flag = 1;
				}
				if(flag == 0)
				System.out.println(i);
			}
		
		}
		
		
	}

}
