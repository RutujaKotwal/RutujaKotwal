
8)a)
package GrpA_Set2;
/*  * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/
public class Pattern1 {

	public static void main(String[] args) {
		for (int i = 1;i<=5;i++)
		{
			for(int s = 4;s>=i;s--)
				System.out.print(" ");
			for (int j = 1;j<=i;j++)
				System.out.print("*"+" ");
			System.out.println();
			
		}
		

	}

}
8)b)
package GrpA_Set2;
/*  
         * * * * 
  	    * * * 
  	     * * 
            *  
*/
public class Pattern1 {

	public static void main(String[] args) {
		for (int i = 4;i>=1;i--)
		{
			for(int s = 4;s>i;s--)
				System.out.print(" ");
			for (int j = 1;j<=i;j++)
				System.out.print("*"+" ");
			System.out.println();
			
		}
		

	}

}

8)C)
/*  
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/
public class Pattern1 {

	public static void main(String[] args) {
		for (int i = 1;i<=9;i++)
		{
			if(i<=5) {
			for(int s = 4;s>=i;s--)
				System.out.print(" ");
			for (int j = 1;j<=i;j++)
				System.out.print("*"+" ");
				System.out.println();
			}
			else {
				for(int s1=1 ;s1<=i-5;s1++)
					System.out.print(" ");
				for(int k=4;k>=i-5;k--)
				System.out.print("*"+" ");
				System.out.println();
			}
			
		}