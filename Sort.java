package upload;

import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),i=0;
	int a[]=new int[n],p=0,d=0,temp=0;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<n-1;i++)
	{
		p=i;
		for(d=i+1;d<n;d++)
		{
			if(a[p]>a[d])
				p=d;
		}
		if(p!=i)
		{
			temp=a[i];
			a[i]=a[p];
			a[p]=temp;
		}
	}
	System.out.println("Sorted array");
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	}

}
