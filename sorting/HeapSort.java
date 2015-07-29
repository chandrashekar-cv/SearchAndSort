package sorting;

public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,5,2,1,9,6,7,5,8,10,-2,-25,45,62};
		HeapSort sort = new HeapSort();
		sort.heapSort(a,a.length-1);
		
		for(int i: a)
			System.out.print(i+" ");
	}
	
	void heapSort(int[] a, int size)
	{
		int[] sorted = new int[size];
		heapify(a,size);
		while(size >0)
		{
			swap(a,0,size);
			heapify(a,size-1);
			size--;
		}
		
	}
	
	void heapify(int[] a, int size)
	{
		for(int i=(size)/2;i>=0;i--)
		{
			maxheap(a,i,size);
		}
	}
	
	void maxheap(int[] a,int i,int size)
	{
		int left = 2*i+1;
		int right = 2*i+2;
		int max = i;
		
		if(left<=size && a[left]<a[max])
			max = left;
		if(right<=size && a[right]<a[max])
			max = right;
		
		if(max!=i)
		{
			swap(a,max,i);
			maxheap(a,max,size);
		}
		
	}
	
	void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	

}
