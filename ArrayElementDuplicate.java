// 8) Java Program to print the duplicate elements of an array

class ArrayElementDuplicate {
	public static void main(String args[] )
	{
		int arr[] = new int[] {7,2,2,8,9, 7, 8, 9, 1,1};
				
		System.out.println(" Duplicate Array Elements are  :");
		
		// int dupli = arr [0];
		for(int i = 0; i < arr.length-1; i ++ ) 
		{
		for(int j = i+1; j < arr.length; j ++ )
		{
			if( arr[i] == arr [j])
			{
				System.out.println(arr[i]);
				break ;
			}
		}
		}
		
	}
}
