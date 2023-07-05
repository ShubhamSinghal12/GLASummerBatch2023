package Lec9;

public class Unique3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,2,2,2,3};
		
		int ans = 0;
		int mask = 1;
		for(int i = 0; i < 32; i++)
		{
			int count = 0;
			for(int val: arr)
			{
				if((val & mask) != 0)
				{
					count++;
				}
			}
			if(count%3 != 0)
			{
				ans = ans|mask;
			}
			mask <<= 1;
		}
		
		System.out.println(ans);

	}

}
