
/*
4)	Display numbers from 3 to 30 except number 24  using loop.
*/
public class Assignment3 {

	public static void main(String[] args) {
		
		for(int i=3;i<=30;i++) {
			if(i==24)
				continue;
			System.out.println(i);
		}
		
	}

}