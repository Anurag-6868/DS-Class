package fifth;

public class MergeSort {
	public static void helper(int[] input,int l,int r)
    {
      if(l<r)
      {
          int mid=l+(r-l)/2;
          helper(input,l,mid);
          helper(input,mid+1,r);
          merge(input,l,mid,r);
      }
    }

	public static void mergeSort(int[] input){
		// Write your code here
        int n=input.length;
		helper(input,0,n-1);
	}
   public static void merge(int[] input,int l,int mid,int r)
    {
        int i,j,k;
        
        int n1=mid-l+1;
        int n2=r-mid;
        int Left[]=new int[n1];
        int Right[]=new int [n2];
        for(i=0;i<n1;i++)
            Left[i]=input[l+i];
        for(j=0;j<n2;j++)
            Right[j]=input[mid+1+j];
          i=0;
          j=0;
          k=l;
        while(i<n1 && j<n2)
        {
            if(Left[i]<=Right[j])
            input[k++]=Left[i++];
        else
            input[k++]=Right[j++];
    }
        while(i<n1)
            input[k++]=Left[i++];
        while(j<n2)
            input[k++]=Right[j++];
    }
}
