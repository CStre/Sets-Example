import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class Closest {
	
	public static void main(String[] args) 
	{
		Node[][] grid;
		int b = 1000;
		grid = new Node[b][b];
		int minDist = 0;
		double its = 0;
		Scanner input = new Scanner(System.in);
		
		while(input != null)
		{
			double x = input.nextDouble();
			double y = input.nextDouble();
			
			int x_cord = (int) Math.floor(x * 100 % b);
			int y_cord = (int) Math.floor(y * 100 % b);
			
			Node cell = grid[x_cord][y_cord];
			
			if (cell == null)
				{
					grid[x_cord][y_cord] = new Node(x, y);
				}
				else
				{
					grid[x_cord][y_cord] = new Node(x, y, cell);
				}
			}
		System.out.println("The closest pair of points is: " + minDist);
	}
}

		
	
