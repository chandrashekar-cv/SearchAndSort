package sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SelectionSort {
	
	
	public static void main(String args[]) throws FileNotFoundException
	{
		int []array ={10,20,5,2,6,7,3,4,9,12,16};
		SelectionSort sort = new SelectionSort();
		sort.selectionSort(array);
		for(int a: array)
		{
			System.out.println(a);
		}
		
	
	}
	
	void selectionSort(int[] array)
	{
		int max_index =0;
		
		for(int i=0;i<array.length;i++)
		{
			max_index = i;
			for(int j=i;j<array.length;j++)
			{
				if(array[j] > array[max_index])
					max_index=j;
			}
			if(max_index!=i)
			{
				int temp=array[i];
				array[i]=array[max_index];
				array[max_index]=temp;
			}
			
		}
	}
	
}
