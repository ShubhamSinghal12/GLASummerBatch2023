package Lec11;

public class lexoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(0);
//		for(int i = 1;i <= 9;i++)
//			lexo(i,1000);
		lexo(0,1000);

	}
	
	public static void lexo(int cur,int n)
	{
		if(cur > n)
		{
			return;
		}
		else
		{
			System.out.println(cur);
			int i = 0;
			if(cur == 0)
				i = 1;
			
			for(; i <= 9; i++)
			{
				lexo(cur*10+i, n);
			}
		}
	}

}
