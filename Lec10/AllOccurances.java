package Lec10;

public class AllOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public static int[] allO(int[] arr,int ele,int cnt,int i)
	{
		if(i == arr.length)
		{
			return new int[cnt];
		}
		else
		{
			if(arr[i] == ele)
			{
				cnt += 1;
			}
			int[] ans = allO(arr, ele, cnt, i+1);
			if(arr[i] == ele)
			{
				ans[cnt-1] = i;
			}
			return ans;
		}
	}

}
