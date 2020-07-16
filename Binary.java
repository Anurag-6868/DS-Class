package upload;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       int n=s.nextInt(),sea=0;
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   a[i]=s.nextInt();
       }
       sea = s.nextInt();
       int f=0;
       int l=n-1;
       int mid=(l+f)/2;
       while(f<=l)
       {
    	   if(a[mid]<sea)
    	   {
    		   f=mid+1;
    	   }
    	   else if(a[mid]==sea)
    	   {
    		   System.out.print("location"+(mid));
    		   break;
    	   }
    	   else if(a[mid]>sea)
    	   {
    		   l=mid-1;
    	   }
    	   mid=(f+l)/2;
       }
       if(f>l)
       {
    	   System.out.print("NOT FOUND");
       }
	}

}
