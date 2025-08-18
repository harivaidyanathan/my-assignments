package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i, n=10, first=0,second=1,tot;
		
		for(i=0;i<=n;i++)
		{
			tot=first+second;
			first=second;
			second=tot;
			
			System.out.println(tot);
		}

	}

}
