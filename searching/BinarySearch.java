package searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		BinarySearch search = new BinarySearch();
		System.out.println(search.find(a,0,a.length-1,2));
		
	}
	
	boolean find(int a[], int start,int end, int term)
	{
		if(start > end)
			return false;
		
		int mid = (start + end)/2;
		System.out.println(mid);
		if(a[mid] == term)
			return true;
		else
		{
			if(a[mid]>term)
				return find(a,start,mid-1,term);
			else
				return find(a,mid+1,end,term);
		}
		
	}
}
