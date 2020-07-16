package upload;
import java.util.*;
public class Optmisort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arrA[]=new int[n];
		for(int i=0;i<arrA.length;i++)
		{
			arrA[i]=s.nextInt();
		}
		  boolean isSwapped;
	        int size = arrA.length;
	        for (int i = 0; i <size-1 ; i++) {
	            isSwapped = false;
	            for (int j = 0; j <size-i-1 ; j++) {
	                //check the adjacent elements
	                if(arrA[j]>arrA[j+1]){
	                    //swap the elements
	                    int temp = arrA[j];
	                    arrA[j] = arrA[j+1];
	                    arrA[j+1] = temp;
	                    isSwapped = true;
	                }
	            }
	            
	            if(isSwapped==false)
	                break;
	        }
	        for(int i=0;i<size;i++)
	        {
	        	System.out.print(arrA[i]);
	        }

	}

}
