package Lec12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SubsetsTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,6,5,3};
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<ArrayList<Integer>> bigAns = new ArrayList<>();
		subsets(arr, arr.length-1, 10, ans, bigAns);
		System.out.println(bigAns);
		
		Collections.sort(bigAns,new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				// TODO Auto-generated method stub
				return o1.size()-o2.size();
			}
		});
		System.out.println(bigAns);
	}
	
	public static void subsets(int[] arr,int i,int target,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> bigAns)
	{
		if(target == 0)
		{
//			System.out.println(ans);
			bigAns.add(new ArrayList<>(ans));
			return;
		}
		if(i == -1 || target < 0)
		{
			return;
		}
		else
		{
			ans.add(arr[i]);
			subsets(arr, i-1, target - arr[i],ans, bigAns);
			ans.remove(ans.size()-1); // Backtracking
			
			subsets(arr, i-1, target, ans, bigAns);
		}
	}

}
