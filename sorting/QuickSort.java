package sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		QuickSort sort = new QuickSort();
		int a[]={10,-5,2,16,-4,3};
		sort.quicksort(a,0,a.length-1);
		sort.print(a,0,a.length-1);
		
	}

	void print(int[] a,int start,int end)
	{
		for(int i=start;i<=end;i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	void quicksort(int a[],int start, int end)
	{
		int i=start;
		int j=end;
		if(end-start>0)
		{
			int pivot = a[start];
			while(j>i)
			{
				while(a[i]<=pivot && i<=end && j>i)
				i++;
				while(a[j]>pivot && j>=start && j>=i)
					j--;
				if(j>i)
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			int temp = a[start];
			a[start]=a[j];
			a[j]=temp;
			print(a,start,end);
			quicksort(a, start, j-1);
			quicksort(a, j+1, end);
		}
	}

}
