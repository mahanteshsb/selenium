
import java.util.Scanner;

public class Pattern {
	

	public static void main(String[] args) {
		

	Scanner tt=new Scanner(System.in);

	System.out.println("enter month");
	 int n=tt.nextInt();

	 for(int i=1;i<=n;i++)
	{
		 k=i;
	 for(int j=1;j<=26;j++)
	 { 
	System.out.print(k+"");
	k=k+n-j;

	}

	System.out.println();
	}
	}}



