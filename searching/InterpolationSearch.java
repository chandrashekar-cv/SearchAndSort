package searching;

public class InterpolationSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		InterpolationSearch search = new InterpolationSearch();
		System.out.println(search.search(a,2));
	}
	
	boolean search(int[] a, int key)
	{
		int left = 0;
		int right = a.length-1;
		int mid = -1;
		
		while(left<=right)
		{
			if(a[left]==a[right])
			{
				if(a[left]==key)
					return true;
				else
					return false;
			}
			
			int k = ((key-a[left])/(a[right]-a[left]));
			mid=left + (right-left) * k;
			
			if(k<0 || k>1)
				return false;
			
			if(key < a[mid])
				right = mid-1;
			else if(key>a[mid])
				left=mid+1;
			else
				return true;
			
		}
		
		if(a[left]==key)
			return true;
		else return false;
	}
	

}
