package Lec9;

import java.util.Scanner;

public class UltraMaths {
	    public static void main(String args[]) {
	        // Your Code Here
	     Scanner sc = new Scanner(System.in);
	        StringBuilder str = new StringBuilder();
	        int t = sc.nextInt();
	        for (int i = 0; i < t; i++) {
	            String str1 = sc.next();
	            String str2 = sc.next();
	            for (int j = 0; j < str1.length(); j++) {
	                int ans = (str1.charAt(j) ^ str2.charAt(j));
	                str.append(ans);
	            }
	        }
//	        str = str.reverse();
	        System.out.println(str);
	        sc.close();

	    }


}
