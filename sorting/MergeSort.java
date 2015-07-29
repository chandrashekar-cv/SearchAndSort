package sorting;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		
		int a[]={3,5,2,1,9,6,7,5,8,10,-2,-25,45,62};
		a = sort.msort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	int[] msort(int a[],int start, int end)
	{
		int m = (end+start)/2;
		
		if(start==end)
			return new int[]{a[m]};
		else
		{
			int []b = msort(a, start,m);
			int []c = msort(a, m+1, end);
			
			return merge(b,c);
		}
		
	}

	int[] merge(int b[],int c[])
	{
		int i=0,j=0,k=0;
		int size = b.length+c.length;
		int a[] = new int[size];
		
		while(i<b.length && j<c.length)
		{
			if(b[i]<c[j])
			{
				a[k]= b[i];
				i++;
			}
			else
			{
				a[k]=c[j];
				j++;
			}
			k++;
		}
		while(i<b.length)
		{
			a[k]=b[i];
			i++;
			k++;
		}
		while(j<c.length)
		{
			a[k]=c[j];
			j++;
			k++;
		}
		return a;
	}
}
