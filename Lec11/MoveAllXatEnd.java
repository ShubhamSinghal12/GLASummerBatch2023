package Lec11;

public class MoveAllXatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(move("axexdexfx", ""));

	}
	
	public static String move(String st,String ans) {
		if(st.length() == 0)
		{
			return ans;
		}
		else
		{
			if(st.charAt(0) == 'x')
			{
				ans += st.charAt(0);
			}
			
			String rr = move(st.substring(1), ans);
			
			if(st.charAt(0) != 'x')
			{
				rr += st.charAt(0);
			}
			return rr;
		}
	}

}
