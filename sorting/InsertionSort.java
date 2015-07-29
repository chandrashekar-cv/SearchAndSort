package sorting;

public class InsertionSort {

	public static void main(String args[])
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		InsertionSort sort = new InsertionSort();
		sort.insertionSort(array);
		
		for(int a: array)
			System.out.println(a);
		
	}
	
	void insertionSort(int[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			int j=i-1;
			int key = array[i];
			
			while(j>=0 && array[j]<key)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	
}
