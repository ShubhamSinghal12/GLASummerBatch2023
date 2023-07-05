package Lec7;

import java.util.Arrays;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {54,548,546,60};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = 1; j < arr.length-i; j++)
			{
				if(compare(arr[j-1] ,arr[j]))
				{
					int t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	public static boolean compare(int a,int b)
	{
		String f = a+""+b;
		String s = b+""+a;
		return s.compareTo(f) > 0;
	}

}
