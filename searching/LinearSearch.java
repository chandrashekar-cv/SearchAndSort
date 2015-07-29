package searching;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		LinearSearch search = new LinearSearch();
		System.out.println(search.find(a, 13));

	}
	
	boolean find(int a[],int term)
	{
		for (int i : a) {
			if(i==term)
				return true;
		}
		return false;
	}
}
