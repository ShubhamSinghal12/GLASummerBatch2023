package Lec7;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Hello";
		String st2 = "Hello";
		String st3 = new String ("Hello");
		
		System.out.println(st == st2);
		System.out.println(st2 == st3);
		
		st = st+"123";
		String st4 = "Hello123";
		System.out.println(st == st4);
		
		

	}

}
