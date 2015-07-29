package sorting;

public class BubbleSort {

	public static void main(String args[])
	{
		int a[]={10,-5,2,16,-4,3};
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(a);
		for(int i: a)
			System.out.print(i+" ");
	}
	
	void bubbleSort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
}
