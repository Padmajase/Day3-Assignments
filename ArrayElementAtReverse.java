//  6) Java Program to print the elements of an array in reverse order

class ArrayElementAtReverse {
	public static void main(String args[] )
	{
		int arr[] = new int[] { 7, 6, 7, 8, 9, 1};

		System.out.println("Array Element In Reverse Order :");

		for(int i = arr.length-1; i >=0 ; i-- )
		{
			System.out.println(arr[i]);
		}
	}
}
