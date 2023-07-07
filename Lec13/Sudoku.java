package Lec13;

import java.util.Arrays;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		sudoku(grid, 0, 0);

	}
	
	public static boolean isItPossible(int[][] grid,int r,int c,int val)
	{
		for(int cc = 0 ; cc < grid[0].length; cc++)
		{
			if(grid[r][cc] == val)
				return false;
		}
		
		for(int cr = 0; cr < grid.length; cr++)
		{
			if(grid[cr][c] == val)
			{
				return false;
			}
		}
		
		int x = r-r%3;
		int y = c-c%3;
		
		for(int i = x; i < x+3; i++)
		{
			for(int j = y; j < y+3; j++)
			{
				if(grid[i][j] == val)
				{
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static void sudoku(int[][] grid,int cr,int cc)
	{
		if(cr == grid.length)
		{
			for(int[] v:grid)
			{
				System.out.println(Arrays.toString(v));
			}
		}
		else if(cc == grid[0].length)
		{
			sudoku(grid, cr+1, 0);
		}
		else if(grid[cr][cc] != 0)
		{
			sudoku(grid, cr, cc+1);
		}
		else
		{
			for(int i = 1; i <= 9; i++)
			{
				if(isItPossible(grid, cr, cc, i))
				{
					grid[cr][cc] = i;
					sudoku(grid, cr, cc+1);
					grid[cr][cc] = 0; //Backtracking
				}
			}
		}
	}

}
