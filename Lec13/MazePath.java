package Lec13;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean[][] grid = new boolean[2][3];
		int[][] grid = new int[4][4];
		grid[1][2] = 2;
		grid[2][1] = 2;
		grid[1][1] = 2;
		grid[2][2] = 2;
		mp2(grid, 0, 0, "");

	}
	
	public static void mp(boolean[][] grid,int cr,int cc,String ans)
	{
		if(cr == grid.length-1 && cc == grid[0].length-1)
		{
			System.out.println(ans);
		}
		else if(cr >= grid.length || cc >= grid[0].length || cc < 0 || cr < 0 || grid[cr][cc])
		{
			return;
		}
		else
		{
			grid[cr][cc] = true;
			
			mp(grid, cr, cc+1, ans+"R");
			mp(grid, cr+1, cc, ans+"D");
			mp(grid, cr, cc-1, ans+"L");
			mp(grid, cr-1, cc, ans+"U");
			
			grid[cr][cc] = false; // Backtracking
			
		}
	}
	
	
	public static void mp2(int[][] grid,int cr,int cc,String ans)
	{
		if(cr == grid.length-1 && cc == grid[0].length-1)
		{
			System.out.println(ans);
		}
		else if(cr >= grid.length || cc >= grid[0].length || cc < 0 || cr < 0 || grid[cr][cc] != 0)
		{
			return;
		}
		else
		{
			grid[cr][cc] = 1;
			
			mp2(grid, cr, cc+1, ans+"R");
			mp2(grid, cr+1, cc, ans+"D");
			mp2(grid, cr, cc-1, ans+"L");
			mp2(grid, cr-1, cc, ans+"U");
			
			grid[cr][cc] = 0; // Backtracking
			
		}
	}

}
