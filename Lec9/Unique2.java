package Lec9;

public class Unique2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,3,5};
		int ans = 0;
		for(int val: arr)
		{
			ans = ans^val;
		}
		System.out.println(ans);

	}

}
