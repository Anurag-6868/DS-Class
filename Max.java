package upload;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,max=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.print(max);
	}

}
