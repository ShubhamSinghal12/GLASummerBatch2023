package Lec10;

public class Tavas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 747;
		int ans = 0;
		int multi = 1;
		
		while(n!= 0)
		{
			int rem = n%10;
			if(rem == 4)
			{
				ans += multi;
			}
			else
			{
				ans += multi*2;
			}
			
			n = n/10;
			multi <<= 1;
			
		}
		System.out.println(ans);

	}

}
